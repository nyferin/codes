public class PegawaiKontrak {
    public String nip, nama;
    public long banyakLembur = 0, gajiPokok = 5000000, lembur = 50000, totalGaji = 0;
    public long  gajiTotal() {
        return gajiPokok + banyakLembur * lembur + gajiPokok * 12 / 100;
    }
}