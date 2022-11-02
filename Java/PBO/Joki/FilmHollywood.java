public class FilmHollywood extends CinemaXXI {
    public double harga_tiket, pajak = 0.05;

    public void hargaTiket() {
        switch (hari_tayang) {
            case "Senin":
            case "Selasa":
            case "Rabu":
            case "Kamis":
                harga_tiket = 35000;
                break;
            case "Jumat":
                harga_tiket = 40000;
                break;
            case "Sabtu":
                harga_tiket = 50000;
                break;
            case "Minggu":
                harga_tiket = 60000;
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
            return "2 Teh Pucuk Harum 400Ml";
        } else if (a > 150000 && a < 200000) {
            return "4 Teh Pucuk Harum 400Ml";
        } else if (a > 200000) {
            return "2 Popcorn Caramel Ukuran L";
        } else {
            return "";
        }
    }
}
