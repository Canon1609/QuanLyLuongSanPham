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
import java.util.List;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connectDB.Conection_DB;
import dao.DAO_CongNhan;
import dao.DAO_NhanVien;
import entity.CongNhan;
import entity.NhanVien;

import javax.swing.JScrollPane;

public class Form_CN_TimKiem extends JPanel {
	private JTextField txtTenCongNhan;
	private JTextField txtDiaChi;
	private JTextField txtCMND;
	private JTable table;
	private DAO_CongNhan cn_dao;
	private DefaultTableModel tableModel;
	private JComboBox cmbGT;
	private JTable tblDanhSachNhanVien;

	/**
	 * Create the panel.
	 */
	public Form_CN_TimKiem() {
setLayout(new BorderLayout(0, 0));
		
		JPanel pnNorth = new JPanel();
		add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblTimKiem = new JLabel("TÌM KIẾM THÔNG TIN NHÂN VIÊN HÀNH CHÍNH");
		lblTimKiem.setForeground(Color.RED);
		lblTimKiem.setFont(new Font("Arial", Font.BOLD, 16));
		pnNorth.add(lblTimKiem);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setPreferredSize(new Dimension(1200, 310));
		add(pnCenter, BorderLayout.CENTER);
		
		JPanel pnNhap = new JPanel();
		pnNhap.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnNhap.setPreferredSize(new Dimension(1000, 250));
		pnCenter.add(pnNhap);
		
        Box b, b1, b2, b3;
        JLabel lblNhapMa,lblNhapTen;
        JTextField txtTen,txtThongBao;
        b = Box.createVerticalBox();
        b.add(Box.createVerticalStrut(40));
        b.add(b1 = Box.createHorizontalBox());
        b1.add(lblNhapMa = new JLabel("Tìm Kiếm Công Nhân Theo: "));
        b1.add(Box.createHorizontalStrut(30));
        JComboBox<String> cmbMaNV;
        cmbMaNV = new JComboBox<>();
            cmbMaNV.addItem("Tên");
            cmbMaNV.addItem("Giới Tính");
        cmbMaNV.setPreferredSize(new Dimension(400,20));
        b1.add(cmbMaNV);
        b.add(Box.createVerticalStrut(20));

        b.add(b2 = Box.createHorizontalBox());
        b2.add(lblNhapTen = new JLabel());
        lblNhapTen.setPreferredSize(lblNhapMa.getPreferredSize());
        b2.add(Box.createHorizontalStrut(30));
        b2.add(txtTen = new JTextField());
        txtTen.setPreferredSize(new Dimension(10,20));
        b.add(Box.createVerticalStrut(10));

        cmbGT = new JComboBox<>();
        cmbGT.addItem("Nam");
        cmbGT.addItem("Nữ");
        b2.add(cmbGT);
        cmbGT.setVisible(false);
        pnNhap.add(b);
        cmbMaNV.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(cmbMaNV.getSelectedItem().equals("Tên")){
                    lblNhapTen.setText("Nhập Tên Công Nhân:");
                    txtTen.setPreferredSize(new Dimension(10,20));
                    txtTen.setVisible(true);
                    cmbGT.setVisible(false);
                }
                else if(cmbMaNV.getSelectedItem().equals("Giới Tính")){
                    lblNhapTen.setText("Chọn Giới Tính:");
                    txtTen.setVisible(false);
                    cmbGT.setVisible(true);
                }

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        b.add(b3 = Box.createHorizontalBox());
        b3.add(Box.createHorizontalStrut(200));
        b3.add(txtThongBao = new JTextField(50));
        txtThongBao.setBorder(null);
        txtThongBao.setEditable(false);
        txtThongBao.setForeground(Color.RED);
        txtThongBao.setFont(new Font("Arial",Font.ITALIC,14));
        b.setPreferredSize(new Dimension(500, 150));
		
		
		JPanel pnChucNang = new JPanel();
		pnChucNang.setPreferredSize(new Dimension(700, 50));
		pnCenter.add(pnChucNang);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setIcon(new ImageIcon(Form_NV_TimKiem.class.getResource("/img/timkiem.png")));
		btnTimKiem.setBackground(Color.LIGHT_GRAY);
		btnTimKiem.setFont(new Font("Arial", Font.BOLD, 12));
		pnChucNang.add(btnTimKiem);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setPreferredSize(new Dimension(50, 0));
		pnChucNang.add(horizontalStrut_7);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setIcon(new ImageIcon(Form_NV_TimKiem.class.getResource("/img/exit.png")));
		btnThoat.setFont(new Font("Arial", Font.BOLD, 12));
		btnThoat.setBackground(Color.RED);
		pnChucNang.add(btnThoat);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBorder(new TitledBorder(null, "K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnSouth.setPreferredSize(new Dimension(1200, 330));
		add(pnSouth, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1150, 290));
		pnSouth.add(scrollPane);
		
		tblDanhSachNhanVien = new JTable();
		scrollPane.setViewportView(tblDanhSachNhanVien);
		tblDanhSachNhanVien.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Nh\u00E2n Vi\u00EAn", "H\u1ECD T\u00EAn", "CMND/CCCD", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i",  "Ph\u1EE5 C\u1EA5p","Trinh Do Tay Nghe", "Ph\u00F2ng Ban"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, Double.class, String.class, String.class
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
		tblDanhSachNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));

		//Xu ly
		tableModel = (DefaultTableModel) tblDanhSachNhanVien.getModel();
		String[] columnNames = { "Mã Công Nhân", "Họ Tên", "CMND/CCCD", "Ngày Sinh", "Giới Tính", "Địa Chỉ",
				"Số Điện Thoại","Phụ Cấp","Trình Độ Tay Nghề", "Phòng Ban" };
		tableModel.setColumnIdentifiers(columnNames);
		// khởi tạo kết nối đến CSDL
				try {
					Conection_DB.getInstance().connect();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		cn_dao= new DAO_CongNhan();
		btnTimKiem.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String loaiTimKiem = cmbMaNV.getSelectedItem().toString();
		        String timKiemTen = txtTen.getText().trim();
		        String timKiemGT = cmbGT.getSelectedItem().toString();

		        if (loaiTimKiem.equals("Tên")) {
		            // Tìm kiếm theo tên và lấy danh sách nhân viên
		            ArrayList<CongNhan> danhSachNhanVien = (ArrayList<CongNhan>) cn_dao.timKiemTen(timKiemTen);
		            
		            // Kiểm tra xem danh sách có dữ liệu không
		            if (danhSachNhanVien.isEmpty()) {
		                txtThongBao.setText("Không tìm thấy công nhân!");
		                updateTableData(danhSachNhanVien);
		            } else {
		                txtThongBao.setText("Tìm thành công!");
		                updateTableData(danhSachNhanVien);
		            }
		        } else if (loaiTimKiem.equals("Giới Tính")) {
		            // Tìm kiếm theo giới tính và lấy danh sách nhân viên
		            ArrayList<CongNhan> danhSachNhanVien = (ArrayList<CongNhan>) cn_dao.timKiemGT(timKiemGT);
		            
		            // Kiểm tra xem danh sách có dữ liệu không
		            if (danhSachNhanVien.isEmpty()) {
		                txtThongBao.setText("Không tìm thấy công nhân!");
		                updateTableData(danhSachNhanVien);
		            } else {
		                txtThongBao.setText("Tìm thành công theo giới tính!");
		                updateTableData(danhSachNhanVien);
		            }
		        }
		    }
		});}
		
		//
		
		// Phương thức cập nhật dữ liệu trong bảng
		private void updateTableData(ArrayList<CongNhan> danhSachNhanVien) {
		    DefaultTableModel model = (DefaultTableModel) tblDanhSachNhanVien.getModel();
		    model.setRowCount(0); // Xóa dữ liệu cũ

		    for (CongNhan nv : danhSachNhanVien) {
		        model.addRow(new Object[] {
		            nv.getMaCongNhan(),
		            nv.getHoTen(),
		            nv.getcCCD(),
		            nv.getNgaySinh(),
		            nv.getGioiTinh(),
		            nv.getDiaChi(),
		            nv.getSoDienThoai(),
		            nv.getPhuCap(),
		            nv.getTrinhDoTayNghe(),
		            nv.getPhongBan()
		           
		        });
		    }
		}
		
	
}
