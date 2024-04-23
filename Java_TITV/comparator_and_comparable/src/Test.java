import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 8, 1, 9};
//        arrays[0] = 5;
//        arrays[1] = 2;
//        arrays[2] = 8;
        System.out.println(Arrays.toString(arrays));

        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
