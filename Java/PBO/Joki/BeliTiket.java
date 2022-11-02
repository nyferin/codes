public class BeliTiket {
    public static void main(String[] args) {
        FilmHollywood fh = new FilmHollywood();
        FilmIndonesia fi = new FilmIndonesia();

        fh.judul_film = "Black Adam";
        fh.hari_tayang = "Kamis";
        fh.jam_tayang = 15;
        fh.jumlah_tiket = 5;
        fh.hargaTiket();
        System.out.println("-- Rincian Pembelian Tiket Film --");
        fh.cetakTiket();
        System.out.println("Harga Tiket: Rp. "+ fh.harga_tiket);
        System.out.println("Total Bayar Anda: Rp. " + fh.hitungTotal(fh.jumlah_tiket));
        System.out.println("Bonus " + fh.cekBonus(fh.hitungTotal(fh.jumlah_tiket)));

        System.out.println();

        fi.judul_film = "Pengabdi Setan 2: Communion";
        fi.hari_tayang = "Sabtu";
        fi.jam_tayang = 19;
        fi.jumlah_tiket = 10;
        fi.hargaTiket();
        System.out.println("-- Rincian Pembelian Tiket Film --");
        fi.cetakTiket();
        System.out.println("Harga Tiket: Rp. "+ fi.harga_tiket);
        System.out.println("Total Bayar Anda: Rp. " + fi.hitungTotal(fi.jumlah_tiket));
        System.out.println("Bonus " + fi.cekBonus(fi.hitungTotal(fi.jumlah_tiket)));
    }
}
