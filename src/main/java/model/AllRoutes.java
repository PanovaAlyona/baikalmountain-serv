package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Алена on 28.04.2017.
 */
public class AllRoutes {

    List<Route> all_routes = new LinkedList<>();

    public List<Route> getAll_routes(){
        return new LinkedList<>(all_routes);
    }

    public void addRoute(Route route){
        this.all_routes.add(route);
    }
}
