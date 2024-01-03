package de_23774;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap thong tin tac gia :");
		String hoten = sn.nextLine();
//		o1.setHoTen(hoten);

		String gioitinh = sn.nextLine();
//		o1.setGioitinh(gioitinh);
		
		String email = sn.nextLine();
//		o1.setEmail(email);
		System.out.println(hoten + " " + gioitinh + " " +email);
	}

}
