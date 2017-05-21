package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


/**
 * Created by Алена on 16.05.2017.
 */
@DatabaseTable(tableName = "Section")
public class Section {
    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField
    private String section;

    @DatabaseField
    private String photo_section;


    @DatabaseField(foreign = true)
    private Routes id_route;

    @DatabaseField
    private Integer section_order;

    public Section(){}

    public Section(String section){
        this.setSection(section);
    }

    public Long getId(){return id;}

    public void setId(Long id){
        this.id = id;
    }

    public String getSection(){return section;}

    public void setSection(String section){
        this.section = section;
    }

    public Routes getId_route() {
        return id_route;
    }

    public void setId_route(Routes id_route) {
        this.id_route = id_route;
    }

    public Integer getSection_order() {
        return section_order;
    }

    public void setSection_order(Integer section_order) {
        this.section_order = section_order;
    }
}
