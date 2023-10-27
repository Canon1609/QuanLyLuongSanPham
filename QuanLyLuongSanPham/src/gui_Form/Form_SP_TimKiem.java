package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_SP_TimKiem extends JPanel {
	private JTextField txtMaSanPham;
	private JTextField txtKieuDang;
	private JTextField txtTenSanPham;
	private JTextField txtChatLieu;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Form_SP_TimKiem() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblTimKiemThongTinSanPham = new JLabel("TÌM KIẾM THÔNG TIN SẢN PHẨM");
		lblTimKiemThongTinSanPham.setForeground(Color.RED);
		lblTimKiemThongTinSanPham.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblTimKiemThongTinSanPham);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 210));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 150));
		pnNhap.setFont(new Font("Arial", Font.BOLD, 14));
		pnNhap.setBorder(new TitledBorder(null, "T\u00ECm Ki\u1EBFm S\u1EA3n Ph\u1EA9m Theo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxMaSanPham = Box.createHorizontalBox();
		box1.add(boxMaSanPham);
		
		JRadioButton radMaSanPham = new JRadioButton("Mã Sản Phẩm");
		radMaSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaSanPham.add(radMaSanPham);
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setPreferredSize(new Dimension(7, 30));
		boxMaSanPham.add(txtMaSanPham);
		txtMaSanPham.setColumns(30);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 50));
		box1.add(verticalStrut);
		
		Box boxKieuDang = Box.createHorizontalBox();
		box1.add(boxKieuDang);
		
		JRadioButton radKieuDang = new JRadioButton("Kiểu Dáng");
		radKieuDang.setFont(new Font("Arial", Font.BOLD, 14));
		boxKieuDang.add(radKieuDang);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		boxKieuDang.add(horizontalStrut);
		
		txtKieuDang = new JTextField();
		txtKieuDang.setEditable(false);
		txtKieuDang.setPreferredSize(new Dimension(7, 30));
		boxKieuDang.add(txtKieuDang);
		txtKieuDang.setColumns(30);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(100, 0));
		pnNhap.add(horizontalStrut_2);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxTenSanPham = Box.createHorizontalBox();
		box2.add(boxTenSanPham);
		
		JRadioButton radTenSanPham = new JRadioButton("Tên Sản Phẩm");
		radTenSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenSanPham.add(radTenSanPham);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setEditable(false);
		txtTenSanPham.setPreferredSize(new Dimension(7, 30));
		boxTenSanPham.add(txtTenSanPham);
		txtTenSanPham.setColumns(30);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
		box2.add(verticalStrut_1);
		
		Box boxChatLieu = Box.createHorizontalBox();
		box2.add(boxChatLieu);
		
		JRadioButton radChatLieu = new JRadioButton("Chất Liệu");
		radChatLieu.setFont(new Font("Arial", Font.BOLD, 14));
		boxChatLieu.add(radChatLieu);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(35, 0));
		boxChatLieu.add(horizontalStrut_1);
		
		txtChatLieu = new JTextField();
		txtChatLieu.setEditable(false);
		txtChatLieu.setPreferredSize(new Dimension(7, 30));
		boxChatLieu.add(txtChatLieu);
		txtChatLieu.setColumns(30);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setBackground(Color.CYAN);
		btnTimKiem.setIcon(new ImageIcon(Form_SP_TimKiem.class.getResource("/img/TimKiem.png")));
		btnTimKiem.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnTimKiem);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_SP_TimKiem.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 420));
		pnSouth.setBorder(new TitledBorder(null, "K\u1EBFt Qu\u1EA3 T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1100, 370));
		pnSouth.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u", "S\u1ED1 L\u01B0\u1EE3ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}

}
