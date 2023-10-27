package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

public class Form_CN_TinhLuong extends JPanel {
	private JTextField txtMaCongNhan;
	private JTextField txtMaLuong;
	private JTextField txtThucLanh;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public Form_CN_TinhLuong() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblLuongCongNhan = new JLabel("LƯƠNG CÔNG NHÂN");
		lblLuongCongNhan.setForeground(Color.RED);
		lblLuongCongNhan.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblLuongCongNhan);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 360));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 300));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin T\u00EDnh L\u01B0\u01A1ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxMaCongNhan = Box.createHorizontalBox();
		box1.add(boxMaCongNhan);
		
		JLabel lblMaCongNhan = new JLabel("Mã Công Nhân :");
		lblMaCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaCongNhan.add(lblMaCongNhan);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		boxMaCongNhan.add(horizontalStrut);
		
		txtMaCongNhan = new JTextField();
		txtMaCongNhan.setPreferredSize(new Dimension(7, 30));
		boxMaCongNhan.add(txtMaCongNhan);
		txtMaCongNhan.setColumns(15);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 40));
		box1.add(verticalStrut);
		
		Box boxMaLuong = Box.createHorizontalBox();
		box1.add(boxMaLuong);
		
		JLabel lblMaLuong = new JLabel("Mã Lương :");
		lblMaLuong.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaLuong.add(lblMaLuong);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(50, 0));
		boxMaLuong.add(horizontalStrut_1);
		
		txtMaLuong = new JTextField();
		txtMaLuong.setEditable(false);
		txtMaLuong.setPreferredSize(new Dimension(7, 30));
		boxMaLuong.add(txtMaLuong);
		txtMaLuong.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 40));
		box1.add(verticalStrut_1);
		
		Box boxThucLanh = Box.createHorizontalBox();
		box1.add(boxThucLanh);
		
		JLabel lblThucLanh = new JLabel("Thực Lãnh :");
		lblThucLanh.setFont(new Font("Arial", Font.BOLD, 14));
		boxThucLanh.add(lblThucLanh);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(48, 0));
		boxThucLanh.add(horizontalStrut_2);
		
		txtThucLanh = new JTextField();
		txtThucLanh.setEditable(false);
		txtThucLanh.setPreferredSize(new Dimension(7, 30));
		boxThucLanh.add(txtThucLanh);
		txtThucLanh.setColumns(10);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(40, 0));
		pnNhap.add(horizontalStrut_3);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxCongNhan = Box.createHorizontalBox();
		box2.add(boxCongNhan);
		
		JLabel lblCongNhan = new JLabel("Công Nhân :");
		lblCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxCongNhan.add(lblCongNhan);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		boxCongNhan.add(horizontalStrut_7);
		
		JComboBox cmbCongNhan = new JComboBox();
		cmbCongNhan.setPreferredSize(new Dimension(140, 30));
		cmbCongNhan.setMaximumRowCount(10);
		boxCongNhan.add(cmbCongNhan);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setPreferredSize(new Dimension(0, 40));
		box2.add(verticalStrut_3);
		
		Box boxThang = Box.createHorizontalBox();
		box2.add(boxThang);
		
		JLabel lblThang = new JLabel("Tháng :");
		lblThang.setFont(new Font("Arial", Font.BOLD, 14));
		boxThang.add(lblThang);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(52, 0));
		boxThang.add(horizontalStrut_5);
		
		JComboBox cmbThang = new JComboBox();
		cmbThang.setPreferredSize(new Dimension(29, 30));
		boxThang.add(cmbThang);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 40));
		box2.add(verticalStrut_2);
		
		Box boxNam = Box.createHorizontalBox();
		box2.add(boxNam);
		
		JLabel lblNam = new JLabel("Năm :");
		lblNam.setFont(new Font("Arial", Font.BOLD, 14));
		boxNam.add(lblNam);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(63, 0));
		boxNam.add(horizontalStrut_6);
		
		JComboBox cmbNam = new JComboBox();
		cmbNam.setPreferredSize(new Dimension(29, 30));
		boxNam.add(cmbNam);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(60, 0));
		pnNhap.add(horizontalStrut_4);
		
		JPanel pnDanhSachCongNhan = new JPanel();
		pnDanhSachCongNhan.setBorder(new TitledBorder(null, "Danh S\u00E1ch C\u00F4ng Nh\u00E2n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.add(pnDanhSachCongNhan);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(510, 200));
		pnDanhSachCongNhan.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 CN", "H\u1ECD T\u00EAn", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "Tay Ngh\u1EC1", "Tr\u1EE3 C\u1EA5p", "Ph\u00F2ng Ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, Double.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnTinhLuong = new JButton("Tính Lương");
		btnTinhLuong.setIcon(new ImageIcon(Form_CN_TinhLuong.class.getResource("/img/salary.png")));
		btnTinhLuong.setFont(new Font("Arial", Font.BOLD, 14));
		btnTinhLuong.setBackground(Color.ORANGE);
		pnChucNang.add(btnTinhLuong);
		
		JButton btnXoaLuong = new JButton("Xóa Lương");
		btnXoaLuong.setIcon(new ImageIcon(Form_CN_TinhLuong.class.getResource("/img/delete.png")));
		btnXoaLuong.setFont(new Font("Arial", Font.BOLD, 14));
		btnXoaLuong.setBackground(Color.YELLOW);
		pnChucNang.add(btnXoaLuong);
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setIcon(new ImageIcon(Form_CN_TinhLuong.class.getResource("/img/reload.png")));
		btnLamMoi.setFont(new Font("Arial", Font.BOLD, 14));
		btnLamMoi.setBackground(Color.CYAN);
		pnChucNang.add(btnLamMoi);
		
		JButton btnXuatExcel = new JButton("Xuất Excel");
		btnXuatExcel.setIcon(new ImageIcon(Form_CN_TinhLuong.class.getResource("/img/excel.png")));
		btnXuatExcel.setFont(new Font("Arial", Font.BOLD, 14));
		btnXuatExcel.setBackground(Color.GREEN);
		pnChucNang.add(btnXuatExcel);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(Form_CN_TinhLuong.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		btnThoat.setBackground(Color.RED);
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 280));
		pnSouth.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Danh S\u00E1ch L\u01B0\u01A1ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1100, 250));
		pnSouth.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 L\u01B0\u01A1ng", "M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "Ph\u00F2ng Ban", "Tr\u1EE3 C\u1EA5p", "Th\u00E1ng", "N\u0103m", "L\u01B0\u01A1ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, Double.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}

}
