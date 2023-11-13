package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import connectDB.Conection_DB;
import dao.DAO_ChamCongCongNhan;
import dao.DAO_PhanCong;
import dao.DAO_SanPham;
import entity.CongCuaCongNhan;
import entity.CongDoan;
import entity.CongNhan;
import entity.PhanCong;
import entity.SanPham;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Form_CN_ChamCong extends JPanel {
	private JTextField txtMaCong;
	private JTextField txtMaCongDoan;
	private JTextField txtLuongCa;
	private JTextField txtMaCongNhan;
	private JTextField txtGioLam;
	private JTable tblDanhSachCongCN;
	private JTextField txtSLPhanCong;
	private JPanel pnCenter;
	private JTable tblPhanCong;
	private DefaultTableModel tableModelPC;
	private DAO_PhanCong pc_dao;
	private JTextField txtMaPC;
	private JTextField txtTenCD;
	private JTextField txtTenCN;
	private DefaultTableModel tableModelDSChamCong;
	private DAO_ChamCongCongNhan congCN_dao;
	private JDateChooser dateChooser;
	private JCheckBox chkCoMat;
	private JCheckBox chkCoPhep;

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
		pnCenter.setPreferredSize(new Dimension(1500, 405));
		add(pnCenter, BorderLayout.CENTER);

		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1400, 350));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin Ch\u1EA5m C\u00F4ng", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);

		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);

		Box boxSanPham = Box.createHorizontalBox();
		box1.add(boxSanPham);

		JLabel lblMaCong = new JLabel("Mã công:");
		lblMaCong.setFont(new Font("Arial", Font.BOLD, 14));
		boxSanPham.add(lblMaCong);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(30, 0));
		boxSanPham.add(horizontalStrut);

		txtMaCong = new JTextField();
		txtMaCong.setEditable(false);
		txtMaCong.setPreferredSize(new Dimension(7, 30));
		boxSanPham.add(txtMaCong);
		txtMaCong.setColumns(15);

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

		dateChooser = new JDateChooser();
		dateChooser.setPreferredSize(new Dimension(73, 30));
		boxNgayCham.add(dateChooser);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 30));
		box1.add(verticalStrut_1);

		Box boxCongDoan = Box.createHorizontalBox();
		box1.add(boxCongDoan);

		JLabel lblCongDoan = new JLabel("Mã Công Đoạn :");
		lblCongDoan.setFont(new Font("Arial", Font.BOLD, 14));
		boxCongDoan.add(lblCongDoan);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(24, 0));
		boxCongDoan.add(horizontalStrut_2);

		txtMaCongDoan = new JTextField();
		txtMaCongDoan.setEditable(false);
		txtMaCongDoan.setPreferredSize(new Dimension(7, 30));
		boxCongDoan.add(txtMaCongDoan);
		txtMaCongDoan.setColumns(10);

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

		JLabel lblSLConLai = new JLabel("SL Phân Công :");
		lblSLConLai.setFont(new Font("Arial", Font.BOLD, 14));
		boxSLConLai.add(lblSLConLai);

		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		horizontalStrut_10.setPreferredSize(new Dimension(25, 0));
		boxSLConLai.add(horizontalStrut_10);

		txtSLPhanCong = new JTextField();
		txtSLPhanCong.setEditable(false);
		txtSLPhanCong.setPreferredSize(new Dimension(7, 30));
		boxSLConLai.add(txtSLPhanCong);
		txtSLPhanCong.setColumns(10);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(40, 0));
		pnNhap.add(horizontalStrut_4);

		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);

		Box boxTenCongNhan = Box.createHorizontalBox();
		box2.add(boxTenCongNhan);

		JLabel lblTenCongNhan = new JLabel("Mã Công Nhân :");
		lblTenCongNhan.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenCongNhan.add(lblTenCongNhan);

		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setPreferredSize(new Dimension(30, 0));
		boxTenCongNhan.add(horizontalStrut_6);

		txtMaCongNhan = new JTextField();
		txtMaCongNhan.setEditable(false);
		txtMaCongNhan.setPreferredSize(new Dimension(7, 30));
		boxTenCongNhan.add(txtMaCongNhan);
		txtMaCongNhan.setColumns(15);

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
		cmbCaLam.setModel(new DefaultComboBoxModel(new String[] { "Ca sáng", "Ca chiều", "Ca tối" }));

		boxCaLam.add(cmbCaLam);
		cmbCaLam.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if(cmbCaLam.getSelectedItem().toString().equals("Ca sáng")) {
					txtGioLam.setText("7h-11h");
					txtLuongCa.setText("1.0");
				}else if(cmbCaLam.getSelectedItem().toString().equals("Ca chiều")) {
					txtGioLam.setText("13h-17h");
					txtLuongCa.setText("1.0");
				}else {
					txtGioLam.setText("18h-21h");
					txtLuongCa.setText("2.0");
				}

			}
		});

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

		JLabel lblMaPC = new JLabel("Mã Phân Công :");
		lblMaPC.setFont(new Font("Arial", Font.BOLD, 14));
		boxSLDaLam.add(lblMaPC);

		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		horizontalStrut_9.setPreferredSize(new Dimension(35, 0));
		boxSLDaLam.add(horizontalStrut_9);

		txtMaPC = new JTextField();
		txtMaPC.setPreferredSize(new Dimension(35, 30));
		txtMaPC.setEditable(false);
		boxSLDaLam.add(txtMaPC);

		Component verticalStrut_7 = Box.createVerticalStrut(20);
		verticalStrut_7.setPreferredSize(new Dimension(0, 30));
		box2.add(verticalStrut_7);

		Box boxCheckBox = Box.createHorizontalBox();
		box2.add(boxCheckBox);

		chkCoMat = new JCheckBox("Có Mặt");
		chkCoMat.setFont(new Font("Arial", Font.BOLD, 14));
		chkCoMat.setSelected(true);
		boxCheckBox.add(chkCoMat);

		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		boxCheckBox.add(horizontalStrut_11);

		chkCoPhep = new JCheckBox("Có Phép");
		chkCoPhep.setFont(new Font("Arial", Font.BOLD, 14));
		boxCheckBox.add(chkCoPhep);
		chkCoMat.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkCoMat.isSelected()) {
					chkCoPhep.setSelected(false);
				}else if(chkCoPhep.isSelected()) {
					chkCoMat.setSelected(false);
				}
				
			}
		});

		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(30, 0));
		pnNhap.add(horizontalStrut_5);

		JPanel pnDanhSachPhanCong = new JPanel();
		pnDanhSachPhanCong.setPreferredSize(new Dimension(700, 320));
		pnDanhSachPhanCong.setBorder(new TitledBorder(null, "Danh S\u00E1ch Ph\u00E2n C\u00F4ng", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnNhap.add(pnDanhSachPhanCong);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(680, 250));
		pnDanhSachPhanCong.add(scrollPane);

		tblPhanCong = new JTable();
		scrollPane.setViewportView(tblPhanCong);
		tblPhanCong.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã phân công", "M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n",
						"Mã công đoạn", "T\u00EAn C\u00F4ng \u0110o\u1EA1n ",
						"S\u1ED1 L\u01B0\u1EE3ng C\u1EA7n L\u00E0m " }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		JLabel lblTenCongDoan = new JLabel("Tên Công Đoạn");
		txtTenCD = new JTextField(15);
		txtTenCD.setEditable(false);
		pnDanhSachPhanCong.add(lblTenCongDoan);
		pnDanhSachPhanCong.add(txtTenCD);

		JLabel lblTenCongNhan1 = new JLabel("Tên Công Nhân");
		txtTenCN = new JTextField(15);
		txtTenCN.setEditable(false);
		pnDanhSachPhanCong.add(lblTenCongNhan1);
		pnDanhSachPhanCong.add(txtTenCN);
		/* XỬ LÝ TỪ ĐÂY */
		tableModelPC = (DefaultTableModel) tblPhanCong.getModel();
		String[] columnNames = { "Mã phân công", "M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n",
				"Mã công đoạn", "T\u00EAn C\u00F4ng \u0110o\u1EA1n ", "S\u1ED1 L\u01B0\u1EE3ng C\u1EA7n L\u00E0m " };
		tableModelPC.setColumnIdentifiers(columnNames);

		tblPhanCong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblPhanCong.getSelectedRow();
				if(row>=0) {
					
					String maPC = (String) tblPhanCong.getValueAt(row, 0);
					String maCD = (String) tblPhanCong.getValueAt(row, 3);
					String tenCD = (String) tblPhanCong.getValueAt(row, 4);
					String maCN = (String) tblPhanCong.getValueAt(row, 1);
					String tenCN = (String) tblPhanCong.getValueAt(row, 2);
					String soLuong = (String) tblPhanCong.getValueAt(row, 5).toString();
					
					txtMaPC.setText(maPC);
					txtMaCongDoan.setText(maCD);
					txtTenCD.setText(tenCD);
					txtMaCongNhan.setText(maCN);
					txtTenCN.setText(tenCN);
					txtSLPhanCong.setText(soLuong);
				}
				
			}
		});
		
		// khởi tạo kết nối đến CSDL
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pc_dao = new DAO_PhanCong();
		docDLPhanCongvaoTB();

		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1200, 50));
		pnCenter.add(pnChucNang);

		JButton btnChamCong = new JButton("Chấm Công");
		btnChamCong.setBackground(Color.GREEN);
		btnChamCong.setIcon(new ImageIcon(
				Form_CN_ChamCong.class.getResource("/img/Icons8-Windows-8-Programming-Add-Property.512 (1).png")));
		btnChamCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnChamCong);

		JButton btnXoaChamCong = new JButton("Xóa Chấm Công");
		btnXoaChamCong.setBackground(Color.ORANGE);
		btnXoaChamCong.setIcon(new ImageIcon(
				Form_CN_ChamCong.class.getResource("/img/Pictogrammers-Material-Calendar-remove-outline.512 (1).png")));
		btnXoaChamCong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaChamCong);

		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_CN_ChamCong.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);

		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1500, 240));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch Ch\u1EA5m C\u00F4ng", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1400, 200));
		pnSouth.add(scrollPane_1);

		tblDanhSachCongCN = new JTable();
		scrollPane_1.setViewportView(tblDanhSachCongCN);
		tblDanhSachCongCN.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã Công", "M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n", "Mã Phân Công",
						"Mã Công đoạn", " Tên C\u00F4ng \u0110o\u1EA1n", "Ng\u00E0y Ch\u1EA5m", "Ca L\u00E0m",
						"Gi\u1EDD L\u00E0m", "Lương Ca Làm", "S\u1ED1 SP", "Tr\u1EA1ng Th\u00E1i", "Ngh\u1EC9 ph\u00E9p" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class,Double.class, Integer.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblDanhSachCongCN.setFont(new Font("Arial", Font.PLAIN, 10));
		tableModelDSChamCong = (DefaultTableModel) tblDanhSachCongCN.getModel();
		String[] columnNames1 = { "Mã Công", "M\u00E3 C\u00F4ng Nh\u00E2n", "T\u00EAn C\u00F4ng Nh\u00E2n", "Mã Phân Công",
				"Mã Công đoạn", " Tên C\u00F4ng \u0110o\u1EA1n", "Ng\u00E0y Ch\u1EA5m", "Ca L\u00E0m",
				"Gi\u1EDD L\u00E0m", "Lương Ca Làm", "S\u1ED1 SP", "Tr\u1EA1ng Th\u00E1i", "Ngh\u1EC9 ph\u00E9p"};
		tableModelDSChamCong.setColumnIdentifiers(columnNames1);
		congCN_dao = new DAO_ChamCongCongNhan();
		docDLDSChamCong();
		btnChamCong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valid()) {
					int maxMaCongCN = congCN_dao.getMaxMaCongCN();
					int nextMaCongCN = maxMaCongCN+1;
					String maCong = String.format("C%02d", nextMaCongCN);
					String maCN = txtMaCongNhan.getText().trim();
					String tenCN = txtTenCN.getText().trim();
					String maPC = txtMaPC.getText().trim();
					String maCD = txtMaCongDoan.getText().trim();
					String tenCD = txtTenCD.getText().trim();
					Date ngayCham = (Date) dateChooser.getDate();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String ngayChamStr = dateFormat.format(ngayCham);
					String caLam = cmbCaLam.getSelectedItem().toString();
					String gioLam = txtGioLam.getText().trim();
					double luongCa = Double.parseDouble(txtLuongCa.getText().toString());
					int soLuong = Integer.parseInt(txtSLPhanCong.getText().toString());
					String trangThai="";
					if(chkCoMat.isSelected()) {
						trangThai = "Có mặt";
					}else {
						trangThai = "Nghỉ";
					}
					String nghiPhep ="";
					if(chkCoPhep.isSelected()) {
						nghiPhep = "Có";
					}else {
						nghiPhep ="Không";
					}
					
					CongNhan cn = new CongNhan(maCN);
					PhanCong pc = new PhanCong(maPC);
					CongDoan cd = new CongDoan(maCD);
					
					CongCuaCongNhan congCN = new CongCuaCongNhan(maCong, cn, tenCN, pc, cd, tenCD, ngayChamStr, caLam, gioLam, luongCa, soLuong, trangThai, nghiPhep);
					congCN_dao.create(congCN);
					tableModelDSChamCong.addRow(new Object[] {congCN.getMaCongCN(),congCN.getCongNhan().getMaCongNhan(),congCN.getTenCongNhan(),
							congCN.getPhanCong().getMaPhanCong(),congCN.getCongDoan().getMaCongDoan(),congCN.getTenCongDoan(),
							congCN.getNgayChamCong(),congCN.getCaLam(),congCN.getGiolam(),congCN.getLuongCaLam(),congCN.getSlSPDaLam(),congCN.getTrangThai(),
							congCN.getNghiPhep()});
					txtMaCong.setText("");
					txtMaCongNhan.setText("");
					txtTenCN.setText("");
					txtMaPC.setText("");
					txtMaCongDoan.setText("");
					txtTenCD.setText("");
					dateChooser.setDate(null);
					txtGioLam.setText("");
					cmbCaLam.setSelectedIndex(0);
					txtGioLam.setText("");
					txtLuongCa.setText("");
					txtSLPhanCong.setText("");
					JOptionPane.showMessageDialog(null, "Cham Cong Thanh Cong");
				}else {
					JOptionPane.showMessageDialog(null, "Cham Cong Khong Thanh Cong");
				}
				
			}
		});
		btnXoaChamCong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tblDanhSachCongCN.getSelectedRow();
				if(row<0) {
					JOptionPane.showMessageDialog(null, "Chọn công cần xóa");
				}else {
					String maCongCN = (String) tblDanhSachCongCN.getValueAt(row, 0);
					congCN_dao.delete(maCongCN);
					tableModelDSChamCong.removeRow(row);
					JOptionPane.showMessageDialog(null, "Xóa chấm công thành công");
				}
				
			}
		});
		//THOÁT
				btnThoat.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});

	}

	public void docDLPhanCongvaoTB() {
		List<PhanCong> list = DAO_PhanCong.getAlltbPhanCong();
		for (PhanCong pc : list) {
			tableModelPC.addRow(new Object[] { pc.getMaPhanCong(), pc.getCongNhan().getMaCongNhan(),
					pc.getTenCongNhan(), pc.getCongDoan().getMaCongDoan(), pc.getTenCongDoan(), pc.getsLSPCanLam() });
		}
	}
	public void docDLDSChamCong() {
		List<CongCuaCongNhan> list = DAO_ChamCongCongNhan.getAlltbCongCuaCongNhan();
		for (CongCuaCongNhan congCN : list) {
			tableModelDSChamCong.addRow(new Object[] {congCN.getMaCongCN(),congCN.getCongNhan().getMaCongNhan(),congCN.getTenCongNhan(),
					congCN.getPhanCong().getMaPhanCong(),congCN.getCongDoan().getMaCongDoan(),congCN.getTenCongDoan(),
					congCN.getNgayChamCong(),congCN.getCaLam(),congCN.getGiolam(),congCN.getLuongCaLam(),congCN.getSlSPDaLam(),congCN.getTrangThai(),
					congCN.getNghiPhep()});
		}
	}
	public boolean valid() {
		Date ngayCham = (Date) dateChooser.getDate();
	    if (ngayCham == null) {
	        JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày chấm công.");
	        return false;
	    }

	    // Kiểm tra xem ngày chấm có nhỏ hơn hoặc bằng ngày hiện tại hay không
	    Date ngayHienTai = new Date(); // Ngày hiện tại
	    if (ngayCham.after(ngayHienTai)) {
	        JOptionPane.showMessageDialog(null, "Ngày chấm công phải nhỏ hơn hoặc bằng ngày hiện tại.");
	        return false;
	    }
		return true;
	}
	//tinh tong ngay cong
	public int tinhTongNgayCong(String maCongNhan, int thang) {
	    int tongNgayCong = 0;
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    for (int row = 0; row < tableModelDSChamCong.getRowCount(); row++) {
	        String maCNTrongBang = (String) tableModelDSChamCong.getValueAt(row, 1); // Cột Mã cong nhan
	        String trangThai = (String) tableModelDSChamCong.getValueAt(row, 11); // Cột Trạng Thái
	        String ngayChamCongStr = (String) tableModelDSChamCong.getValueAt(row, 6); // Cột Ngày Chấm Công
	        Date ngayChamCong;

	        try {
	            ngayChamCong = dateFormat.parse(ngayChamCongStr);
	        } catch (ParseException e) {
	            // Xử lý ngoại lệ nếu định dạng ngày không hợp lệ
	            e.printStackTrace();
	            continue;
	        }

	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(ngayChamCong);
	        int thangChamCong = calendar.get(Calendar.MONTH) + 1;

	        if (maCNTrongBang.equals(maCongNhan) && "Có mặt".equals(trangThai) && thangChamCong == thang) {
	            tongNgayCong++;
	        }
	    }

	    return tongNgayCong;
	}

	//TB luong ca
	public double tinhTrungBinhLuongCa(String maCongNhan, int thang) {
	    double tongLuongCa = 0;
	    int soLuongChamCong = 0;
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    for (int row = 0; row < tableModelDSChamCong.getRowCount(); row++) {
	        String maCNTrongBang = (String) tableModelDSChamCong.getValueAt(row, 1); // Cột Mã cong nhan
	        String ngayChamCongStr = (String) tableModelDSChamCong.getValueAt(row, 6); // Cột Ngày Chấm Công
	        Object luongCaLamObj = tableModelDSChamCong.getValueAt(row, 9); // Cột Lương Ca Làm
	        String trangThai = (String) tableModelDSChamCong.getValueAt(row, 11); // Cột Trạng Thái

	        try {
	            Date ngayChamCong = dateFormat.parse(ngayChamCongStr);
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(ngayChamCong);
	            int thangChamCong = calendar.get(Calendar.MONTH) + 1;

	            if (maCNTrongBang.equals(maCongNhan)&& "Có mặt".equals(trangThai) && thangChamCong == thang ) {
	                if (luongCaLamObj instanceof Double) {
	                    double luongCaLam = (Double) luongCaLamObj;
	                    tongLuongCa += luongCaLam;
	                    soLuongChamCong++;
	                }
	            }
	        } catch (ParseException e) {
	            // Xử lý ngoại lệ nếu định dạng ngày không hợp lệ
	            e.printStackTrace();
	            continue;
	        }
	    }

	    if (soLuongChamCong == 0) {
	        return 0.0; // Tránh chia cho 0
	    } else {
	        return tongLuongCa / soLuongChamCong;
	    }
	}
	//

}
