public class Mahasiswa {
    // Capsulated atribute
    public String nim;
    public String nama;
    private String password;
    private double ipk;
    private double tagihan;

    // Getter & Setter
    // Tagihan
    public double getTagihan() {
        return this.tagihan;
    }
    public void setTagihan(double n) {
        this.tagihan = n;
    }
    // Password
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String a) {
        this.password = a;
    }
    // IPK
    public double getIpk() {
        return this.ipk;
    }
    public void setIpk(double n) {
        this.ipk = n;
    }

    
}
