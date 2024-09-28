import java.util.InputMismatchException;
import java.util.Scanner;
// Lớp Rectangle kế thừa từ Shape
class Rectangle extends Shape {
    private double width;
    private double height;
    
    // Hàm khởi tạo
    public Rectangle() {}
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Getters và Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws InvalidInputException {
        if (width <= 0){
            throw new InvalidInputException("Chieu rong phai duong");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws InvalidInputException {
        if (height <= 0){
            throw new InvalidInputException("Chieu cao phai duong");
        }
        this.height = height;
    }

    @Override
    // Cài đặt phương thức nhập
    public void input() {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        do {
            try {
                System.out.print("Nhap chieu rong: ");
                setWidth(scanner.nextDouble());

                System.out.print("Nhap chieu dai: ");
                setHeight(scanner.nextDouble());

                valid = true; // Nếu không có lỗi, dữ liệu hợp lệ
            } catch (InputMismatchException e) {
                System.out.println("Không hợp lệ!Nhập lại số");
                scanner.nextLine(); // Đọc bỏ giá trị sai
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } finally {
                if (!valid) {
                    System.out.println("Vui lòng nhập lại");
                }
            }
        } while (!valid); // Yêu cầu nhập lại nếu dữ liệu không hợp lệ
    }
    }
    
    // Cài đặt phương thức xuất
    public void output() {
        System.out.println("Chieu rong: " + width);
        System.out.println("Chieu dai: " + height);
        System.out.println("Dien tich: " + calculateArea());
        System.out.println("Chu vi: " + calculatePerimeter());
    }
    
    // Cài đặt phương thức tính diện tích
    public double calculateArea() {
        return width * height;
    }
    
    // Cài đặt phương thức tính chu vi
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void performAction() {
        System.out.println("Thuc hien tinh toan cho hinh chu nhat");
        super.performAction(); // Gọi phương thức in thông tin của lớp cha
    }
}

