package gui_Form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import connectDB.Conection_DB;

import dao.DAO_NhanVien;
import entity.NhanVien;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_NV_CapNhat extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField txtMaNV;
	private JTextField txtHoTen;
	private JTextField txtCMND;
	private JTextField txtLuongCoBan;
	private JTextField txtDiaChi;
	private JTextField txtSoDienThoai;
	private JTextField txtPhuCap;
	private DAO_NhanVien nv_dao;
	private DefaultTableModel tableModel;
	private int nextEmployeeNumber = 0;
	private JComboBox cmbHeSoLuong;
	private JDateChooser dateChooser;
	private JComboBox cmbGioiTinh;
	private JComboBox cmbPhongBan;

	/**
	 * Create the panel.
	 */
	public Form_NV_CapNhat() {
		setLayout(new BorderLayout(0, 0));

		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);

		JLabel lblTieuDe = new JLabel("NHÂN VIÊN HÀNH CHÍNH");
		lblTieuDe.setForeground(new Color(255, 0, 0));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblTieuDe);

		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 360));
		add(pnCenter, BorderLayout.CENTER);

		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng tin nh\u00E2n vi\u00EAn h\u00E0nh ch\u00EDnh",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1200, 300));
		pnCenter.add(pnNhap);

		Box boxTrai = Box.createVerticalBox();
		pnNhap.add(boxTrai);

		Box boxTrai1 = Box.createHorizontalBox();
		boxTrai.add(boxTrai1);

		JLabel lblMaNV = new JLabel("Mã Nhân Viên :");
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai1.add(lblMaNV);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(19, 0));
		boxTrai1.add(horizontalStrut);

		txtMaNV = new JTextField();
		txtMaNV.setPreferredSize(new Dimension(30, 25));
		txtMaNV.requestFocus();
		txtMaNV.setEditable(false);
		txtMaNV.setFont(new Font("Arial", Font.PLAIN, 12));
		boxTrai1.add(txtMaNV);
		txtMaNV.setColumns(30);

		Component verticalStrut = Box.createVerticalStrut(25);
		boxTrai.add(verticalStrut);

		Box boxTrai2 = Box.createHorizontalBox();
		boxTrai.add(boxTrai2);

		JLabel lblGioiTinh = new JLabel("Giới Tính :");
		lblGioiTinh.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai2.add(lblGioiTinh);

		Component horizontalStrut_1 = Box.createHorizontalStrut(45);
		horizontalStrut_1.setPreferredSize(new Dimension(44, 0));
		boxTrai2.add(horizontalStrut_1);

		cmbGioiTinh = new JComboBox();
		cmbGioiTinh.setFont(new Font("Arial", Font.BOLD, 12));
		cmbGioiTinh.setPreferredSize(new Dimension(30, 25));
		cmbGioiTinh.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		boxTrai2.add(cmbGioiTinh);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		boxTrai.add(verticalStrut_2);

		Box boxTrai3 = Box.createHorizontalBox();
		boxTrai.add(boxTrai3);

		JLabel lblCMND = new JLabel("CMND/CCCD :");
		lblCMND.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai3.add(lblCMND);

		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		boxTrai3.add(horizontalStrut_5);

		txtCMND = new JTextField();
		txtCMND.setPreferredSize(new Dimension(30, 25));
		boxTrai3.add(txtCMND);
		txtCMND.setColumns(10);

		Component verticalStrut_3 = Box.createVerticalStrut(20);
		boxTrai.add(verticalStrut_3);

		Box boxTrai4 = Box.createHorizontalBox();
		boxTrai.add(boxTrai4);

		JLabel lblLuongCoBan = new JLabel("Lương Cơ Bản :");
		lblLuongCoBan.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai4.add(lblLuongCoBan);

		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(10, 0));
		boxTrai4.add(horizontalStrut_6);

		txtLuongCoBan = new JTextField();
		txtLuongCoBan.setPreferredSize(new Dimension(30, 25));
		boxTrai4.add(txtLuongCoBan);
		txtLuongCoBan.setColumns(10);

		Component verticalStrut_4 = Box.createVerticalStrut(20);
		boxTrai.add(verticalStrut_4);

		Box boxTrai5 = Box.createHorizontalBox();
		boxTrai.add(boxTrai5);

		JLabel lblHeSoLuong = new JLabel("Hệ Số Lương :");
		lblHeSoLuong.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai5.add(lblHeSoLuong);

		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		boxTrai5.add(horizontalStrut_7);

		cmbHeSoLuong = new JComboBox();
		cmbHeSoLuong.setModel(new DefaultComboBoxModel(new String[] { "2.34", "2.67", "3.00", "3.33", "3.66", "3.99", "4.32" }));
		cmbHeSoLuong.setPreferredSize(new Dimension(30, 25));
		boxTrai5.add(cmbHeSoLuong);

		Component verticalStrut_5 = Box.createVerticalStrut(20);
		boxTrai.add(verticalStrut_5);

		Box boxTrai6 = Box.createHorizontalBox();
		boxTrai.add(boxTrai6);

		JLabel lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setFont(new Font("Arial", Font.BOLD, 12));
		boxTrai6.add(lblDiaChi);

		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalStrut_8.setPreferredSize(new Dimension(55, 0));
		boxTrai6.add(horizontalStrut_8);

		txtDiaChi = new JTextField();
		txtDiaChi.setPreferredSize(new Dimension(30, 25));
		boxTrai6.add(txtDiaChi);
		txtDiaChi.setColumns(10);

		Component horizontalStrut_2 = Box.createHorizontalStrut(100);
		horizontalStrut_2.setPreferredSize(new Dimension(70, 0));
		pnNhap.add(horizontalStrut_2);

		Box boxPhai = Box.createVerticalBox();
		boxPhai.setPreferredSize(new Dimension(400, 200));
		pnNhap.add(boxPhai);

		Box boxPhai1 = Box.createHorizontalBox();
		boxPhai.add(boxPhai1);

		JLabel lblHoTen = new JLabel("Họ Và Tên :");
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai1.add(lblHoTen);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(40, 0));
		boxPhai1.add(horizontalStrut_3);

		txtHoTen = new JTextField();
		txtHoTen.setPreferredSize(new Dimension(30, 25));
		txtHoTen.setFont(new Font("Arial", Font.PLAIN, 12));
		boxPhai1.add(txtHoTen);
		txtHoTen.setColumns(10);

		Component verticalStrut_1 = Box.createVerticalStrut(25);
		boxPhai.add(verticalStrut_1);

		Box boxPhai2 = Box.createHorizontalBox();
		boxPhai.add(boxPhai2);

		JLabel lblNgaySinh = new JLabel("Ngày Sinh :");
		lblNgaySinh.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai2.add(lblNgaySinh);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(40, 0));
		boxPhai2.add(horizontalStrut_4);

		dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(30, 25));
		boxPhai2.add(dateChooser);

		Component verticalStrut_6 = Box.createVerticalStrut(20);
		boxPhai.add(verticalStrut_6);

		Box boxPhai3 = Box.createHorizontalBox();
		boxPhai.add(boxPhai3);

		JLabel lblSoDienThoai = new JLabel("Số Điện Thoại :");
		lblSoDienThoai.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai3.add(lblSoDienThoai);

		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		horizontalStrut_9.setPreferredSize(new Dimension(18, 0));
		boxPhai3.add(horizontalStrut_9);

		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setPreferredSize(new Dimension(30, 25));
		txtSoDienThoai.setFont(new Font("Arial", Font.PLAIN, 12));
		boxPhai3.add(txtSoDienThoai);
		txtSoDienThoai.setColumns(10);

		Component verticalStrut_7 = Box.createVerticalStrut(20);
		boxPhai.add(verticalStrut_7);

		Box boxPhai4 = Box.createHorizontalBox();
		boxPhai.add(boxPhai4);

		JLabel lblPhongBan = new JLabel("Phòng Ban :");
		lblPhongBan.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai4.add(lblPhongBan);

		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		horizontalStrut_10.setPreferredSize(new Dimension(35, 0));
		boxPhai4.add(horizontalStrut_10);

		cmbPhongBan = new JComboBox();
		cmbPhongBan.setPreferredSize(new Dimension(30, 25));
		cmbPhongBan.setModel(new DefaultComboBoxModel(new String[] { "Quản Lý", "Nhân Sự" }));
		cmbPhongBan.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai4.add(cmbPhongBan);

		Component verticalStrut_8 = Box.createVerticalStrut(20);
		boxPhai.add(verticalStrut_8);

		Box boxPhai5 = Box.createHorizontalBox();
		boxPhai.add(boxPhai5);

		JLabel lblPhuCap = new JLabel("Phụ Cấp :");
		lblPhuCap.setFont(new Font("Arial", Font.BOLD, 12));
		boxPhai5.add(lblPhuCap);

		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		horizontalStrut_11.setPreferredSize(new Dimension(50, 0));
		boxPhai5.add(horizontalStrut_11);

		txtPhuCap = new JTextField();
		txtPhuCap.setPreferredSize(new Dimension(30, 25));
		txtPhuCap.setFont(new Font("Arial", Font.PLAIN, 12));
		boxPhai5.add(txtPhuCap);
		txtPhuCap.setColumns(10);

		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1000, 50));
		pnCenter.add(pnChucNang);

		JButton btnThemNhanVien = new JButton("Thêm Nhân Viên");
		btnThemNhanVien.setBackground(Color.GREEN);
		btnThemNhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		btnThemNhanVien.setIcon(new ImageIcon(Form_NV_CapNhat.class.getResource("/img/add.png")));
		pnChucNang.add(btnThemNhanVien);

		JButton btnXoaNhanVien = new JButton("Xóa Nhân Viên");
		btnXoaNhanVien.setBackground(new Color(255, 128, 128));
		btnXoaNhanVien.setEnabled(true);
		btnXoaNhanVien.setIcon(new ImageIcon(Form_NV_CapNhat.class.getResource("/img/delete.png")));
		btnXoaNhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnXoaNhanVien);

		JButton btnSuaNhanVien = new JButton("Sửa Thông Tin");
		btnSuaNhanVien.setIcon(new ImageIcon(Form_NV_CapNhat.class.getResource("/img/fixinfomation.png")));
		btnSuaNhanVien.setBackground(new Color(0, 255, 255));
		btnSuaNhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnSuaNhanVien);

		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setBackground(Color.LIGHT_GRAY);
		btnXoaRong.setIcon(new ImageIcon(Form_NV_CapNhat.class.getResource("/img/xoarong.png")));
		btnXoaRong.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnXoaRong);

		JButton btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(Form_NV_CapNhat.class.getResource("/img/exit.png")));
		btnThoat.setBackground(Color.RED);
		btnThoat.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnThoat);

		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 280));
		pnSouth.setBorder(new TitledBorder(null, "Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1150, 250));
		pnSouth.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "CMND/CCCD", "Ng\u00E0y Sinh",
						"Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i",
						"L\u01B0\u01A1ng C\u01A1 b\u1EA3n", "Ph\u1EE5 C\u1EA5p", "Ph\u00F2ng Ban",
						"H\u1EC7 S\u1ED1 L\u01B0\u01A1ng" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, Double.class, Double.class, String.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false,
					false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setFont(new Font("Arial", Font.PLAIN, 10));

		/* XỬ LÝ TỪ ĐÂY*/
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
		// THÊM NHÂN VIÊN
		btnThemNhanVien.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valid()) {
					// Lấy thông tin từ các trường nhập liệu
					// Truy vấn cơ sở dữ liệu để lấy ra mã nhân viên lớn nhất
					int maxEmployeeNumber = nv_dao.getMaxEmployeeNumber(); // Hãy viết phương thức getMaxEmployeeNumber để thực hiện truy vấn
					// Tăng giá trị mã nhân viên lớn nhất lên 1
					int nextEmployeeNumber = maxEmployeeNumber + 1;
					// Định dạng số thứ tự thành chuỗi với độ dài 2 và tạo mã nhân viên
					String ma = String.format("NV%02d", nextEmployeeNumber);

			        // Gán mã nhân viên đã tạo vào trường nhập liệu
			        txtMaNV.setText(ma);
					String ten = txtHoTen.getText().trim();
					String cmnd = txtCMND.getText().trim();

					// Xử lý ngày sinh
					Date ngaySinh = (Date) dateChooser.getDate();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String ngaySinhStr = dateFormat.format(ngaySinh);

					String gioiTinh = cmbGioiTinh.getSelectedItem().toString();
					String diaChi = txtDiaChi.getText().trim();
					String soDienThoai = txtSoDienThoai.getText().trim();
					double luongCoBan = Double.parseDouble(txtLuongCoBan.getText().trim());
					double phuCap = Double.parseDouble(txtPhuCap.getText().trim());
					String phongBan = cmbPhongBan.getSelectedItem().toString();
					double heSoLuong = Double.parseDouble(cmbHeSoLuong.getSelectedItem().toString());
					
					NhanVien nv = new NhanVien(ma, ten, cmnd, ngaySinhStr, gioiTinh, diaChi, soDienThoai, luongCoBan, phuCap, phongBan, heSoLuong);
					nv_dao.create(nv);
					tableModel.addRow(new Object[] {nv.getMaNhanVien(),nv.getHoTen(),nv.getcCCD(),nv.getNgaySinh(),nv.getGioiTinh()
							,nv.getDiaChi(),nv.getSoDienThoai(),nv.getLuongCoBan(),nv.getPhuCap(),nv.getPhongBan(),nv.getHeSoLuong()});
					JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");
					// Xóa nội dung của các trường nhập liệu sau khi thêm
					txtMaNV.setText("");
					txtMaNV.requestFocus();
					txtHoTen.setText("");
					txtCMND.setText("");
					dateChooser.setDate(null);
					cmbGioiTinh.setSelectedIndex(0);
					txtDiaChi.setText("");
					txtSoDienThoai.setText("");
					txtLuongCoBan.setText("");
					txtPhuCap.setText("");
					cmbPhongBan.setSelectedIndex(0);
					cmbHeSoLuong.setSelectedIndex(0);
					
				}else {
					JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công");
				}
			}
		});
		//XÓA NHÂN VIÊN
		btnXoaNhanVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row < 0) {
					JOptionPane.showMessageDialog(null, "Chọn nhân viên cần xóa");
				}else {
					String maNV = (String) table.getValueAt(row, 0);
					nv_dao.deleteNV(maNV);
					tableModel.removeRow(row);
					JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công");
				}
				
			}
		});
		//SỬA NHÂN VIÊN
		btnSuaNhanVien.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = table.getSelectedRow();
		        if (selectedRow < 0) {
		            JOptionPane.showMessageDialog(null, "Chọn một nhân viên trong bảng để sửa.");
		            return;
		        }

		        // Lấy thông tin nhân viên từ dòng được chọn trong bảng
		        String maNV = txtMaNV.getText().trim();
		        String ten = txtHoTen.getText().trim();
		        String cmnd = txtCMND.getText().trim();
		        // Xử lý ngày sinh
		        Date ngaySinh = (Date) dateChooser.getDate();
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        String ngaySinhStr = dateFormat.format(ngaySinh);		        
		        String gioiTinh = cmbGioiTinh.getSelectedItem().toString();
		        String diaChi = txtDiaChi.getText().trim();
		        String soDienThoai = txtSoDienThoai.getText().trim();
		        double luongCoBan = Double.parseDouble(txtLuongCoBan.getText().trim());
		        double phuCap = Double.parseDouble(txtPhuCap.getText().trim());
		        String phongBan = cmbPhongBan.getSelectedItem().toString();
		        double heSoLuong = Double.parseDouble(cmbHeSoLuong.getSelectedItem().toString());
		        // Tạo đối tượng NhanVien mới
		        NhanVien nv = new NhanVien(maNV, ten, cmnd, ngaySinhStr, gioiTinh, diaChi, soDienThoai, luongCoBan, phuCap, phongBan, heSoLuong);
		        // Gọi phương thức DAO để cập nhật thông tin nhân viên
		        boolean updated = nv_dao.update(nv);

		        if (updated) {
		            // Cập nhật lại thông tin trong bảng
		            tableModel.setValueAt(ten, selectedRow, 1);
		            tableModel.setValueAt(cmnd, selectedRow, 2);
		            tableModel.setValueAt(ngaySinhStr, selectedRow, 3);
		            tableModel.setValueAt(gioiTinh, selectedRow, 4);
		            tableModel.setValueAt(diaChi, selectedRow, 5);
		            tableModel.setValueAt(soDienThoai, selectedRow, 6);
		            tableModel.setValueAt(luongCoBan, selectedRow, 7);
		            tableModel.setValueAt(phuCap, selectedRow, 8);
		            tableModel.setValueAt(phongBan, selectedRow, 9);
		            tableModel.setValueAt(heSoLuong, selectedRow, 10);

		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công");
		        } else {
		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thất bại");
		        }
		    }
		});
		
		// XÓA RỖNG
		btnXoaRong.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Đặt giá trị của các trường nhập liệu về rỗng hoặc giá trị mặc định
		        txtMaNV.setText("");
		        txtHoTen.setText("");
		        txtCMND.setText("");
		        dateChooser.setDate(null);
		        cmbGioiTinh.setSelectedIndex(0); // Đặt lại giá trị mặc định
		        txtDiaChi.setText("");
		        txtSoDienThoai.setText("");
		        txtLuongCoBan.setText("");
		        txtPhuCap.setText("");
		        cmbPhongBan.setSelectedIndex(0); // Đặt lại giá trị mặc định
		        cmbHeSoLuong.setSelectedIndex(0); // Đặt lại giá trị mặc định
		    }
		});
		//THOÁT
		btnThoat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		// Đưa dữ liệu từ bảng lên các trường nhập liệu khi click vào một dòng trong bảng
		table.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int row = table.getSelectedRow();
		        if (row >= 0) {
		            String ma = (String) table.getValueAt(row, 0);
		            String ten = (String) table.getValueAt(row, 1);
		            String cmnd = (String) table.getValueAt(row, 2);
		            String ngaySinhStr = (String) table.getValueAt(row, 3);
		            String gioiTinh = (String) table.getValueAt(row, 4);
		            String diaChi = (String) table.getValueAt(row, 5);
		            String soDienThoai = (String) table.getValueAt(row, 6);
		            String luongCoBan = (String) table.getValueAt(row, 7).toString();
		            String phuCap = (String) table.getValueAt(row, 8).toString();
		            String phongBan = (String) table.getValueAt(row, 9);
		            String heSoLuong = (String) table.getValueAt(row, 10).toString();

		            txtMaNV.setText(ma);
		            txtHoTen.setText(ten);
		            txtCMND.setText(cmnd);
		            try {
		                Date ngaySinhDate = new SimpleDateFormat("yyyy-MM-dd").parse(ngaySinhStr);
		                dateChooser.setDate(ngaySinhDate);
		            } catch (ParseException ex) {
		                ex.printStackTrace();
		            }
		            cmbGioiTinh.setSelectedItem(gioiTinh);
		            txtDiaChi.setText(diaChi);
		            txtSoDienThoai.setText(soDienThoai);
		            txtLuongCoBan.setText(luongCoBan);
		            txtPhuCap.setText(phuCap);
		            cmbPhongBan.setSelectedItem(phongBan);
		            cmbHeSoLuong.setSelectedItem(heSoLuong);
		        }
		    }
		});

		/////////////////
	}
	 //////////
	public void DocDuLieuDBVaoTable() {
		List<NhanVien> list = DAO_NhanVien.getAlltbNhanVien();
		for (NhanVien nv : list) {
			tableModel.addRow(new Object[] {nv.getMaNhanVien(),nv.getHoTen(),nv.getcCCD(),nv.getNgaySinh(),nv.getGioiTinh()
					,nv.getDiaChi(),nv.getSoDienThoai(),nv.getLuongCoBan(),nv.getPhuCap(),nv.getPhongBan(),nv.getHeSoLuong()});
		}
	}
	public boolean valid() {
	    if (txtHoTen.getText().equals("") 
	        || txtCMND.getText().equals("") || dateChooser.getDate() == null 
	        || cmbGioiTinh.getSelectedItem() == null || txtDiaChi.getText().equals("") 
	        || txtSoDienThoai.getText().equals("") || txtLuongCoBan.getText().equals("") 
	        || txtPhuCap.getText().equals("") || cmbPhongBan.getSelectedItem() == null 
	        || cmbHeSoLuong.getSelectedItem() == null) 
	    {
	        JOptionPane.showMessageDialog(null, "Không được rỗng !!!");
	        return false;
	    }
	    
	    if (!(txtHoTen.getText().matches("[\\p{L}' ]+"))) {
	        JOptionPane.showMessageDialog(null, "Tên theo mẫu: Ho Nguyen Cong Hieu");
	        txtHoTen.requestFocus();
	        return false;
	    }
	    
	    if (!(txtCMND.getText().matches("0\\d{11}"))) {
	        JOptionPane.showMessageDialog(null, "CMND/CCCD theo mẫu: bắt đầu bằng số 0 và theo sau là 11 số khác");
	        txtCMND.requestFocus();
	        return false;
	    }
	    
	    if (!(cmbGioiTinh.getSelectedItem().toString().matches("[A-Za-z' ]+"))) {
	        JOptionPane.showMessageDialog(null, "Giới tính theo mẫu: Nam hoặc Nữ");
	        cmbGioiTinh.requestFocus();
	        return false;
	    }
	    
	    // Kiểm tra ngày sinh theo định dạng ngày/tháng/năm
//	    String ngaySinhPattern = "\\d{2}/\\d{2}/\\d{4}";
//	    if (!txtDiaChi.getText().matches(ngaySinhPattern)) {
//	        JOptionPane.showMessageDialog(null, "Ngày sinh theo mẫu: 16/09/2003");
//	        txtDiaChi.requestFocus();
//	        return false;
//	    }
	    
	    
	        if (dateChooser.getDate() != null) {
	            Calendar dob = Calendar.getInstance();
	            dob.setTime(dateChooser.getDate());

	            Calendar now = Calendar.getInstance();
	            now.setTime(new Date());

	            int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

	            if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
	                age--;
	            }

	            if (age < 18) {
	                JOptionPane.showMessageDialog(null, "Nhân viên phải trên 18 tuổi.");
	                return false;
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống.");
	            return false;
	        }


	        if (!(txtDiaChi.getText().matches("[\\p{L}0-9'/, ]+"))) {
	            JOptionPane.showMessageDialog(null, "Địa chỉ theo mẫu: 79/12/21 Bùi Quang Là, Gò Vấp");
	            txtDiaChi.requestFocus();
	            return false;
	        }

	    
	    // Kiểm tra số điện thoại theo mẫu
	    String soDienThoaiPattern = "^\\d{10,11}$";
	    if (!txtSoDienThoai.getText().matches(soDienThoaiPattern)) {
	        JOptionPane.showMessageDialog(null, "Số điện thoại theo mẫu: 0366228041");
	        txtSoDienThoai.requestFocus();
	        return false;
	    }
	    
	    try {
		    double luong = Double.parseDouble(txtLuongCoBan.getText());
	        if (luong <= 0) {
	            JOptionPane.showMessageDialog(null, "Lương phải lớn hơn 0");
	            txtLuongCoBan.requestFocus();
	            return false;
	        }
		    
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Lương không hợp lệ");
			return false;
		}
	    
	    try {
		    double phuCap = Double.parseDouble(txtPhuCap.getText());
	        if (phuCap <= 0) {
	            JOptionPane.showMessageDialog(null, "Phụ cấp phải lớn hơn 0");
	            txtPhuCap.requestFocus();
	            return false;
	        }
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Phụ cấp không hợp lệ");
			return false;
		}
        
	    try {
	        double heSoLuong = Double.parseDouble(cmbHeSoLuong.getSelectedItem().toString());
	        if (heSoLuong <= 0) {
	            JOptionPane.showMessageDialog(null, "Hệ số lương phải lớn hơn 0");
	            cmbHeSoLuong.requestFocus();
	            return false;
	        }
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Hệ số lương không hợp lệ");
			return false;
		}
        return true;  
	}
}
