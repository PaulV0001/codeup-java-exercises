package Shapes;

public class Rectangle extends Quadralateral implements Measurable{

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;

    }


    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(int l) {
        this.length = l;
    }

    @Override
    public void setWidth(int w) {
        this.width = w;
    }
}
