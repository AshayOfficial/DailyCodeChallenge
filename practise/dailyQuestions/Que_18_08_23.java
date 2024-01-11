package practise.dailyQuestions;

public class Que_18_08_23 {
    public static void main(String[] args) {
        Double x1 = 3d;
        Double y1 = 4d;
        Double r1 = 5d;
        Double x2 = 14d;
        Double y2 = 18d;
        Double r2 = 18d;

        System.out.println(canCirclesTouch(x1, y1, r1, x2, y2, r2));
    }

    private static int canCirclesTouch(Double x1, Double y1, Double r1, Double x2, Double y2, Double r2) {
        double distanceBetween2Points = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
        double totalLengthOfRadiusOfCircles = r1 + r2;

        if (distanceBetween2Points <= totalLengthOfRadiusOfCircles)
            return 1;

        return 0;
    }
}
