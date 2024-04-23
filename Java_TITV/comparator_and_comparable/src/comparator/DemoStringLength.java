package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoStringLength {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1,
                               String o2) {
                return o1.length() > o2.length()
                        ? 1
                        : -1;
            }
        };

//        List<Integer> nums = new ArrayList<>();
//        nums.add(43);
//        nums.add(31);
//        nums.add(72);
//        nums.add(29);

        List<String> nums = new ArrayList<>();
        nums.add("Ab");
        nums.add("A");
        nums.add("ANHFJ");
        nums.add("JAO");


        System.out.println(nums);

//        nums.sort(null);
        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
