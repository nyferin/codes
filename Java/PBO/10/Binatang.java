public class Binatang {
    private String kodeBinatang, nama, pemilik;
    public int usia, berat;

    public void setKodeBinatang(String a, int n) {
        this.kodeBinatang = a + String.format("%03d", n);
    }
    public String getKodeBinatang() {
        return this.kodeBinatang;
    }

    public void setNama(String a) {
        this.nama = a;
    }
    public String getNama() {
        return this.nama;
    }

    public void setPemilik(String a) {
        this.pemilik = a;
    }
    public String getPemilik() {
        return this.pemilik;
    }
}
