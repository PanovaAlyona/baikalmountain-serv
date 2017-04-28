package model;

import model.Peaks;

import java.util.ArrayList;

/**
 * Created by Алена on 28.04.2017.
 */
public class Route {

    private String region;
    private String mountain_area;
    private Boolean travers;
    private ArrayList<Peaks> peaks = new ArrayList<Peaks>();
    private String route_complexity;
    private String route_character;
    private String route;
    private String pathfinder_head;
    private String pathfinder_year;
    private String area_description;
    private String running_time;
    private String route_description;
    private String equipment;
    private String peak_photo;
    private ArrayList<Sections> sections = new ArrayList<Sections>();
    private String photo_UIAA;


    public Route() {
    }

    ;

    public Route(String region, String mountain_area, Boolean travers, String route_complexity,
                 String route_character, String route, String pathfinder_head, String pathfinder_year,
                 String area_description, String running_time, String route_description, String equipment,
                 String peak_photo, String photo_UIAA) {
        this.region = region;
        this.mountain_area = mountain_area;
        this.travers = travers;
        this.route_complexity = route_complexity;
        this.route_character = route_character;
        this.route = route;
        this.pathfinder_head = pathfinder_head;
        this.pathfinder_year = pathfinder_year;
        this.area_description = area_description;
        this.running_time = running_time;
        this.route_description = route_description;
        this.equipment = equipment;
        this.peak_photo = peak_photo;
        this.photo_UIAA = photo_UIAA;
    }


    //Прописать getter и setter для model.Route, model.AllRoutes, model.Sections, model.Peaks;

    public String getRegion() {
        return region;
    }

    public String getMountain_area() {
        return mountain_area;
    }

    public Boolean getTravers(){
        return travers;
    }

    public ArrayList<Peaks> getPeaks(Peaks peaks){
        return new ArrayList<Peaks>();
    }

    public String getRoute_complexity() {
        return route_complexity;
    }

    public String getRoute_character() {
        return route_character;
    }

    public String getRoute() {
        return route;
    }

    public String getPathfinder_head() {
        return pathfinder_head;
    }

    public String getPathfinder_year() {
        return pathfinder_year;
    }

    public String getArea_description() {
        return area_description;
    }

    public String getRunning_time() {
        return running_time;
    }

    public String getRoute_description() {
        return route_description;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getPeak_photo() {
        return peak_photo;
    }

    public ArrayList<Sections> getSections(){
        return new ArrayList<Sections>();
    }

    public String getPhoto_UIAA() {
        return photo_UIAA;
    }

    //setter

    public void setRegion(String region) {
        this.region = region;
    }

    public void setMountain_area(String mountain_area) {
        this.mountain_area = mountain_area;
    }

    public void setTravers(Boolean travers) {
        this.travers = travers;
    }

    public void addPeaks(Peaks peaks){
        this.peaks.add(peaks);
    }

    public void setRoute_complexity(String route_complexity){
        this.route_complexity = route_complexity;
    }

    public void setRoute_character(String route_character){
        this.route_character = route_character;
    }

    public void setRoute(String route){
        this.route = route;
    }

    public void setPathfinder_head(String pathfinder_head){
        this.pathfinder_head = pathfinder_head;
    }

    public void setPathfinder_year(String pathfinder_year){
        this.pathfinder_year = pathfinder_year;
    }

    public void setArea_description(String area_description){
        this.area_description = area_description;
    }

    public void setRunning_time(String running_time){
        this.running_time = running_time;
    }

    public void setRoute_description(String route_description){
        this.route_description = route_description;
    }

    public void setEquipment(String equipment){
        this.equipment = equipment;
    }

    public void setPeak_photo(String peak_photo){
        this.peak_photo = peak_photo;
    }

    public void addSections (Sections sections){
        this.sections.add(sections);
    }

    public void setPhoto_UIAA(String photo_UIAA){
        this.photo_UIAA = photo_UIAA;
    }


}
