package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.JCheckBox;
import java.awt.Component;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class Form_NV_ChamCong extends JPanel {
	private JTextField txtNhanVien;
	private JTextField txtGioLam;
	private JTextField txtPhongBan;
	private JTextField txtLuongCa;
	private JTable tblDanhSachNV;
	private JTable tblDanhSachChamCong;

	/**
	 * Create the panel.
	 */
	public Form_NV_ChamCong() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblChamCongNV = new JLabel("CHẤM CÔNG NHÂN VIÊN HÀNH CHÍNH");
		lblChamCongNV.setForeground(Color.RED);
		lblChamCongNV.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblChamCongNV);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 360));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng tin ch\u1EA5m c\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1200, 300));
		pnCenter.add(pnNhap);
		
		Box boxTrai1 = Box.createVerticalBox();
		boxTrai1.setPreferredSize(new Dimension(250, 170));
		pnNhap.add(boxTrai1);
		
		Box boxNgayCham = Box.createHorizontalBox();
		boxTrai1.add(boxNgayCham);
		
		JLabel lblNgayCham = new JLabel("Ngày Chấm :");
		lblNgayCham.setFont(new Font("Arial", Font.BOLD, 12));
		boxNgayCham.add(lblNgayCham);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(5, 0));
		boxNgayCham.add(horizontalStrut_3);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(30, 25));
		boxNgayCham.add(dateChooser);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut_1);
		
		Box boxNhanVien = Box.createHorizontalBox();
		boxTrai1.add(boxNhanVien);
		
		JLabel lblNhanVien = new JLabel("Nhân Viên :");
		lblNhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		boxNhanVien.add(lblNhanVien);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(10, 0));
		boxNhanVien.add(horizontalStrut_2);
		
		txtNhanVien = new JTextField();
		txtNhanVien.setEditable(false);
		txtNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNhanVien.setPreferredSize(new Dimension(30, 25));
		boxNhanVien.add(txtNhanVien);
		txtNhanVien.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut);
		
		Box boxGioLam = Box.createHorizontalBox();
		boxTrai1.add(boxGioLam);
		
		JLabel lblGioLam = new JLabel("Giờ Làm :");
		lblGioLam.setFont(new Font("Arial", Font.BOLD, 12));
		boxGioLam.add(lblGioLam);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		boxGioLam.add(horizontalStrut_4);
		
		txtGioLam = new JTextField();
		txtGioLam.setEditable(false);
		txtGioLam.setFont(new Font("Arial", Font.PLAIN, 12));
		txtGioLam.setPreferredSize(new Dimension(30, 25));
		boxGioLam.add(txtGioLam);
		txtGioLam.setColumns(10);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut_4);
		
		Box boxNghiPhep = Box.createHorizontalBox();
		boxTrai1.add(boxNghiPhep);
		
		JRadioButton radCoMat = new JRadioButton("Có Mặt");
		radCoMat.setSelected(true);
		radCoMat.setFont(new Font("Arial", Font.BOLD, 12));
		boxNghiPhep.add(radCoMat);
		
		JRadioButton radCoPhep = new JRadioButton("Có Phép");
		radCoPhep.setFont(new Font("Arial", Font.BOLD, 12));
		boxNghiPhep.add(radCoPhep);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		pnNhap.add(horizontalStrut_1);
		
		Box boxTrai2 = Box.createVerticalBox();
		boxTrai2.setPreferredSize(new Dimension(250, 170));
		pnNhap.add(boxTrai2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		boxTrai2.add(horizontalBox_3);
		
		JLabel lblCaLam = new JLabel("Ca Làm :");
		lblCaLam.setFont(new Font("Arial", Font.BOLD, 12));
		horizontalBox_3.add(lblCaLam);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(25, 0));
		horizontalBox_3.add(horizontalStrut_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ca sáng", "Ca chiều"}));
		comboBox.setPreferredSize(new Dimension(30, 25));
		horizontalBox_3.add(comboBox);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		boxTrai2.add(verticalStrut_2);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		boxTrai2.add(horizontalBox_4);
		
		JLabel lblPhongBan = new JLabel("Phòng Ban :");
		lblPhongBan.setFont(new Font("Arial", Font.BOLD, 12));
		horizontalBox_4.add(lblPhongBan);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(5, 0));
		horizontalBox_4.add(horizontalStrut_5);
		
		txtPhongBan = new JTextField();
		txtPhongBan.setEditable(false);
		txtPhongBan.setPreferredSize(new Dimension(30, 25));
		horizontalBox_4.add(txtPhongBan);
		txtPhongBan.setColumns(10);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		boxTrai2.add(verticalStrut_3);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		boxTrai2.add(horizontalBox_5);
		
		JLabel lblLuongCa = new JLabel("Lương Ca :");
		lblLuongCa.setFont(new Font("Arial", Font.BOLD, 12));
		horizontalBox_5.add(lblLuongCa);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(10, 0));
		horizontalBox_5.add(horizontalStrut_7);
		
		txtLuongCa = new JTextField();
		txtLuongCa.setEditable(false);
		txtLuongCa.setPreferredSize(new Dimension(30, 25));
		horizontalBox_5.add(txtLuongCa);
		txtLuongCa.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 40));
		boxTrai2.add(panel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		pnNhap.add(horizontalStrut);
		
		JPanel pnDanhSachNhanVien = new JPanel();
		pnDanhSachNhanVien.setPreferredSize(new Dimension(600, 250));
		pnDanhSachNhanVien.setBorder(new TitledBorder(null, "Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnDanhSachNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		pnNhap.add(pnDanhSachNhanVien);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(570, 220));
		pnDanhSachNhanVien.add(scrollPane);
		
		tblDanhSachNV = new JTable();
		tblDanhSachNV.setFont(new Font("Arial", Font.PLAIN, 10));
		scrollPane.setViewportView(tblDanhSachNV);
		tblDanhSachNV.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "CMND/CCCD", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "L\u01B0\u01A1ng", "Ph\u1EE5 C\u1EA5p", "Ph\u00F2ng Ban", "H\u1EC7 S\u1ED1 L\u01B0\u01A1ng"
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
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1000, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnChamCongNV = new JButton("Chấm Công");
		btnChamCongNV.setBackground(Color.GREEN);
		btnChamCongNV.setIcon(new ImageIcon(Form_NV_ChamCong.class.getResource("/img/themChamCong.png")));
		btnChamCongNV.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnChamCongNV);
		
		JButton btnXoaChamCongNV = new JButton("Xóa Chấm Công");
		btnXoaChamCongNV.setIcon(new ImageIcon(Form_NV_ChamCong.class.getResource("/img/xoaChamCong.png")));
		btnXoaChamCongNV.setBackground(Color.LIGHT_GRAY);
		btnXoaChamCongNV.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnXoaChamCongNV);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(Form_NV_ChamCong.class.getResource("/img/exit.png")));
		btnThoat.setBackground(Color.RED);
		btnThoat.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBorder(new TitledBorder(null, "Danh s\u00E1ch ch\u1EA5m c\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnSouth.setPreferredSize(new Dimension(1200, 280));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1150, 250));
		pnSouth.add(scrollPane_1);
		
		tblDanhSachChamCong = new JTable();
		scrollPane_1.setViewportView(tblDanhSachChamCong);
		tblDanhSachChamCong.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 C\u00F4ng", "T\u00EAn Nh\u00E2n Vi\u00EAn", "Ng\u00E0y Ch\u1EA5m", "Ca L\u00E0m", "Gi\u1EDD L\u00E0m", "Tr\u1EA1ng Th\u00E1i", "Ngh\u1EC9 Ph\u00E9p"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblDanhSachChamCong.setFont(new Font("Arial", Font.PLAIN, 10));

	}

}