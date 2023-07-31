import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
public class RoundOff{
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  
    public static void main(String[] args) {
        double num = 1234.1595235625;
        System.out.println("Original Number: " +num);
        System.out.println("Roundoff Number: "+decfor.format(num));
        decfor.setRoundingMode(RoundingMode.DOWN); 
        System.out.println("Roundoff Number: "+decfor.format(num));

    }
}