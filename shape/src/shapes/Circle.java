package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;
// Lớp Circle kế thừa từ Shape
class Circle extends Shape {
    private double radius;
    
    // Hàm khởi tạo
    public Circle() {}
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Getters và Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new InvalidInputException("Ban kinh ko hop le!");
        }
        this.radius = radius;
    }
    
    // Cài đặt phương thức nhập
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        do {
            try {
                System.out.print("Nhap ban kinh cua hinh tron: ");
                setRadius(scanner.nextDouble());
                valid = true; // Dữ liệu hợp lệ
            } catch (InputMismatchException e) {
                System.out.println("Khong hop le! Nhap lai so");
                scanner.nextLine(); // Đọc bỏ giá trị sai
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } finally {
                if (!valid) {
                    System.out.println("Vui long thu lai.");
                }
            }
        } while (!valid); // Yêu cầu nhập lại nếu dữ liệu không hợp lệ
    }
    
    // Cài đặt phương thức xuất
    @Override
    public void output() {

        System.out.println("Ban kinh: " + radius);
        System.out.println("Dien tich: " + calculateArea());
        System.out.println("Chu vi: " + calculatePerimeter());
    }
    
    // Cài đặt phương thức tính diện tích
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Cài đặt phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void performAction(){
        System.out.println("Thuc hien tinh toan cho hinh tron:");
        super.performAction();
    }
}
