package gui_Form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connectDB.Conection_DB;
import dao.DAO_DangNhap;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Label;

public class Form_DangNhap extends JFrame {
	private JTextField txttaiKhoan;
	private JPasswordField passwordField;
	private DAO_DangNhap dn_dao;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_DangNhap frame = new Form_DangNhap();
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
	public Form_DangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrangChu.class.getResource("/img/ungdung.png")));
		setBounds(100, 100, 841, 446);
		this.setTitle("Đăng Nhập");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltieuDe = new JLabel("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ LƯƠNG SẢN PHẨM");
		lbltieuDe.setForeground(new Color(0, 255, 0));
		lbltieuDe.setFont(new Font("Arial", Font.BOLD, 20));
		lbltieuDe.setBounds(185, 10, 529, 29);
		contentPane.add(lbltieuDe);
		
		JLabel lbltenDangNhap = new JLabel("Tài Khoản:");
		lbltenDangNhap.setFont(new Font("Arial", Font.BOLD, 11));
		lbltenDangNhap.setBounds(530, 95, 58, 14);
		contentPane.add(lbltenDangNhap);
		
		JLabel lblmatKhau = new JLabel("Mật Khẩu:");
		lblmatKhau.setFont(new Font("Arial", Font.BOLD, 11));
		lblmatKhau.setBounds(531, 145, 57, 22);
		contentPane.add(lblmatKhau);
		
		txttaiKhoan = new JTextField();
		txttaiKhoan.setBounds(598, 89, 175, 28);
		contentPane.add(txttaiKhoan);
		txttaiKhoan.setColumns(10);
		
		JCheckBox chckhienMatKhau = new JCheckBox("Hiển Thị Mật Khẩu");
		chckhienMatKhau.setFont(new Font("Arial", Font.BOLD, 11));
		chckhienMatKhau.setBounds(646, 202, 127, 29);
		contentPane.add(chckhienMatKhau);
        chckhienMatKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chckhienMatKhau.isSelected()) {
                    txtPass.setEchoChar((char) 0); 
                } else {
                    txtPass.setEchoChar('*'); 
                }
            }
        });
		
        txtPass = new JPasswordField();
        txtPass.setBounds(598, 142, 175, 29);
        contentPane.add(txtPass);

		
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setBackground(new Color(128, 255, 128));
		btnDangNhap.setBounds(575, 253, 99, 34);
		contentPane.add(btnDangNhap);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(new Color(255, 128, 128));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(684, 253, 89, 34);
		contentPane.add(btnThoat);
		
		JLabel AnhNen = new JLabel("");
		AnhNen.setIcon(new ImageIcon(Form_DangNhap.class.getResource("/img/AnhLogin.jpg")));
		AnhNen.setBounds(0, 0, 827, 50);
		contentPane.add(AnhNen);
		
		JLabel Nen1 = new JLabel("");
		Nen1.setBounds(72, 178, 46, 14);
		contentPane.add(Nen1);
		
		JLabel lblAnhNen = new JLabel("");
		lblAnhNen.setIcon(new ImageIcon(Form_DangNhap.class.getResource("/img/trangchu - Copy.jpg")));
		lblAnhNen.setFont(new Font("Arial", Font.BOLD, 11));
		lblAnhNen.setBounds(10, 60, 500, 339);
		contentPane.add(lblAnhNen);
		
		// khởi tạo kết nối đến CSDL
				try {
					Conection_DB.getInstance().connect();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		dn_dao = new DAO_DangNhap();
		btnDangNhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int d = dn_dao.TimKiem(txttaiKhoan.getText(), txtPass.getText()).toArray().length;
				//System.out.println(d);
				if(!txttaiKhoan.getText().equals("")&&!txtPass.getPassword().equals("")) {
					//System.out.println(txtPass.getText());
					//System.out.println(dn_dao.TimKiem(txttaiKhoan.getText(), txtPass.getText()));
					if(dn_dao.TimKiem(txttaiKhoan.getText(), txtPass.getText())!=null) {
						if(dn_dao.TimKiem(txttaiKhoan.getText(), txtPass.getText()).toArray().length==0) {
							JOptionPane.showMessageDialog(null, "Thông tin tài khoản, mật khẩu không chính xác");
							txttaiKhoan.setText("");
							txtPass.setText("");
							txttaiKhoan.requestFocus();
						}else {
							JOptionPane.showMessageDialog(null, "Đăng nhập hệ thống thành công");
							TrangChu tc = new TrangChu();
							tc.setVisible(true);
							setVisible(false);
						}
					}
				}else
					JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin");
				
			}
		});
		// Kiểm tra phím "Enter" trên trường mật khẩu
		txtPass.addKeyListener(new KeyAdapter() {
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            btnDangNhap.doClick();
		        }
		    }
		});

		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            System.exit(0); // Đóng ứng dụng nếu người dùng chọn "Có"
		        }
				
			}
		});
		//
	}
}
