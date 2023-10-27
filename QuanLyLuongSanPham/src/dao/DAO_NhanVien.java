package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Conection_DB;
import entity.NhanVien;

public class DAO_NhanVien {
	public DAO_NhanVien() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<NhanVien> getAlltbNhanVien(){
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		String sql = "select * from nhanvien";
		
		Statement statement;
		
		try {
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String maNV =rs.getString(1);
				String hoTen =rs.getString(2);
				String cCCD =rs.getString(3);
				String ngaySinh =rs.getString(4);
				String gioiTinh =rs.getString(5);
				String diaChi =rs.getString(6);
				String soDienThoai =rs.getString(7);
				double luongCoBan =rs.getDouble(8);
				double phuCap =rs.getDouble(9);
				String phongBan =rs.getString(10);
				double heSoLuong =rs.getDouble(11);
				NhanVien nv = new NhanVien(maNV, hoTen, cCCD, ngaySinh, gioiTinh, diaChi, soDienThoai, luongCoBan, phuCap, phongBan, heSoLuong);
				dsnv.add(nv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsnv;
	}
	
	public boolean create(NhanVien nv) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("insert into NhanVien values(?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, nv.getMaNhanVien());
			stmt.setString(2, nv.getHoTen());
			stmt.setString(3, nv.getcCCD());
			stmt.setString(4, nv.getNgaySinh());
			stmt.setString(5, nv.getGioiTinh());
			stmt.setString(6, nv.getDiaChi());
			stmt.setString(7, nv.getSoDienThoai());
			stmt.setDouble(8, nv.getLuongCoBan());
			stmt.setDouble(9, nv.getPhuCap());
			stmt.setString(10, nv.getPhongBan());
			stmt.setDouble(11, nv.getHeSoLuong());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	
	
	//
	
}
