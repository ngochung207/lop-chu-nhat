public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double _width, double _height) {
        this.width = _width;
        this.height = _height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}
