package gui_Form;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng form đăng nhập
        Form_DangNhap formDangNhap = new Form_DangNhap();

        // Đảm bảo hiển thị formDangNhap chính giữa màn hình
        formDangNhap.setLocationRelativeTo(null);

        // Hiển thị form đăng nhập
        formDangNhap.setVisible(true);
    }
}

