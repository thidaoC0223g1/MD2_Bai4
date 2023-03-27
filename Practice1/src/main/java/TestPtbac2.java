import java.util.Scanner;

public class TestPtbac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao tham so thu 1 a = ");
        double a = input.nextDouble();
        System.out.println("nhap vao tham so thu 2 b = ");
        double b = input.nextDouble();
        System.out.println("nhap vao tham so thu 3 c =");
        double c = input.nextDouble();
        Ptbac2 pt1 = new Ptbac2(a, b, c);
        if (pt1.getDelta() < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (pt1.getDelta() == 0) {
            System.out.println("phuong trinh co nghiem kep = " + -b/(2*a));

        }else{
            System.out.println("phuong trinh co 2 nghiem phan biet ");
            System.out.printf( "%s%4.2f","x1 = " , pt1.getNgiem1());
            System.out.println();
            System.out.printf("%s%4.2f","x2 = " ,  pt1.getNgiem2());
        }


    }
}
