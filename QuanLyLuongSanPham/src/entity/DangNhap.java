package entity;

public class DangNhap {
	private String taiKhoan;
	private String matKhau;
	public DangNhap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DangNhap(String taiKhoan, String matKhau) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	@Override
	public String toString() {
		return "DangNhap [taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + "]";
	}
	
	
}
