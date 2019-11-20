public class Point implements IShape {

    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double calcS() {
        return 0;
    }

    @Override
    public double calcL() {
        return 0;
    }

    @Override
    public void initialize(String... coordinates) {
        x = Double.parseDouble(coordinates[0]);
        y = Double.parseDouble(coordinates[1]);
    }
}
