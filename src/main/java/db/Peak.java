package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Peak")
public class Peak {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField(foreign = true)
    private Region id_region;

    @DatabaseField(foreign = true)
    private Mountain_area id_mountain_area;

    @DatabaseField
    private String peak;

    @DatabaseField
    private String height;

    @DatabaseField
    private String N_coordinates;

    @DatabaseField
    private String E_coordinates;

    public Peak(Region id_region, Mountain_area id_mountain_area, String peak, String height, String N_coordinates, String E_coordinates){
        this.setId_region(id_region);
        this.setId_mountain_area(id_mountain_area);
        this.setPeak(peak);
        this.setHeight(height);
        this.setN_coordinates(N_coordinates);
        this.setE_coordinates(E_coordinates);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Region getId_region() {
        return id_region;
    }

    public void setId_region(Region id_region) {
        this.id_region = id_region;
    }

    public Mountain_area getId_mountain_area() {
        return id_mountain_area;
    }

    public void setId_mountain_area(Mountain_area id_mountain_area) {
        this.id_mountain_area = id_mountain_area;
    }

    public String getPeak() {
        return peak;
    }

    public void setPeak(String peak) {
        this.peak = peak;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getN_coordinates() {
        return N_coordinates;
    }

    public void setN_coordinates(String n_coordinates) {
        N_coordinates = n_coordinates;
    }

    public String getE_coordinates() {
        return E_coordinates;
    }

    public void setE_coordinates(String e_coordinates) {
        E_coordinates = e_coordinates;
    }
}
