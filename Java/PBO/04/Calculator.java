// Calculator with OOP

public class Calculator {
    // ATTRIBUTE
    public int angka1, angka2; 

    //  METHOD
    public void penjumlahan() {
        int hasil = angka1 + angka2;
        System.out.println("Hasil tambah = " + hasil);
    }

    public void pengurangan() {
        int hasil = angka1 - angka2;
        System.out.println("Hasil kurang = " + hasil);
    }

    public int perkalian(int a, int b) {
        int hasil = a * b;
        return hasil;
    }

    public double pembagian(double a, double b) {
        double hasil = a / b;
        return hasil;
    }

    public double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
}
