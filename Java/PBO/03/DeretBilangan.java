// Numbers
public class DeretBilangan {
    public int N, bawah = 0, atas = 10;

    public void deretN() {
        for(N = bawah; N < atas; N++) {
            System.out.println(N);
        }
    }
    public void deret3N() {
        for(N = bawah; N < atas; N++) {
            System.out.println(N * 3);
        }
    }
}
