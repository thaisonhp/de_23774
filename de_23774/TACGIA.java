package de_23774;

public class TACGIA {
	private String HoTen ; 
	private String gioitinh ; 
	private String Email ;

	
	public TACGIA() {
	}




	public TACGIA(String hoTen, String gioitinh, String email) {
		HoTen = hoTen;
		this.gioitinh = gioitinh;
		Email = email;
	}




	public String getHoTen() {
		return HoTen;
	}




	public String getGioitinh() {
		return gioitinh;
	}




	public String getEmail() {
		return Email;
	}




	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}




	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}




	public void setEmail(String email) {
		Email = email;
	}




	@Override
	public String toString() {
		return "TACGIA [HoTen=" + HoTen + ", gioitinh=" + gioitinh + ", Email=" + Email + "]";
	} 
	
}
