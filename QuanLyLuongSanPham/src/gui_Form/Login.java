package gui_Form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txttaiKhoan;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 312);
		this.setTitle("Đăng Nhập");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltieuDe = new JLabel("ĐĂNG NHẬP HỆ THỐNG");
		lbltieuDe.setForeground(new Color(255, 255, 255));
		lbltieuDe.setFont(new Font("Arial", Font.BOLD, 16));
		lbltieuDe.setBounds(152, 11, 218, 29);
		contentPane.add(lbltieuDe);
		
		JLabel lbltenDangNhap = new JLabel("Tài Khoản:");
		lbltenDangNhap.setFont(new Font("Arial", Font.BOLD, 11));
		lbltenDangNhap.setBounds(30, 90, 58, 14);
		contentPane.add(lbltenDangNhap);
		
		JLabel lblmatKhau = new JLabel("Mật Khẩu:");
		lblmatKhau.setFont(new Font("Arial", Font.BOLD, 11));
		lblmatKhau.setBounds(31, 126, 57, 22);
		contentPane.add(lblmatKhau);
		
		txttaiKhoan = new JTextField();
		txttaiKhoan.setBounds(109, 87, 328, 20);
		contentPane.add(txttaiKhoan);
		txttaiKhoan.setColumns(10);
		
		JCheckBox chckhienMatKhau = new JCheckBox("Hiển Thị Mật Khẩu");
		chckhienMatKhau.setFont(new Font("Arial", Font.BOLD, 11));
		chckhienMatKhau.setBounds(310, 154, 127, 29);
		contentPane.add(chckhienMatKhau);
        chckhienMatKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chckhienMatKhau.isSelected()) {
                    passwordField.setEchoChar((char) 0); 
                } else {
                    passwordField.setEchoChar('*'); 
                }
            }
        });
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 127, 328, 20);
		contentPane.add(passwordField);
		
		
		JButton btnĐangNhap = new JButton("Đăng nhập");
		btnĐangNhap.setBounds(109, 220, 99, 23);
		contentPane.add(btnĐangNhap);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(329, 220, 89, 23);
		contentPane.add(btnThoat);
		
		JLabel AnhNen = new JLabel("");
		AnhNen.setIcon(new ImageIcon(Login.class.getResource("/img/AnhLogin.jpg")));
		AnhNen.setBounds(0, 0, 496, 50);
		contentPane.add(AnhNen);
		
		JLabel Nen1 = new JLabel("");
		Nen1.setBounds(72, 178, 46, 14);
		contentPane.add(Nen1);
	}
}
