import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import db.*;

import java.sql.SQLException;


/**
 * Created by Алена on 23.05.2017.
 */
public class DbUtil {
    private static DbUtil ourInstance = new DbUtil();
    private JdbcConnectionSource dbSource;
    private Dao<Complexity, Integer> complexityDao;
    private Dao<Mountain_area, Integer> mountain_areaDao;
    private Dao<Pathfinder_head, Integer> pathfinder_headDao;
    private Dao<Pathfinder_year, Integer> pathfinder_yearDao;
    private Dao<Peak, Integer> peakDao;
    private Dao<Photo_peak, Integer> photo_peakDao;
    private Dao<Region, Integer> regionDao;
    private Dao<Routes, Integer> routesDao;
    private Dao<Section, Integer> sectionDao;

    public static DbUtil getInstance() {
        return ourInstance;
    }


    private DbUtil() {
        try {
            dbSource = new JdbcConnectionSource("jdbc:postgresql://localhost:9000/characterEncoding=utf8");
            complexityDao = DaoManager.createDao(dbSource, Complexity.class);
            mountain_areaDao = DaoManager.createDao(dbSource, Mountain_area.class);
            pathfinder_headDao = DaoManager.createDao(dbSource, Pathfinder_head.class);
            pathfinder_yearDao = DaoManager.createDao(dbSource, Pathfinder_year.class);
            peakDao = DaoManager.createDao(dbSource, Peak.class);
            photo_peakDao = DaoManager.createDao(dbSource, Photo_peak.class);
            regionDao = DaoManager.createDao(dbSource, Region.class);
            routesDao = DaoManager.createDao(dbSource, Routes.class);
            sectionDao = DaoManager.createDao(dbSource, Section.class);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Cannot establish DB connection " + e.getMessage() + " " + e.getCause());
        }
    }
}
