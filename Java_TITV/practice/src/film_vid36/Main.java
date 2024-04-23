package film_vid36;

public class Main {
    public static void main(String[] args) {
        ReleaseDate releaseDate1 = new ReleaseDate(2, 4, 2006);
        ReleaseDate releaseDate2 = new ReleaseDate(3, 5, 2007);
        ReleaseDate releaseDate3 = new ReleaseDate(5, 2, 2010);

        Studio studio1 = new Studio("S1", "VN");
        Studio studio2 = new Studio("S2", "Meo~");
        Studio studio3 = new Studio("S3", "Nga");

        Film film1 = new Film("Old father", 2020, studio1, 5000, releaseDate1);
        Film film2 = new Film("Bubble", 2018, studio2, 10000, releaseDate2);
        Film film3 = new Film("Sun flower", 2006, studio3, 19000, releaseDate3);

        System.out.println(film1.getStudioName());
        System.out.println(film1.getStudioName());
        System.out.println(film1.getStudioName());

        System.out.println(film3.isBetterCost(film2));

        System.out.println(film2.getTicketCostWithCoupon(20));
    }
}
