package lab7_Prob2;

public class EquilateralTriangle implements Polygon {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getSides() {
        double[] sides = {side,side,side};
        return sides;
    }


}
