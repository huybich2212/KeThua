import java.awt.*;
import java.util.Scanner;

public class lophinhcn {
    double dai, rong;

    // khởi tạo phương thức constructor có tham số
    public lophinhcn(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    //khởi tạo phương thức constructor không có tham số
    public lophinhcn() {
    }

    public double getRong() {
        return rong;
    }

    public double getDai() {
        return dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    //tạo hàm tính diện tích
    double tinhDienTich() {
        return dai * rong;
    }

    //tạo hàm tính chu vi
    double tinhChuVi() {
        return (dai + rong) * 2;
    }
}
class Main {
    public static void main(String[] args) {
        //khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
        lophinhcn hcn = new lophinhcn();
        Scanner scanner = new Scanner(System.in);
        //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
        System.out.println("----------------------end----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}

