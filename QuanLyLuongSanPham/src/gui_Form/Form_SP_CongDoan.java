package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import dao.DAO_CongDoan;
import dao.DAO_SanPham;
import entity.CongDoan;
import entity.SanPham;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JTable tblCongDoan;
	private DAO_SanPham dao_SP;
	private TableModel tableModelSP;
	private TableModel tableModelCD;
	private DAO_CongDoan cd_dao;
	private JComboBox<String> cmbCongDoanYeuCau;
	private JComboBox<Comparable> cmbSoLuong;

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
		
		cmbCongDoanYeuCau = new JComboBox();
		cmbCongDoanYeuCau.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbCongDoanYeuCau.setModel(new DefaultComboBoxModel());
		//new String[] {"Công đoạn 1","Công đoạn 2","Công đoạn 3"}
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
		txtTenSanPham.setEditable(false);
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
		
		cmbSoLuong = new JComboBox();
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
		
		tblCongDoan = new JTable();
		scrollPane_1.setViewportView(tblCongDoan);
		tblCongDoan.setModel(new DefaultTableModel(
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
		tableModelCD = (DefaultTableModel)tblCongDoan.getModel();
		String[] columnNames = { "Mã Công Đoan", "Tên Công Đoạn", "Giá Công Đoạn", "Mã Sản Phẩm",
				"Tên Sản Phẩm", "Số Lượng", "Công Đoạn Yêu Cầu"};
		((DefaultTableModel) tableModelCD).setColumnIdentifiers(columnNames);
		
		tblCongDoan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblCongDoan.getSelectedRow();
				if(row>=0) {
					String maCD = (String) tblCongDoan.getValueAt(row, 0);
					String tenCD = (String) tblCongDoan.getValueAt(row, 1);
					String giaCD = (String) tblCongDoan.getValueAt(row, 2).toString();
					String maSP = (String) tblCongDoan.getValueAt(row, 3);
					String tenSP = (String) tblCongDoan.getValueAt(row, 4);
					String soLuong = (String) tblCongDoan.getValueAt(row, 5).toString();
					String congDoanYC = (String) tblCongDoan.getValueAt(row, 6).toString();
					
					txtMaCongDoan.setText(maCD);
					txtTenCongDoan.setText(tenCD);
					txtGiaCongDoan.setText(giaCD);
					txtMaSanPham.setText(maSP);
					txtTenSanPham.setText(tenSP);

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
		cd_dao = new DAO_CongDoan();
		DocDuLieuDBVaoTableCD();
		updateCongDoanYeuCauComboBox();
		btnThemCongDoan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row<0) {
					JOptionPane.showMessageDialog(null, "Can chon san phan de phan cong doan");
					return;
				}
				else if(valid()) {
					String maSP = txtMaSanPham.getText().trim();
					int maxMACD = cd_dao.getMaxMaCongDoan();
					int nextMaCD = maxMACD +1;
					String ma = String.format(maSP+"CD%02d", nextMaCD);
					txtMaCongDoan.setText(ma);
					
					String tenCD = txtTenCongDoan.getText().trim();
					double giaCD = Double.parseDouble(txtGiaCongDoan.getText().trim());
					String tenSP = txtTenSanPham.getText().trim();
					int soLuong = Integer.parseInt(cmbSoLuong.getSelectedItem().toString());
					String congDoanYC =null;
					if (chkCongDoanYeuCau.isSelected() && cmbCongDoanYeuCau.getSelectedItem() != null) {
					    congDoanYC = cmbCongDoanYeuCau.getSelectedItem().toString();
					} else {
					    congDoanYC = null;
					}

					SanPham sp = new SanPham(maSP);
					CongDoan cd = new CongDoan(ma, tenCD, giaCD, sp, tenSP, soLuong, congDoanYC);
					cd_dao.create(cd);
					((DefaultTableModel) tableModelCD).addRow(new Object[] {cd.getMaCongDoan(),cd.getTenCongDoan(),cd.getGiaCongDoan()
							,cd.getSanPham().getMaSanPham(),cd.getTenSanPham(),cd.getSoLuong(),cd.getCongDoanYC()});
					JOptionPane.showMessageDialog(null, "Thêm Công Đoạn Thành Công");
					
					
					updateCongDoanYeuCauComboBox();
					txtMaCongDoan.setText("");
					txtTenCongDoan.setText("");
					txtGiaCongDoan.setText("");
					txtMaSanPham.setText("");
					txtTenSanPham.setText("");
					cmbSoLuong.setSelectedIndex(0);
					cmbCongDoanYeuCau.setSelectedIndex(0);
				}else {
					JOptionPane.showMessageDialog(null, "Thêm Công Đoạn Không Thành Công");
				}
			}
		});
		btnXoaCongDoan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tblCongDoan.getSelectedRow();
				if(row < 0) {
					JOptionPane.showMessageDialog(null, "Chọn Công Đoạn cần xóa");
				}else {
					String macd = (String) tblCongDoan.getValueAt(row, 0);
					cd_dao.delete(macd);
					((DefaultTableModel) tableModelCD).removeRow(row);
					JOptionPane.showMessageDialog(null, "Xóa Công Đoạn thành công");
				}
				
			}
		});
		btnSuaThongTin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tblCongDoan.getSelectedRow();
		        if (selectedRow < 0) {
		            JOptionPane.showMessageDialog(null, "Chọn một công đoạn trong bảng để sửa.");
		            return;
		        }
		        String maCD = txtMaCongDoan.getText().trim();
		        String tenCD = txtTenCongDoan.getText().trim();
		        double giaCD = Double.parseDouble(txtGiaCongDoan.getText().trim());
		        String maSP = txtMaSanPham.getText().trim();
		        String tenSP = txtTenSanPham.getText().trim();
		        int soLuong = Integer.parseInt(cmbSoLuong.getSelectedItem().toString());
		        String congDoanYC = cmbCongDoanYeuCau.getSelectedItem().toString();
		        SanPham sp = new SanPham(maSP);
		        CongDoan cd = new CongDoan(maCD, tenCD, giaCD, sp, tenSP, soLuong, congDoanYC);
		        boolean updated = cd_dao.update(cd);
		        if(updated) {
		        	
		        	tblCongDoan.setValueAt(tenCD, selectedRow, 1);
		        	tblCongDoan.setValueAt(giaCD, selectedRow, 2);
		        	tblCongDoan.setValueAt(maSP, selectedRow, 3);
		        	tblCongDoan.setValueAt(tenSP, selectedRow, 4);
		        	tblCongDoan.setValueAt(soLuong, selectedRow, 5);
		        	tblCongDoan.setValueAt(congDoanYC, selectedRow, 6);
		        	
		        	JOptionPane.showMessageDialog(null, "Cập nhật thông tin công đoạn thành công");
		        }else {
		        	JOptionPane.showMessageDialog(null, "Cập nhật thông tin công đoạn thất bại");
		        }
		        
				
			}
		});
		btnXoaRong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtMaCongDoan.setText("");
				txtTenCongDoan.setText("");
				txtGiaCongDoan.setText("");
				txtMaSanPham.setText("");
				txtTenSanPham.setText("");
				cmbSoLuong.removeAll();
				cmbCongDoanYeuCau.removeAll();
				
			}
		});
		//THOÁT
				btnThoat.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
		//
	}
	
	//
	public void DocDuLieuDBVaoTable() {
		List<SanPham> list = DAO_SanPham.getAlltbSanPham();
		for (SanPham sp : list) {
			((DefaultTableModel) tableModelSP).addRow(new Object[] {sp.getMaSanPham(),sp.getTenSanPham(),sp.getKieuDang(),sp.getChatLieu(),sp.getSoLuong()});
		}
	}
	public void DocDuLieuDBVaoTableCD() {
		List<CongDoan> list = DAO_CongDoan.getAlltbCongDoan();
		for (CongDoan cd : list) {
			((DefaultTableModel) tableModelCD).addRow(new Object[] {cd.getMaCongDoan(),cd.getTenCongDoan(),cd.getGiaCongDoan()
					,cd.getSanPham().getMaSanPham(),cd.getTenSanPham(),cd.getSoLuong(),cd.getCongDoanYC()});
		}
	}
	public boolean valid() {
		if(txtGiaCongDoan.getText().equals("")||txtTenCongDoan.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Không được rỗng !!!");
	        return false;
		}
		return true;
	}
	private void updateCongDoanYeuCauComboBox() {
	    // Xóa toàn bộ mục trong cmbCongDoanYeuCau
	    cmbCongDoanYeuCau.removeAllItems();

	    // Lấy danh sách tên công đoạn yêu cầu từ cơ sở dữ liệu
	    List<String> congDoanYeuCauList = cd_dao.getAllCongDoanYeuCau();

	    // Thêm danh sách mới vào cmbCongDoanYeuCau
	    for (String congDoan : congDoanYeuCauList) {
	        cmbCongDoanYeuCau.addItem(congDoan);
	    }
	}
//
}
