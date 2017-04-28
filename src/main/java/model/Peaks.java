package model;

/**
 * Created by Алена on 28.04.2017.
 */
public class Peaks {
    private String name;
    private String height;
    private String N;
    private String E;

    public Peaks(String name, String height, String N, String E){
        this.name = name;
        this.height = height;
        this.N = N;
        this.E = E;
    }

    public String getName(){
        return name;
    }

    public String getHeight(){
        return height;
    }

    public String getN(){
        return N;
    }

    public String getE(){
        return E;
    }

    //setter

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setN(String N){
        this.N = N;
    }

    public void setE(String E){
        this.E = E;
    }
}
