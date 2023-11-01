package entity;

import java.util.Objects;

public class HopDong {
	private String maHopDong;
	private String tenKH;
	private String ngayLap;
	private String ngayGiao;
	private double donGia;
	private int sLSanPham;
	private NhanVien nhanVien;
	private SanPham sanPham;
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HopDong(String maHopDong) {
		super();
		this.maHopDong = maHopDong;
	}
	public HopDong(String maHopDong, String tenKH, String ngayLap, String ngayGiao, double donGia, int sLSanPham,
			NhanVien nhanVien, SanPham sanPham) {
		super();
		this.maHopDong = maHopDong;
		this.tenKH = tenKH;
		this.ngayLap = ngayLap;
		this.ngayGiao = ngayGiao;
		this.donGia = donGia;
		this.sLSanPham = sLSanPham;
		this.nhanVien = nhanVien;
		this.sanPham = sanPham;
	}
	
	
	public HopDong(String maHopDong, String tenKH, String ngayLap, String ngayGiao, double donGia, NhanVien nhanVien) {
		super();
		this.maHopDong = maHopDong;
		this.tenKH = tenKH;
		this.ngayLap = ngayLap;
		this.ngayGiao = ngayGiao;
		this.donGia = donGia;
		this.nhanVien = nhanVien;
	}
	public String getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}
	public String getNgayGiao() {
		return ngayGiao;
	}
	public void setNgayGiao(String ngayGiao) {
		this.ngayGiao = ngayGiao;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getsLSanPham() {
		return sLSanPham;
	}
	public void setsLSanPham(int sLSanPham) {
		this.sLSanPham = sLSanPham;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHopDong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HopDong other = (HopDong) obj;
		return Objects.equals(maHopDong, other.maHopDong);
	}
	@Override
	public String toString() {
		return "HopDong [maHopDong=" + maHopDong + ", tenKH=" + tenKH + ", ngayLap=" + ngayLap + ", ngayGiao="
				+ ngayGiao + ", donGia=" + donGia + ", sLSanPham=" + sLSanPham + ", nhanVien=" + nhanVien + ", sanPham="
				+ sanPham + "]";
	}
	
	
}
