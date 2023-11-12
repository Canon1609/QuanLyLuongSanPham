package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
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

import connectDB.Conection_DB;
import dao.DAO_NhanVien;
import dao.DAO_LuongNhanVien;
import entity.LuongNhanVien;
import entity.NhanVien;

import javax.swing.JScrollPane;

public class Form_NV_TinhLuong extends JPanel {
	private JTextField txtMaLuong;
	private JTextField txtThucLanh;
	private JTable table;
	private JTable tblTinhLuong;
	private DefaultTableModel tableModel;
	private DAO_NhanVien nv_dao;
	private DefaultTableModel tableModelTinhLuong;
	private JTextField txtMaNV;
	private JTextField txtTenNV;
	private Form_NV_ChamCong chamCongNV;
	private Double luongCB;
	private Double phuCap;
	private int tongNgayCong;
	private double tbLuongCa;
	private double thucNhan;
	private Double heSoLuong;
	private DAO_LuongNhanVien luongNV_DAO;

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
		pnCenter.setPreferredSize(new Dimension(1800, 360));
		add(pnCenter, BorderLayout.CENTER);

		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng tin t\u00EDnh l\u01B0\u01A1ng", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1800, 300));
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

		txtMaNV = new JTextField();
		txtMaNV.setPreferredSize(new Dimension(30, 10));
		txtMaNV.setEditable(false);
		boxMaNV.add(txtMaNV);

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

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		boxTrai1.add(verticalStrut_1);

		Box boxThucLanh = Box.createHorizontalBox();
		boxTrai1.add(boxThucLanh);

		JLabel lblThucLanh = new JLabel("Thực Nhận :");
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

		txtTenNV = new JTextField();
		txtTenNV.setPreferredSize(new Dimension(30, 0));
		txtTenNV.setEditable(false);
		boxNhanVien.add(txtTenNV);

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

		JComboBox cmbThang = new JComboBox<Integer>();
		cmbThang.setPreferredSize(new Dimension(30, 35));
		for (int thang = 1; thang <= 12; thang++) {
			cmbThang.addItem(thang);
		}
		boxThang.add(cmbThang);
		chamCongNV = new Form_NV_ChamCong();

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

		JComboBox cmbNam = new JComboBox<Integer>();
		cmbNam.setPreferredSize(new Dimension(30, 35));
		// Lấy năm hiện tại
		int namHienTai = Calendar.getInstance().get(Calendar.YEAR);

		// Thêm các năm từ 2020 đến năm hiện tại vào JComboBox
		for (int nam = 2023; nam <= namHienTai; nam++) {
			cmbNam.addItem(nam);
		}
		boxNam.add(cmbNam);

		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(10, 0));
		pnNhap.add(horizontalStrut_7);

		JPanel pnDanhSachNhanVien = new JPanel();
		pnDanhSachNhanVien.setBorder(new TitledBorder(null, "Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnDanhSachNhanVien.setPreferredSize(new Dimension(950, 270));
		pnNhap.add(pnDanhSachNhanVien);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(900, 240));
		pnDanhSachNhanVien.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "CMND/CCCD", "Ng\u00E0y Sinh",
						"Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i",
						"L\u01B0\u01A1ng", "Ph\u1EE5 C\u1EA5p", "Ph\u00F2ng Ban", "H\u1EC7 S\u1ED1 L\u01B0\u01A1ng" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, Double.class, Double.class, String.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false,
					false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		/* XỬ LÝ TỪ ĐÂY */
		tableModel = (DefaultTableModel) table.getModel();
		String[] columnNames = { "Mã Nhân Viên", "Họ Tên", "CMND/CCCD", "Ngày Sinh", "Giới Tính", "Địa Chỉ",
				"Số Điện Thoại", "Lương Cơ bản", "Phụ Cấp", "Phòng Ban", "Hệ Số Lương" };
		tableModel.setColumnIdentifiers(columnNames);
		// khởi tạo kết nối đến CSDL
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nv_dao = new DAO_NhanVien();
		DocDuLieuDBVaoTable();

		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				if (row >= 0) {
					String ma = (String) table.getValueAt(row, 0);
					String ten = (String) table.getValueAt(row, 1);
					luongCB = (Double) table.getValueAt(row, 7);
					phuCap = (Double) table.getValueAt(row, 8);
					heSoLuong = (Double) table.getValueAt(row, 10);
					txtMaNV.setText(ma);
					txtTenNV.setText(ten);
				}
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
		pnSouth.setBorder(new TitledBorder(null, "Danh s\u00E1ch l\u01B0\u01A1ng", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnSouth.setPreferredSize(new Dimension(1200, 280));
		add(pnSouth, BorderLayout.SOUTH);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1150, 250));
		pnSouth.add(scrollPane_1);

		tblTinhLuong = new JTable();
		scrollPane_1.setViewportView(tblTinhLuong);
		tblTinhLuong.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã Lương", "Mã Nhân Viên", "Họ Tên", "Tháng Nhận", "Năm Nhận", "Thực Nhận" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, Integer.class, Integer.class,
					Integer.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableModelTinhLuong = (DefaultTableModel) tblTinhLuong.getModel();
		String[] columnNames1 = { "Mã Lương", "Mã Nhân Viên", "Họ Tên", "Số Ngày Đi Làm", "Tháng Nhận", "Năm Nhận",
				"Thực Nhận" };
		tableModelTinhLuong.setColumnIdentifiers(columnNames1);
		docDLLuongNV();
		// Thêm ActionListener cho cmbThang
		cmbThang.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Gọi hàm tính tổng ngày công dựa trên tháng đã chọn
				tongNgayCong = chamCongNV.tinhTongNgayCong(txtMaNV.getText().trim(),
						Integer.parseInt(cmbThang.getSelectedItem().toString()));
				tbLuongCa = chamCongNV.tinhTrungBinhLuongCa(txtMaNV.getText().trim(),
						Integer.parseInt(cmbThang.getSelectedItem().toString()));
				// Hiển thị tổng ngày công (ví dụ: bằng cách đặt nó vào một JLabel hoặc
				// JTextField)

				// System.out.println("Tổng ngày công: " + tongNgayCong); // Thay thế
				// lblTongNgayCong bằng thành phần hiển thị thực tế của bạn
				// System.out.println("\nTB lương ca: " + tbLuongCa);
				thucNhan = ((((luongCB * tbLuongCa) * heSoLuong) / 26) * tongNgayCong) + phuCap;
				// Chuyển giá trị double thành chuỗi
				String thucNhanStr = Double.toString(thucNhan);

				// Gán giá trị chuỗi vào txtThucLanh
				txtThucLanh.setText(thucNhanStr);

			}
		});

		luongNV_DAO = new DAO_LuongNhanVien();
		btnTinhLuong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int maxLuongNumber = luongNV_DAO.getMaxMaLuongNV();
				int nextLuongNumber = maxLuongNumber + 1;
				String ma = String.format("L%02d", nextLuongNumber);
				String maNV = txtMaNV.getText().trim();
				String tenNV = txtTenNV.getText().trim();
				int ngayDiLam = tongNgayCong;
				int thangNhan = Integer.parseInt(cmbThang.getSelectedItem().toString());
				int namNhan = Integer.parseInt(cmbNam.getSelectedItem().toString());
				double thucNhan = Double.parseDouble(txtThucLanh.getText().trim());
				NhanVien nv = new NhanVien(maNV);
				LuongNhanVien luongNV = new LuongNhanVien(ma, nv, tenNV, ngayDiLam, thangNhan, namNhan, thucNhan);
				luongNV_DAO.create(luongNV);
				tableModelTinhLuong.addRow(new Object[] { ma, luongNV.getNhanVien().getMaNhanVien(),
						luongNV.getTenNhanVien(), luongNV.getSoNgayDiLam(), luongNV.getThangNhan(),
						luongNV.getNamNhan(), luongNV.getThucNhan() });

				txtMaLuong.setText("");
				txtMaNV.setText("");
				txtTenNV.setText("");
				txtThucLanh.setText("");
				cmbNam.setSelectedIndex(0);
				cmbThang.setSelectedIndex(0);

			}
		});
		btnXoaLuong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tblTinhLuong.getSelectedRow();
				if (row < 0) {
					JOptionPane.showMessageDialog(null, "Chọn Lương cần xóa");
				} else {
					String maLuongNV = (String) tblTinhLuong.getValueAt(row, 0);
					luongNV_DAO.delete(maLuongNV);
					tableModelTinhLuong.removeRow(row);
					JOptionPane.showMessageDialog(null, "Xóa Lương thành công");
				}

			}
		});
		btnLamMoi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtMaLuong.setText("");
				txtMaNV.setText("");
				txtTenNV.setText("");
				txtThucLanh.setText("");
				cmbNam.setSelectedIndex(0);
				cmbThang.setSelectedIndex(0);

			}
		});
		btnThoat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public void DocDuLieuDBVaoTable() {
		List<NhanVien> list = DAO_NhanVien.getAlltbNhanVien();
		for (NhanVien nv : list) {
			tableModel.addRow(new Object[] { nv.getMaNhanVien(), nv.getHoTen(), nv.getcCCD(), nv.getNgaySinh(),
					nv.getGioiTinh(), nv.getDiaChi(), nv.getSoDienThoai(), nv.getLuongCoBan(), nv.getPhuCap(),
					nv.getPhongBan(), nv.getHeSoLuong() });
		}

	}

	public void docDLLuongNV() {
		List<LuongNhanVien> list = DAO_LuongNhanVien.getAlltbCongCuaNhanVien();
		for (LuongNhanVien luongNV : list) {
			tableModelTinhLuong.addRow(new Object[] { luongNV.getMaLuongNhanVien(),
					luongNV.getNhanVien().getMaNhanVien(), luongNV.getTenNhanVien(), luongNV.getSoNgayDiLam(),
					luongNV.getThangNhan(), luongNV.getNamNhan(), luongNV.getThucNhan() });
		}

	}
}
