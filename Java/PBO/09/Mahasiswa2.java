public class Mahasiswa2 extends KTP {
    public String nim;
    public String prodi;
    public String fakultas;
    private double ipk;
    private long tagihan;

    // Getter & Setter
    public void setIpk(double n) {
        this.ipk = n;
    }
    public double getIpk() {
        return this.ipk;
    }

    public void setTagihan(long n) {
        this.tagihan = n;
    }
    public long getTagihan() {
        return this.tagihan;
    }

}
