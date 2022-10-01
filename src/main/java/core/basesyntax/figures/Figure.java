package core.basesyntax.figures;

public abstract class Figure implements Drawingtool, AreaCalculator {

    private String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public abstract String toString();

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public abstract double getArea();

    public String getColour() {
        return colour;
    }
}
