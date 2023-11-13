package gui_Form;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import connectDB.Conection_DB;
import dao.DAO_ChamCongNhanVIen;
import dao.DAO_CongNhan;
import dao.DAO_TinhLuongCongNhan;
import dao.DAO_LuongNhanVien;
import entity.CongNhan;
import entity.LuongCongNhan;
import entity.LuongNhanVien;
import entity.NhanVien;

import javax.swing.DefaultComboBoxModel;

public class Form_CN_ThongKe extends JPanel {
	private JTable tbl_c;
	private DAO_CongNhan cn_dao;
	private DAO_TinhLuongCongNhan lcn_dao;

	/**
	 * Create the panel.
	 */
	public Form_CN_ThongKe() {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Nouth = new JPanel();
		panel_Nouth.setPreferredSize(new Dimension(1200, 50));
		add(panel_Nouth, BorderLayout.NORTH);
		
		JLabel lbl_tieuDe = new JLabel("THỐNG KÊ LƯƠNG CÔNG NHÂN");
		lbl_tieuDe.setFont(new Font("Arial", Font.BOLD, 15));
		panel_Nouth.add(lbl_tieuDe);
		
		JPanel panel_T = new JPanel();
		panel_T.setPreferredSize(new Dimension(600, 300));
		panel_T.setBorder(new TitledBorder(null, "Thống kê lương công nhân", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_T, BorderLayout.WEST);
		panel_T.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box b = Box.createVerticalBox();
		panel_T.add(b);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		b.add(verticalStrut_3);
		
		Box b1 = Box.createHorizontalBox();
		b.add(b1);
		
		JLabel lbl_thang = new JLabel("Tháng: ");
		lbl_thang.setPreferredSize(new Dimension(100, 30));
		lbl_thang.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lbl_thang);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut);
		
		JComboBox cmb_thang = new JComboBox();
		cmb_thang.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cmb_thang.setPreferredSize(new Dimension(100, 30));
		cmb_thang.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(cmb_thang);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(40, 0));
		b1.add(horizontalStrut_1);
		
		JLabel lbl_nam = new JLabel("Năm: ");
		lbl_nam.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lbl_nam);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "2018", "2019", "2020", "2021", "2022", "2023"}));
		comboBox_1.setPreferredSize(new Dimension(100, 30));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(comboBox_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		b.add(verticalStrut);
		
		Box b2 = Box.createHorizontalBox();
		b.add(b2);
		
		JLabel lbl_maCN = new JLabel("Mã Công Nhân : ");
		lbl_maCN.setPreferredSize(new Dimension(100, 30));
		lbl_maCN.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbl_maCN);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_3);
		
		JComboBox cmb_maCN = new JComboBox();
		cmb_maCN.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_maCN.setPreferredSize(new Dimension(100, 30));
		cmb_maCN.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(cmb_maCN);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		b.add(verticalStrut_1);
		
		Box b3 = Box.createHorizontalBox();
		b.add(b3);
//		
//		JLabel lbl_tenCN = new JLabel("Tên Công Nhân: ");
//		lbl_tenCN.setPreferredSize(new Dimension(100, 30));
//		lbl_tenCN.setFont(new Font("Arial", Font.PLAIN, 12));
//		b3.add(lbl_tenCN);
//		
//		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
//		b3.add(horizontalStrut_4);
//		
//		JComboBox cmb_tenCN = new JComboBox();
//		cmb_tenCN.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
//		b3.add(cmb_tenCN);
//		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 50));
		b.add(verticalStrut_2);
		
		Box b4 = Box.createHorizontalBox();
		b4.setPreferredSize(new Dimension(300, 50));
		b.add(b4);
		
		JButton btn_thongKe = new JButton("Thống Kê");
		btn_thongKe.setIcon(new ImageIcon(Form_CN_ThongKe.class.getResource("/img/thongke.png")));
		btn_thongKe.setPreferredSize(new Dimension(150, 40));
		btn_thongKe.setFont(new Font("Arial", Font.BOLD, 14));
		btn_thongKe.setBackground(Color.ORANGE);
		b4.add(btn_thongKe);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(40, 0));
		b4.add(horizontalStrut_5);
		
		JButton btn_in = new JButton("In");
		btn_in.setIcon(new ImageIcon(Form_CN_ThongKe.class.getResource("/img/in.png")));
		btn_in.setPreferredSize(new Dimension(140, 40));
		btn_in.setFont(new Font("Arial", Font.BOLD, 14));
		btn_in.setBackground(Color.GREEN);
		b4.add(btn_in);
		
		JPanel panel_South = new JPanel();
		panel_South.setPreferredSize(new Dimension(550, 320));
		panel_South.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u1EA3ng th\u1ED1ng k\u00EA c\u00F4ng nh\u00E2n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel_South, BorderLayout.SOUTH);
		
		JScrollPane src_c = new JScrollPane();
		src_c.setPreferredSize(new Dimension(1100, 280));
		panel_South.add(src_c);
		
		tbl_c = new JTable();
		JTable tbl_c = new JTable(new DefaultTableModel(
			    new Object[][] {},
			    new String[] {  "Mã Công Nhân","Họ Tên", "Số Ngày Làm", "Lương" }
			) {
			    Class[] columnTypes = new Class[] { String.class, String.class, Integer.class,  Double.class };
			    public Class getColumnClass(int columnIndex) {
			        return columnTypes[columnIndex];
			    }
			});

			DefaultTableModel tableModel = (DefaultTableModel) tbl_c.getModel();
			tableModel.setColumnIdentifiers(new String[] { "Mã Công Nhân","Họ Tên", "Số Ngày Làm", "Lương" });
		tbl_c.setFont(new Font("Arial", Font.PLAIN, 12));
		src_c.setViewportView(tbl_c);
		
		JPanel panel_Center = new JPanel();
		panel_Center.setPreferredSize(new Dimension(600, 300));
		panel_Center.setBorder(new TitledBorder(null, "Th\u1ED1ng k\u00EA ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_CenTer_T = new JPanel();
		panel_Center.add(panel_CenTer_T, BorderLayout.WEST);
		
		Box bc = Box.createVerticalBox();
		panel_CenTer_T.add(bc);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_5);
		
		Box bc1 = Box.createHorizontalBox();
		bc.add(bc1);
		
		JLabel lbl_tongTienLuong = new JLabel("Tổng tiền lương: ");
		lbl_tongTienLuong.setFont(new Font("Arial", Font.PLAIN, 14));
		bc1.add(lbl_tongTienLuong);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_4);
		
		Box bc2 = Box.createHorizontalBox();
		bc.add(bc2);
		
		JLabel lbl_tongCN = new JLabel("Tổng công nhân: ");
		lbl_tongCN.setPreferredSize(new Dimension(150, 30));
		lbl_tongCN.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tongCN.setFont(new Font("Arial", Font.PLAIN, 14));
		bc2.add(lbl_tongCN);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_6);
		
		Box bc3 = Box.createHorizontalBox();
		bc.add(bc3);
		
		JLabel lbl_soNgayLam = new JLabel("Số ngày làm trung bình: ");
		lbl_soNgayLam.setPreferredSize(new Dimension(160, 30));
		lbl_soNgayLam.setFont(new Font("Arial", Font.PLAIN, 14));
		bc3.add(lbl_soNgayLam);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_7);
		
		Box bc4 = Box.createHorizontalBox();
		bc.add(bc4);
		
		JLabel lbl_soNgayNghi = new JLabel("Số ngày nghĩ trung bình: ");
		lbl_soNgayNghi.setPreferredSize(new Dimension(170, 30));
		lbl_soNgayNghi.setFont(new Font("Arial", Font.PLAIN, 14));
		bc4.add(lbl_soNgayNghi);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_8);
		
		Box bc5 = Box.createHorizontalBox();
		bc.add(bc5);
		
		JLabel lbl_luongCaoNhat = new JLabel("Lương cao nhất: ");
		lbl_luongCaoNhat.setPreferredSize(new Dimension(160, 30));
		lbl_luongCaoNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		bc5.add(lbl_luongCaoNhat);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_9);
		
		Box bc6 = Box.createHorizontalBox();
		bc.add(bc6);
		
		JLabel lbl_luongThapNhat = new JLabel("Lương thấp nhất: ");
		lbl_luongThapNhat.setPreferredSize(new Dimension(160, 30));
		lbl_luongThapNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		bc6.add(lbl_luongThapNhat);
		
		JPanel panel_Center_Center = new JPanel();
		panel_Center.add(panel_Center_Center, BorderLayout.CENTER);
		panel_Center_Center.setLayout(new GridLayout(0, 1, 0, 0));
		
		Box bc_1 = Box.createVerticalBox();
		panel_Center_Center.add(bc_1);
		
		Component verticalStrut_5_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_5_1);
		
		Box bc1_1 = Box.createHorizontalBox();
		bc_1.add(bc1_1);
		
		JLabel lblTongTienLuong = new JLabel("???");
		lblTongTienLuong.setFont(new Font("Arial", Font.PLAIN, 14));
		bc1_1.add(lblTongTienLuong);
		
		Component verticalStrut_4_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_4_1);
		
		Box bc2_1 = Box.createHorizontalBox();
		bc_1.add(bc2_1);
		
		JLabel lbl_hienThiTongNV = new JLabel("???");
		lbl_hienThiTongNV.setPreferredSize(new Dimension(150, 30));
		lbl_hienThiTongNV.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_hienThiTongNV.setFont(new Font("Arial", Font.PLAIN, 14));
		bc2_1.add(lbl_hienThiTongNV);
		
		Component verticalStrut_6_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_6_1);
		
		Box bc3_1 = Box.createHorizontalBox();
		bc_1.add(bc3_1);
		
		JLabel lbl_hienThuSoNgayLam = new JLabel("???");
		lbl_hienThuSoNgayLam.setPreferredSize(new Dimension(160, 30));
		lbl_hienThuSoNgayLam.setFont(new Font("Arial", Font.PLAIN, 14));
		bc3_1.add(lbl_hienThuSoNgayLam);
		
		Component verticalStrut_7_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_7_1);
		
		Box bc4_1 = Box.createHorizontalBox();
		bc_1.add(bc4_1);
		
		JLabel lbl_hienThiSoNgayNghi = new JLabel("???");
		lbl_hienThiSoNgayNghi.setPreferredSize(new Dimension(160, 30));
		lbl_hienThiSoNgayNghi.setFont(new Font("Arial", Font.PLAIN, 14));
		bc4_1.add(lbl_hienThiSoNgayNghi);
		
		Component verticalStrut_8_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_8_1);
		
		Box bc5_1 = Box.createHorizontalBox();
		bc_1.add(bc5_1);
		
		JLabel lbl_hienThiLuongCaoNhat = new JLabel("???");
		lbl_hienThiLuongCaoNhat.setPreferredSize(new Dimension(160, 30));
		lbl_hienThiLuongCaoNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		bc5_1.add(lbl_hienThiLuongCaoNhat);
		
		Component verticalStrut_9_1 = Box.createVerticalStrut(20);
		verticalStrut_9_1.setPreferredSize(new Dimension(0, 0));
		bc_1.add(verticalStrut_9_1);
		
		Box bc6_1 = Box.createHorizontalBox();
		bc_1.add(bc6_1);
		
		JLabel lbl_hienThiLuongThapNhat = new JLabel("???");
		lbl_hienThiLuongThapNhat.setPreferredSize(new Dimension(160, 30));
		lbl_hienThiLuongThapNhat.setFont(new Font("Arial", Font.PLAIN, 14));
		bc6_1.add(lbl_hienThiLuongThapNhat);
		try {
			Conection_DB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cn_dao =new DAO_CongNhan();
	List<CongNhan> list =cn_dao.getAlltbCongNhan();
		
		for (CongNhan congNhan : list) {
			cmb_maCN.addItem(congNhan.getMaCongNhan());
		}
		
		lcn_dao =new DAO_TinhLuongCongNhan();
		List<LuongCongNhan> dscnv =lcn_dao.getAlltbCongCuaNhanVien();
		for (LuongCongNhan luongCongNhan : dscnv) {
			tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
					luongCongNhan.getTenCongNhan(),
					luongCongNhan.getSoNgayDiLam(),
					luongCongNhan.getThucNhan()  });
		}
		btn_thongKe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ma =cmb_maCN.getSelectedItem().toString();
				String date =cmb_thang.getSelectedItem().toString();
				String year =comboBox_1.getSelectedItem().toString();
				tableModel.setRowCount(0);
				
				if(date.equals("Tất cả") && year.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.getmatbNhanVien(ma);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
				}
				else if(ma.equals("Tất cả") && date.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.timKiemNgayLYear(year);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
						
				//	lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
				
				else if(year.equals("Tất cả") && ma.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.timKiemNgayLMonth(date);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
					//lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
				else if(year.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.timKiemMonthMaHD(date, ma);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
					//lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
				else if(ma.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.timKiemMonthYear(date, year);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
					//lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
				else if(date.equals("Tất cả"))
				{
					List<LuongCongNhan> list_hd =lcn_dao.timKiemYearMaHD(year, ma);
					for (LuongCongNhan luongCongNhan : dscnv) {
						tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
								luongCongNhan.getTenCongNhan(),
								luongCongNhan.getSoNgayDiLam(),
								luongCongNhan.getThucNhan()  });
					}
					//lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
				else if(date.equals("Tất cả") && year.equals("Tất cả") && ma.equals("Tất cả"))
				{
					
//					DocDuLieuDBVaoTable();
//					lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
				}
					
				else
					{
						List<LuongCongNhan> list_hd =lcn_dao.timKiem(date,year,ma);
						for (LuongCongNhan luongCongNhan : dscnv) {
							tableModel.addRow(new Object[] {luongCongNhan.getCongNhan().getMaCongNhan(),
									luongCongNhan.getTenCongNhan(),
									luongCongNhan.getSoNgayDiLam(),
									luongCongNhan.getThucNhan()  });
						}					
						//lbl_hienThiSoLuongHD.setText(tbl_c.getRowCount()+"");
					}
				
				
			}
		});
	}

}
