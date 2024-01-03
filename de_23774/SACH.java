package de_23774;

public class SACH {
	private String tensach ;
	private int ID ;
	private TACGIA tacgia ; 
	private int soluong ; 
	private int namxuatban ; 
	private double gia ;
	
	public SACH() {
		
	}

	

	public SACH(String tensach, int iD, TACGIA tacgia, int soluong, int namxuatban, double gia) {
		this.tensach = tensach;
		ID = iD;
		this.tacgia = tacgia;
		this.soluong = soluong;
		this.namxuatban = namxuatban;
		this.gia = gia;
	}


	

	public String getTensach() {
		return tensach;
	}



	public int getID() {
		return ID;
	}



	public TACGIA getTacgia() {
		return tacgia;
	}



	public int getSoluong() {
		return soluong;
	}



	public int getNamxuatban() {
		return namxuatban;
	}



	public double getGia() {
		return gia;
	}



	public void setTensach(String tensach) {
		this.tensach = tensach;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public void setTacgia(TACGIA tacgia) {
		this.tacgia = tacgia;
	}



	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}



	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}



	public void setGia(double gia) {
		this.gia = gia;
	}



	@Override
	public String toString() {
		return "SACH [tensach=" + tensach + ", ID=" + ID + ", tacgia=" + tacgia + ", soluong=" + soluong
				+ ", namxuatban=" + namxuatban + ", gia=" + gia + "]";
	}

	
	
	

		
	
}
