// Student data OOP
public class NilaiMahasiswa {
    public String[][] data = 
    {
        {"672021224", "Irene", "4.00"},
        {"672021238", "Ino", "4.00"},
        {"672021256", "Bimo", "4.00"},
        {"672021258", "Krisna", "4.00"},
        {"672021023", "Camuels", "4.00"}
    };

    public String[][] print() {
        return data;
    }

    public boolean search(String obj) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (obj.equals(data[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
