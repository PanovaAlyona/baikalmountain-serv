import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.AllRoutes;
import model.OurRoutes;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import static spark.Spark.*;

/**
 * Created by Алена on 04.04.2017.
 */

public class Main {

    public static void main(String[] args) {
        port(9000);


        AllRoutes new_route = OurRoutes.createListRoutes();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(new_route);

        //код для перекодировки нагло скопипастен с интернета, но он не помогает для корректного отображения
        Charset cset = Charset.forName("koi8");
        ByteBuffer buf = cset.encode(json);
        byte[] b = buf.array();
        String str = new String(b);

        get("/route", (req, res) -> str);
    }
}
