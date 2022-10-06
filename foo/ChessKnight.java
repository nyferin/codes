/* 
BOARD:
-------------------------
| 0| 1| 2| 3| 4| 5| 6| 7|
-------------------------
| 8| 9|10|11|12|13|14|15|
-------------------------
|16|17|18|19|20|21|22|23|
-------------------------
|24|25|26|27|28|29|30|31|
-------------------------
|32|33|34|35|36|37|38|39|
-------------------------
|40|41|42|43|44|45|46|47|
-------------------------
|48|49|50|51|52|53|54|55|
-------------------------
|56|57|58|59|60|61|62|63|
-------------------------

COMMAND: source, destination
*/
import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        int src = 0, dest = 0;
        Scanner input = new Scanner(System.in);
        SolutionKnight2 knight = new SolutionKnight2();

        System.out.print("Masukkan titik awal dan akhir: ");
        src = input.nextInt();
        dest = input.nextInt();

        System.out.println(knight.solution(src, dest));
        
        input.close();
    }
}
