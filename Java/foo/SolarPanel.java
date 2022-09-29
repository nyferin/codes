import java.util.Scanner;

public class SolarPanel {
  public static void main(String[] args) {
    int area = 0;
    Scanner input = new Scanner(System.in);
    SolutionPanel panel = new SolutionPanel();

    area = input.nextInt();
    int[] cetak = panel.solution(area);

    for (int i = 0; i < cetak.length; i++) {
      System.out.print(cetak[i] + " ");
    }
    input.close();
  }
}
