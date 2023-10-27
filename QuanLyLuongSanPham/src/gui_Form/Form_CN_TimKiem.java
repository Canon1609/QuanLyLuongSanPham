package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_CN_TimKiem extends JPanel {
	private JTextField txtTenCongNhan;
	private JTextField txtDiaChi;
	private JTextField txtCMND;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Form_CN_TimKiem() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblTimKiemThongTinCongNhan = new JLabel("TÌM KIẾM THÔNG TIN CÔNG NHÂN");
		lblTimKiemThongTinCongNhan.setForeground(Color.RED);
		lblTimKiemThongTinCongNhan.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblTimKiemThongTinCongNhan);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 270));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 200));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin C\u00F4ng Nh\u00E2n Theo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxTenCongNhan = Box.createHorizontalBox();
		box1.add(boxTenCongNhan);
		
		JRadioButton radTenCongNhan = new JRadioButton("Tên Công Nhân ");
		radTenCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongNhan.add(radTenCongNhan);
		
		txtTenCongNhan = new JTextField();
		txtTenCongNhan.setPreferredSize(new Dimension(7, 30));
		txtTenCongNhan.setEditable(false);
		boxTenCongNhan.add(txtTenCongNhan);
		txtTenCongNhan.setColumns(30);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 50));
		box1.add(verticalStrut);
		
		Box boxDiaChi = Box.createHorizontalBox();
		box1.add(boxDiaChi);
		
		JRadioButton radDiaChi = new JRadioButton("Địa Chỉ");
		radDiaChi.setFont(new Font("Arial", Font.BOLD, 14));
		boxDiaChi.add(radDiaChi);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(62, 0));
		boxDiaChi.add(horizontalStrut);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setPreferredSize(new Dimension(7, 30));
		txtDiaChi.setEditable(false);
		boxDiaChi.add(txtDiaChi);
		txtDiaChi.setColumns(10);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(100, 0));
		pnNhap.add(horizontalStrut_1);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxCMND = Box.createHorizontalBox();
		box2.add(boxCMND);
		
		JRadioButton radCMND = new JRadioButton("CMND ");
		radCMND.setFont(new Font("Arial", Font.BOLD, 14));
		boxCMND.add(radCMND);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(30, 0));
		boxCMND.add(horizontalStrut_2);
		
		txtCMND = new JTextField();
		txtCMND.setPreferredSize(new Dimension(7, 30));
		txtCMND.setEditable(false);
		boxCMND.add(txtCMND);
		txtCMND.setColumns(30);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
		box2.add(verticalStrut_1);
		
		Box boxPhongBan = Box.createHorizontalBox();
		box2.add(boxPhongBan);
		
		JRadioButton radPhongBan = new JRadioButton("Phòng Ban");
		radPhongBan.setFont(new Font("Arial", Font.BOLD, 14));
		boxPhongBan.add(radPhongBan);
		
		JComboBox cmbPhongBan = new JComboBox();
		cmbPhongBan.setPreferredSize(new Dimension(29, 30));
		boxPhongBan.add(cmbPhongBan);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setBackground(Color.CYAN);
		btnTimKiem.setIcon(new ImageIcon(Form_CN_TimKiem.class.getResource("/img/TimKiem.png")));
		btnTimKiem.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnTimKiem);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_CN_TimKiem.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 370));
		pnSouth.setBorder(new TitledBorder(null, "K\u1EBFt Qu\u1EA3 T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1100, 340));
		pnSouth.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 C\u00F4ng Nh\u00E2n", "H\u1ECD T\u00EAn", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "Tay Ngh\u1EC1", "Tr\u1EE3 C\u1EA5p", "Ph\u00F2ng Ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, Double.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}

}
