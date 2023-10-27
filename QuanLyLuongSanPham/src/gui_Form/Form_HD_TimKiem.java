package gui_Form;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

public class Form_HD_TimKiem extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Form_HD_TimKiem() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Nouth = new JPanel();
		panel_Nouth.setPreferredSize(new Dimension(1200, 50));
		add(panel_Nouth, BorderLayout.NORTH);
		
		JLabel lbl_tieuDe = new JLabel("TÌM KIẾM HỢP ĐỒNG");
		lbl_tieuDe.setForeground(new Color(255, 0, 0));
		lbl_tieuDe.setFont(new Font("Arial", Font.BOLD, 16));
		panel_Nouth.add(lbl_tieuDe);
		
		JPanel panel_South = new JPanel();
		panel_South.setPreferredSize(new Dimension(1200, 320));
		panel_South.setBorder(new TitledBorder(null, "Danh s\u00E1ch h\u1EE3p \u0111\u1ED3ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_South, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1150, 280));
		panel_South.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 H\u1EE3p \u0110\u1ED3ng", "T\u00EAn Kh\u00E1ch H\u00E0ng", "M\u00E3 Nh\u00E2n Vi\u00EAn", "T\u00EAn Nh\u00E2n Vi\u00EAn", "Ng\u00E0y L\u1EADp", "Ng\u00E0y Giao"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JPanel panel_Center = new JPanel();
		panel_Center.setPreferredSize(new Dimension(1200, 300));
		panel_Center.setBorder(new TitledBorder(null, "Tìm Kiếm hợp đồng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_Center, BorderLayout.CENTER);
		
		Box b = Box.createVerticalBox();
		panel_Center.add(b);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 30));
		b.add(verticalStrut);
		
		Box b1 = Box.createHorizontalBox();
		b.add(b1);
		
		JLabel lbl_maHD = new JLabel("Mã Hợp Đồng: ");
		lbl_maHD.setPreferredSize(new Dimension(100, 30));
		lbl_maHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lbl_maHD);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut);
		
		JComboBox cmb_maHD = new JComboBox();
		cmb_maHD.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_maHD.setPreferredSize(new Dimension(150, 30));
		cmb_maHD.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(cmb_maHD);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(40, 0));
		b1.add(horizontalStrut_1);
		
		JLabel lbl_tenKH = new JLabel("Tên Khách Hàng: ");
		lbl_tenKH.setPreferredSize(new Dimension(100, 30));
		lbl_tenKH.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(lbl_tenKH);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		b1.add(horizontalStrut_2);
		
		JComboBox cmb_tenKH = new JComboBox();
		cmb_tenKH.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_tenKH.setPreferredSize(new Dimension(150, 30));
		cmb_tenKH.setFont(new Font("Arial", Font.PLAIN, 12));
		b1.add(cmb_tenKH);
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setPreferredSize(new Dimension(40, 0));
		b1.add(horizontalStrut_1_1);
		
		JButton btn_timTheoTen = new JButton("Tìm");
		btn_timTheoTen.setIcon(new ImageIcon(Form_HD_TimKiem.class.getResource("/img/timkiem.png")));
		btn_timTheoTen.setPreferredSize(new Dimension(100, 35));
		btn_timTheoTen.setFont(new Font("Arial", Font.BOLD, 12));
		b1.add(btn_timTheoTen);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		b.add(verticalStrut_2);
		
		Box b2 = Box.createHorizontalBox();
		b.add(b2);
		
		JLabel lbl_maNV = new JLabel("Mã Nhân Viên: ");
		lbl_maNV.setPreferredSize(new Dimension(100, 30));
		lbl_maNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbl_maNV);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_3);
		
		JComboBox cmb_maNV = new JComboBox();
		cmb_maNV.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_maNV.setPreferredSize(new Dimension(150, 30));
		cmb_maNV.setFont(new Font("Arial", Font.PLAIN, 11));
		b2.add(cmb_maNV);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(40, 0));
		b2.add(horizontalStrut_4);
		
		JLabel lbl_tenNV = new JLabel("Tên Nhân Viên: ");
		lbl_tenNV.setPreferredSize(new Dimension(100, 30));
		lbl_tenNV.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(lbl_tenNV);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		b2.add(horizontalStrut_5);
		
		JComboBox cmb_tenNhanVien = new JComboBox();
		cmb_tenNhanVien.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cmb_tenNhanVien.setPreferredSize(new Dimension(150, 30));
		cmb_tenNhanVien.setFont(new Font("Arial", Font.PLAIN, 12));
		b2.add(cmb_tenNhanVien);
		
		Component horizontalStrut_1_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1_1.setPreferredSize(new Dimension(40, 0));
		b2.add(horizontalStrut_1_1_1);
		
		JButton btn_timTheoNV = new JButton("Tìm");
		btn_timTheoNV.setIcon(new ImageIcon(Form_HD_TimKiem.class.getResource("/img/timkiem.png")));
		btn_timTheoNV.setPreferredSize(new Dimension(100, 35));
		btn_timTheoNV.setFont(new Font("Arial", Font.BOLD, 12));
		b2.add(btn_timTheoNV);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		b.add(verticalStrut_1);
		
		Box b3 = Box.createHorizontalBox();
		b.add(b3);
		
		JLabel lbl_ngayLap = new JLabel("Ngày Lâp: ");
		lbl_ngayLap.setPreferredSize(new Dimension(100, 30));
		lbl_ngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(lbl_ngayLap);
		
		Component horizontalStrut_3_1 = Box.createHorizontalStrut(20);
		b3.add(horizontalStrut_3_1);
		
		JDateChooser dateChooser_ngayLap = new JDateChooser();
		dateChooser_ngayLap.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(dateChooser_ngayLap);
		
		Component horizontalStrut_4_1 = Box.createHorizontalStrut(20);
		horizontalStrut_4_1.setPreferredSize(new Dimension(40, 0));
		b3.add(horizontalStrut_4_1);
		
		JLabel lbl_ngayGiao = new JLabel("Ngày Giao: ");
		lbl_ngayGiao.setPreferredSize(new Dimension(100, 30));
		lbl_ngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(lbl_ngayGiao);
		
		Component horizontalStrut_3_2 = Box.createHorizontalStrut(20);
		b3.add(horizontalStrut_3_2);
		
		JDateChooser dateChooser_ngayGiao = new JDateChooser();
		dateChooser_ngayGiao.setFont(new Font("Arial", Font.PLAIN, 12));
		b3.add(dateChooser_ngayGiao);
		
		Component horizontalStrut_4_2 = Box.createHorizontalStrut(20);
		horizontalStrut_4_2.setPreferredSize(new Dimension(40, 0));
		b3.add(horizontalStrut_4_2);
		
		JButton btn_timTheoNgay = new JButton("Tìm");
		btn_timTheoNgay.setIcon(new ImageIcon(Form_HD_TimKiem.class.getResource("/img/timkiem.png")));
		btn_timTheoNgay.setPreferredSize(new Dimension(100, 35));
		btn_timTheoNgay.setFont(new Font("Arial", Font.BOLD, 12));
		b3.add(btn_timTheoNgay);
	}
	public static void main(String[] args) {
		Form_HD_TimKiem f =new Form_HD_TimKiem();
		f.setVisible(true);
	}
}
