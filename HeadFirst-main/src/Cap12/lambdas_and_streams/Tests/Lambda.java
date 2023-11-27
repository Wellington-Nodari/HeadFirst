package Cap12.lambdas_and_streams.Tests;

import java.util.List;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> nums = List.of (1, 2, 3, 4, 5);

        String output = "";

        for (int i = 0; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }

//        for (Integer num : nums) {
//            output += nums + " ";
//        }
        System.out.println(output);

//        Stream
    }
}
