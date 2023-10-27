package gui_Form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TrangChu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrangChu() {
		//setAlwaysOnTop(true);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrangChu.class.getResource("/img/ungdung.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 795);
		setVisible(true);
		setLocationRelativeTo(null); // canh giua man hinh
		setResizable(false);

		JMenuBar mnuChinh = new JMenuBar();
		mnuChinh.setFont(new Font("Arial", Font.BOLD, 30));
		mnuChinh.setBackground(new Color(128, 255, 255));
		setJMenuBar(mnuChinh);

		JMenu mnTrangChu = new JMenu("Trang Chủ");
		mnTrangChu.setBackground(new Color(255, 255, 255));
		mnTrangChu.setIcon(new ImageIcon(TrangChu.class.getResource("/img/home.png")));
		mnTrangChu.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnTrangChu);

		JMenu mnNhanVien = new JMenu("Nhân Viên");
		mnNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/nhanVien.png")));
		mnNhanVien.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnNhanVien);

		JMenuItem mniCapNhatNhanVien = new JMenuItem("Cập Nhật");
		mniCapNhatNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/capnhat.png")));
		mniCapNhatNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNhanVien.add(mniCapNhatNhanVien);

		JMenuItem mniChamCongNhanVien = new JMenuItem("Chấm Công");
		mniChamCongNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/chamcong.png")));
		mniChamCongNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNhanVien.add(mniChamCongNhanVien);

		JMenuItem mniLuongNhanVien = new JMenuItem("Lương");
		mniLuongNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/luong.png")));
		mniLuongNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNhanVien.add(mniLuongNhanVien);

		JMenuItem mniTimKiemNhanVien = new JMenuItem("Tìm Kiếm");
		mniTimKiemNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/timkiem.png")));
		mniTimKiemNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNhanVien.add(mniTimKiemNhanVien);

		JMenu mnCongNhan = new JMenu("Công Nhân");
		mnCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/congNhan.png")));
		mnCongNhan.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnCongNhan);

		JMenuItem mniCapNhatCongNhan = new JMenuItem("Cập Nhật");
		mniCapNhatCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/capnhat.png")));
		mniCapNhatCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCongNhan.add(mniCapNhatCongNhan);

		JMenuItem mniPhanCongCongNhan = new JMenuItem("Phân Công");
		mniPhanCongCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/phanCong.png")));
		mniPhanCongCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCongNhan.add(mniPhanCongCongNhan);

		JMenuItem mniChamCongCongNhan = new JMenuItem("Chấm Công");
		mniChamCongCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/chamcong.png")));
		mniChamCongCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCongNhan.add(mniChamCongCongNhan);

		JMenuItem mniLuongCongNhan = new JMenuItem("Lương");
		mniLuongCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/luong.png")));
		mniLuongCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCongNhan.add(mniLuongCongNhan);

		JMenuItem mniTimKiemCongNhan = new JMenuItem("Tìm Kiếm");
		mniTimKiemCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/timkiem.png")));
		mniTimKiemCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnCongNhan.add(mniTimKiemCongNhan);

		JMenu mnSanPham = new JMenu("Sản Phẩm");
		mnSanPham.setIcon(new ImageIcon(TrangChu.class.getResource("/img/sanPham.png")));
		mnSanPham.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnSanPham);

		JMenuItem mniCapNhatSanPham = new JMenuItem("Cập Nhật");
		mniCapNhatSanPham.setIcon(new ImageIcon(TrangChu.class.getResource("/img/capnhat.png")));
		mniCapNhatSanPham.setFont(new Font("Arial", Font.PLAIN, 14));
		mnSanPham.add(mniCapNhatSanPham);

		JMenuItem mniCongDoanSanPham = new JMenuItem("Công Đoạn");
		mniCongDoanSanPham.setIcon(new ImageIcon(TrangChu.class.getResource("/img/congDoan.png")));
		mniCongDoanSanPham.setFont(new Font("Arial", Font.PLAIN, 14));
		mnSanPham.add(mniCongDoanSanPham);

		JMenuItem mniTimKiemSanPham = new JMenuItem("Tìm Kiếm");
		mniTimKiemSanPham.setIcon(new ImageIcon(TrangChu.class.getResource("/img/timkiem.png")));
		mniTimKiemSanPham.setFont(new Font("Arial", Font.PLAIN, 14));
		mnSanPham.add(mniTimKiemSanPham);

		JMenu mnHopDong = new JMenu("Hợp Đồng");
		mnHopDong.setIcon(new ImageIcon(TrangChu.class.getResource("/img/hopDong.png")));
		mnHopDong.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnHopDong);

		JMenuItem mniCapNhatHopDong = new JMenuItem("Cập Nhật");
		mniCapNhatHopDong.setIcon(new ImageIcon(TrangChu.class.getResource("/img/capnhat.png")));
		mniCapNhatHopDong.setFont(new Font("Arial", Font.PLAIN, 14));
		mnHopDong.add(mniCapNhatHopDong);

		JMenuItem mniTimKiemHopDong = new JMenuItem("Tìm Kiếm");
		mniTimKiemHopDong.setIcon(new ImageIcon(TrangChu.class.getResource("/img/timkiem.png")));
		mniTimKiemHopDong.setFont(new Font("Arial", Font.PLAIN, 14));
		mnHopDong.add(mniTimKiemHopDong);

		JMenu mnThongKe = new JMenu("Thống Kê");
		mnThongKe.setIcon(new ImageIcon(TrangChu.class.getResource("/img/thongke.png")));
		mnThongKe.setFont(new Font("Arial", Font.BOLD, 25));
		mnuChinh.add(mnThongKe);

		JMenuItem mniThongKeNhanVien = new JMenuItem("Nhân Viên");
		mniThongKeNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/img/nhanVien.png")));
		mniThongKeNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		mnThongKe.add(mniThongKeNhanVien);

		JMenuItem mniThongKeCongNhan = new JMenuItem("Công Nhân");
		mniThongKeCongNhan.setIcon(new ImageIcon(TrangChu.class.getResource("/img/congNhan.png")));
		mniThongKeCongNhan.setFont(new Font("Arial", Font.PLAIN, 14));
		mnThongKe.add(mniThongKeCongNhan);

		JMenuItem mniThongKeSanPham = new JMenuItem("Sản Phẩm");
		mniThongKeSanPham.setIcon(new ImageIcon(TrangChu.class.getResource("/img/sanPham.png")));
		mniThongKeSanPham.setFont(new Font("Arial", Font.PLAIN, 14));
		mnThongKe.add(mniThongKeSanPham);

		JMenuItem mniThongKeHopDong = new JMenuItem("Hợp Đồng");
		mniThongKeHopDong.setIcon(new ImageIcon(TrangChu.class.getResource("/img/hopDong.png")));
		mniThongKeHopDong.setFont(new Font("Arial", Font.PLAIN, 14));
		mnThongKe.add(mniThongKeHopDong);

		JMenu mnThoat = new JMenu("Đóng Ứng Dụng");
		mnThoat.setFont(new Font("Arial", Font.BOLD, 20));
		mnThoat.setIcon(new ImageIcon(TrangChu.class.getResource("/img/out.png")));
		mnuChinh.add(mnThoat);

		Container cp = getContentPane();

		JPanel pnSouth = new JPanel();
		cp.add(pnSouth, BorderLayout.SOUTH);

		JLabel lblTen = new JLabel("Trần Quốc Anh - Nguyễn Hoàng Khôi - Hồ Nguyễn Công Hiếu");
		lblTen.setFont(new Font("Arial", Font.ITALIC, 18));
		pnSouth.setPreferredSize(new Dimension(0, 40));
		pnSouth.setBackground(Color.LIGHT_GRAY);
		pnSouth.add(lblTen);

		JPanel pnCenter = new JPanel();
		// pnCenter.setBounds(100, 100, 1222, 795);
		cp.add(pnCenter, BorderLayout.CENTER);
		JLabel lblTieuDe = new JLabel("PHẦN MỀM QUẢN LÝ LƯƠNG");
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 27));
		lblTieuDe.setForeground(Color.BLUE);
		JLabel imgLabel = new JLabel(new ImageIcon(TrangChu.class.getResource("/img/trangchu.jpg")));
		imgLabel.setPreferredSize(new Dimension(1000, 600));
		pnCenter.add(lblTieuDe);
		pnCenter.add(imgLabel);

		mnTrangChu.addMouseListener(new MouseListener() {

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
				pnCenter.removeAll();
				JLabel lblTieuDe = new JLabel("PHẦN MỀM QUẢN LÝ LƯƠNG");
				lblTieuDe.setFont(new Font("Arial", Font.BOLD, 27));
				lblTieuDe.setForeground(Color.BLUE);
				JLabel imgLabel = new JLabel(new ImageIcon(TrangChu.class.getResource("/img/trangchu.jpg")));
				imgLabel.setPreferredSize(new Dimension(1000, 600));
				pnCenter.add(lblTieuDe);
				pnCenter.add(imgLabel);
				System.out.println("Click");
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});

		//Nhan Vien
		mniCapNhatNhanVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_NV_CapNhat());
				pnCenter.revalidate();
				pnCenter.repaint();
			}
		});

		mniChamCongNhanVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_NV_ChamCong());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});

		mniLuongNhanVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_NV_TinhLuong());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});

		mniTimKiemNhanVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_NV_TimKiem());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});

		//Cong Nhan
		mniCapNhatCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_CapNhat());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniChamCongCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_ChamCong());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniPhanCongCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_PhanCong());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniLuongCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_TinhLuong());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniTimKiemCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_TimKiem());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		//San Pham
		mniCapNhatSanPham.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_SP_CapNhat());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniCongDoanSanPham.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_SP_CongDoan());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniTimKiemSanPham.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_SP_TimKiem());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		
		//Hop Dong
		
		mniCapNhatHopDong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_HD_CapNhap());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniTimKiemHopDong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_HD_TimKiem());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		//Thong Ke
		mniThongKeCongNhan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_CN_ThongKe());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniThongKeNhanVien.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_NV_ThongKe());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		
		mniThongKeHopDong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_HD_ThongKe());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		mniThongKeSanPham.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnCenter.removeAll();
				pnCenter.add(new Form_SP_ThongKe());
				pnCenter.revalidate();
				pnCenter.repaint();

			}
		});
		//THOAT
		// Thêm phím tắt Ctrl+T để thoát
		KeyStroke ctrlT = KeyStroke.getKeyStroke(KeyEvent.VK_T, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());
		InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(ctrlT, "ctrlT");
		getRootPane().getActionMap().put("ctrlT", new AbstractAction() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	int choice = JOptionPane.showConfirmDialog(TrangChu.this, "Bạn có chắc chắn muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            System.exit(0); // Đóng ứng dụng nếu người dùng chọn "Có"
		        }
		    }
		});

		// Thêm menu item "Thoát"
		JMenuItem mniThoat = new JMenuItem("Thoát (CTRT + T)");
		mniThoat.setFont(new Font("Arial", Font.BOLD, 14));
		mniThoat.setIcon(new ImageIcon(TrangChu.class.getResource("/img/exit.png")));
		mnThoat.add(mniThoat);

		mniThoat.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int choice = JOptionPane.showConfirmDialog(TrangChu.this, "Bạn có chắc chắn muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
		        if (choice == JOptionPane.YES_OPTION) {
		            System.exit(0); // Đóng ứng dụng nếu người dùng chọn "Có"
		        }
		    }
		});


		

		
		
		
	}
}
