package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Pathfinder_year")
public class Pathfinder_year {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String year;


    public Pathfinder_year(){}

    public Pathfinder_year(String year){
        this.year = year;
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public String getYear(){return year;}

    public void setYear(String year){
        this.year = year;
    }
}
