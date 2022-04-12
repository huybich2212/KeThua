import java.util.Scanner;

public class ptbhQuadraticEquation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập hệ số bậc 2,a =");
        float a = ptbhQuadraticEquation.scanner.nextFloat();
        System.out.println("Nhập hệ số bậc 1,b =");
        float b = ptbhQuadraticEquation.scanner.nextFloat();
        System.out.println("Nhập hằng số tự do, c =");
        float c = scanner.nextFloat();
        ptbhQuadraticEquation.GiaiptBac2(a,b,c);
    }
    public static void GiaiptBac2(float a,float b,float c)  {
        if (a == 0)  {
            if (b == 0)  {
                System.out.println("phương trình vô nghiệm");
            }else {
                System.out.println("phương trình có một nghiệm :" + "x= " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0)  {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("phương trình có hai nghiệm là :" + "x1=" +x1+"và x2" + x2);
        }else if (delta == 0) {
            x1 = (-b / (2*a));
            System.out.println("phương trình có nghiệm kép :" + "x1 = x2= "+ x1);
        }else {
            System.out.println("phương trình vô nghiệm!");
        }
    }
}
