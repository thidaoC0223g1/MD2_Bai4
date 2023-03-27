public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public String display(){
        return "hinh chu nhat co kich thuoc la  " + width +" "+ height ;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public double getArea() {
        return this.width * this.height;
    }

}
