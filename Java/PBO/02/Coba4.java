// Print odd numbers
public class Coba4 {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i -= 2) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
