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
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_NV_TinhLuong extends JPanel {
	private JTextField txtMaLuong;
	private JTextField txtThucLanh;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public Form_NV_TinhLuong() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblLuongNhanVien = new JLabel("Lương Nhân Viên");
		lblLuongNhanVien.setForeground(Color.RED);
		lblLuongNhanVien.setBackground(new Color(255, 255, 255));
		lblLuongNhanVien.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblLuongNhanVien);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(120, 360));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng tin t\u00EDnh l\u01B0\u01A1ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1200, 300));
		pnCenter.add(pnNhap);
		
		Box boxTrai1 = Box.createVerticalBox();
		boxTrai1.setPreferredSize(new Dimension(250, 150));
		pnNhap.add(boxTrai1);
		
		Box boxMaNV = Box.createHorizontalBox();
		boxTrai1.add(boxMaNV);
		
		JLabel lblMaNV = new JLabel("Mã Nhân Viên :");
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 12));
		boxMaNV.add(lblMaNV);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(15, 0));
		boxMaNV.add(horizontalStrut);
		
		JComboBox cmbMaNV = new JComboBox();
		cmbMaNV.setPreferredSize(new Dimension(30, 30));
		boxMaNV.add(cmbMaNV);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut);
		
		Box boxMaLuong = Box.createHorizontalBox();
		boxTrai1.add(boxMaLuong);
		
		JLabel lblMaLuong = new JLabel("Mã Lương :");
		lblMaLuong.setFont(new Font("Arial", Font.BOLD, 12));
		boxMaLuong.add(lblMaLuong);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(35, 0));
		boxMaLuong.add(horizontalStrut_1);
		
		txtMaLuong = new JTextField();
		txtMaLuong.setEditable(false);
		txtMaLuong.setPreferredSize(new Dimension(30, 10));
		boxMaLuong.add(txtMaLuong);
		txtMaLuong.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut_1);
		
		Box boxThucLanh = Box.createHorizontalBox();
		boxTrai1.add(boxThucLanh);
		
		JLabel lblThucLanh = new JLabel("Thực Lãnh :");
		lblThucLanh.setFont(new Font("Arial", Font.BOLD, 12));
		boxThucLanh.add(lblThucLanh);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(35, 0));
		boxThucLanh.add(horizontalStrut_2);
		
		txtThucLanh = new JTextField();
		txtThucLanh.setEditable(false);
		txtThucLanh.setPreferredSize(new Dimension(30, 10));
		boxThucLanh.add(txtThucLanh);
		txtThucLanh.setColumns(10);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		pnNhap.add(horizontalStrut_6);
		
		Box boxTrai2 = Box.createVerticalBox();
		boxTrai2.setPreferredSize(new Dimension(250, 150));
		pnNhap.add(boxTrai2);
		
		Box boxNhanVien = Box.createHorizontalBox();
		boxTrai2.add(boxNhanVien);
		
		JLabel lblNhanVien = new JLabel("Nhân Viên :");
		lblNhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		boxNhanVien.add(lblNhanVien);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(10, 0));
		boxNhanVien.add(horizontalStrut_4);
		
		JComboBox cmbNhanVien = new JComboBox();
		cmbNhanVien.setPreferredSize(new Dimension(30, 25));
		boxNhanVien.add(cmbNhanVien);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		boxTrai2.add(verticalStrut_2);
		
		Box boxThang = Box.createHorizontalBox();
		boxTrai2.add(boxThang);
		
		JLabel lblThang = new JLabel("Tháng :");
		lblThang.setFont(new Font("Arial", Font.BOLD, 12));
		boxThang.add(lblThang);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(30, 0));
		boxThang.add(horizontalStrut_3);
		
		JComboBox cmbThang = new JComboBox();
		cmbThang.setPreferredSize(new Dimension(30, 25));
		boxThang.add(cmbThang);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		boxTrai2.add(verticalStrut_3);
		
		Box boxNam = Box.createHorizontalBox();
		boxTrai2.add(boxNam);
		
		JLabel lblNam = new JLabel("Năm :");
		lblNam.setFont(new Font("Arial", Font.BOLD, 12));
		boxNam.add(lblNam);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(40, 0));
		boxNam.add(horizontalStrut_5);
		
		JComboBox cmbNam = new JComboBox();
		cmbNam.setPreferredSize(new Dimension(30, 25));
		boxNam.add(cmbNam);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(10, 0));
		pnNhap.add(horizontalStrut_7);
		
		JPanel pnDanhSachNhanVien = new JPanel();
		pnDanhSachNhanVien.setBorder(new TitledBorder(null, "Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnDanhSachNhanVien.setPreferredSize(new Dimension(630, 270));
		pnNhap.add(pnDanhSachNhanVien);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(600, 240));
		pnDanhSachNhanVien.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
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
		
		JButton btnTinhLuong = new JButton("Tính Lương");
		btnTinhLuong.setBackground(Color.ORANGE);
		btnTinhLuong.setIcon(new ImageIcon(Form_NV_TinhLuong.class.getResource("/img/themChamCong.png")));
		btnTinhLuong.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnTinhLuong);
		
		JButton btnXoaLuong = new JButton("Xóa Lương");
		btnXoaLuong.setIcon(new ImageIcon(Form_NV_TinhLuong.class.getResource("/img/xoaChamCong.png")));
		btnXoaLuong.setFont(new Font("Arial", Font.BOLD, 12));
		btnXoaLuong.setBackground(new Color(255, 128, 128));
		pnChucNang.add(btnXoaLuong);
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setBackground(Color.CYAN);
		btnLamMoi.setIcon(new ImageIcon(Form_NV_TinhLuong.class.getResource("/img/reload.png")));
		btnLamMoi.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnLamMoi);
		
		JButton btnXuatExcel = new JButton("Xuất Excel");
		btnXuatExcel.setIcon(new ImageIcon(Form_NV_TinhLuong.class.getResource("/img/excel.png")));
		btnXuatExcel.setFont(new Font("Arial", Font.BOLD, 12));
		btnXuatExcel.setBackground(new Color(0, 255, 128));
		pnChucNang.add(btnXuatExcel);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_NV_TinhLuong.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBorder(new TitledBorder(null, "Danh s\u00E1ch l\u01B0\u01A1ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnSouth.setPreferredSize(new Dimension(1200, 280));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1150, 250));
		pnSouth.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 L\u01B0\u01A1ng", "M\u00E3 Nh\u00E2n Vi\u00EAn", "T\u00EAn Nh\u00E2n Vi\u00EAn", "CMND/CCCD", "L\u01B0\u01A1ng C\u01A1 B\u1EA3n", "H\u1EC7 S\u1ED1 L\u01B0\u01A1ng", "Ph\u1EE5 C\u1EA5p", "Ph\u00F2ng Ban", "Th\u00E1ng", "N\u0103m", "L\u01B0\u01A1ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Double.class, Double.class, Double.class, String.class, Integer.class, Integer.class, Double.class
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

	}

}
