package Cap10.Statics.numberFormatting;

public class NumbFormat {
    public static void main(String[] args) {
        long numb1 = 1000000000;
        long numb2 = 1_000_000_000;
        double numb3 = 547823654.129; // wrapper types will work too, since it's compatible

        String s = String.format("%,3.2f", numb3);
        String s2 = String.format("%,6.1f", 42.000); // % [argument number (if there's more than one %)] [flags (adding comma or negative, etc)] >>
                                                        // [width (number of characters that will be used)] [precision (floating points numb)] type (type is mandatory)
                                                            // eg. on "%,6.1f": [no argument numbers] [flag = ,] [width = 6] [precision = .1] type = f


        String s3 = String.format("%x", 255);
        String s4 = String.format("%c", 60);
        System.out.println(s);

        System.out.println(String.format("The rank is %,d out of %,.2f", numb2, numb3));
    }

}
