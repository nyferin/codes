public class Kucing extends Binatang{
    public String Ras;
    private int Berat;

    public int getBerat() {
        return Berat;
    }
    public void setBerat(int berat) {
        Berat = berat;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis binatang\t: " + this.Jenis);
        System.out.println("Nama\t\t: " + this.Nama);
        System.out.println("Ras\t\t: " + this.Ras);
        System.out.println("Berat\t\t: " + this.Berat + " kg");
        
    }

    @Override
    public void CetakNama() {
        System.out.println(this.Nama);
        
    }
}