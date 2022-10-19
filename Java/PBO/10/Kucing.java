public class Kucing extends Binatang {
    private int berat;

    public void setBerat(int n) {
        this.berat = n;
    }
    public int getBerat() {
        return this.berat;
    }

    public void mengeong(String a) {
        System.out.println("Meong! " + a);
    }
}
