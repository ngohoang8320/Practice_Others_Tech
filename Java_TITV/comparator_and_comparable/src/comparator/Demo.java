package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,
                               Integer o2) {
                return o1 % 10 > o2 % 10
                        ? 1
                        : -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        System.out.println(nums);

//        nums.sort(null);
        Collections.sort(nums, com); //Do not need the argument "com" because in Integer already have the default comparator logic by implement interface Comparable in it
//        Collections.sort(nums);
        
        System.out.println(nums);


    }
}
