import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

class ListBelanja {
    public static void main(String[] args) {
        // ItemBelanja item = new ItemBelanja();
        ArrayList<ItemBelanja> list = new ArrayList<ItemBelanja>();
        Scanner in = new Scanner(System.in);

        String id, produk, pilihan = "0";
        int jumlah, isi;

        System.out.print("Jumlah belanjaan: ");
        jumlah = in.nextInt();
        in.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan id: ");
            id = in.nextLine();
            System.out.print("Masukkan produk: ");
            produk = in.nextLine();
            System.out.print("Masukkan jumlah: ");
            isi = in.nextInt();
            in.nextLine();
            ItemBelanja itm = new ItemBelanja(id, produk, isi);
            list.add(itm);
        }

        while (!pilihan.equalsIgnoreCase("n")) {
            System.out.print("\nMENU\n\n");
            System.out.print("1. Tampilkan list belanjaan\n2. Jumlah terbesar\nExit (n)\n");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextLine();

            switch (pilihan) {
                case "1":
                System.out.println();
                int idx = 0, idp = 0, idj = 0;
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = idx; j < list.size(); j++) {
                            System.out.print("ID\t: " + list.get(idx).id + "\t|");
                            idx++;
                        }
                        System.out.println();
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Produk\t: " + list.get(idp).produk + "\t|");
                            idp++;
                        }
                        System.out.println();
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Jumlah\t: " + list.get(idj).jumlah + "\t|");
                            idj++;
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    break;
                case "n":
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }

        in.close();
    }
}