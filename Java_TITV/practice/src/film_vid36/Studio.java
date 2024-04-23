package film_vid36;

public class Studio {
    private String studioName;
    private String country;

    public Studio(String studioName, String country) {
        this.studioName = studioName;
        this.country = country;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioNam(String studioNam) {
        this.studioName = studioNam;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
