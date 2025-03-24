package lab5.bai3;

abstract class shape {
    protected String color;
    protected boolean filled;

    public shape() {
        this.color = "red";;
        this.filled = true;
    }
    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        shape shape = (lab5.bai3.shape) obj;
        return filled == shape.filled && color.equals(shape.color);
    }
}
