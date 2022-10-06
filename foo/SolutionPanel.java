public class SolutionPanel {
    public int[] solution(int area) {
        int count = 0;
        double areaRoot, areaSquare, areaDouble = (double)area;
        
        while(areaDouble > 0.0) {
            areaRoot = Math.floor(Math.sqrt(areaDouble));
            areaSquare = Math.pow(areaRoot, 2);
            areaDouble -= areaSquare;
            count++;
        }
        
        int[] areas = new int[count];
        areaDouble = (double)area;

        for(int i = 0; i < count; i++) {
            areaRoot = Math.floor(Math.sqrt(areaDouble));
            areaSquare = Math.pow(areaRoot, 2);
            areaDouble -= areaSquare;
            areas[i] = (int) areaSquare;
        }
        return areas;
    }
}