package Shapes;

public class Square extends Quadralateral {

    @Override
    public void setLength(int l) {
        this.length = l;
        this.width = l;
    }

    @Override
    public void setWidth(int w) {
        this.length = w;
        this.width = w;

    }

    public Square(int l) {
        this.length = l;
        this.width = l;

    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
        // also works with super.getLength() or super.getWidth()
    }

    @Override
    public double getArea() {
        return this.length * this.width;
        // also works with super.getLength() or super.getWidth()
    }
}
