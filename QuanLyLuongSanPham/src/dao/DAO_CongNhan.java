package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Conection_DB;
import entity.CongNhan;

public class DAO_CongNhan {
	public DAO_CongNhan() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<CongNhan> getAlltbCongNhan(){
		ArrayList<CongNhan> dscn = new ArrayList<CongNhan>();
		
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		String sql = "select * from congnhan";
		
		Statement statement;
		
		try {
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String maCN =rs.getString(1);
				String hoTen =rs.getString(2);
				String gioiTinh =rs.getString(3);
				String ngaySinh =rs.getString(4);
				String cCCD =rs.getString(5);
				String soDienThoai =rs.getString(6);
				double phuCap =rs.getDouble(7);
				String phongBan =rs.getString(8);
				String trinhDo =rs.getString(9);
				String diaChi =rs.getString(10);
				CongNhan cn = new CongNhan(maCN, hoTen, gioiTinh, ngaySinh, cCCD, soDienThoai, phuCap, phongBan, trinhDo, diaChi);
				dscn.add(cn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dscn;
	}
	
	public boolean create(CongNhan nv) {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			stmt = con.prepareStatement("insert into CongNhan values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, nv.getMaCongNhan());
			stmt.setString(2, nv.getHoTen());
			stmt.setString(3, nv.getGioiTinh());
			stmt.setString(4, nv.getNgaySinh());
			stmt.setString(5, nv.getcCCD());
			stmt.setString(6, nv.getSoDienThoai());
			stmt.setDouble(7, nv.getPhuCap());
			stmt.setString(8, nv.getPhongBan());
			stmt.setString(9, nv.getTrinhDoTayNghe());
			stmt.setString(10, nv.getDiaChi());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}
	
	public int getCNNumber() {
		Conection_DB.getInstance();
		Connection con = Conection_DB.getCon();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// Truy vấn để lấy ra mã nhân viên lớn nhất
			String query = "SELECT MAX(CAST(SUBSTRING(MaCongNhan, 3, LEN(MaCongNhan) - 2) AS INT)) FROM CongNhan";
			stmt = con.prepareStatement(query);
			// Thực hiện truy vấn
			rs = stmt.executeQuery();
			if (rs.next()) {
				int maxCNNumber = rs.getInt(1);
				return maxCNNumber;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return 0; // Trả về giá trị mặc định nếu có lỗi
	}
	
	
	
	//
	
}

