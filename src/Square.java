public class Square implements IShape {

    private Triangle triangle1;
    private Triangle triangle2;
    private Line diagonal;

    @Override
    public double calcS() {

        return triangle1.calcS() + triangle2.calcS();
    }

    @Override
    public double calcL() {
        return triangle1.calcL() + triangle2.calcL() - 2*diagonal.calcL();
    }

    @Override
    public void initialize(String... points) {
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        diagonal = new Line();

        triangle1.initialize(points[0], points[1], points[2], points[3], points[4], points[5]);
        triangle2.initialize(points[4], points[5], points[6], points[7], points[0], points[1]);
        diagonal.initialize(points[0], points[1], points[4], points[5]);
    }
}
