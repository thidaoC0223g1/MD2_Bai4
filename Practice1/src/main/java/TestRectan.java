import java.util.Scanner;

public class TestRectan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao chieu rong hinh chu nhat");
        double width = input.nextDouble();
        System.out.println("nhap vao chieu cao hinh chu nhat");
        double height= input.nextDouble();
        Rectangle hcn= new Rectangle(width,height);
        System.out.println(hcn.display());
        System.out.println("dien tich hinh chu nhat =" + hcn.getArea());
        System.out.println("chu vi hinh chu nhat =" + hcn.getPerimeter());

        }
    }

