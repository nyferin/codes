public class CinemaXXI {
    public String judul_film, hari_tayang;
    public double jam_tayang, jumlah_tiket;

    public void cetakTiket() {
        System.out.println("Judul film: " + judul_film);
        System.out.println("Hari tayang: " + hari_tayang);
        System.out.printf("Jam tayang: %.2f WIB\n", jam_tayang);
        System.out.printf("Jumlah tiket: %.0f\n", jumlah_tiket);
    }
}
