public class DataMahasiswa {
    public String nama, nim, jk;
    
    public String namaMahasiswa() {
        return "Selamat Datang " + nama + ",";
        
    }

    public String cekProgdi() {
        String progdi = nim.substring(0, 2); // [67]2021001
        if (progdi.equals("67")) {
            return "Teknik Informatika";
        } else if (progdi.equals("68")) {
            return "Sistem Informasi";
        } else if (progdi.equals("69")) {
            return "Desain komunikasi Visual";
        } else {
            return "progdi tidak ditemukan";
        }
    }

    public String cekAngkatan() {
        return nim.substring(2, 6); // contoh 67[2021]001
    }

    public String jKelamin() {
        if (jk.equals("w") || jk.equals("W") || jk.equals("Wanita") || jk.equals("wanita")) {
            return "mahasiswi";    
        } else if (jk.equals("p") || jk.equals("P") || jk.equals("Pria") || jk.equals("pria")) {
            return "mahasiswa";
        } else {
            return "jenis kelamin tidak ditemukan";
        }
    }
}
