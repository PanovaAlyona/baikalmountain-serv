package entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import db.Complexity;
import db.Region;


/**
 * Created by Алена on 29.05.2017.
 */
public class DeserializeJSONRoute {
    //com.example.AllRoute.java-----------------------------------

    public Collection<Complexity> getComplexityList (){
            List<AllRoute> allroute  = getAllRoutes();
        Collection<Complexity> lComplexity = new ArrayList<Complexity>();
        for (AllRoute x: allroute) {
            Complexity nComlexity = new Complexity();
            nComlexity.setComplexity(x.getRouteComplexity());
            lComplexity.add(nComlexity);
        }
            return lComplexity;
    }

    public Collection<Region> getRegionList (){
        List<AllRoute> allroute  = getAllRoutes();
        Collection<Region> lRegion = new ArrayList<Region>();
        for (AllRoute x: allroute) {
            Region nRegion = new Region();
            nRegion.setRegion(x.getRegion());
            lRegion.add(nRegion);
        }
        return lRegion;
    }


        @SerializedName("all_routes")
        @Expose
        private List<AllRoute> allRoutes = null;

        public  List<AllRoute> getAllRoutes() {
            return allRoutes;
        }

        public void setAllRoutes(List<AllRoute> allRoutes) {
            this.allRoutes = allRoutes;
        }




    public class AllRoute {

        @SerializedName("region")
        @Expose
        private String region;
        @SerializedName("mountain_area")
        @Expose
        private String mountainArea;
        @SerializedName("travers")
        @Expose
        private Boolean travers;
        @SerializedName("peaks")
        @Expose
        private List<Peak> peaks = null;
        @SerializedName("route_complexity")
        @Expose
        private String routeComplexity;
        @SerializedName("route_character")
        @Expose
        private String routeCharacter;
        @SerializedName("route")
        @Expose
        private String route;
        @SerializedName("pathfinder_head")
        @Expose
        private String pathfinderHead;
        @SerializedName("pathfinder_year")
        @Expose
        private String pathfinderYear;
        @SerializedName("area_description")
        @Expose
        private String areaDescription;
        @SerializedName("running_time")
        @Expose
        private String runningTime;
        @SerializedName("route_description")
        @Expose
        private String routeDescription;
        @SerializedName("equipment")
        @Expose
        private String equipment;
        @SerializedName("peak_photo")
        @Expose
        private String peakPhoto;
        @SerializedName("sections")
        @Expose
        private List<Section> sections = null;
        @SerializedName("photo_UIAA")
        @Expose
        private String photoUIAA;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getMountainArea() {
            return mountainArea;
        }

        public void setMountainArea(String mountainArea) {
            this.mountainArea = mountainArea;
        }

        public Boolean getTravers() {
            return travers;
        }

        public void setTravers(Boolean travers) {
            this.travers = travers;
        }

        public List<Peak> getPeaks() {
            return peaks;
        }

        public void setPeaks(List<Peak> peaks) {
            this.peaks = peaks;
        }

        public String getRouteComplexity() {
            return routeComplexity;
        }

        public void setRouteComplexity(String routeComplexity) {
            this.routeComplexity = routeComplexity;
        }

        public String getRouteCharacter() {
            return routeCharacter;
        }

        public void setRouteCharacter(String routeCharacter) {
            this.routeCharacter = routeCharacter;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

        public String getPathfinderHead() {
            return pathfinderHead;
        }

        public void setPathfinderHead(String pathfinderHead) {
            this.pathfinderHead = pathfinderHead;
        }

        public String getPathfinderYear() {
            return pathfinderYear;
        }

        public void setPathfinderYear(String pathfinderYear) {
            this.pathfinderYear = pathfinderYear;
        }

        public String getAreaDescription() {
            return areaDescription;
        }

        public void setAreaDescription(String areaDescription) {
            this.areaDescription = areaDescription;
        }

        public String getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(String runningTime) {
            this.runningTime = runningTime;
        }

        public String getRouteDescription() {
            return routeDescription;
        }

        public void setRouteDescription(String routeDescription) {
            this.routeDescription = routeDescription;
        }

        public String getEquipment() {
            return equipment;
        }

        public void setEquipment(String equipment) {
            this.equipment = equipment;
        }

        public String getPeakPhoto() {
            return peakPhoto;
        }

        public void setPeakPhoto(String peakPhoto) {
            this.peakPhoto = peakPhoto;
        }

        public List<Section> getSections() {
            return sections;
        }

        public void setSections(List<Section> sections) {
            this.sections = sections;
        }

        public String getPhotoUIAA() {
            return photoUIAA;
        }

        public void setPhotoUIAA(String photoUIAA) {
            this.photoUIAA = photoUIAA;
        }

    }
    //com.example.Example.java


    //com.example.Peak.java


    public class Peak {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("N")
        @Expose
        private String n;
        @SerializedName("E")
        @Expose
        private String e;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getN() {
            return n;
        }

        public void setN(String n) {
            this.n = n;
        }

        public String getE() {
            return e;
        }

        public void setE(String e) {
            this.e = e;
        }

    }
    //Section.java
    public class Section {

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("photo_section")
        @Expose
        private String photoSection;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPhotoSection() {
            return photoSection;
        }

        public void setPhotoSection(String photoSection) {
            this.photoSection = photoSection;
        }

    }

}
