package Cap9.ConstructorExamples.fiveMinMystery;

import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);

        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}

class SimUnit {
    String botType;

    SimUnit(String type) {
        botType = type;
        System.out.println(botType);
    }

    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } return 4;
    }
}
