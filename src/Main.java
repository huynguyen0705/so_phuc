import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        QuanLySoPhuc quanLySoPhuc = new QuanLySoPhuc();
        while (isRunning){
            try {
                System.out.println("1. Nhập số phức");
                System.out.println("2. Tính tích 2 số phức");
                System.out.println("3. Thoát");
                System.out.println("Mời nhập: ");
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                if (input < 1 || input > 3){
                    System.out.println("Nhập sai");
                }
                switch (input){
                    case 1:
                        System.out.println("NHẬP VÀO SỐ PHỨC");
                        System.out.println("Nhập phần thực: ");
                        Scanner scanner1 = new Scanner(System.in);
                        double a = scanner1.nextDouble();
                        System.out.println("Nhập phần ảo: ");
                        Scanner scanner2 = new Scanner(System.in);
                        double b = scanner2.nextDouble();
                        quanLySoPhuc.NhapSoPhuc(a,b);
                        quanLySoPhuc.HienThiSoPhuc();
                        break;
                    case 2:
                        System.out.println("TÍNH TÍCH 2 SỐ PHỨC");
                        System.out.println("Nhập số phức thứ 2");
                        System.out.println("Nhập phần thực: ");
                        Scanner scanner3 = new Scanner(System.in);
                        double a2 = scanner3.nextDouble();
                        System.out.println("Nhập phần ảo: ");
                        Scanner scanner4 = new Scanner(System.in);
                        double b2 = scanner4.nextDouble();
                        quanLySoPhuc.Nhan2SoPhuc(new SoPhuc(a2, b2)).HienThiSoPhuc();
                        break;
                    case 3:
                        isRunning = false;
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Nhập sai tham số đầu vào");
            }
        }
    }
}