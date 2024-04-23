package film_vid36;

public class Film {
    private String filmName;

    private int filmYearRelease;

    private Studio studio;

    private double ticketCost;

    private ReleaseDate releaseDate;

    public Film(String filmName, int filmYearRelease, Studio studio, double ticketCost, ReleaseDate releaseDate) {
        this.filmName = filmName;
        this.filmYearRelease = filmYearRelease;
        this.studio = studio;
        this.ticketCost = ticketCost;
        this.releaseDate = releaseDate;
    }

    public boolean isBetterCost(Film otherFilm) {
        return this.ticketCost < otherFilm.ticketCost;
    }

    public String getStudioName() {
        return this.studio.getStudioName();
    }

    public double getTicketCostWithCoupon(double percent) {
        return ticketCost * (1 - percent / 100);
    }
}
