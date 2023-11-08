package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import connectDB.Conection_DB;
import dao.DAO_SanPham;
import entity.SanPham;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class Form_SP_CongDoan extends JPanel {
	private JTextField txtMaCongDoan;
	private JTextField txtMaSanPham;
	private JTextField txtGiaCongDoan;
	private JTextField txtTenCongDoan;
	private JTextField txtTenSanPham;
	private JTable table;
	private JTable table_1;
	private DAO_SanPham dao_SP;
	private TableModel tableModelSP;

	/**
	 * Create the panel.
	 */
	public Form_SP_CongDoan() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblCongDoanSanXuatSanPham = new JLabel("CÔNG ĐOẠN SẢN XUẤT SẢN PHẨM");
		lblCongDoanSanXuatSanPham.setForeground(Color.RED);
		lblCongDoanSanXuatSanPham.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblCongDoanSanXuatSanPham);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 430));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 370));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin C\u00F4ng \u0110o\u1EA1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		box1.setPreferredSize(new Dimension(300, 250));
		pnNhap.add(box1);
		
		Box boxMaCongDoan = Box.createHorizontalBox();
		box1.add(boxMaCongDoan);
		
		JLabel lblMaCongDoan = new JLabel("Mã Công Đoạn :");
		lblMaCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaCongDoan.add(lblMaCongDoan);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(4, 0));
		boxMaCongDoan.add(horizontalStrut_4);
		
		txtMaCongDoan = new JTextField();
		txtMaCongDoan.setEditable(false);
		txtMaCongDoan.setPreferredSize(new Dimension(7, 30));
		boxMaCongDoan.add(txtMaCongDoan);
		txtMaCongDoan.setColumns(15);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut);
		
		Box boxMaSanPham = Box.createHorizontalBox();
		box1.add(boxMaSanPham);
		
		JLabel lblMaSanPham = new JLabel("Mã Sản Phẩm :");
		lblMaSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaSanPham.add(lblMaSanPham);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(10, 0));
		boxMaSanPham.add(horizontalStrut_3);
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setPreferredSize(new Dimension(7, 30));
		boxMaSanPham.add(txtMaSanPham);
		txtMaSanPham.setColumns(15);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_1);
		
		Box boxGiaCongDoan = Box.createHorizontalBox();
		box1.add(boxGiaCongDoan);
		
		JLabel lblGiaCongDoan = new JLabel("Giá Công Đoạn :");
		lblGiaCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxGiaCongDoan.add(lblGiaCongDoan);
		
		txtGiaCongDoan = new JTextField();
		txtGiaCongDoan.setPreferredSize(new Dimension(7, 30));
		boxGiaCongDoan.add(txtGiaCongDoan);
		txtGiaCongDoan.setColumns(15);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalStrut_4.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_4);
		
		Box boxYeuCau = Box.createHorizontalBox();
		box1.add(boxYeuCau);
		
		JCheckBox chkCongDoanYeuCau = new JCheckBox("Công Đoạn Yêu Cầu");
		chkCongDoanYeuCau.setFont(new Font("Arial", Font.BOLD, 14));
		boxYeuCau.add(chkCongDoanYeuCau);
		
		JComboBox cmbCongDoanYeuCau = new JComboBox();
		cmbCongDoanYeuCau.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbCongDoanYeuCau.setModel(new DefaultComboBoxModel(new String[] {"Công Đoạn 1"}));
		cmbCongDoanYeuCau.setPreferredSize(new Dimension(300, 30));
		boxYeuCau.add(cmbCongDoanYeuCau);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		pnNhap.add(horizontalStrut);
		
		Box box2 = Box.createVerticalBox();
		box2.setPreferredSize(new Dimension(250, 200));
		pnNhap.add(box2);
		
		Box boxTenCongDoan = Box.createHorizontalBox();
		box2.add(boxTenCongDoan);
		
		JLabel lblTenCongDoan = new JLabel("Tên Công Đoạn :");
		lblTenCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongDoan.add(lblTenCongDoan);
		
		txtTenCongDoan = new JTextField();
		txtTenCongDoan.setPreferredSize(new Dimension(7, 30));
		boxTenCongDoan.add(txtTenCongDoan);
		txtTenCongDoan.setColumns(15);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_2);
		
		Box boxTenSanPham = Box.createHorizontalBox();
		box2.add(boxTenSanPham);
		
		JLabel lblTenSanPham = new JLabel("Tên Sản Phẩm :");
		lblTenSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenSanPham.add(lblTenSanPham);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(8, 0));
		boxTenSanPham.add(horizontalStrut_5);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setPreferredSize(new Dimension(7, 30));
		boxTenSanPham.add(txtTenSanPham);
		txtTenSanPham.setColumns(15);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_3);
		
		Box boxSoLuong = Box.createHorizontalBox();
		box2.add(boxSoLuong);
		
		JLabel lblSoLuong = new JLabel("Số Lượng :");
		lblSoLuong.setFont(new Font("Arial", Font.BOLD, 14));
		boxSoLuong.add(lblSoLuong);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(38, 0));
		boxSoLuong.add(horizontalStrut_1);
		
		JComboBox cmbSoLuong = new JComboBox();
		cmbSoLuong.setPreferredSize(new Dimension(29, 30));
		boxSoLuong.add(cmbSoLuong);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		verticalStrut_10.setPreferredSize(new Dimension(0, 40));
		box2.add(verticalStrut_10);
		pnNhap.add(horizontalStrut_2);
		
		JPanel pnDanhSachSanPham = new JPanel();
		pnDanhSachSanPham.setBorder(new TitledBorder(null, "Danh S\u00E1ch S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.add(pnDanhSachSanPham);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(510, 300));
		pnDanhSachSanPham.add(scrollPane);
		
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
		//xu ly
		tableModelSP = table.getModel(); 
		String [] columName = {"Mã Sản Phẩm","Tên Sản Phẩm","Kiểu Dáng","Chất Liệu","Số Lượng"};
		((DefaultTableModel) tableModelSP).setColumnIdentifiers(columName);
		// khởi tạo kết nối đến CSDL
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao_SP = new DAO_SanPham();
		DocDuLieuDBVaoTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				if(row>=0) {
					String maSP = (String) table.getValueAt(row, 0);
					String tenSP = (String) table.getValueAt(row, 1);
					int soLuong = (int) table.getValueAt(row, 4);
					txtMaSanPham.setText(maSP);
					txtTenSanPham.setText(tenSP);
					cmbSoLuong.addItem(soLuong);
				}
			}
		});
		
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnThemCongDoan = new JButton("Thêm Công Đoạn");
		btnThemCongDoan.setBackground(Color.LIGHT_GRAY);
		btnThemCongDoan.setIcon(new ImageIcon(Form_SP_CongDoan.class.getResource("/img/Icons8-Windows-8-Programming-Add-Property.512 (1).png")));
		btnThemCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThemCongDoan);
		
		JButton btnXoaCongDoan = new JButton("Xóa Công Đoạn");
		btnXoaCongDoan.setBackground(Color.CYAN);
		btnXoaCongDoan.setIcon(new ImageIcon(Form_SP_CongDoan.class.getResource("/img/Pictogrammers-Material-Calendar-remove-outline.512 (1).png")));
		btnXoaCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaCongDoan);
		
		JButton btnSuaThongTin = new JButton("Sửa Thông Tin");
		btnSuaThongTin.setBackground(Color.GREEN);
		btnSuaThongTin.setIcon(new ImageIcon(Form_SP_CongDoan.class.getResource("/img/Icons8-Windows-8-Programming-Add-Property.512 (1).png")));
		btnSuaThongTin.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnSuaThongTin);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setBackground(Color.MAGENTA);
		btnXoaRong.setIcon(new ImageIcon(Form_SP_CongDoan.class.getResource("/img/xoarong.png")));
		btnXoaRong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaRong);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_SP_CongDoan.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 210));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch C\u00F4ng \u0110o\u1EA1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1100, 170));
		pnSouth.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 C\u00F4ng \u0110o\u1EA1n", "T\u00EAn C\u00F4ng \u0110o\u1EA1n", "Gi\u00E1 C\u00F4ng \u0110o\u1EA1n", "M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "S\u1ED1 L\u01B0\u1EE3ng", "C\u00F4ng \u0110o\u1EA1n Y\u00EAu C\u1EA7u"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}
	//
	public void DocDuLieuDBVaoTable() {
		List<SanPham> list = DAO_SanPham.getAlltbSanPham();
		for (SanPham sp : list) {
			((DefaultTableModel) tableModelSP).addRow(new Object[] {sp.getMaSanPham(),sp.getTenSanPham(),sp.getKieuDang(),sp.getChatLieu(),sp.getSoLuong()});
		}
	}

}
