package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_CN_PhanCong extends JPanel {
	private JTextField txtMaPhanCong;
	private JTextField txtTenSanPham;
	private JTextField txtSLCanLam;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public Form_CN_PhanCong() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblChamCong = new JLabel("PHÂN CÔNG");
		lblChamCong.setForeground(Color.RED);
		lblChamCong.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblChamCong);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 400));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 330));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin Ph\u00E2n C\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxMaPhanCong = Box.createHorizontalBox();
		box1.add(boxMaPhanCong);
		
		JLabel lblMaPhanCong = new JLabel("Mã Phân Công :");
		lblMaPhanCong.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaPhanCong.add(lblMaPhanCong);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		boxMaPhanCong.add(horizontalStrut);
		
		txtMaPhanCong = new JTextField();
		txtMaPhanCong.setEditable(false);
		txtMaPhanCong.setPreferredSize(new Dimension(7, 30));
		boxMaPhanCong.add(txtMaPhanCong);
		txtMaPhanCong.setColumns(15);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 35));
		box1.add(verticalStrut);
		
		Box boxMaCongNhan = Box.createHorizontalBox();
		box1.add(boxMaCongNhan);
		
		JLabel lblMaCongNhan = new JLabel("Mã Công nhân :");
		lblMaCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaCongNhan.add(lblMaCongNhan);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		boxMaCongNhan.add(horizontalStrut_1);

		JComboBox cmbMaCongNhan = new JComboBox();
		cmbMaCongNhan.setEditable(true);
		cmbMaCongNhan.setPreferredSize(new Dimension(140, 30));
		boxMaCongNhan.add(cmbMaCongNhan);
		
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 35));
		box1.add(verticalStrut_1);
		
		Box boxSLCanTim = Box.createHorizontalBox();
		box1.add(boxSLCanTim);
		
		JLabel lblSLCanTim = new JLabel("SL Cần Làm :");
		lblSLCanTim.setFont(new Font("Arial", Font.BOLD, 14));
		boxSLCanTim.add(lblSLCanTim);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(33, 0));
		boxSLCanTim.add(horizontalStrut_2);
		
		txtSLCanLam = new JTextField();
		txtSLCanLam.setPreferredSize(new Dimension(7, 30));
		boxSLCanTim.add(txtSLCanLam);
		txtSLCanLam.setColumns(15);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(30, 0));
		pnNhap.add(horizontalStrut_3);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxTenCongNhan = Box.createHorizontalBox();
		box2.add(boxTenCongNhan);
		
		JLabel lblTenCongNhan = new JLabel("Tên Công Nhân :");
		lblTenCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongNhan.add(lblTenCongNhan);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		boxTenCongNhan.add(horizontalStrut_5);
		
		JComboBox cmbTenCongNhan = new JComboBox();
		cmbTenCongNhan.setEditable(true);
		cmbTenCongNhan.setPreferredSize(new Dimension(140, 30));
		boxTenCongNhan.add(cmbTenCongNhan);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 35));
		box2.add(verticalStrut_2);
		
		Box boxTenCongDoan = Box.createHorizontalBox();
		box2.add(boxTenCongDoan);
		
		JLabel lblTenCongDoan = new JLabel("Tên Công Đoạn :");
		lblTenCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongDoan.add(lblTenCongDoan);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		boxTenCongDoan.add(horizontalStrut_6);
		
		JComboBox cmbTenCongDoan = new JComboBox();
		cmbTenCongDoan.setEditable(true);
		cmbTenCongDoan.setPreferredSize(new Dimension(140, 30));
		boxTenCongDoan.add(cmbTenCongDoan);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setPreferredSize(new Dimension(0, 35));
		box2.add(verticalStrut_3);
		
		Box boxCongDoanYC = Box.createHorizontalBox();
		box2.add(boxCongDoanYC);
		
		JLabel lblCongDoanYC = new JLabel("Công Đoạn YC :");
		lblCongDoanYC.setFont(new Font("Arial", Font.BOLD, 14));
		boxCongDoanYC.add(lblCongDoanYC);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(27, 0));
		boxCongDoanYC.add(horizontalStrut_7);
		
		JComboBox cmbCongDoanYC = new JComboBox();
		cmbCongDoanYC.setEditable(true);
		cmbCongDoanYC.setPreferredSize(new Dimension(140, 30));
		boxCongDoanYC.add(cmbCongDoanYC);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(40, 0));
		pnNhap.add(horizontalStrut_4);
		
		JPanel pnDanhSachSanPham = new JPanel();
		pnDanhSachSanPham.setPreferredSize(new DimensionUIResource(500, 300));
		pnDanhSachSanPham.setBorder(new TitledBorder(null, "Danh S\u00E1ch S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.add(pnDanhSachSanPham);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(490, 270));
		pnDanhSachSanPham.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u", "S\u1ED1 L\u01B0\u1EE3ng "
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 60));
		pnCenter.add(pnChucNang);
		
		JButton btnThemPhanCong = new JButton("Thêm Phân Công");
		btnThemPhanCong.setBackground(Color.LIGHT_GRAY);
		btnThemPhanCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThemPhanCong.setIcon(new ImageIcon(Form_CN_PhanCong.class.getResource("/img/add.png")));
		btnThemPhanCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThemPhanCong);
		
		JButton btnXoaPhanCong = new JButton("Xóa Phân Công");
		btnXoaPhanCong.setBackground(Color.CYAN);
		btnXoaPhanCong.setIcon(new ImageIcon(Form_CN_PhanCong.class.getResource("/img/delete.png")));
		btnXoaPhanCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaPhanCong);
		
		JButton btnSuaPhanCong = new JButton("Sửa Phân Công");
		btnSuaPhanCong.setBackground(Color.GREEN);
		btnSuaPhanCong.setIcon(new ImageIcon(Form_CN_PhanCong.class.getResource("/img/fixinfomation.png")));
		btnSuaPhanCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnSuaPhanCong);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setBackground(Color.MAGENTA);
		btnXoaRong.setIcon(new ImageIcon(Form_CN_PhanCong.class.getResource("/img/xoarong.png")));
		btnXoaRong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaRong);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_CN_PhanCong.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 240));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch Ph\u00E2n C\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1100, 200));
		pnSouth.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Ph\u00E2n C\u00F4ng", "T\u00EAn C\u00F4ng Nh\u00E2n", "T\u00EAn S\u1EA3n Ph\u1EA9m", "T\u00EAn C\u00F4ng \u0110o\u1EA1n", "S\u1ED1 L\u01B0\u1EE3ng C\u1EA7n T\u00ECm"
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
