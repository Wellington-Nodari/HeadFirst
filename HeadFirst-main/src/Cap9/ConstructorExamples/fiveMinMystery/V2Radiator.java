package Cap9.ConstructorExamples.fiveMinMystery;

import java.util.ArrayList;

class V2Radiator {
    V2Radiator(ArrayList<SimUnit> list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
    V2Radiator () {
        System.out.println("Nothing will be added to the list");
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList<SimUnit> lglist) {
        super(); // here was the issue, where the list of the V2 constructor was being added to this as well, setting it as 0 solved the problem.
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList<SimUnit> rlist) {
        rlist.add(new SimUnit("Retention"));
    }
}
