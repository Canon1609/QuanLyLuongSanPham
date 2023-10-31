package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connectDB.Conection_DB;
import dao.DAO_NhanVien;
import dao.DAO_SanPham;
import entity.NhanVien;
import entity.SanPham;

import javax.swing.JScrollPane;

public class Form_SP_TimKiem extends JPanel {
	private JTextField txtMaSanPham;
	private JTextField txtKieuDang;
	private JTextField txtTenSanPham;
	private JTextField txtChatLieu;
	private JTable table;
	private JComboBox cmbGT;
	private JTable tblDanhSachSanPham;
	private DefaultTableModel tableModel;
	private DAO_SanPham sp_dao;

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
		
//		Box box1 = Box.createVerticalBox();
//		pnNhap.add(box1);
//		
//		Box boxMaSanPham = Box.createHorizontalBox();
//		box1.add(boxMaSanPham);
//		
//		JRadioButton radMaSanPham = new JRadioButton("Mã Sản Phẩm");
//		radMaSanPham.setFont(new Font("Arial", Font.BOLD, 14));
//		boxMaSanPham.add(radMaSanPham);
//		
//		txtMaSanPham = new JTextField();
//		txtMaSanPham.setEditable(false);
//		txtMaSanPham.setPreferredSize(new Dimension(7, 30));
//		boxMaSanPham.add(txtMaSanPham);
//		txtMaSanPham.setColumns(30);
//		
//		Component verticalStrut = Box.createVerticalStrut(20);
//		verticalStrut.setPreferredSize(new Dimension(0, 50));
//		box1.add(verticalStrut);
//		
//		Box boxKieuDang = Box.createHorizontalBox();
//		box1.add(boxKieuDang);
//		
//		JRadioButton radKieuDang = new JRadioButton("Kiểu Dáng");
//		radKieuDang.setFont(new Font("Arial", Font.BOLD, 14));
//		boxKieuDang.add(radKieuDang);
//		
//		Component horizontalStrut = Box.createHorizontalStrut(20);
//		boxKieuDang.add(horizontalStrut);
//		
//		txtKieuDang = new JTextField();
//		txtKieuDang.setEditable(false);
//		txtKieuDang.setPreferredSize(new Dimension(7, 30));
//		boxKieuDang.add(txtKieuDang);
//		txtKieuDang.setColumns(30);
//		
//		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
//		horizontalStrut_2.setPreferredSize(new Dimension(100, 0));
//		pnNhap.add(horizontalStrut_2);
//		
//		Box box2 = Box.createVerticalBox();
//		pnNhap.add(box2);
//		
//		Box boxTenSanPham = Box.createHorizontalBox();
//		box2.add(boxTenSanPham);
//		
//		JRadioButton radTenSanPham = new JRadioButton("Tên Sản Phẩm");
//		radTenSanPham.setFont(new Font("Arial", Font.BOLD, 14));
//		boxTenSanPham.add(radTenSanPham);
//		
//		txtTenSanPham = new JTextField();
//		txtTenSanPham.setEditable(false);
//		txtTenSanPham.setPreferredSize(new Dimension(7, 30));
//		boxTenSanPham.add(txtTenSanPham);
//		txtTenSanPham.setColumns(30);
//		
//		Component verticalStrut_1 = Box.createVerticalStrut(20);
//		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
//		box2.add(verticalStrut_1);
//		
//		Box boxChatLieu = Box.createHorizontalBox();
//		box2.add(boxChatLieu);
//		
//		JRadioButton radChatLieu = new JRadioButton("Chất Liệu");
//		radChatLieu.setFont(new Font("Arial", Font.BOLD, 14));
//		boxChatLieu.add(radChatLieu);
//		
//		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
//		horizontalStrut_1.setPreferredSize(new Dimension(35, 0));
//		boxChatLieu.add(horizontalStrut_1);
//		
//		txtChatLieu = new JTextField();
//		txtChatLieu.setEditable(false);
//		txtChatLieu.setPreferredSize(new Dimension(7, 30));
//		boxChatLieu.add(txtChatLieu);
//		txtChatLieu.setColumns(30);
		
		Box b, b1, b2, b3;
		JLabel lblNhapTimTheo, lblTimKieuDang, lblTenSanPham;
		JTextField txtTimKieuDang, txtTenSanPham, txtThongBao;
		b = Box.createVerticalBox();
		b.add(Box.createVerticalStrut(60));
		b.add(b2 = Box.createHorizontalBox());
//		b2.add(lblTimKieuDang = new JLabel("Tìm kiếm theo Kiểu Dáng: "));
		b2.add(lblTenSanPham = new JLabel("Tìm kiếm theo Tên Sản Phẩm: "));
		b2.add(txtTenSanPham = new JTextField());
		txtTenSanPham.setPreferredSize(new Dimension(250, 20));
		b.add(Box.createVerticalStrut(20)); // Khoảng cách giữa trường nhập kiểu dáng và trường nhập chất liệu
		b.add(b3 = Box.createHorizontalBox());
		b3.add(lblTimKieuDang = new JLabel("Tìm kiếm theo Kiểu Dáng: "));
		b3.add(txtTimKieuDang = new JTextField());
		txtTimKieuDang.setPreferredSize(new Dimension(250, 20));

		pnNhap.add(b);

		b.add(b3 = Box.createHorizontalBox());
		b3.add(Box.createHorizontalStrut(200)); // Khoảng cách giữa trường thông báo và biên dưới
		b3.add(txtThongBao = new JTextField(50));
		txtThongBao.setBorder(null);
		txtThongBao.setEditable(false);
		txtThongBao.setForeground(Color.RED);
		txtThongBao.setFont(new Font("Arial", Font.ITALIC, 14));
		b.setPreferredSize(new Dimension(500, 150));
		
		
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
		
		
		//SOUTH
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 420));
		pnSouth.setBorder(new TitledBorder(null, "K\u1EBFt Qu\u1EA3 T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1100, 370));
		pnSouth.add(scrollPane);
		
		tblDanhSachSanPham = new JTable();
		scrollPane.setViewportView(tblDanhSachSanPham);
		tblDanhSachSanPham.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u", "S\u1ED1 L\u01B0\u1EE3ng"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
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
		tblDanhSachSanPham.setFont(new Font("Arial", Font.PLAIN, 12));

		//Xu ly
		tableModel = (DefaultTableModel) tblDanhSachSanPham.getModel();
		String[] columnNames = { "Mã Sản Phẩm", "Tên Sản Phẩm", "Kiểu Dáng", "Chất Liệu", "Số Lượng"};
		tableModel.setColumnIdentifiers(columnNames);
		
	
		// Khởi tạo kết nối đến CSDL
		try {
		    Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();
		}

		// Tạo đối tượng DAO sản phẩm
		sp_dao = new DAO_SanPham();

		btnTimKiem.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String timKiemKieuDang = txtTimKieuDang.getText().trim();
		        String timKiemTheoTenSP = txtTenSanPham.getText().trim();

		        if (!timKiemKieuDang.isEmpty()) {
		            // Tìm kiếm theo kiểu dáng và lấy danh sách sản phẩm
		            ArrayList<SanPham> danhSachSanPham = (ArrayList<SanPham>) sp_dao.timKiemKD(timKiemKieuDang);

		            // Kiểm tra xem danh sách có dữ liệu không
		            if (danhSachSanPham.isEmpty()) {
		                txtThongBao.setText("Không tìm thấy sản phẩm theo kiểu dáng!");
		                updateTableData(danhSachSanPham);
		            } else {
		                txtThongBao.setText("Tìm thành công theo kiểu dáng!");
		                updateTableData(danhSachSanPham);
		            }
		        } else if (!timKiemTheoTenSP.isEmpty()) {
		            // Tìm kiếm theo chất liệu và lấy danh sách sản phẩm
		            ArrayList<SanPham> danhSachSanPham = (ArrayList<SanPham>) sp_dao.timKiemTen(timKiemTheoTenSP);

		            // Kiểm tra xem danh sách có dữ liệu không
		            if (danhSachSanPham.isEmpty()) {
		                txtThongBao.setText("Không tìm thấy sản phẩm theo tên sản phẩm!");
		                updateTableData(danhSachSanPham);
		            } else {
		                txtThongBao.setText("Tìm thành công theo tên sản phẩm!");
		                updateTableData(danhSachSanPham);
		            }
		        }
		    }
		}); }
	
		private void updateTableData(ArrayList<SanPham> danhSachSanPham) {
		    DefaultTableModel model = (DefaultTableModel) tblDanhSachSanPham.getModel();
		    model.setRowCount(0); // Xóa dữ liệu cũ

		    for (SanPham sp : danhSachSanPham) {
		        model.addRow(new Object[] {
		            sp.getMaSanPham(),
		            sp.getTenSanPham(),
		            sp.getChatLieu(),
		            sp.getKieuDang(),
		            sp.getSoLuong(),

		        });
		    }
	}

}
