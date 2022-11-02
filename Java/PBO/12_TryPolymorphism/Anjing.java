public class Anjing extends Binatang {
    private int Kecepatan;
    public String Ras;

    public int getKecepatan()
    {
        return Kecepatan;
    }

    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }

    @Override
    public void Cetak() {
        System.out.println("Jenis Binatang\t: " + this.Jenis);
        System.out.println("Nama\t\t: " + this.Nama);
        System.out.println("Ras\t\t: " + this.Ras);
        System.out.println("Kecepatan\t: " + this.Kecepatan + " mph");
        
    }

    @Override
    public void CetakNama() {
        System.out.println(this.Nama);
        
    }
}
