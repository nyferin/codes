/* 

1       = 1
10      = 2
100     = 3
1000    = 4
10000   = 5

*/

/* 

N! / R!(N - R)!

*/

public class SolutionNumber {
    public int solution(int[] L) {
        int N = 1, pos = 0;
        for (int i = 1; i <= L.length; i++) {
            N *= i;
        }

        int[][] temp = new int[N][L.length];
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Hai");
            for (int j = 0; j < L.length; j++) {
                
            }
            pos++;
        }

        return N;
    }
}
