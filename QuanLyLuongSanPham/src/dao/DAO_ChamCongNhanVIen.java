//package dao;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import connectDB.Conection_DB;
//import entity.CongCuaNhanVien;
//
//public class DAO_ChamCongNhanVIen {
//	public DAO_ChamCongNhanVIen() {
//		// TODO Auto-generated constructor stub
//	}
//	public static ArrayList<CongCuaNhanVien> getAlltbCongCuaNhanVien(){
//		ArrayList<CongCuaNhanVien> dscongNV = new ArrayList<CongCuaNhanVien>();
//		Conection_DB.getInstance();
//		Connection con = Conection_DB.getCon();
//		String sql = "select * from CongCuaNhanVien";
//		Statement statement;
//		
//		try {
//			statement = con.createStatement();
//			ResultSet rs = statement.executeQuery(sql);
//			while(rs.next()) {
//				String maCong = rs.getString(1);
//				String tenNhanVien = rs.getString(2);
//				String ngayCham = rs.getString(3);
//				String caLam = rs.getString(4);
//				String gioLam = rs.getString(5);
//				double luongCaLam = rs.getDouble(6);
//				String trangThai = rs.getString(7);
//				String nghiPhep = rs.getString(8);
//				//CongCuaNhanVien congNV = new 
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//	
//	//
//}
