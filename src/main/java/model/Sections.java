package model;

/**
 * Created by Алена on 28.04.2017.
 */
public class Sections {
    private String description;
    private String photo_section;

    public Sections(String description, String photo_section){
        this.description = description;
        this.setPhoto_section(photo_section);
    }

    public String getDescription(){
        return description;
    }

    //setter

    public void setDescription(String description){
        this.description = description;
    }

    public String getPhoto_section() {
        return photo_section;
    }

    public void setPhoto_section(String photo_section) {
        this.photo_section = photo_section;
    }
}
