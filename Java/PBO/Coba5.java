public class Coba5 {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
            System.out.println("Hasil= " + x);
        } catch (Exception e) {
            System.out.println("Tidak dapat dibagi 0 \n" + e);
        }
    }
}
