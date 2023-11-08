package gui_Form;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import com.toedter.components.JSpinField;

import connectDB.Conection_DB;
import dao.DAO_NhanVien;
import dao.DAO_SanPham;
import entity.NhanVien;
import entity.SanPham;

public class Form_SP_CapNhat extends JPanel {
	private JTable table;
	private JTextField txtMaSanPham;
	private JTextField txtKieuDang;
	private JTextField txtTenSanPham;
	private JTextField txtChatLieu;
	private DefaultTableModel tableModel;
	private DAO_SanPham sp_dao;
	private JSpinField jsfSoLuong;

	/**
	 * Create the panel.
	 */
	public Form_SP_CapNhat() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblSanPham = new JLabel("SẢN PHẨM");
		lblSanPham.setForeground(Color.RED);
		lblSanPham.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblSanPham);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 210));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setPreferredSize(new Dimension(1200, 150));
		pnNhap.setBorder(new TitledBorder(null, "Th\u00F4ng Tin S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnCenter.add(pnNhap);
		
		Box box1 = Box.createVerticalBox();
		pnNhap.add(box1);
		
		Box boxMaSanPham = Box.createHorizontalBox();
		box1.add(boxMaSanPham);
		
		JLabel lblMaSanPham = new JLabel("Mã Sản Phẩm :");
		lblMaSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxMaSanPham.add(lblMaSanPham);
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setPreferredSize(new Dimension(7, 30));
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setColumns(20);
		boxMaSanPham.add(txtMaSanPham);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 50));
		box1.add(verticalStrut);
		
		Box boxKieuDang = Box.createHorizontalBox();
		box1.add(boxKieuDang);
		
		JLabel lblKieuDang = new JLabel("Kiểu Dáng :");
		lblKieuDang.setFont(new Font("Arial", Font.BOLD, 14));
		boxKieuDang.add(lblKieuDang);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		boxKieuDang.add(horizontalStrut);
		
		txtKieuDang = new JTextField();
		txtKieuDang.setPreferredSize(new Dimension(7, 30));
		boxKieuDang.add(txtKieuDang);
		txtKieuDang.setColumns(20);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(60, 0));
		pnNhap.add(horizontalStrut_2);
		
		Box box2 = Box.createVerticalBox();
		pnNhap.add(box2);
		
		Box boxTenSanPham = Box.createHorizontalBox();
		box2.add(boxTenSanPham);
		
		JLabel lblTenSanPham = new JLabel("Tên Sản Phẩm :");
		lblTenSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		boxTenSanPham.add(lblTenSanPham);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setPreferredSize(new Dimension(7, 30));
		boxTenSanPham.add(txtTenSanPham);
		txtTenSanPham.setColumns(20);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
		box2.add(verticalStrut_1);
		
		Box boxChatLieu = Box.createHorizontalBox();
		box2.add(boxChatLieu);
		
		JLabel lblChatLieu = new JLabel("Chất Liệu :");
		lblChatLieu.setFont(new Font("Arial", Font.BOLD, 14));
		boxChatLieu.add(lblChatLieu);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(33, 0));
		boxChatLieu.add(horizontalStrut_1);
		
		txtChatLieu = new JTextField();
		txtChatLieu.setPreferredSize(new Dimension(7, 30));
		boxChatLieu.add(txtChatLieu);
		txtChatLieu.setColumns(20);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(60, 0));
		pnNhap.add(horizontalStrut_3);
		
		Box box3 = Box.createVerticalBox();
		pnNhap.add(box3);
		
		Box boxSoLuong = Box.createHorizontalBox();
		box3.add(boxSoLuong);
		
		JLabel lblSoLuong = new JLabel("Số Lượng ");
		lblSoLuong.setFont(new Font("Arial", Font.BOLD, 14));
		boxSoLuong.add(lblSoLuong);
		
		jsfSoLuong = new JSpinField();
		jsfSoLuong.getSpinner().setPreferredSize(new Dimension(30, 40));
		jsfSoLuong.setPreferredSize(new Dimension(100, 29));
		boxSoLuong.add(jsfSoLuong);
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(1000, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnThemSanPham = new JButton("Thêm Sản Phẩm");
		btnThemSanPham.setIcon(new ImageIcon(Form_SP_CapNhat.class.getResource("/img/Graphicloads-Colorful-Long-Shadow-Cart-add.256 (1).png")));
		btnThemSanPham.setBackground(Color.ORANGE);
		btnThemSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThemSanPham);
		
		JButton btnXoaSanPham = new JButton("Xóa Sản Phẩm");
		btnXoaSanPham.setBackground(Color.CYAN);
		btnXoaSanPham.setIcon(new ImageIcon(Form_SP_CapNhat.class.getResource("/img/Custom-Icon-Design-Flatastic-11-Shopping-basket-remove.512 (2).png")));
		btnXoaSanPham.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaSanPham);
		
		JButton btnSuaThongTin = new JButton("Sửa Thông Tin");
		btnSuaThongTin.setBackground(Color.GREEN);
		btnSuaThongTin.setIcon(new ImageIcon(Form_SP_CapNhat.class.getResource("/img/fixinfomation.png")));
		btnSuaThongTin.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnSuaThongTin);
		
		JButton btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setIcon(new ImageIcon(Form_SP_CapNhat.class.getResource("/img/xoarong.png")));
		btnXoaRong.setBackground(Color.MAGENTA);
		btnXoaRong.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnXoaRong);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.RED);
		btnThoat.setIcon(new ImageIcon(Form_SP_CapNhat.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 14));
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(1200, 420));
		pnSouth.setBorder(new TitledBorder(null, "Danh S\u00E1ch S\u1EA3n Ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1100, 380));
		pnSouth.add(scrollPane);
		
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
			
			boolean[] columnEditables = new boolean[] {false, false, false, false,false};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setFont(new Font("Arial", Font.PLAIN, 10));

		/* XỬ LÝ TỪ ĐÂY*/
		tableModel = (DefaultTableModel) table.getModel();
		String[] columnNames = { "Mã Sản Phẩm", "Tên Sản Phẩm", "Kiểu Dáng", "Chất Liệu", "Số Lượng"};
		tableModel.setColumnIdentifiers(columnNames);
		
		// khởi tạo kết nối đến CSDL
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sp_dao = new DAO_SanPham();
		DocDuLieuDBVaoTable();
		
		// THÊM NHÂN VIÊN
		btnThemSanPham.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valid()) {
					// Lấy thông tin từ các trường nhập liệu
					// Truy vấn cơ sở dữ liệu để lấy ra mã nhân viên lớn nhất
					int maxSPNumber = sp_dao.getMaxProductNumberNumber(); // Hãy viết phương thức getMaxEmployeeNumber để thực hiện truy vấn
					// Tăng giá trị mã nhân viên lớn nhất lên 1
					int nextSPNumber = maxSPNumber + 1;
					// Định dạng số thứ tự thành chuỗi với độ dài 2 và tạo mã nhân viên
					String ma = String.format("SP%02d", nextSPNumber);

			        // Gán mã nhân viên đã tạo vào trường nhập liệu
			        txtMaSanPham.setText(ma);
					String tenSanPham = txtTenSanPham.getText().trim();
					String kieuDang = txtKieuDang.getText().trim();
					String chatLieu = txtChatLieu.getText().trim();
					
					// Xử lý số lượng
					int soLuong = jsfSoLuong.getValue();
					
					SanPham sp = new SanPham(ma, tenSanPham, kieuDang, chatLieu, soLuong);
					sp_dao.create(sp);
					tableModel.addRow(new Object[] {sp.getMaSanPham(),sp.getTenSanPham(),sp.getKieuDang(),sp.getChatLieu(),sp.getSoLuong()});
					JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công");
					// Xóa nội dung của các trường nhập liệu sau khi thêm
					txtMaSanPham.setText("");
					txtMaSanPham.requestFocus();
					txtTenSanPham.setText("");
					txtChatLieu.setText("");
					jsfSoLuong.validate();
				}else {
					JOptionPane.showMessageDialog(null, "Thêm sản phẩm không thành công");
				}
			}
		});
		//XÓA NHÂN VIÊN
		btnXoaSanPham.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row < 0) {
					JOptionPane.showMessageDialog(null, "Chọn sản phẩm cần xóa");
				}else {
					String maSP = (String) table.getValueAt(row, 0);
					sp_dao.deleteSP(maSP);
					tableModel.removeRow(row); 
					JOptionPane.showMessageDialog(null, "Xóa sản phẩm thành công"); 
				}
			} 
		}); 
		//SỬA NHÂN VIÊN
		btnSuaThongTin.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = table.getSelectedRow();
		        if (selectedRow < 0) {
		            JOptionPane.showMessageDialog(null, "Chọn một sản phẩm trong bảng để sửa.");
		            return;
		        }

		        // Lấy thông tin sản phẩm từ dòng được chọn trong bảng
		        String maSP = txtMaSanPham.getText().trim();
		        String tenSP = txtTenSanPham.getText().trim();
		        String kieuDang = txtKieuDang.getText().trim();
		        String chatLieu = txtChatLieu.getText().trim();
		        // Xử lý số lượng
		        int soLuong = jsfSoLuong.getValue();
		        // Tạo đối tượng NhanVien mới
		        SanPham sp = new SanPham(maSP, tenSP, kieuDang, chatLieu, soLuong);
		        // Gọi phương thức DAO để cập nhật thông tin nhân viên
		        boolean updated = sp_dao.update(sp);

		        if (updated) {
		            // Cập nhật lại thông tin trong bảng
		            tableModel.setValueAt(tenSP, selectedRow, 1);
		            tableModel.setValueAt(kieuDang, selectedRow, 2);
		            tableModel.setValueAt(chatLieu, selectedRow, 3);
		            tableModel.setValueAt(soLuong, selectedRow, 4);
		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sản phẩm thành công");
		        } else {
		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin sản phẩm thất bại");
		        }
		    }
		});
		
		// XÓA RỖNG
		btnXoaRong.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Đặt giá trị của các trường nhập liệu về rỗng hoặc giá trị mặc định
		        txtMaSanPham.setText("");
		        txtTenSanPham.setText("");
		        txtKieuDang.setText("");
		        txtChatLieu.setText("");
		        jsfSoLuong.setValue(0);
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
				            String maSP = (String) table.getValueAt(row, 0);
				            String tenSP = (String) table.getValueAt(row, 1);
				            String kieuDang = (String) table.getValueAt(row, 2);
				            String chatLieu = (String) table.getValueAt(row, 3);
				            String soLuong = (String) table.getValueAt(row, 4).toString();

				            txtMaSanPham.setText(maSP);
				            txtTenSanPham.setText(tenSP);
				            txtKieuDang.setText(kieuDang);
				            txtChatLieu.setText(chatLieu);
				            jsfSoLuong.setValue(0);

				        }
				    }
				});

				/////////////////
	}
	
	public void DocDuLieuDBVaoTable() {
		List<SanPham> list = DAO_SanPham.getAlltbSanPham();
		for (SanPham sp : list) {
			tableModel.addRow(new Object[] {sp.getMaSanPham(),sp.getTenSanPham(),sp.getKieuDang(),sp.getChatLieu(),sp.getSoLuong()});
		}
	}
	public boolean valid() {
	    if (txtTenSanPham.getText().equals("") || txtKieuDang.getText().equals("") || txtChatLieu.getText().equals("") 
	        || jsfSoLuong.getValue() <= 0) 
	    {
	        JOptionPane.showMessageDialog(null, "Không được rỗng !!!");
	        return false;
	    }
	    
	    if (!(txtTenSanPham.getText().matches("[A-Za-z0-9' ]+"))) {
	        JOptionPane.showMessageDialog(null, "Tên sản phẩm theo mẫu: Air Force 1");
	        txtTenSanPham.requestFocus();
	        return false;
	    }
	    if (!(txtKieuDang.getText().matches("[A-Za-z' ,]+"))) {
	        JOptionPane.showMessageDialog(null, "Kiểu dáng sản phẩm theo mẫu: to");
	        txtKieuDang.requestFocus();
	        return false;
	    }
	    if (!(txtChatLieu.getText().matches("[A-Za-z0-9' ]+"))) {
	        JOptionPane.showMessageDialog(null, "Chất liệu sản phẩm theo mẫu: vải 03");
	        txtChatLieu.requestFocus();
	        return false;
	    }
	    return true;
	}
	//
}
