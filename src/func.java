import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class func {
    public static void deut(){
        DecimalFormat format = new DecimalFormat("#########0.00##");
        if(lib.a!=0){
            lib.D = Math.pow(lib.b, 2) - 4*lib.a*lib.c;
            if(lib.D>0){
                lib.x1 = (-1*lib.b + Math.sqrt(lib.D))/(2*lib.a);
                lib.x2 = (-1*lib.b - Math.sqrt(lib.D))/(2*lib.a);
                lib.outcome = "Η εξίσωση έχει δύο λύσεις:\n x1 = " + format.format(lib.x1) + "\n x2 = " + format.format(lib.x2);
            }else if(lib.D==0){
                lib.x = (-1*lib.b)/(2*lib.a);
                lib.outcome = "Η εξίσωση έχει μία διπλή λύση:\n x = " + format.format(lib.x);
            }else{
                lib.outcome = "Η εξίσωση δεν έχει πραγματικές λύσεις.";
            }
        }else{
            if(lib.b==0){
                if(lib.c==0){
                    lib.outcome = "Η εξίσωση είναι αόριστη";
                }else{
                    lib.outcome = "Η εξίσωση είναι αδύνατη";
                }
            }else{
                lib.x = (-1*lib.c)/lib.b;
                lib.outcome = " Η ρίζα της εξίσωσης είναι:\n x = " + format.format(lib.x);
            }
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(".\\file.txt"));
            writer.write("a: " + lib.a + "\nb: " + lib.b + "\nc: " + lib.c + "\nD: " + lib.D + "\nEither x or x1,x2 should have values" + "\nx: " + lib.x + "\nx1: " + lib.x1 + "\nx2: " + lib.x2);
            writer.close();
        } catch (IOException el) {
            System.out.println("Exception" + el);
        }
    }
}
