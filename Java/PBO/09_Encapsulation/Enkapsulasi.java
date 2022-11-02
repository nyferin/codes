public class Enkapsulasi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nim = "672021037";
        System.out.println(mhs.nim);

        mhs.nama = "Anthony";
        System.out.println(mhs.nama);

        mhs.setTagihan(0);
        System.out.println(mhs.getTagihan());

        mhs.setIpk(4);
        System.out.println(mhs.getIpk());

        mhs.setPassword("xixixixi");
        System.out.println(mhs.getPassword());

    }
}