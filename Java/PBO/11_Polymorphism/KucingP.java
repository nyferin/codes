/*
 * Sub class KucingP
 */
public class KucingP extends BinatangP implements SifatP {
    public int kecepatan;
    
    @Override
    public void cetakSifat() {
        System.out.println("Sifat dari " + super.nama + " adalah suka mencakar.");
    }
    public void cetakBiodata() {
        System.out.println("Nama: " + super.nama);
        System.out.println("Ras: " + super.ras);
        System.out.println("Jumlah kaki: " + super.jumlahKaki);
        System.out.println("Kecepatan: " + this.kecepatan);

    }
}
