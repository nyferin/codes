public class TahunKabisat {
    public int tahun;
    public String cekKabisat() {
        if(tahun % 4 == 0) {
            return "Kabisat";
        } else {
            return "bukan Kabisat";
        }
    } 
}
