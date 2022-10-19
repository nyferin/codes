public class PegawaiTetap {
    public String nip, nama;
    public long banyakLembur = 0, gajiPokok = 10000000, lembur = 50000, totalGaji = 0;
    public long gajiTotal() {
        return gajiPokok + banyakLembur * lembur + gajiPokok * 24 / 100;
    }
}
