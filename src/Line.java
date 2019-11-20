import static java.lang.Math.sqrt;

public class Line implements IShape {

    private Point firstPoint;
    private Point secondPoint;

    @Override
    public double calcS() {
        return 0;
    }

    @Override
    public double calcL() {
        double a = firstPoint.getX() - secondPoint.getX();
        double b = secondPoint.getY() - secondPoint.getY();

        return sqrt((a*a)+(b*b));
    }

    @Override
    public void initialize(String... points) {
        firstPoint = new Point();
        secondPoint = new Point();
        firstPoint.initialize(points[0],points[1]);
        secondPoint.initialize(points[2],points[3]);

    }
}
