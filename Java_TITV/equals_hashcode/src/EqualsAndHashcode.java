public class EqualsAndHashcode {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(15, 5, 2005);
        MyDate date2 = new MyDate(2, 3, 2005);
        MyDate date3 = new MyDate(15, 5, 2005);

        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
        System.out.println();

        System.out.println(date1 == date2);
        System.out.println(date1 == date3);
        System.out.println();

        System.out.println(date1.equals(date2)); //true because equals just compare the year (like I set up in MyDate class)
        System.out.println(date1.equals(date3));
    }
}
