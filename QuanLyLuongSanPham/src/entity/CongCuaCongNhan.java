package entity;

import java.util.Objects;

public class CongCuaCongNhan {
	private String maCongCN;
	private String ngayChamCong;
	private int caLam;
	private String giolam;
	private int slSPDaLam;
	private boolean trangThai;
	private boolean nghiPhep;
	private CongNhan congNhan;
	public CongCuaCongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CongCuaCongNhan(String maCongCN) {
		super();
		this.maCongCN = maCongCN;
	}
	public CongCuaCongNhan(String maCongCN, String ngayChamCong, int caLam, String giolam, int slSPDaLam,
			boolean trangThai, boolean nghiPhep, CongNhan congNhan) {
		super();
		this.maCongCN = maCongCN;
		this.ngayChamCong = ngayChamCong;
		this.caLam = caLam;
		this.giolam = giolam;
		this.slSPDaLam = slSPDaLam;
		this.trangThai = trangThai;
		this.nghiPhep = nghiPhep;
		this.congNhan = congNhan;
	}
	public String getMaCongCN() {
		return maCongCN;
	}
	public void setMaCongCN(String maCongCN) {
		this.maCongCN = maCongCN;
	}
	public String getNgayChamCong() {
		return ngayChamCong;
	}
	public void setNgayChamCong(String ngayChamCong) {
		this.ngayChamCong = ngayChamCong;
	}
	public int getCaLam() {
		return caLam;
	}
	public void setCaLam(int caLam) {
		this.caLam = caLam;
	}
	public String getGiolam() {
		return giolam;
	}
	public void setGiolam(String giolam) {
		this.giolam = giolam;
	}
	public int getSlSPDaLam() {
		return slSPDaLam;
	}
	public void setSlSPDaLam(int slSPDaLam) {
		this.slSPDaLam = slSPDaLam;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public boolean isNghiPhep() {
		return nghiPhep;
	}
	public void setNghiPhep(boolean nghiPhep) {
		this.nghiPhep = nghiPhep;
	}
	public CongNhan getCongNhan() {
		return congNhan;
	}
	public void setCongNhan(CongNhan congNhan) {
		this.congNhan = congNhan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maCongCN);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongCuaCongNhan other = (CongCuaCongNhan) obj;
		return Objects.equals(maCongCN, other.maCongCN);
	}
	@Override
	public String toString() {
		return "CongCuaCongNhan [maCongCN=" + maCongCN + ", ngayChamCong=" + ngayChamCong + ", caLam=" + caLam
				+ ", giolam=" + giolam + ", slSPDaLam=" + slSPDaLam + ", trangThai=" + trangThai + ", nghiPhep="
				+ nghiPhep + ", congNhan=" + congNhan + "]";
	}
	
	
}
