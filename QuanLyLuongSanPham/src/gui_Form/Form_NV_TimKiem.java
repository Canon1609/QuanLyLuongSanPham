package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_NV_TimKiem extends JPanel {
	private JTextField textField;
	private JTextField txtDiaChi;
	private JTable tblDanhSachNhanVien;

	/**
	 * Create the panel.
	 */
	public Form_NV_TimKiem() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblTimKiem = new JLabel("TÌM KIẾM THÔNG TIN NHÂN VIÊN HÀNH CHÍNH");
		lblTimKiem.setForeground(Color.RED);
		lblTimKiem.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblTimKiem);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 310));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1000, 250));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		box1.setPreferredSize(new Dimension(350, 200));
		pnNhap.add(box1);
		
		Box boxMaNV = Box.createHorizontalBox();
		box1.add(boxMaNV);
		
		JLabel lblMaNV = new JLabel("Mã Nhân Viên :");
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 12));
		boxMaNV.add(lblMaNV);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(25, 0));
		boxMaNV.add(horizontalStrut_1);
		
		JComboBox cmbMaNV = new JComboBox();
		cmbMaNV.setPreferredSize(new Dimension(30, 35));
		cmbMaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbMaNV.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		boxMaNV.add(cmbMaNV);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 50));
		box1.add(verticalStrut);
		
		Box boxTen = Box.createHorizontalBox();
		box1.add(boxTen);
		
		JLabel lblNewLabel = new JLabel("Tên :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		boxTen.add(lblNewLabel);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(80, 0));
		boxTen.add(horizontalStrut_2);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(30, 2));
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		boxTen.add(textField);
		textField.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
		box1.add(verticalStrut_1);
		
		Box boxGioiTinh = Box.createHorizontalBox();
		box1.add(boxGioiTinh);
		
		JLabel lblGioiTInh = new JLabel("Giới Tính :");
		lblGioiTInh.setFont(new Font("Arial", Font.BOLD, 12));
		boxGioiTinh.add(lblGioiTInh);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(50, 0));
		boxGioiTinh.add(horizontalStrut_3);
		
		JComboBox cmbGioiTinh = new JComboBox();
		cmbGioiTinh.setPreferredSize(new Dimension(30, 35));
		cmbGioiTinh.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ", "Tất cả"}));
		boxGioiTinh.add(cmbGioiTinh);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(40, 0));
		pnNhap.add(horizontalStrut);
		
		Box box2 = Box.createVerticalBox();
		box2.setPreferredSize(new Dimension(350, 200));
		pnNhap.add(box2);
		
		Box boxNgaySinh = Box.createHorizontalBox();
		box2.add(boxNgaySinh);
		
		JLabel lblNgaySinh = new JLabel("Ngày Sinh :");
		lblNgaySinh.setFont(new Font("Arial", Font.BOLD, 12));
		boxNgaySinh.add(lblNgaySinh);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(25, 0));
		boxNgaySinh.add(horizontalStrut_4);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(30, 25));
		boxNgaySinh.add(dateChooser);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 50));
		box2.add(verticalStrut_2);
		
		Box boxPhongBan = Box.createHorizontalBox();
		box2.add(boxPhongBan);
		
		JLabel lblPhongBan = new JLabel("Phòng Ban :");
		lblPhongBan.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhongBan.add(lblPhongBan);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		boxPhongBan.add(horizontalStrut_5);
		
		JComboBox cmbPhongBan = new JComboBox();
		cmbPhongBan.setPreferredSize(new Dimension(30, 35));
		cmbPhongBan.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbPhongBan.setModel(new DefaultComboBoxModel(new String[] {"Quản lí", "Nhân sự"}));
		boxPhongBan.add(cmbPhongBan);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setPreferredSize(new Dimension(0, 50));
		box2.add(verticalStrut_3);
		
		Box boxDiaChi = Box.createHorizontalBox();
		box2.add(boxDiaChi);
		
		JLabel lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setFont(new Font("Arial", Font.BOLD, 12));
		boxDiaChi.add(lblDiaChi);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(40, 0));
		boxDiaChi.add(horizontalStrut_6);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setPreferredSize(new Dimension(30, 25));
		boxDiaChi.add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(700, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setIcon(new ImageIcon(Form_NV_TimKiem.class.getResource("/img/timkiem.png")));
		btnTimKiem.setBackground(Color.LIGHT_GRAY);
		btnTimKiem.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnTimKiem);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(50, 0));
		pnChucNang.add(horizontalStrut_7);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(Form_NV_TimKiem.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBorder(new TitledBorder(null, "K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnSouth.setPreferredSize(new Dimension(1200, 330));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1150, 290));
		pnSouth.add(scrollPane);
		
		tblDanhSachNhanVien = new JTable();
		scrollPane.setViewportView(tblDanhSachNhanVien);
		tblDanhSachNhanVien.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "CMND/CCCD", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "L\u01B0\u01A1ng C\u01A1 B\u1EA3n", "Ph\u1EE5 C\u1EA5p", "Ph\u00F2ng Ban", "H\u1EC7 S\u1ED1 L\u01B0\u01A1ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, Double.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblDanhSachNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));

	}

}
