package lab7_Prob2;

public class Ellipse implements ClosedCurve{
    private double semiAxes;
    private double eIntegral;

    public Ellipse(double semiAxes, double eIntegral) {
        this.semiAxes = semiAxes;
        this.eIntegral = eIntegral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiAxes * eIntegral;
    }


}
