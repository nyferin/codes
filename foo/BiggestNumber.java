import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SolutionNumber num = new SolutionNumber();
        int[] L = {1, 2};
        System.out.println(num.solution(L) + " ");
        input.close();
    }

}
