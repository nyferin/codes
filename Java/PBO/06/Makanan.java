// Foods with OOP
public class Makanan {
    // AM  TD       NA
    public String[] menu = 
        { "Nasi Goreng", 
        "Nasi Rames", 
        "Ayam Geprek", 
        "Rendang", 
        "Babi Kecap" };

    // AM  TD       NM           PM
    public String[] tampilMakanan(){
        return menu;
    }
    
    public String[] tampilMakananGenap(){
        String[] temp = new String[(menu.length / 2) + (menu.length % 2)];
        int count = 0;
        for (int i = 0; i < menu.length; i+=2) {
                temp[count] = menu[i];
                count++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Makanan listMakanan = new Makanan();

        for (int i = 0; i < listMakanan.menu.length; i++) {
            System.out.println(listMakanan.tampilMakanan()[i]);
        }
    }
}
