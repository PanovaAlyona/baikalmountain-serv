import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import db.Complexity;
import db.Mountain_area;
import entity.DeserializeJSONRoute;
import model.AllRoutes;
import model.OurRoutes;


import java.sql.SQLException;
import java.util.Collection;


import com.j256.ormlite.jdbc.JdbcConnectionSource;


import static spark.Spark.*;

/**
 * Created by Алена on 04.04.2017.
 */

public class Main {

    private static Dao<Complexity, Integer> complexityDao;
    private static Dao<Mountain_area, Integer>mountain_areaDao;


    public static void main(String[] args) {
        port(9000);


        AllRoutes new_route = OurRoutes.createListRoutes();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(new_route);


        get("/route", (req, res) -> json);

        //парсим в новый класс из которого разнесем в разные
        Gson gson2 = new Gson();

        DeserializeJSONRoute infoRoute = gson2.fromJson(json, DeserializeJSONRoute.class);
        System.out.println(infoRoute);

        try {
            complexityDao.create(infoRoute.getComplexityList());
        } catch (SQLException e) {
            e.printStackTrace();
        }



 /*       post("/api/AddUser", (request, response) -> {
            Integer id = 1;
            String str = "lol";


            //написать обход по списку comlexity и добавлять с idшником в таблицу

            Complexity user = new Complexity( str);
            complexityDao.create(user);
        }
        );*/

    }

    private static void doMain() throws Exception {
            ConnectionSource connectionSource;
            try {
                Class.forName("org.postgresql.Driver");
                connectionSource = new JdbcConnectionSource(System.getenv("JDBC_DATABASE_URL"));
                // setup our database and DAOs
                setupDatabase(connectionSource);
                // read and write some data
                System.out.println("\n\nIt seems to have worked\n\n");
            } catch (SQLException ignored) {}
        }

    private static void setupDatabase(ConnectionSource connectionSource) throws Exception {

        complexityDao = DaoManager.createDao(connectionSource, Complexity.class);
        try {
            complexityDao.queryRaw("CREATE SEQUENCE id_seq" +
                    "  INCREMENT 1" +
                    "  MINVALUE 1" +
                    "  MAXVALUE 9223372036854775807" +
                    "  START 1" +
                    "  CACHE 1;");
        } catch (SQLException ignored) {}
        // if you need to create the table
        try {
            // test if the table already exists
            DaoManager.createDao(connectionSource, Complexity.class).countOf();
        } catch (SQLException ex) {
            // if not, then create the table
            TableUtils.createTable(connectionSource, Complexity.class);
        }


}




}
