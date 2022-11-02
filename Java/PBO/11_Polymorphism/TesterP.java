public class TesterP {
    public static void main(String[] args) {
        BinatangP b;
        KucingP k;

        k = new KucingP();
        k.nama = "Udang";
        k.ras = "Kucing";
        k.jumlahKaki = 4;
        k.kecepatan = 10;

        k.cetakSifat();
        k.cetakBiodata();
        System.out.println("================");

        // Polymorphism:
        b = k;
        System.out.println(b.nama);

        k = (KucingP)b;
        k.cetakBiodata();
    }
}
