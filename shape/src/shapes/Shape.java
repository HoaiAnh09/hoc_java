abstract class Shape implements GeometricProperties {  
    // Phương thức nhập và xuất dữ liệu
    public abstract void input();
    public abstract void output();

    @Override
    public void performAction(){
        output();
    }
}
