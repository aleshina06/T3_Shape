import static java.lang.Math.sqrt;

public class Triangle implements IShape {

    private Line line1;
    private Line line2;
    private Line line3;

    @Override
    public double calcS() {

        double perimeter = calcL();
        return sqrt(perimeter * (perimeter - line1.calcL()) +
                (perimeter - line2.calcL()) +
                (perimeter - line3.calcL()) );
    }

    @Override
    public double calcL() {

        return line1.calcL() + line2.calcL() + line3.calcL();
    }

    @Override
    public void initialize(String... points) {

        line1 = new Line();
        line2 = new Line();
        line3 = new Line();

        line1.initialize(points[0], points[1], points[2], points[3]);
        line2.initialize(points[2], points[3], points[4], points[5]);
        line3.initialize(points[4], points[5], points[0], points[1]);
    }


}
