package gui_Form;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;

import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class Form_HD_CapNhap extends JPanel {
	private JTextField txtmaHD;
	private JTextField txtkhachHang;
	private JTextField txtdonGia;
	private JTable tbl_SanPham;
	private JTextField txtsoLuong;
	private JTable tbl_Chinh;

	/**
	 * Create the panel.
	 */
	public Form_HD_CapNhap() {

		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_T = new JPanel();
		panel_T.setPreferredSize(new Dimension(600, 300));
		panel_T.setBorder(new TitledBorder(null, "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_T, BorderLayout.WEST);
		
		Component horizontalStrut_11_1 = Box.createHorizontalStrut(20);
		horizontalStrut_11_1.setPreferredSize(new Dimension(40, 0));
		panel_T.add(horizontalStrut_11_1);
		
		Box b = Box.createVerticalBox();
		panel_T.add(b);
		
		Box b1 = Box.createHorizontalBox();
		b.add(b1);
		
		JLabel lblmaHD = new JLabel("Mã Hợp Đồng: ");
		lblmaHD.setPreferredSize(new Dimension(100, 20));
		lblmaHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lblmaHD);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut);
		
		txtmaHD = new JTextField();
		txtmaHD.setEditable(false);
		txtmaHD.setPreferredSize(new Dimension(7, 30));
		txtmaHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(txtmaHD);
		txtmaHD.setColumns(10);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_1);
		
		JLabel lblmaNV = new JLabel("Mã Nhân Viên: ");
		lblmaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lblmaNV);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_2);
		
		JComboBox cmbmaNV = new JComboBox();
		cmbmaNV.setPreferredSize(new Dimension(100, 22));
		cmbmaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(cmbmaNV);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 15));
		b.add(verticalStrut);
		
		Box b2 = Box.createHorizontalBox();
		b.add(b2);
		
		JLabel lbltenKhachHang = new JLabel("Tên Khách Hàng: ");
		lbltenKhachHang.setPreferredSize(new Dimension(100, 14));
		lbltenKhachHang.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbltenKhachHang);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_3);
		
		txtkhachHang = new JTextField();
		txtkhachHang.setPreferredSize(new Dimension(7, 30));
		txtkhachHang.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(txtkhachHang);
		txtkhachHang.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 15));
		b.add(verticalStrut_1);
		
		Box b3 = Box.createHorizontalBox();
		b.add(b3);
		
		JLabel lbltenNhanVien = new JLabel("Tên Nhân Viên: ");
		lbltenNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		lbltenNhanVien.setPreferredSize(new Dimension(100, 14));
		b3.add(lbltenNhanVien);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		b3.add(horizontalStrut_4);
		
		JComboBox cmbtenNhanVien = new JComboBox();
		cmbtenNhanVien.setPreferredSize(new Dimension(30, 30));
		cmbtenNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(cmbtenNhanVien);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setMinimumSize(new Dimension(0, 15));
		b.add(verticalStrut_2);
		
		Box b4 = Box.createHorizontalBox();
		b.add(b4);
		
		JLabel lblmaSP = new JLabel("Mã Sản Phẩm: ");
		lblmaSP.setPreferredSize(new Dimension(100, 14));
		lblmaSP.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(lblmaSP);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_5);
		
		JComboBox cmbmaSP = new JComboBox();
		cmbmaSP.setPreferredSize(new Dimension(100, 30));
		cmbmaSP.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(cmbmaSP);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_6);
		
		JLabel lbldonGia = new JLabel("Đơn Giá: ");
		lbldonGia.setPreferredSize(new Dimension(65, 14));
		lbldonGia.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(lbldonGia);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_7);
		
		txtdonGia = new JTextField();
		txtdonGia.setPreferredSize(new Dimension(7, 30));
		txtdonGia.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(txtdonGia);
		txtdonGia.setColumns(10);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setMinimumSize(new Dimension(0, 15));
		b.add(verticalStrut_3);
		
		Box b5 = Box.createHorizontalBox();
		b.add(b5);
		
		JLabel lblngayLap = new JLabel("Ngày Lâp: ");
		lblngayLap.setPreferredSize(new Dimension(100, 14));
		lblngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(lblngayLap);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_8);
		
		JDateChooser dateChooser_ngayLap = new JDateChooser();
		dateChooser_ngayLap.setPreferredSize(new Dimension(45, 30));
		dateChooser_ngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(dateChooser_ngayLap);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_9);
		
		JLabel lblngayGiao = new JLabel("Ngày Giao: ");
		lblngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(lblngayGiao);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_10);
		
		JDateChooser dateChooser_ngayGiao = new JDateChooser();
		dateChooser_ngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(dateChooser_ngayGiao);
		
		JPanel panel_Center = new JPanel();
		panel_Center.setPreferredSize(new Dimension(600, 300));
		panel_Center.setBorder(new TitledBorder(null, "S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_Center, BorderLayout.CENTER);
		
		JScrollPane scr_sanPham = new JScrollPane();
		scr_sanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		scr_sanPham.setPreferredSize(new Dimension(550, 200));
		panel_Center.add(scr_sanPham);
		
		tbl_SanPham = new JTable();
		tbl_SanPham.setPreferredScrollableViewportSize(new Dimension(400, 400));
		tbl_SanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		tbl_SanPham.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scr_sanPham.setViewportView(tbl_SanPham);
		
		JLabel lblsoLuong = new JLabel("Số Lượng: ");
		lblsoLuong.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_Center.add(lblsoLuong);
		
		JSpinField jsfSoLuong = new JSpinField();
		jsfSoLuong.getSpinner().setPreferredSize(new Dimension(30, 40));
		jsfSoLuong.setPreferredSize(new Dimension(100, 29));
		panel_Center.add(jsfSoLuong);
		
		JPanel panel_South = new JPanel();
		panel_South.setPreferredSize(new Dimension(600, 340));
		add(panel_South, BorderLayout.SOUTH);
		panel_South.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_table = new JPanel();
		panel_table.setPreferredSize(new Dimension(400, 150));
		panel_table.setBorder(new TitledBorder(null, "H\u1EE3p \u0111\u1ED3ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_table.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_South.add(panel_table);
		panel_table.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JScrollPane src_tableChinh = new JScrollPane();
		src_tableChinh.setPreferredSize(new Dimension(1100, 250));
		panel_table.add(src_tableChinh);
		
		tbl_Chinh = new JTable();
		tbl_Chinh.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 H\u1EE3p \u0110\u1ED3ng", "T\u00EAn Kh\u00E1ch H\u00E0ng", "M\u00E3 Nh\u00E2n Vi\u00EAn", "T\u00EAn Nh\u00E2n Vi\u00EAn", "Ng\u00E0y L\u1EADp", "Ng\u00E0y Giao", "\u0110\u01A1n Gi\u00E1"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		src_tableChinh.setViewportView(tbl_Chinh);
		
		JPanel panel_ChucNang = new JPanel();
		panel_ChucNang.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_ChucNang.setPreferredSize(new Dimension(200, 50));
		panel_ChucNang.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_South.add(panel_ChucNang, BorderLayout.NORTH);
		panel_ChucNang.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/them.png")));
		btn_Them.setPreferredSize(new Dimension(140, 40));
		btn_Them.setFont(new Font("Arial", Font.BOLD, 14));
		panel_ChucNang.add(btn_Them);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		horizontalStrut_11.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_11);
		
		JButton btn_Sua = new JButton("Sửa");
		btn_Sua.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/sua.png")));
		btn_Sua.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn_Sua.setPreferredSize(new Dimension(140, 40));
		btn_Sua.setFont(new Font("Arial", Font.BOLD, 14));
		panel_ChucNang.add(btn_Sua);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		horizontalStrut_12.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_12);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/xoa.png")));
		btn_Xoa.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Xoa.setPreferredSize(new Dimension(140, 40));
		panel_ChucNang.add(btn_Xoa);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		horizontalStrut_13.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_13);
		
		JButton btn_In = new JButton("In");
		btn_In.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/in.png")));
		btn_In.setPreferredSize(new Dimension(140, 40));
		btn_In.setFont(new Font("Arial", Font.BOLD, 14));
		panel_ChucNang.add(btn_In);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		horizontalStrut_14.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_14);
		
		JButton btn_lamMoi = new JButton("Làm Mới");
		btn_lamMoi.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/xoa.png")));
		btn_lamMoi.setFont(new Font("Arial", Font.BOLD, 14));
		btn_lamMoi.setPreferredSize(new Dimension(140, 40));
		panel_ChucNang.add(btn_lamMoi);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblCapNhatHDong = new JLabel("CẬP NHẬT THÔNG TIN HỢP ĐÔNG");
		lblCapNhatHDong.setForeground(new Color(255, 0, 0));
		lblCapNhatHDong.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblCapNhatHDong);
	}
	

}
