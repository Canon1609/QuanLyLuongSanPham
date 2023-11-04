package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Conection_DB;
import entity.HopDong;
import entity.NhanVien;
import entity.SanPham;

public class DAO_HopDong {
	public DAO_HopDong() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<HopDong> getAllHopDong() {
		ArrayList<HopDong> dshd = new ArrayList<HopDong>();

		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		String sql = "select * from hopdong";

		Statement statement;

		try {
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String maHD = rs.getString(1);
				String tenKhachHang = rs.getString(4);
				NhanVien nv =new NhanVien(rs.getString(3));
				
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				
				double donGia = rs.getDouble(7);
				HopDong hd =new HopDong(maHD, tenKhachHang, ngayLap, ngayGiao, donGia, nv);
				dshd.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dshd;
	}

	public boolean create(HopDong hd) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("insert into hopdong values(?,?,?,?,?,?,?)");
			stmt.setString(1, hd.getMaHopDong());
			stmt.setString(2, hd.getSanPham().getMaSanPham());
			stmt.setString(3, hd.getNhanVien().getMaNhanVien());
			stmt.setString(4, hd.getTenKH());
			stmt.setString(5, hd.getNgayLap());
			stmt.setString(6, hd.getNgayGiao());
			stmt.setDouble(7, hd.getDonGia());
			
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}

	public boolean delete(String maHD) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		try {
			PreparedStatement stmt = con.prepareStatement("delete from hopdong where mahopdong = ?");
			stmt.setString(1, maHD);
			int n = stmt.executeUpdate();
			if (n > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean update(HopDong hd) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement(
					"UPDATE hopdong SET TenKhachHang=?, maSanPham=?, MaNhanVien=?, NgayLap=?, NgayGiao=?, DonGia=?");
			stmt.setString(1, hd.getTenKH());
			stmt.setString(2, hd.getSanPham().getMaSanPham());
			stmt.setString(3, hd.getNhanVien().getMaNhanVien());
			stmt.setString(4, hd.getNgayLap());
			stmt.setString(5, hd.getNgayGiao());
			stmt.setDouble(6, hd.getDonGia());
			
			
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	//Tim kiem theo ten
	public List<HopDong> timKiemMaHopDong(String ma){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dshd = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where maHopDong = ?");
			stmt.setString(1, ma);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao, donGia, nv);
				dshd.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dshd;
	}
	public List<HopDong> timKiemTenKhachHang(String ten){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dsnv = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where tenKhachHang = ?");
			stmt.setString(1, ten);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao, donGia, nv);
				dsnv.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsnv;
	}
	public List<HopDong> timKiemMaNhanVien(String ma){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dshd = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where maNhanVien = ?");
			stmt.setString(1, ma);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao, donGia, nv);
				dshd.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dshd;
	}
	//all
	public List<HopDong> timKiemALL(String ma, String tenKH1){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dshd = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where maNhanVien = ? tenKhachHang=?");
			stmt.setString(1, ma);
			stmt.setString(2, tenKH1);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao, donGia, nv);
				dshd.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dshd;
	}
	public List<HopDong> timKiemTenNhanVien(String ten){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dsnv = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where tenNhanVien = ?");
			stmt.setString(1, ten);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao, donGia, nv);
				dsnv.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsnv;
	}
	//Tim kiem theo gioi tinh
	public List<HopDong> timKiemNgayLap(String ngayLap){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dsnv = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where ngayLap = ?");
			stmt.setString(1, ngayLap);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap_New = rs.getString(5);
				String ngayGiao = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap_New, ngayGiao, donGia, nv);
				dsnv.add(hd);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsnv;
	}
	public List<HopDong> timKiemNgayGiao(String ngayGiao){
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<HopDong> dsnv = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("select * from HopDong where ngayLap = ?");
			stmt.setString(1, ngayGiao);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String maHD = rs.getString(1);
				String maSP = rs.getString(2);
				String maNV = rs.getString(3);
				String tenKH = rs.getString(4);
				String ngayLap = rs.getString(5);
				String ngayGiao_New = rs.getString(6);
				double donGia = rs.getDouble(7);
				NhanVien nv =new NhanVien(maNV);
				SanPham sp=new SanPham(maSP);
				HopDong hd =new HopDong(maHD, tenKH, ngayLap, ngayGiao_New, donGia, nv);
				dsnv.add(hd);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsnv;
	}
	// Lấy mã nhân viên lớn nhất có trong csdl để tránh bị trùng
	public int getMaxEmployeeNumber() {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// Truy vấn để lấy ra mã nhân viên lớn nhất
			String query = "SELECT MAX(CAST(SUBSTRING(MaHopDong, 3, LEN(MaNhanVien) - 2) AS INT)) FROM hopdong";
			stmt = con.prepareStatement(query);
			// Thực hiện truy vấn
			rs = stmt.executeQuery();
			if (rs.next()) {
				int maxEmployeeNumber = rs.getInt(1);
				return maxEmployeeNumber;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return 0; // Trả về giá trị mặc định nếu có lỗi
	}

	//
}
