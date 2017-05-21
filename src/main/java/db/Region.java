package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 04.04.2017.
 */
@DatabaseTable(tableName = "Region")
public class Region {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String region;

    public Region(){}

    public Region(String Region) {
        this.region = region;
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public String getRegion(){return region;}

    public void setRegion(String region){
        this.region = region;
    }

}
