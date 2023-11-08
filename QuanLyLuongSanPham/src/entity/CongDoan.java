package entity;

import java.util.Objects;

public class CongDoan {
	private String maCongDoan;
	private String tenCongDoan;
	private double giaCongDoan;
	private SanPham sanPham;
	private String tenSanPham;
	private int soLuong;
	private String congDoanYC;
	public CongDoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CongDoan(String maCongDoan) {
		super();
		this.maCongDoan = maCongDoan;
	}
	public CongDoan(String maCongDoan, String tenCongDoan, double giaCongDoan, SanPham sanPham) {
		super();
		this.maCongDoan = maCongDoan;
		this.tenCongDoan = tenCongDoan;
		this.giaCongDoan = giaCongDoan;
		this.sanPham = sanPham;
	}
	public String getMaCongDoan() {
		return maCongDoan;
	}
	public void setMaCongDoan(String maCongDoan) {
		this.maCongDoan = maCongDoan;
	}
	public String getTenCongDoan() {
		return tenCongDoan;
	}
	public void setTenCongDoan(String tenCongDoan) {
		this.tenCongDoan = tenCongDoan;
	}
	public double getGiaCongDoan() {
		return giaCongDoan;
	}
	public void setGiaCongDoan(double giaCongDoan) {
		this.giaCongDoan = giaCongDoan;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maCongDoan);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongDoan other = (CongDoan) obj;
		return Objects.equals(maCongDoan, other.maCongDoan);
	}
	@Override
	public String toString() {
		return "CongDoan [maCongDoan=" + maCongDoan + ", tenCongDoan=" + tenCongDoan + ", giaCongDoan=" + giaCongDoan
				+ ", sanPham=" + sanPham + "]";
	}
	
}
