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
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class Form_SP_ThongKe extends JPanel {
	private JTable tbl_c;

	/**
	 * Create the panel.
	 */
	public Form_SP_ThongKe() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Nouth = new JPanel();
		panel_Nouth.setPreferredSize(new Dimension(1200, 50));
		add(panel_Nouth, BorderLayout.NORTH);
		
		JLabel lbl_tieuDe = new JLabel("THỐNG KÊ SẢN PHẨM");
		lbl_tieuDe.setFont(new Font("Arial", Font.BOLD, 15));
		panel_Nouth.add(lbl_tieuDe);
		
		JPanel panel_T = new JPanel();
		panel_T.setPreferredSize(new Dimension(600, 300));
		panel_T.setBorder(new TitledBorder(null, "Thống kê sản phẩm ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		
		JLabel lbl_maSP = new JLabel("Mã Sản Phẩm: ");
		lbl_maSP.setPreferredSize(new Dimension(100, 30));
		lbl_maSP.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbl_maSP);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_3);
		
		JComboBox cmb_maSP = new JComboBox();
		cmb_maSP.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_maSP.setPreferredSize(new Dimension(100, 30));
		cmb_maSP.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(cmb_maSP);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		b.add(verticalStrut_1);
		
		Box b3 = Box.createHorizontalBox();
		b.add(b3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		b3.add(horizontalStrut_4);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 50));
		b.add(verticalStrut_2);
		
		Box b4 = Box.createHorizontalBox();
		b4.setPreferredSize(new Dimension(300, 50));
		b.add(b4);
		
		JButton btn_thongKe = new JButton("Thống Kê");
		btn_thongKe.setIcon(new ImageIcon(Form_SP_ThongKe.class.getResource("/img/thongke.png")));
		btn_thongKe.setPreferredSize(new Dimension(150, 40));
		btn_thongKe.setFont(new Font("Arial", Font.BOLD, 14));
		b4.add(btn_thongKe);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setPreferredSize(new Dimension(40, 0));
		b4.add(horizontalStrut_5);
		
		JButton btn_in = new JButton("In");
		btn_in.setIcon(new ImageIcon(Form_SP_ThongKe.class.getResource("/img/in.png")));
		btn_in.setPreferredSize(new Dimension(140, 40));
		btn_in.setFont(new Font("Arial", Font.BOLD, 14));
		b4.add(btn_in);
		
		JPanel panel_South = new JPanel();
		panel_South.setPreferredSize(new Dimension(550, 320));
		panel_South.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u1EA3ng th\u1ED1ng k\u00EA s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel_South, BorderLayout.SOUTH);
		
		JScrollPane src_c = new JScrollPane();
		src_c.setPreferredSize(new Dimension(1100, 280));
		panel_South.add(src_c);
		
		tbl_c = new JTable();
		tbl_c.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Ki\u1EC3u D\u00E1ng", "Ch\u1EA5t Li\u1EC7u", "S\u1ED1 L\u01B0\u1EE3ng T\u1ED3n", "S\u1ED1 L\u01B0\u1EE3ng \u0110\u1EB7t"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbl_c.setFont(new Font("Arial", Font.PLAIN, 12));
		src_c.setViewportView(tbl_c);
		
		JPanel panel_Center = new JPanel();
		panel_Center.setPreferredSize(new Dimension(600, 300));
		panel_Center.setBorder(new TitledBorder(null, "Th\u1ED1ng k\u00EA ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new BorderLayout(0, 0));
		
		Box bc = Box.createVerticalBox();
		panel_Center.add(bc, BorderLayout.WEST);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_5);
		
		Box bc1 = Box.createHorizontalBox();
		bc.add(bc1);
		
		JLabel lbl_soLuongHienTai = new JLabel("Số lượng hiện tại: ");
		lbl_soLuongHienTai.setFont(new Font("Arial", Font.PLAIN, 14));
		bc1.add(lbl_soLuongHienTai);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_4);
		
		Box bc2 = Box.createHorizontalBox();
		bc.add(bc2);
		
		JLabel lbl_tongHangDat = new JLabel("Tổng số lượng hàng đặt: ");
		lbl_tongHangDat.setPreferredSize(new Dimension(180, 30));
		lbl_tongHangDat.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tongHangDat.setFont(new Font("Arial", Font.PLAIN, 14));
		bc2.add(lbl_tongHangDat);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		bc.add(verticalStrut_6);
		
		Box bc3 = Box.createHorizontalBox();
		bc.add(bc3);
		
		JLabel lbl_hangTon = new JLabel("Số lượng hàng tồn kho: ");
		lbl_hangTon.setPreferredSize(new Dimension(160, 30));
		lbl_hangTon.setFont(new Font("Arial", Font.PLAIN, 14));
		bc3.add(lbl_hangTon);
		
		Box bc4 = Box.createHorizontalBox();
		bc.add(bc4);
		
		Box bc5 = Box.createHorizontalBox();
		bc.add(bc5);
		
		Box bc6 = Box.createHorizontalBox();
		bc.add(bc6);
		
		Box bc_1 = Box.createVerticalBox();
		panel_Center.add(bc_1, BorderLayout.CENTER);
		
		Component verticalStrut_5_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_5_1);
		
		Box bc1_1 = Box.createHorizontalBox();
		bc_1.add(bc1_1);
		
		JLabel lbl_hienThiSoLuongHienTai = new JLabel("???");
		lbl_hienThiSoLuongHienTai.setFont(new Font("Arial", Font.PLAIN, 12));
		bc1_1.add(lbl_hienThiSoLuongHienTai);
		
		Component verticalStrut_4_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_4_1);
		
		Box bc2_1 = Box.createHorizontalBox();
		bc_1.add(bc2_1);
		
		JLabel lbl_hienThiTongHangDat = new JLabel("???");
		lbl_hienThiTongHangDat.setFont(new Font("Arial", Font.PLAIN, 12));
		bc2_1.add(lbl_hienThiTongHangDat);
		
		Component verticalStrut_6_1 = Box.createVerticalStrut(20);
		bc_1.add(verticalStrut_6_1);
		
		Box bc3_1 = Box.createHorizontalBox();
		bc_1.add(bc3_1);
		
		JLabel lbl_hienThiHangTon = new JLabel("???");
		lbl_hienThiHangTon.setPreferredSize(new Dimension(160, 30));
		lbl_hienThiHangTon.setFont(new Font("Arial", Font.PLAIN, 12));
		bc3_1.add(lbl_hienThiHangTon);
	}

}
