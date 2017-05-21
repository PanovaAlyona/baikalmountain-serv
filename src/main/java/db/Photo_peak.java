package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Photo_peak")
public class Photo_peak {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String photo_p;

    @DatabaseField
    private String photo_UIAA;

    @DatabaseField
    private String photo_map;

    @DatabaseField
    private String area_description;

    @DatabaseField
    private String route_description;

    @DatabaseField
    private String running_time;

    @DatabaseField
    private String equipment;

    public Photo_peak(){}

    public Photo_peak(String photo_p, String photo_UIAA, String photo_map, String area_description,
                      String route_description, String running_time, String equipment){
        this.photo_p = photo_p;
        this.photo_UIAA = photo_UIAA;
        this.photo_map = photo_map;
        this.area_description = area_description;
        this.route_description = route_description;
        this.running_time = running_time;
        this.equipment = equipment;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoto_p() {
        return photo_p;
    }

    public void setPhoto_p(String photo_p) {
        this.photo_p = photo_p;
    }

    public String getPhoto_UIAA() {
        return photo_UIAA;
    }

    public void setPhoto_UIAA(String photo_UIAA) {
        this.photo_UIAA = photo_UIAA;
    }

    public String getPhoto_map() {
        return photo_map;
    }

    public void setPhoto_map(String photo_map) {
        this.photo_map = photo_map;
    }

    public String getArea_description() {
        return area_description;
    }

    public void setArea_description(String area_description) {
        this.area_description = area_description;
    }

    public String getRoute_description() {
        return route_description;
    }

    public void setRoute_description(String route_description) {
        this.route_description = route_description;
    }

    public String getRunning_time() {
        return running_time;
    }

    public void setRunning_time(String running_time) {
        this.running_time = running_time;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
