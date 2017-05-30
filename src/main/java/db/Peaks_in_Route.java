package db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Алена on 29.05.2017.
 */
@DatabaseTable(tableName = "Peaks_in_route")
public class Peaks_in_Route {
    @DatabaseField(foreign = true)
    private Peak id_peak;

    @DatabaseField(foreign = true)
    private Routes id_route;

    @DatabaseField(foreign = true)
    private Integer peak_order;

    public Peak getId_peak() {
        return id_peak;
    }

    public void setId_peak(Peak id_peak) {
        this.id_peak = id_peak;
    }

    public Routes getId_route() {
        return id_route;
    }

    public void setId_route(Routes id_route) {
        this.id_route = id_route;
    }

    public Integer getPeak_order() {
        return peak_order;
    }

    public void setPeak_order(Integer peak_order) {
        this.peak_order = peak_order;
    }
}
