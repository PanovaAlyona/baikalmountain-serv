package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Routes")
public class Routes {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private Boolean travers;

    @DatabaseField(foreign = true)
    private Complexity id_complexity;

    @DatabaseField
    private String character;

    @DatabaseField
    private String routes;

    @DatabaseField(foreign = true)
    private Pathfinder_head id_pathfinder_head;

    @DatabaseField(foreign = true)
    private Pathfinder_year id_pathfinder_year;

    @DatabaseField(foreign = true)
    private Photo_peak id_photo_peak;

    public Routes(){}

    public Routes(Boolean travers, Complexity id_complexity, String character, String routes, Pathfinder_head id_pathfinder_head,
                  Pathfinder_year id_pathfinder_year, Photo_peak id_photo_peak){
        this.travers = travers;
        this.id_complexity = id_complexity;
        this.character = character;
        this.setRoutes(routes);
        this.setId_pathfinder_head(id_pathfinder_head);
        this.setId_pathfinder_year(id_pathfinder_year);
        this.setId_photo_peak(id_photo_peak);
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id=id;
    }


    public Boolean getTravers(){return travers;}

    public void setTravers(Boolean travers){
        this.travers = travers;
    }


    public Complexity getId_complexity(){return id_complexity;}

    public void setId_complexity(Complexity id_complexity){
        this.id_complexity = id_complexity;
    }


    public String getCharacter(){return character;}

    public void setCharacter(String character){
        this.character = character;
    }


    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {
        this.routes = routes;
    }

    public Pathfinder_head getId_pathfinder_head() {
        return id_pathfinder_head;
    }

    public void setId_pathfinder_head(Pathfinder_head id_pathfinder_head) {
        this.id_pathfinder_head = id_pathfinder_head;
    }

    public Pathfinder_year getId_pathfinder_year() {
        return id_pathfinder_year;
    }

    public void setId_pathfinder_year(Pathfinder_year id_pathfinder_year) {
        this.id_pathfinder_year = id_pathfinder_year;
    }

    public Photo_peak getId_photo_peak() {
        return id_photo_peak;
    }

    public void setId_photo_peak(Photo_peak id_photo_peak) {
        this.id_photo_peak = id_photo_peak;
    }
}
