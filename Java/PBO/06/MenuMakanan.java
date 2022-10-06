// Method with data type
public class MenuMakanan {
    public static void main(String[] args) {
        Makanan listMakanan = new Makanan();

        System.out.println("Cara 1:");
        for (int i = 0; i < listMakanan.menu.length; i++) {
            System.out.println(listMakanan.tampilMakanan()[i]);
        }
        System.out.println("\n");

        System.out.println("Cara 2:");
        String[] temp = listMakanan.tampilMakanan();
        for (int i = 0; i < listMakanan.menu.length; i++) {
            System.out.println(temp[i]);
        }
        System.out.println("\n");

        System.out.println("Genap 1:");
        temp = listMakanan.tampilMakanan();
        for (int i = 0; i < listMakanan.menu.length; i+=2) {
            if (i % 2 == 0) {
                System.out.println(temp[i]);
            }
        }
        System.out.println("\n");

        System.out.println("Genap 2:");
        temp = listMakanan.tampilMakanan();
        for (int i = 0; i < listMakanan.menu.length; i+=2) {
            System.out.println(temp[i]);
        }
        System.out.println("\n");

        System.out.println("Genap 3:");
        for (int i = 0; i < listMakanan.tampilMakananGenap().length; i++) {
            System.out.println(listMakanan.tampilMakananGenap()[i]);
        }
        System.out.println("\n");
    }
}
