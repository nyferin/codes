
public class Code2 {
    public static void main(String[] args) {
        int x = 0, check;

        check = x % 2; // check == 1 || check == 0

        switch (check) {
            case 1:
                System.out.println("Ganjil");
                break;
            case 0:
                System.out.println("Genap");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
