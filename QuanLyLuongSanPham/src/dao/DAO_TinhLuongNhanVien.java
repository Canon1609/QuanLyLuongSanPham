package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Conection_DB;
import entity.CongCuaNhanVien;
import entity.LuongNhanVien;
import entity.NhanVien;

public class DAO_TinhLuongNhanVien {
	public DAO_TinhLuongNhanVien() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<LuongNhanVien> getAlltbCongCuaNhanVien(){
		ArrayList<LuongNhanVien> dsluongNV = new ArrayList<LuongNhanVien>();
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		String sql = "select * from LuongNhanVien";
		Statement statement;
		try {
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String maLuong = rs.getString(1);
				String maNV = rs.getString("maNhanVien");
				String tenNV = rs.getString(3);
				int soNgayDiLam = rs.getInt(4);
				int thangNhan = rs.getInt(5);
				int namNhan = rs.getInt(6);
				double thucNhan = rs.getDouble(7);
				
				NhanVien nv = new NhanVien(maNV);
				LuongNhanVien luongNV = new LuongNhanVien(maLuong, nv, tenNV, soNgayDiLam, thangNhan, namNhan, thucNhan);
				dsluongNV.add(luongNV);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsluongNV;
	}
	
	public boolean create(LuongNhanVien luongNV) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		int n=0;
		
		try {
			stmt = con.prepareStatement("insert into " + "LuongNhanVien values (?,?,?,?,?,?,?)");
			stmt.setString(1, luongNV.getMaLuongNhanVien());
			stmt.setString(2, luongNV.getNhanVien().getMaNhanVien());
			stmt.setString(3, luongNV.getTenNhanVien());
			stmt.setInt(4, luongNV.getSoNgayDiLam());
			stmt.setInt(5, luongNV.getThangNhan());
			stmt.setInt(6, luongNV.getNamNhan());
			stmt.setDouble(7, luongNV.getThucNhan());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n>0;
	}
	public boolean delete(String maLuongNV) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		
		try {
			PreparedStatement stmt = con.prepareStatement("delete from LuongNhanVien where maLuongNhanVien = ?");
			stmt.setString(1, maLuongNV);
			int n = stmt.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public int getMaxMaLuongNV() {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String query = "SELECT MAX(CAST(SUBSTRING(maLuongNhanVien, 3, LEN(maLuongNhanVien) - 2) AS INT)) FROM LuongNhanVien";
		
		try {
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int maxMaLuongNV = rs.getInt(1);
				return maxMaLuongNV;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
