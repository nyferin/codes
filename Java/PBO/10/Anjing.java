public class Anjing extends Binatang {
    private int kecepatan;

    public void setKecepatan(int a) {
        this.kecepatan = a;
    }
    public int getKecepatan() {
        return this.kecepatan;
    }

    public void menggonggong(String a) {
        System.out.println("Gukk! " + a);
    }
}
