package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Pathfinder_head")
public class Pathfinder_head {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String head;

    public Pathfinder_head(){}

    public Pathfinder_head(String head){
        this.head = head;
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public String getHead(){return head;}

    public void setHead(String head){
        this.head = head;
    }

}
