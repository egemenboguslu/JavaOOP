public class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void fieldMeasurement() {
        double area = Math.PI * radius * radius;
        System.out.println(getName() + " nin alani: " + area);

    }
}
