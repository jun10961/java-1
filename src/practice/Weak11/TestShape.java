package practice.Weak11;

interface IShape {
    public double getArea();
    double getPerimeter();
}

public class ShapeImpl implements IShape{
    public double getArea(){return 0.0;}
    public double getPerimeter(){return 0.0;}
}
