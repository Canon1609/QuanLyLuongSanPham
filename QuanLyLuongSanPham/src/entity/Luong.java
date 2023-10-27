package entity;

import java.util.Objects;

public class Luong {
	private String maLuong;
	private int thangNhan;
	private int namNhan;
	private double thucNhan;
	private NhanVien nhanVien;
	private CongNhan congNhan;
	public Luong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Luong(String maLuong) {
		super();
		this.maLuong = maLuong;
	}
	public Luong(String maLuong, int thangNhan, int namNhan, double thucNhan, NhanVien nhanVien, CongNhan congNhan) {
		super();
		this.maLuong = maLuong;
		this.thangNhan = thangNhan;
		this.namNhan = namNhan;
		this.thucNhan = thucNhan;
		this.nhanVien = nhanVien;
		this.congNhan = congNhan;
	}
	public String getMaLuong() {
		return maLuong;
	}
	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}
	public int getThangNhan() {
		return thangNhan;
	}
	public void setThangNhan(int thangNhan) {
		this.thangNhan = thangNhan;
	}
	public int getNamNhan() {
		return namNhan;
	}
	public void setNamNhan(int namNhan) {
		this.namNhan = namNhan;
	}
	public double getThucNhan() {
		return thucNhan;
	}
	public void setThucNhan(double thucNhan) {
		this.thucNhan = thucNhan;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public CongNhan getCongNhan() {
		return congNhan;
	}
	public void setCongNhan(CongNhan congNhan) {
		this.congNhan = congNhan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maLuong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Luong other = (Luong) obj;
		return Objects.equals(maLuong, other.maLuong);
	}
	@Override
	public String toString() {
		return "Luong [maLuong=" + maLuong + ", thangNhan=" + thangNhan + ", namNhan=" + namNhan + ", thucNhan="
				+ thucNhan + ", nhanVien=" + nhanVien + ", congNhan=" + congNhan + "]";
	}
	
	
	
	
}
