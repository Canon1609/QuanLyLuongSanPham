package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;

import connectDB.Conection_DB;
import dao.DAO_HopDong;
import dao.DAO_NhanVien;
import dao.DAO_SanPham;
import entity.HopDong;
import entity.NhanVien;
import entity.SanPham;

import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class Form_HD_CapNhap extends JPanel {
	private JTextField txtmaHD;
	private JTextField txtkhachHang;
	private JTextField txtdonGia;
	private JTable tbl_SanPham;
	private JTextField txtsoLuong;
	private JTable tbl_Chinh;
	private DefaultTableModel tableM;
	private DefaultTableModel tableModel;
	private DAO_HopDong hd_dao;
	private DAO_NhanVien dao_nv;
	private DAO_SanPham dao_sp;
	private DefaultTableModel tableModelSanPham;
	private JTextField txt_tenNhanVien;
	private JTextField txt_tenSanPham;
	private JDateChooser dateChooser_ngayLap;
	private JDateChooser dateChooser_ngayGiao;
	private JSpinField jsfSoLuong;

	/**
	 * Create the panel.
	 */
	public Form_HD_CapNhap() {
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao_nv = new DAO_NhanVien();
		setLayout(new BorderLayout(0, 0));

		JPanel panel_T = new JPanel();
		panel_T.setPreferredSize(new Dimension(600, 300));
		panel_T.setBorder(
				new TitledBorder(null, "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_T, BorderLayout.WEST);

		Component horizontalStrut_11_1 = Box.createHorizontalStrut(20);
		horizontalStrut_11_1.setPreferredSize(new Dimension(40, 0));
		panel_T.add(horizontalStrut_11_1);

		Box b = Box.createVerticalBox();
		panel_T.add(b);

		Box b1 = Box.createHorizontalBox();
		b.add(b1);

		JLabel lblmaHD = new JLabel("Mã Hợp Đồng: ");
		lblmaHD.setPreferredSize(new Dimension(100, 20));
		lblmaHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lblmaHD);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut);

		txtmaHD = new JTextField();
		txtmaHD.setEditable(false);
		txtmaHD.setPreferredSize(new Dimension(7, 30));
		txtmaHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(txtmaHD);
		txtmaHD.setColumns(10);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_1);

		JLabel lblmaNV = new JLabel("Mã Nhân Viên: ");
		lblmaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lblmaNV);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_2);

		JComboBox cmbmaNV = new JComboBox();
		cmbmaNV.setPreferredSize(new Dimension(100, 22));
		cmbmaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(cmbmaNV);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 15));
		b.add(verticalStrut);

		Box b2 = Box.createHorizontalBox();
		b.add(b2);

		JLabel lbltenKhachHang = new JLabel("Tên Khách Hàng: ");
		lbltenKhachHang.setPreferredSize(new Dimension(100, 14));
		lbltenKhachHang.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbltenKhachHang);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_3);

		txtkhachHang = new JTextField();
		txtkhachHang.setPreferredSize(new Dimension(7, 30));
		txtkhachHang.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(txtkhachHang);
		txtkhachHang.setColumns(10);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 15));
		b.add(verticalStrut_1);

		Box b3 = Box.createHorizontalBox();
		b.add(b3);

		JLabel lbltenNhanVien = new JLabel("Tên Nhân Viên: ");
		lbltenNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		lbltenNhanVien.setPreferredSize(new Dimension(100, 14));
		b3.add(lbltenNhanVien);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		b3.add(horizontalStrut_4);

		txt_tenNhanVien = new JTextField();
		txt_tenNhanVien.setPreferredSize(new Dimension(30, 30));
		txt_tenNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(txt_tenNhanVien);
		txt_tenNhanVien.setEditable(false);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setMinimumSize(new Dimension(0, 15));
		b.add(verticalStrut_2);

		Box b4 = Box.createHorizontalBox();
		b.add(b4);

		JLabel lblmaSP = new JLabel("Mã Sản Phẩm: ");
		lblmaSP.setPreferredSize(new Dimension(100, 14));
		lblmaSP.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(lblmaSP);

		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_5);

		txt_tenSanPham = new JTextField();
		txt_tenSanPham.setPreferredSize(new Dimension(100, 30));
		txt_tenSanPham.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(txt_tenSanPham);
		txt_tenSanPham.setEditable(false);

		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_6);

		JLabel lbldonGia = new JLabel("Đơn Giá: ");
		lbldonGia.setPreferredSize(new Dimension(65, 14));
		lbldonGia.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(lbldonGia);

		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		b4.add(horizontalStrut_7);

		txtdonGia = new JTextField();
		txtdonGia.setPreferredSize(new Dimension(7, 30));
		txtdonGia.setFont(new Font("Arial", Font.PLAIN, 12));
		b4.add(txtdonGia);
		txtdonGia.setColumns(10);

		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setMinimumSize(new Dimension(0, 15));
		b.add(verticalStrut_3);

		Box b5 = Box.createHorizontalBox();
		b.add(b5);

		JLabel lblngayLap = new JLabel("Ngày Lâp: ");
		lblngayLap.setPreferredSize(new Dimension(100, 14));
		lblngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(lblngayLap);

		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_8);

		dateChooser_ngayLap = new JDateChooser();
		dateChooser_ngayLap.setPreferredSize(new Dimension(45, 30));
		dateChooser_ngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(dateChooser_ngayLap);

		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_9);

		JLabel lblngayGiao = new JLabel("Ngày Giao: ");
		lblngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(lblngayGiao);

		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		b5.add(horizontalStrut_10);

		dateChooser_ngayGiao = new JDateChooser();
		dateChooser_ngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b5.add(dateChooser_ngayGiao);

		JPanel panel_Center = new JPanel();
		panel_Center.setPreferredSize(new Dimension(650, 300));
		panel_Center.setBorder(
				new TitledBorder(null, "S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_Center, BorderLayout.CENTER);

		JScrollPane scr_sanPham = new JScrollPane();
		scr_sanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		scr_sanPham.setPreferredSize(new Dimension(750, 200));
		panel_Center.add(scr_sanPham);

		tbl_SanPham = new JTable();
		tbl_SanPham.setPreferredScrollableViewportSize(new Dimension(400, 400));
		tbl_SanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		tbl_SanPham.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Mã Sản Phẩm",
				"T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u","Số lượng" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class,Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scr_sanPham.setViewportView(tbl_SanPham);

		JLabel lblsoLuong = new JLabel("Số Lượng: ");
		lblsoLuong.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_Center.add(lblsoLuong);

		jsfSoLuong = new JSpinField();
		jsfSoLuong.getSpinner().setPreferredSize(new Dimension(30, 40));
		jsfSoLuong.setPreferredSize(new Dimension(100, 29));
		panel_Center.add(jsfSoLuong);
		
		JLabel lblTenSP = new JLabel("Tên Sản Phẩm: ");
		lblTenSP.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_Center.add(lblTenSP);
		
		JTextField txtTenSP = new JTextField();
		txtTenSP.setPreferredSize(new Dimension(30, 40));
		txtTenSP.setPreferredSize(new Dimension(100, 29));
		txtTenSP.setEditable(false);
		panel_Center.add(txtTenSP);
		

		JPanel panel_South = new JPanel();
		panel_South.setPreferredSize(new Dimension(1400, 340));
		add(panel_South, BorderLayout.SOUTH);
		panel_South.setLayout(new BorderLayout(0, 0));

		JPanel panel_table = new JPanel();
		panel_table.setPreferredSize(new Dimension(1400, 150));
		panel_table.setBorder(
				new TitledBorder(null, "H\u1EE3p \u0111\u1ED3ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_table.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_South.add(panel_table);
		panel_table.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JScrollPane src_tableChinh = new JScrollPane();
		src_tableChinh.setPreferredSize(new Dimension(1300, 250));
		panel_table.add(src_tableChinh);

		tbl_Chinh = new JTable();

		src_tableChinh.setViewportView(tbl_Chinh);
		tbl_Chinh.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã Hợp Đồng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Khách Hàng", "Mã Nhân Viên",
						"Tên Nhân Viên", "Ngày Lập", "Ngày Giao", "Số Lượng", "Đơn Giá" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, Integer.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		JPanel panel_ChucNang = new JPanel();
		panel_ChucNang.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_ChucNang.setPreferredSize(new Dimension(200, 50));
		panel_ChucNang.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_South.add(panel_ChucNang, BorderLayout.NORTH);
		panel_ChucNang.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btn_Them = new JButton("Thêm");
		btn_Them.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/them.png")));
		btn_Them.setPreferredSize(new Dimension(140, 40));
		btn_Them.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Them.setBackground(Color.LIGHT_GRAY);
		panel_ChucNang.add(btn_Them);

		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		horizontalStrut_11.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_11);

		JButton btn_Sua = new JButton("Sửa");
		btn_Sua.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/sua.png")));
		btn_Sua.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn_Sua.setPreferredSize(new Dimension(140, 40));
		btn_Sua.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Sua.setBackground(Color.MAGENTA);
		panel_ChucNang.add(btn_Sua);

		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		horizontalStrut_12.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_12);

		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/xoa.png")));
		btn_Xoa.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Xoa.setPreferredSize(new Dimension(140, 40));
		btn_Xoa.setBackground(Color.ORANGE);
		panel_ChucNang.add(btn_Xoa);

		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		horizontalStrut_13.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_13);

		JButton btn_In = new JButton("In");
		btn_In.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/in.png")));
		btn_In.setPreferredSize(new Dimension(140, 40));
		btn_In.setFont(new Font("Arial", Font.BOLD, 14));
		btn_In.setBackground(Color.GREEN);
		panel_ChucNang.add(btn_In);

		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		horizontalStrut_14.setPreferredSize(new Dimension(50, 0));
		panel_ChucNang.add(horizontalStrut_14);

		JButton btn_lamMoi = new JButton("Làm Mới");
		btn_lamMoi.setIcon(new ImageIcon(Form_HD_CapNhap.class.getResource("/img/xoa.png")));
		btn_lamMoi.setFont(new Font("Arial", Font.BOLD, 14));
		btn_lamMoi.setPreferredSize(new Dimension(140, 40));
		btn_lamMoi.setBackground(Color.CYAN);
		panel_ChucNang.add(btn_lamMoi);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);

		JLabel lblCapNhatHDong = new JLabel("CẬP NHẬT THÔNG TIN HỢP ĐÔNG");
		lblCapNhatHDong.setForeground(new Color(255, 0, 0));
		lblCapNhatHDong.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblCapNhatHDong);

		//
		/* XỬ LÝ TỪ ĐÂY */

		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<NhanVien> dsnv = new ArrayList<>();
		dsnv = dao_nv.getAlltbNhanVien();
		for (NhanVien nhanVien : dsnv) {
			cmbmaNV.addItem(nhanVien.getMaNhanVien());
		}
		dao_sp = new DAO_SanPham();

		tableModel = (DefaultTableModel) tbl_Chinh.getModel();
		String[] columnNames = { "Mã Hợp Đồng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Khách Hàng", "Mã Nhân Viên",
				"Tên Nhân Viên", "Ngày Lập", "Ngày Giao", "Số Lượng", "Đơn Giá" };
		tableModel.setColumnIdentifiers(columnNames);
		tableModelSanPham = (DefaultTableModel) tbl_SanPham.getModel();
		String[] columnNamesSanPham = { "Mã Sản Phẩm", "Tên Sản Phẩm", "Kiểu Dáng", "Chất Liệu","Số lượng" };
		tableModelSanPham.setColumnIdentifiers(columnNamesSanPham);
		hd_dao = new DAO_HopDong();
		DocDuLieuDBVaoTable();
		DocDuLieuDBVaoTableSanPham();
		btn_Them.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (valiData()) {
		        	// Lấy thông tin từ các trường nhập liệu
					// Truy vấn cơ sở dữ liệu để lấy ra mã nhân viên lớn nhất
					int maxEmployeeNumber = hd_dao.getMaxEmployeeNumber(); // Hãy viết phương thức getMaxEmployeeNumber để thực hiện truy vấn
					// Tăng giá trị mã nhân viên lớn nhất lên 1
					int nextEmployeeNumber = maxEmployeeNumber + 1;
					// Định dạng số thứ tự thành chuỗi với độ dài 2 và tạo mã nhân viên
					String ma = String.format("HD%02d", nextEmployeeNumber);

			        // Gán mã nhân viên đã tạo vào trường nhập liệu
			        txtmaHD.setText(ma);

		            // Lấy thông tin từ các trường nhập liệu
		            Date ngayLap = (Date) dateChooser_ngayLap.getDate();
		            Date ngayGiao = (Date) dateChooser_ngayGiao.getDate();
		            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		            String ngayLap_New = dateFormat.format(ngayLap);
		            String ngayGiao_New = dateFormat.format(ngayGiao);

		            String maSP = txt_tenSanPham.getText().trim();
		            String tenSP = txtTenSP.getText().trim();
		            String tenKH = txtkhachHang.getText().trim();

		            String maNV = cmbmaNV.getSelectedItem().toString();
		            String tenNV = txt_tenNhanVien.getText().trim();

		            int soLuong = jsfSoLuong.getValue();
		            double donGia = Double.parseDouble(txtdonGia.getText().trim());

		            SanPham sp = new SanPham(maSP);
		            NhanVien nv = new NhanVien(maNV);

		            HopDong hd = new HopDong(ma, sp, tenSP, tenKH, nv, tenNV, ngayLap_New, ngayGiao_New, soLuong, donGia);
		            

		            hd_dao.create(hd);
		            tableModel.addRow(new Object[] { hd.getMaHopDong(),hd.getSanPham().getMaSanPham(),hd.getTenSPham()
							, hd.getTenKH(), hd.getNhanVien().getMaNhanVien(),hd.getTenNVien(),
							hd.getNgayLap(), hd.getNgayGiao(),hd.getSoLuongSanPham(), hd.getDonGia() });

		            // Xóa nội dung của các trường nhập liệu sau khi thêm
		            txtkhachHang.setText("");
		            dateChooser_ngayLap.setDate(null);
		            dateChooser_ngayGiao.setDate(null);
		            txt_tenSanPham.setText("");
		            cmbmaNV.setSelectedIndex(0);
		            txtdonGia.setText("");
		        }
		    }
		});


		cmbmaNV.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ArrayList<NhanVien> ds = new ArrayList<>();
				String ma = cmbmaNV.getSelectedItem().toString();
				ds = dao_nv.getmatbNhanVien(ma);
				for (NhanVien nhanVien : ds) {
					txt_tenNhanVien.setText(nhanVien.getHoTen());
				}
			}
		});

		// XÓA NHÂN VIÊN
		btn_Xoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tbl_Chinh.getSelectedRow();
				if (row < 0) {
					JOptionPane.showMessageDialog(null, "Chọn hợp đồng cần xóa");
				} else {
					String maHD = (String) tbl_Chinh.getValueAt(row, 0);
					hd_dao.delete(maHD);
					tableModel.removeRow(row);
					JOptionPane.showMessageDialog(null, "Xóa hợp đồng thành công");
				}

			}
		});

		// SỬA NHÂN VIÊN
		btn_Sua.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tbl_Chinh.getSelectedRow();
				if (selectedRow < 0) {
					JOptionPane.showMessageDialog(null, "Chọn một hợp đồng trong bảng để sửa.");
					return;
				}

				// Lấy thông tin nhân viên từ dòng được chọn trong bảng
				String maHD = txtmaHD.getText().trim();
				String ten = txtkhachHang.getText().trim();

				// Xử lý ngày sinh
				Date ngayLap = (Date) dateChooser_ngayLap.getDate();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String ngayLapStr = dateFormat.format(ngayLap);
				Date ngayGiao = (Date) dateChooser_ngayGiao.getDate();
				String ngayGiaoStr = dateFormat.format(ngayLap);

				String maNV = cmbmaNV.getSelectedItem().toString();
				String tenNV = txt_tenNhanVien.getText().trim();
				String tenKh = txtkhachHang.getText().trim();
				String maSP = txt_tenSanPham.getText();
				String tenSP = txtTenSP.getText().trim();
				NhanVien nv = new NhanVien(maNV);
				SanPham sp = new SanPham(maSP);
				int soLuong = jsfSoLuong.getValue();
				double donGia = Double.parseDouble(txtdonGia.getText().trim());

				// Tạo đối tượng NhanVien mới
				HopDong hd = new HopDong(maHD, sp, tenSP, tenKh, nv, tenNV, ngayLapStr, ngayGiaoStr, soLuong, donGia);
				
				// Gọi phương thức DAO để cập nhật thông tin nhân viên
				boolean updated = hd_dao.update(hd);

				if (updated) {
					// Cập nhật lại thông tin trong bảng
					tableModel.setValueAt(maSP, selectedRow, 1);
					tableModel.setValueAt(tenSP, selectedRow, 2);
					tableModel.setValueAt(tenKh, selectedRow, 3);
					tableModel.setValueAt(maNV, selectedRow, 4);
					tableModel.setValueAt(tenNV, selectedRow, 5);
					tableModel.setValueAt(ngayLapStr, selectedRow, 6);
					tableModel.setValueAt(ngayGiaoStr, selectedRow, 7);
					tableModel.setValueAt(soLuong, selectedRow, 8);
					tableModel.setValueAt(donGia, selectedRow, 9);

					JOptionPane.showMessageDialog(null, "Cập nhật thông tin hợp đồng thành công");
				} else {
					JOptionPane.showMessageDialog(null, "Cập nhật thông tin hợp đồng thất bại");
				}
			}
		});

		// XÓA RỖNG
		btn_lamMoi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Đặt giá trị của các trường nhập liệu về rỗng hoặc giá trị mặc định
				txtmaHD.setText("");

				txtkhachHang.setText("");

				txt_tenNhanVien.setText("");

				dateChooser_ngayLap.setDate(null);
				dateChooser_ngayGiao.setDate(null);
				cmbmaNV.setSelectedIndex(0); // Đặt lại giá trị mặc định
				txt_tenSanPham.setText("");
				;
				txtdonGia.setText("");
				jsfSoLuong.setValue(0);
				;

			}
		});
		// THOÁT
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setVisible(false);
//			}
//		});
		// Đưa dữ liệu từ bảng lên các trường nhập liệu khi click vào một dòng trong
		// bảng
		tbl_Chinh.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int row = tbl_Chinh.getSelectedRow();
		        if (row >= 0) {
		            String ma = (String) tbl_Chinh.getValueAt(row, 0);
		            String maNV = (String) tbl_Chinh.getValueAt(row, 4);
		            String ngayLapStr = (String) tbl_Chinh.getValueAt(row, 6);
		            String ngayGiaoStr = (String) tbl_Chinh.getValueAt(row, 7);
		            String soLuongStr = tbl_Chinh.getValueAt(row, 8).toString(); // Convert to string

		            // Set the values to your text fields
		            txtmaHD.setText(ma);
		            txtkhachHang.setText((String) tbl_Chinh.getValueAt(row, 3));
		            txtdonGia.setText(tbl_Chinh.getValueAt(row, 9).toString()); // Convert to string

		            try {
		                Date ngayLapDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngayLapStr);
		                dateChooser_ngayLap.setDate(ngayLapDate);
		                Date ngayGiaoDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngayGiaoStr);
		                dateChooser_ngayGiao.setDate(ngayGiaoDate);
		            } catch (ParseException ex) {
		                ex.printStackTrace();
		            }
		            String maSP = (String) tbl_SanPham.getValueAt(row, 0); // Lấy mã sản phẩm từ bảng sản phẩm
		            String tenSP = (String) tbl_SanPham.getValueAt(row, 1); // Lấy tên sản phẩm từ bảng sản phẩm

		            // Đưa mã sản phẩm và tên sản phẩm vào các trường nhập liệu
		            txt_tenSanPham.setText(maSP);
		            txtTenSP.setText(tenSP);
		            cmbmaNV.setSelectedItem(maNV);
		            jsfSoLuong.setValue(Integer.parseInt(soLuongStr)); // Convert to integer
		        }
		    }
		});

		tbl_SanPham.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tbl_SanPham.getSelectedRow();
				if (row >= 0) {

					String maSP = (String) tbl_SanPham.getValueAt(row, 0);
					txt_tenSanPham.setText(maSP);
					String tenSP = (String) tbl_SanPham.getValueAt(row, 1);
					txtTenSP.setText(tenSP);

				}
			}
		});
		/////////////////

	}

	public void DocDuLieuDBVaoTable() {
		List<HopDong> list = hd_dao.getAllHopDong();
		for (HopDong hd : list) {

			tableModel.addRow(new Object[] { hd.getMaHopDong(),hd.getSanPham().getMaSanPham(),hd.getTenSPham()
					, hd.getTenKH(), hd.getNhanVien().getMaNhanVien(),hd.getTenNVien(),
					hd.getNgayLap(), hd.getNgayGiao(),hd.getSoLuongSanPham(), hd.getDonGia() });
		}
		//System.out.println(list);
	}

	public void DocDuLieuDBVaoTableSanPham() {
		List<SanPham> list = dao_sp.getAlltbSanPham();
		for (SanPham sp : list) {

			tableModelSanPham
					.addRow(new Object[] { sp.getMaSanPham(), sp.getTenSanPham(), sp.getKieuDang(), sp.getChatLieu(),sp.getSoLuong() });
		}
	}

	public boolean valiData() {

		if (txtkhachHang.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Tên Khách Hàng Không Được Rỗng!!!");
			txtkhachHang.selectAll();
			txtkhachHang.requestFocus();
			return false;
		}
		if (txtdonGia.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Đơn Giá Không Được Rỗng!!!");
			txtdonGia.selectAll();
			txtdonGia.requestFocus();
			return false;
		}

		String tenKH =txtkhachHang.getText().trim();
		Date ngayLap =dateChooser_ngayLap.getDate();
		Date ngayGiao =dateChooser_ngayGiao.getDate();
		double donGia =Double.parseDouble(txtdonGia.getText().trim());

		if (!tenKH.matches("[\\p{L}' ]+")) {
			JOptionPane.showMessageDialog(this, "Tên Khách Hàng Không Hợp Lệ!!!");
			txtkhachHang.selectAll();
			txtkhachHang.requestFocus();
			return false;
		}

		if(ngayLap.compareTo(ngayGiao) >=0)
		{
			JOptionPane.showMessageDialog(this, "Ngày Lập Phải Trước Ngày Giao!!!");
			return false;
					
		}
		int row = tbl_SanPham.getSelectedRow();
		if(jsfSoLuong.getValue()>Integer.parseInt(tbl_SanPham.getValueAt(row, 4).toString())) {
			JOptionPane.showMessageDialog(this, "Số lượng phải nhỏ hơn số lượng hiện có");
			return false;
		}
		
		if (donGia <= 0) {

			JOptionPane.showMessageDialog(this, "Đơn Giá Phải Lớn Hơn 0!!!");
			txtdonGia.selectAll();
			txtdonGia.requestFocus();
			return false;
		}

		return true;
	}
}
