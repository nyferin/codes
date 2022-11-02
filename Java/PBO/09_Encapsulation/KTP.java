public class KTP {
    public String nik;
    public String nama;
    private String ttl;
    private String agama;
    public String jenisKelamin;

    // Getter & Setter
    // Tempat Tanggal Lahir
    public void setTtl(String a) {
        this.ttl = a;
    }
    public String getTtl() {
        return this.ttl;
    }
    // Agama
    public void setAgama(String a) {
        this.agama = a;
    }
    public String getAgama() {
        return this.agama;
    }

}
