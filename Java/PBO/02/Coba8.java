// Array
import java.util.Scanner;

public class Coba8 {
    public static void main(String[] args) {
        // int[] a = new int[10];

        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a);
        // }

        // double[] kp = new double[9];
        // kp[3] = 10;

        // System.out.println(kp[3]);

        // for (int i = 0; i < kp.length; i++) {
        // System.out.println("Kamar " + (i + 1));
        // }

        // try {
        // double[] kp = new double[9];
        // kp[3] = 10;
        // kp[9] = 100;

        // System.out.println(kp[3] + " " + kp[9]);
        // } catch (ArithmeticException e) {
        // System.out.println("ERROR HIYA HIYA HIYA 1");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("ERROR HIYA HIYA HIYA 2");
        // } finally {
        // System.out.println("ERROR HIYA HIYA HIYA 3");
        // }

        String[] ps = { "A", "B", "C", "D", "E" };
        System.out.println(ps[1]);

        int kp[] = new int[10];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < kp.length; i++) {
            System.out.print("Kamar ke-" + (i + 1) + ": ");
            kp[i] = input.nextInt();
        }
        input.close();
    }
}
