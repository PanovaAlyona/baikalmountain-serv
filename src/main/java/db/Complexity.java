package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Complexity")
public class Complexity {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField (unique = true)
    private String complexity;

    public Complexity(){}

    public Complexity(String complexity){
        this.complexity = complexity;
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public String getComplexity(){return complexity;}

    public void setComplexity(String complexity){
        this.complexity = complexity;
    }
}
