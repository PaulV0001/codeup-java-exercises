package Shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int l, int w) {
        this.length = l;
        this.width = w;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int l);

    public abstract void setWidth(int w);

    public Quadrilateral() {

    }

}
