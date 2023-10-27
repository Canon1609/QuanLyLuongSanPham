package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Form_CN_ChamCong extends JPanel {
	private JTextField txtSanPham;
	private JTextField txtCongDoan;
	private JTextField txtLuongCa;
	private JTextField txtTenCongNhan;
	private JTextField txtGioLam;
	private JTable table;
	private JTable table_1;
	private JTextField txtSLConLai;
	private JPanel pnCenter;

	/**
	 * Create the panel.
	 */
	public Form_CN_ChamCong() {
		setMinimumSize(new Dimension(1222, 795));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblChamCongCongNhan = new JLabel("CHẤM CÔNG CÔNG NHÂN");
		lblChamCongCongNhan.setForeground(Color.RED);
		lblChamCongCongNhan.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblChamCongCongNhan);
		
		pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 405));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 350));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin Ch\u1EA5m C\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxSanPham = Box.createHorizontalBox();
		box1.add(boxSanPham);
		
		JLabel lblSanPham = new JLabel("Sản Phẩm :");
		lblSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxSanPham.add(lblSanPham);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(30, 0));
		boxSanPham.add(horizontalStrut);
		
		txtSanPham = new JTextField();
		txtSanPham.setEditable(false);
		txtSanPham.setPreferredSize(new Dimension(7, 30));
		boxSanPham.add(txtSanPham);
		txtSanPham.setColumns(15);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut);
		
		Box boxNgayCham = Box.createHorizontalBox();
		box1.add(boxNgayCham);
		
		JLabel lblNgayCham = new JLabel("Ngày Chấm :");
		lblNgayCham.setFont(new Font("Arial", Font.BOLD, 14));
		boxNgayCham.add(lblNgayCham);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		boxNgayCham.add(horizontalStrut_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(73, 30));
		boxNgayCham.add(dateChooser);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_1);
		
		Box boxCongDoan = Box.createHorizontalBox();
		box1.add(boxCongDoan);
		
		JLabel lblCongDoan = new JLabel("Công Đoạn :");
		lblCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxCongDoan.add(lblCongDoan);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(24, 0));
		boxCongDoan.add(horizontalStrut_2);
		
		txtCongDoan = new JTextField();
		txtCongDoan.setEditable(false);
		txtCongDoan.setPreferredSize(new Dimension(7, 30));
		boxCongDoan.add(txtCongDoan);
		txtCongDoan.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_2);
		
		Box boxLuongCa = Box.createHorizontalBox();
		box1.add(boxLuongCa);
		
		JLabel lblLuongCa = new JLabel("Lương Ca :");
		lblLuongCa.setFont(new Font("Arial", Font.BOLD, 14));
		boxLuongCa.add(lblLuongCa);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(31, 0));
		boxLuongCa.add(horizontalStrut_3);
		
		txtLuongCa = new JTextField();
		txtLuongCa.setEditable(false);
		txtLuongCa.setPreferredSize(new Dimension(7, 30));
		boxLuongCa.add(txtLuongCa);
		txtLuongCa.setColumns(10);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		verticalStrut_6.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_6);
		
		Box boxSLConLai = Box.createHorizontalBox();
		box1.add(boxSLConLai);
		
		JLabel lblSLConLai = new JLabel("SL Còn Lại :");
		lblSLConLai.setFont(new Font("Arial", Font.BOLD, 14));
		boxSLConLai.add(lblSLConLai);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		horizontalStrut_10.setPreferredSize(new Dimension(25, 0));
		boxSLConLai.add(horizontalStrut_10);
		
		txtSLConLai = new JTextField();
		txtSLConLai.setEditable(false);
		txtSLConLai.setPreferredSize(new Dimension(7, 30));
		boxSLConLai.add(txtSLConLai);
		txtSLConLai.setColumns(10);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(40, 0));
		pnNhap.add(horizontalStrut_4);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxTenCongNhan = Box.createHorizontalBox();
		box2.add(boxTenCongNhan);
		
		JLabel lblTenCongNhan = new JLabel("Tên Công Nhân :");
		lblTenCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongNhan.add(lblTenCongNhan);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(30, 0));
		boxTenCongNhan.add(horizontalStrut_6);
		
		txtTenCongNhan = new JTextField();
		txtTenCongNhan.setEditable(false);
		txtTenCongNhan.setPreferredSize(new Dimension(7, 30));
		boxTenCongNhan.add(txtTenCongNhan);
		txtTenCongNhan.setColumns(15);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_3);
		
		Box boxCaLam = Box.createHorizontalBox();
		box2.add(boxCaLam);
		
		JLabel lblCaLam = new JLabel("Ca Làm :");
		lblCaLam.setFont(new Font("Arial", Font.BOLD, 14));
		boxCaLam.add(lblCaLam);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(82, 0));
		boxCaLam.add(horizontalStrut_7);
		
		JComboBox cmbCaLam = new JComboBox();
		cmbCaLam.setPreferredSize(new Dimension(29, 30));
		boxCaLam.add(cmbCaLam);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalStrut_4.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_4);
		
		Box boxGioLam = Box.createHorizontalBox();
		box2.add(boxGioLam);
		
		JLabel lblGioLam = new JLabel("Giờ Làm ");
		lblGioLam.setFont(new Font("Arial", Font.BOLD, 14));
		boxGioLam.add(lblGioLam);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalStrut_8.setPreferredSize(new Dimension(80, 0));
		boxGioLam.add(horizontalStrut_8);
		
		txtGioLam = new JTextField();
		txtGioLam.setEditable(false);
		txtGioLam.setPreferredSize(new Dimension(7, 30));
		boxGioLam.add(txtGioLam);
		txtGioLam.setColumns(10);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		verticalStrut_5.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_5);
		
		Box boxSLDaLam = Box.createHorizontalBox();
		box2.add(boxSLDaLam);
		
		JLabel lblSLDaLam = new JLabel("SL Đã Làm :");
		lblSLDaLam.setFont(new Font("Arial", Font.BOLD, 14));
		boxSLDaLam.add(lblSLDaLam);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		horizontalStrut_9.setPreferredSize(new Dimension(60, 0));
		boxSLDaLam.add(horizontalStrut_9);
		
		JComboBox cmbSLDaLam = new JComboBox();
		cmbSLDaLam.setPreferredSize(new Dimension(29, 30));
		boxSLDaLam.add(cmbSLDaLam);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		verticalStrut_7.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_7);
		
		Box boxCheckBox = Box.createHorizontalBox();
		box2.add(boxCheckBox);
		
		JCheckBox chkCoMat = new JCheckBox("Có Mặt");
		chkCoMat.setFont(new Font("Arial", Font.BOLD, 14));
		boxCheckBox.add(chkCoMat);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		boxCheckBox.add(horizontalStrut_11);
		
		JCheckBox chkCoPhep = new JCheckBox("Có Phép");
		chkCoPhep.setFont(new Font("Arial", Font.BOLD, 14));
		boxCheckBox.add(chkCoPhep);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(30, 0));
		pnNhap.add(horizontalStrut_5);
		
		JPanel pnDanhSachPhanCong = new JPanel();
		pnDanhSachPhanCong.setPreferredSize(new Dimension(530, 320));
		pnDanhSachPhanCong.setBorder(new TitledBorder(null, "Danh S\u00E1ch Ph\u00E2n C\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.add(pnDanhSachPhanCong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(510, 280));
		pnDanhSachPhanCong.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n", "T\u00EAn S\u1EA3n Ph\u1EA9m", "T\u00EAn C\u00F4ng \u0110o\u1EA1n ", "S\u1ED1 L\u01B0\u1EE3ng C\u1EA7n L\u00E0m "
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
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnChamCong = new JButton("Chấm Công");
		btnChamCong.setBackground(Color.GREEN);
		btnChamCong.setIcon(new ImageIcon(Form_CN_ChamCong.class.getResource("/img/Icons8-Windows-8-Programming-Add-Property.512 (1).png")));
		btnChamCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnChamCong);
		
		JButton btnXoaChamCong = new JButton("Xóa Chấm Công");
		btnXoaChamCong.setBackground(Color.ORANGE);
		btnXoaChamCong.setIcon(new ImageIcon(Form_CN_ChamCong.class.getResource("/img/Pictogrammers-Material-Calendar-remove-outline.512 (1).png")));
		btnXoaChamCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaChamCong);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_CN_ChamCong.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 240));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch Ch\u1EA5m C\u00F4ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
				"M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n", "S\u1EA3n Ph\u1EA9m", "C\u00F4ng \u0110o\u1EA1n", "Ng\u00E0y Ch\u1EA5m", "Ca L\u00E0m", "Gi\u1EDD L\u00E0m", "S\u1ED1 SP", "Tr\u1EA1ng Th\u00E1i", "Ngh\u1EC9 ph\u00E9p"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}

}
