package shapes;
import java.util.Scanner;

interface GeometricProperties {
    double calculateArea();        // Tính diện tích
    double calculatePerimeter();   // Tính chu vi
    void performAction();          
}

// Lớp kiểm tra
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("Menu:");
            System.out.println("1,Hinh chu nhat");
            System.out.println("2,Hình Tron");
            System.out.println("3,Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();

            Shape shape = null;
            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Circle();
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon ko hop le!!!");
                    continue;
            }
            if(shape != null){
                shape.input();
                shape.performAction();
            }
        } while ( choice != 3);
        // // Kiểm tra lớp Rectangle
        // Rectangle rectangle = new Rectangle();
        // rectangle.input();
        // rectangle.output();
        
        // // Kiểm tra lớp Circle
        // Circle circle = new Circle();
        // circle.input();
        // circle.output();
    }
}
