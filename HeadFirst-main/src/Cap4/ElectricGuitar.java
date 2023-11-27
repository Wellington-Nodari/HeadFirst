package Cap4;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUsesIt(boolean yesOrNo) {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
