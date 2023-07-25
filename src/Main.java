import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            float av = a.nextFloat();

            Scanner x = new Scanner(System.in);
            float xv = x.nextFloat();

            Scanner b = new Scanner(System.in);
            float bv = b.nextFloat();

            Scanner c = new Scanner(System.in);
            float cv = c.nextFloat();

            System.out.println(av * xv * xv + bv * xv + cv);
        }
    }
