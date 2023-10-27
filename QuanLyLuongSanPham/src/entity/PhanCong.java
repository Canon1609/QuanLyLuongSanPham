package entity;

import java.util.Objects;

public class PhanCong {
	private String maPhanCong;
	private int sLSPCanLam;
	private CongDoan congDoan;
	private CongNhan congNhan;
	public PhanCong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhanCong(String maPhanCong) {
		super();
		this.maPhanCong = maPhanCong;
	}
	public PhanCong(String maPhanCong, int sLSPCanLam, CongDoan congDoan, CongNhan congNhan) {
		super();
		this.maPhanCong = maPhanCong;
		this.sLSPCanLam = sLSPCanLam;
		this.congDoan = congDoan;
		this.congNhan = congNhan;
	}
	public String getMaPhanCong() {
		return maPhanCong;
	}
	public void setMaPhanCong(String maPhanCong) {
		this.maPhanCong = maPhanCong;
	}
	public int getsLSPCanLam() {
		return sLSPCanLam;
	}
	public void setsLSPCanLam(int sLSPCanLam) {
		this.sLSPCanLam = sLSPCanLam;
	}
	public CongDoan getCongDoan() {
		return congDoan;
	}
	public void setCongDoan(CongDoan congDoan) {
		this.congDoan = congDoan;
	}
	public CongNhan getCongNhan() {
		return congNhan;
	}
	public void setCongNhan(CongNhan congNhan) {
		this.congNhan = congNhan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhanCong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhanCong other = (PhanCong) obj;
		return Objects.equals(maPhanCong, other.maPhanCong);
	}
	@Override
	public String toString() {
		return "PhanCong [maPhanCong=" + maPhanCong + ", sLSPCanLam=" + sLSPCanLam + ", congDoan=" + congDoan
				+ ", congNhan=" + congNhan + "]";
	}
	
	
	
	
}
