public class Pewarisan {
    public static void main(String[] args) {
        Mahasiswa2 mhs = new Mahasiswa2();

        mhs.nik = "337301******";
        mhs.nama = "Anthony";
        mhs.setTtl("DD-MM-YYYY");
        mhs.setAgama("Kepercayaan");
        mhs.jenisKelamin = "L";
        mhs.nim = "672021***";
        mhs.fakultas = "FTI";
        mhs.prodi = "Teknik Informatika";
        mhs.setIpk(4);
        mhs.setTagihan(0);

        System.out.println(mhs.nik);
        System.out.println(mhs.nama);
        System.out.println(mhs.getTtl());
        System.out.println(mhs.getAgama());
        System.out.println(mhs.jenisKelamin);
        System.out.println(mhs.nim);
        System.out.println(mhs.fakultas);
        System.out.println(mhs.prodi);
        System.out.println(mhs.getIpk());
        System.out.println(mhs.getTagihan());
    }
}
