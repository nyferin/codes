// Method with data type
import java.util.Scanner;

public class CobaOOPLagi2 {
    public static void main(String[] args) {
        NilaiMahasiswa dt = new NilaiMahasiswa();

        String[][] temp = dt.print();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\n");

        System.out.print("Masukkan data: ");
        Scanner input = new Scanner(System.in);

        String object = input.nextLine();

        if (dt.search(object) == true) {
            System.out.println("ADA");
        } else {
            System.out.println("TIDAK ADA");
        }
        input.close();
    }
}