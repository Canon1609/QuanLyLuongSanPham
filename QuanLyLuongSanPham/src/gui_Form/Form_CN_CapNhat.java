package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;

import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import connectDB.Conection_DB;
import dao.DAO_CongNhan;
import dao.DAO_NhanVien;
import entity.CongNhan;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Form_CN_CapNhat extends JPanel {
	private JTextField txtMaCongNhan;
	private JTextField txtCMND;
	private JTextField txtPhuCap;
	private JTextField txtHoTen;
	private JTextField txtSoDienThoai;
	private JTextField txtDiaChi;
	private JTable table;
	private DAO_CongNhan cn_dao;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public Form_CN_CapNhat() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblCongNhan = new JLabel("CÔNG NHÂN");
		lblCongNhan.setForeground(Color.RED);
		lblCongNhan.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblCongNhan);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 360));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 300));
		pnNhap.setBorder(new TitledBorder(null, "Thông tin công nhân", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxMaCongNhan = Box.createHorizontalBox();
		box1.add(boxMaCongNhan);
		
		JLabel lblMaCongNhan = new JLabel("Mã Công Nhân :");
		lblMaCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaCongNhan.add(lblMaCongNhan);
		
		txtMaCongNhan = new JTextField();
		txtMaCongNhan.setEditable(true);
		txtMaCongNhan.setPreferredSize(new Dimension(7, 30));
		boxMaCongNhan.add(txtMaCongNhan);
		txtMaCongNhan.setColumns(30);
		txtMaCongNhan.setEditable(false);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		verticalStrut.setPreferredSize(new Dimension(0, 20));
		box1.add(verticalStrut);
		
		Box boxGioiTinh = Box.createHorizontalBox();
		box1.add(boxGioiTinh);
		
		JLabel lblGioiTinh = new JLabel("Giới Tính :");
		lblGioiTinh.setFont(new Font("Arial", Font.BOLD, 14));
		boxGioiTinh.add(lblGioiTinh);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(38, 0));
		boxGioiTinh.add(horizontalStrut_1);
		
		JComboBox cmbGioiTinh = new JComboBox();
		cmbGioiTinh.setPreferredSize(new Dimension(29, 30));
		cmbGioiTinh.setModel(new DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
		boxGioiTinh.add(cmbGioiTinh);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		verticalStrut_1.setPreferredSize(new Dimension(0, 20));
		box1.add(verticalStrut_1);
		
		Box boxCMND = Box.createHorizontalBox();
		box1.add(boxCMND);
		
		JLabel lblCMND = new JLabel("CMND/CCCD:");
		lblCMND.setFont(new Font("Arial", Font.BOLD, 14));
		boxCMND.add(lblCMND);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(17, 0));
		boxCMND.add(horizontalStrut_2);
		
		txtCMND = new JTextField();
		txtCMND.setPreferredSize(new Dimension(7, 30));
		boxCMND.add(txtCMND);
		txtCMND.setColumns(30);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		verticalStrut_2.setPreferredSize(new Dimension(0, 20));
		box1.add(verticalStrut_2);
		
		Box boxPhuCap = Box.createHorizontalBox();
		box1.add(boxPhuCap);
		
		JLabel lblPhuCap = new JLabel("Phụ Cấp :");
		lblPhuCap.setFont(new Font("Arial", Font.BOLD, 14));
		boxPhuCap.add(lblPhuCap);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(42, 0));
		boxPhuCap.add(horizontalStrut_3);
		
		txtPhuCap = new JTextField();
		txtPhuCap.setPreferredSize(new Dimension(7, 30));
		boxPhuCap.add(txtPhuCap);
		txtPhuCap.setColumns(30);
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		verticalStrut_3.setPreferredSize(new Dimension(0, 20));
		box1.add(verticalStrut_3);
		
		Box boxTayNghe = Box.createHorizontalBox();
		box1.add(boxTayNghe);
		
		JLabel lblTayNghe = new JLabel("Tay Nghề :");
		lblTayNghe.setFont(new Font("Arial", Font.BOLD, 14));
		boxTayNghe.add(lblTayNghe);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(34, 0));
		boxTayNghe.add(horizontalStrut_4);
		
		JComboBox cmbTaynghe = new JComboBox();
		cmbTaynghe.setPreferredSize(new Dimension(29, 30));
		cmbTaynghe.setModel(new DefaultComboBoxModel(new String[] { "Cao", "Thấp" }));
		boxTayNghe.add(cmbTaynghe);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(100, 0));
		pnNhap.add(horizontalStrut);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxHoTen = Box.createHorizontalBox();
		box2.add(boxHoTen);
		
		JLabel lblHoTen = new JLabel("Họ Tên :");
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 14));
		boxHoTen.add(lblHoTen);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(48, 0));
		boxHoTen.add(horizontalStrut_6);
		
		txtHoTen = new JTextField();
		txtHoTen.setPreferredSize(new Dimension(7, 30));
		boxHoTen.add(txtHoTen);
		txtHoTen.setColumns(30);
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		verticalStrut_4.setPreferredSize(new Dimension(0, 20));
		box2.add(verticalStrut_4);
		
		Box boxNgaySinh = Box.createHorizontalBox();
		box2.add(boxNgaySinh);
		
		JLabel lblNgaySinh = new JLabel("Ngày Sinh :");
		lblNgaySinh.setFont(new Font("Arial", Font.BOLD, 14));
		boxNgaySinh.add(lblNgaySinh);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(25, 0));
		boxNgaySinh.add(horizontalStrut_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(73, 30));
		boxNgaySinh.add(dateChooser);
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		verticalStrut_5.setPreferredSize(new Dimension(0, 20));
		box2.add(verticalStrut_5);
		
		Box boxSoDienThoai = Box.createHorizontalBox();
		box2.add(boxSoDienThoai);
		
		JLabel lblSoDienThoai = new JLabel("Số Điện Thoại :");
		lblSoDienThoai.setFont(new Font("Arial", Font.BOLD, 14));
		boxSoDienThoai.add(lblSoDienThoai);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setPreferredSize(new Dimension(7, 30));
		boxSoDienThoai.add(txtSoDienThoai);
		txtSoDienThoai.setColumns(30);
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		verticalStrut_6.setPreferredSize(new Dimension(0, 20));
		box2.add(verticalStrut_6);
		
		Box boxPhongBan = Box.createHorizontalBox();
		box2.add(boxPhongBan);
		
		JLabel lblPhongBan = new JLabel("Phòng Ban :");
		lblPhongBan.setFont(new Font("Arial", Font.BOLD, 14));
		boxPhongBan.add(lblPhongBan);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		boxPhongBan.add(horizontalStrut_7);
		
		JComboBox cmbPhongBan = new JComboBox();
		cmbPhongBan.setPreferredSize(new Dimension(29, 30));
		cmbPhongBan.setModel(new DefaultComboBoxModel(new String[] { "Kỹ thuật", "Sản xuất" }));
		boxPhongBan.add(cmbPhongBan);
		
		Component verticalStrut_7 = Box.createVerticalStrut(10);
		verticalStrut_7.setPreferredSize(new Dimension(0, 20));
		box2.add(verticalStrut_7);
		
		Box boxDiaChi = Box.createHorizontalBox();
		box2.add(boxDiaChi);
		
		JLabel lblDiaChi = new JLabel("Địa Chỉ :");
		lblDiaChi.setFont(new Font("Arial", Font.BOLD, 14));
		boxDiaChi.add(lblDiaChi);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalStrut_8.setPreferredSize(new Dimension(48, 0));
		boxDiaChi.add(horizontalStrut_8);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setPreferredSize(new Dimension(7, 30));
		boxDiaChi.add(txtDiaChi);
		txtDiaChi.setColumns(30);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnThemCongNhan = new JButton("Thêm Công Nhân");
		btnThemCongNhan.setIcon(new ImageIcon(Form_CN_CapNhat.class.getResource("/img/add.png")));
		btnThemCongNhan.setBackground(Color.LIGHT_GRAY);
		btnThemCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThemCongNhan);
		
		JButton btnXoaCongNhan = new JButton("Xóa Công Nhân");
		btnXoaCongNhan.setBackground(Color.CYAN);
		btnXoaCongNhan.setIcon(new ImageIcon(Form_CN_CapNhat.class.getResource("/img/delete.png")));
		btnXoaCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaCongNhan);
		
		JButton btnSuaThongTin = new JButton("Sửa Thông Tin");
		btnSuaThongTin.setIcon(new ImageIcon(Form_CN_CapNhat.class.getResource("/img/fixinfomation.png")));
		btnSuaThongTin.setBackground(Color.GREEN);
		btnSuaThongTin.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnSuaThongTin);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setBackground(Color.MAGENTA);
		btnXoaRong.setIcon(new ImageIcon(Form_CN_CapNhat.class.getResource("/img/xoarong.png")));
		btnXoaRong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaRong);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_CN_CapNhat.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 340));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch C\u00F4ng Nh\u00E2n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1100, 250));
		pnSouth.add(scrollPane);
		
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
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableModel = (DefaultTableModel) table.getModel();
		String[] columnNames = {
		    "Mã Công Nhân", "Họ Tên", "CMND/CCCD", "Ngày Sinh", "Giới Tính", 
		    "Địa Chỉ", "Số Điện Thoại", "Phụ Cấp", "Tay Nghề", "Phòng Ban"
		};
		tableModel.setColumnIdentifiers(columnNames);
		//Hien thi du lieu tu bang
		// khởi tạo kết nối đến CSDL
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cn_dao = new DAO_CongNhan();
		DocDLVaoTable();
		//Xy ly chức năng
		btnThemCongNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lấy thông tin từ các trường nhập liệu
				int maxCNNumber = cn_dao.getCNNumber(); 
				// Tăng giá trị mã CN lớn nhất lên 1
				int nextCNNumber = maxCNNumber + 1;
				// Định dạng số thứ tự thành chuỗi với độ dài 2 và tạo mã CN-
				String ma = String.format("NV%02d", nextCNNumber);
				
				String ten = txtHoTen.getText().trim();
				String cmnd = txtCMND.getText().trim();

				// Xử lý ngày sinh
				Date ngaySinh = (Date) dateChooser.getDate();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String ngaySinhStr = dateFormat.format(ngaySinh);


				String gioiTinh = cmbGioiTinh.getSelectedItem().toString();
				String diaChi = txtDiaChi.getText().trim();
				String soDienThoai = txtSoDienThoai.getText().trim();
				double phuCap = Double.parseDouble(txtPhuCap.getText().trim());
				String tayNghe = cmbTaynghe.getSelectedItem().toString();
				String phongBan = cmbPhongBan.getSelectedItem().toString();

				CongNhan cn = new CongNhan(ma, ten, gioiTinh, ngaySinhStr,cmnd, soDienThoai, phuCap, phongBan, tayNghe, diaChi);
				cn_dao.create(cn);
				tableModel.addRow(new Object[] {cn.getMaCongNhan(),cn.getHoTen(),cn.getcCCD(),cn.getNgaySinh(),cn.getGioiTinh(),
						cn.getDiaChi(),cn.getSoDienThoai(),cn.getPhuCap(),cn.getTrinhDoTayNghe(),cn.getPhongBan()});

				// Xóa nội dung của các trường nhập liệu sau khi thêm
				txtMaCongNhan.setText("");
				txtMaCongNhan.requestFocus();
				txtHoTen.setText("");
				txtCMND.setText("");
				dateChooser.setDate(null);
				cmbGioiTinh.setSelectedIndex(0);
				txtDiaChi.setText("");
				txtSoDienThoai.setText("");
				txtPhuCap.setText("");
				cmbTaynghe.setSelectedIndex(0);
				cmbPhongBan.setSelectedIndex(0);
	
				
			}
		});
		
		
		//
		
	}
	
	public void DocDLVaoTable() {
		List<CongNhan> list = DAO_CongNhan.getAlltbCongNhan();
		for (CongNhan cn : list) {
			tableModel.addRow(new Object[] {cn.getMaCongNhan(),cn.getHoTen(),cn.getcCCD(),cn.getNgaySinh(),cn.getGioiTinh(),
					cn.getDiaChi(),cn.getSoDienThoai(),cn.getPhuCap(),cn.getTrinhDoTayNghe(),cn.getPhongBan()});
		}
	}
	
	
	

}

