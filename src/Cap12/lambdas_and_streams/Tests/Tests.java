package Cap12.lambdas_and_streams.Tests;

import java.util.*;

class Tests {
    public static void main(String [] args) {
        List<String> allCollors = List.of("Red", "Blue", "Yellow");
//        for (String color : allCollors) {
//            System.out.println(color);
//        }

        allCollors.forEach(color -> System.out.println(color));
    }
}


