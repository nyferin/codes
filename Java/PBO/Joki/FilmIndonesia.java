public class FilmIndonesia extends CinemaXXI {
    public double harga_tiket, pajak = 0.025;

    public void hargaTiket() {
        switch (hari_tayang) {
            case "Senin":
            case "Selasa":
            case "Rabu":
            case "Kamis":
                harga_tiket = 25000;
                break;
            case "Jumat":
                harga_tiket = 30000;
                break;
            case "Sabtu":
                harga_tiket = 40000;
                break;
            case "Minggu":
                harga_tiket = 50000;
                break;
            default:
                harga_tiket = 0;
                break;
        }
    }
    public double hitungTotal(double jumlah) {
        return (harga_tiket * jumlah) + (harga_tiket * jumlah * pajak);
    }

    public String cekBonus(double a) {
        if (a > 100000 && a < 150000) {
            return "1 Botol Aqua 400Ml";
        } else if (a > 150000 && a < 200000) {
            return "2 Botol Aqua 400Ml";
        } else if (a > 200000) {
            return "2 Popcorn Asin Ukuran M";
        } else {
            return "";
        }
    }
}
