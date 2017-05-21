package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Mountain_area")
public class Mountain_area {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField(foreign = true)
    private Region id_region;

    @DatabaseField
    private String mountain_area;


    public Mountain_area(){}

    public Mountain_area(Region id_region, String mountain_area) {
        this.id_region = id_region;
        this.mountain_area = mountain_area;
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public Region getId_region(){return id_region;}

    public void setId_region(Region id_region){
        this.id_region = id_region;
    }

    public String getMountain_area(){return mountain_area;}

    public void setMountain_area(String mountain_area){
        this.mountain_area = mountain_area;
    }
}
