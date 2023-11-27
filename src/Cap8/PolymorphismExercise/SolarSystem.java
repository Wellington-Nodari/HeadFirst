package Cap8.PolymorphismExercise;

public class SolarSystem {
    public static void main (String[] args) {
       CelesteBody[] ss = new CelesteBody[9];

       ss[0] = new Sun();
       ss[1] = new Mercury();
       ss[2] = new Venus();
       ss[3] = new Earth();
       ss[4] = new Mars();
       ss[5] = new Jupiter();
       ss[6] = new Saturn();
       ss[7] = new Neptune();
       ss[8] = new Uranus();

       Sun sun = (Sun) ss[0];
       sun.setDistanceFromSun(0);
       sun.setGravity(274);
       sun.setRadius(696340);
       sun.setHasMoons(false);
       sun.setSurfaceTemperature(6000);

       System.out.println(sun.getClass()+":");
       sun.composition();
       sun.shine();
       sun.move();

       Earth earth = (Earth) ss[3];
       earth.setDistanceFromSun(150);
       earth.setGravity(9.8);
       earth.setRadius(6378);
       earth.setHasMoons(false);
       earth.setSurfaceTemperature(14.76);

       if(earth.getHasMoons()) {
          System.out.println("Yeah baby, we have THE MOON!");
       } else {
          System.out.println("Liar");
       }

       System.out.println(earth.getClass() + ":");
       earth.yearToDays();
       earth.composition();
       earth.move();
       System.out.println(earth.move(24.0));
       System.out.println(earth.move(730f));

    }

}
