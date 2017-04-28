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
    private String Region;

    public Region(String Region) {
        this.Region = Region;
    }
}
