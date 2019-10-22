package lab7_Prob2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter(){
        double[] sides = getSides();
        double totalSides = 0.0;
        for (double side : sides)
            totalSides += side;
        return totalSides;
    }
}
