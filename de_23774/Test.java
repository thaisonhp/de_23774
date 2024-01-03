package de_23774;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private static ArrayList<SACH> listbook = new ArrayList<>();
	public void nhapsach() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap vao so sach muon them !");
		int n = sn.nextInt();
		sn.nextLine();
		for(int i = 0 ; i < n ; i++) {
			SACH s = new SACH();
//			TACGIA o1 = new TACGIA();
			System.out.println("Nhap thong tin tac gia :");
			String hoten = sn.nextLine();
//			o1.setHoTen(hoten);

			String gioitinh = sn.nextLine();
//			o1.setGioitinh(gioitinh);
			
			String email = sn.nextLine();
//			o1.setEmail(email);
			
			s.setTacgia(new TACGIA(hoten,gioitinh,email));
			
			
			System.out.println("Nhap ten sach !");
			String tensach = sn.nextLine();
			s.setTensach(tensach);
			
			
			System.out.println("Nhap id !");
			int id = sn.nextInt();
			s.setID(id);
			
			
			System.out.println("Nhap vao so luong !");
			int soluong = sn.nextInt();
			s.setSoluong(soluong);
			
			System.out.println("Nhap vao nam xuat ban !");
			int namxuatban = sn.nextInt();
			s.setNamxuatban(namxuatban);
			
			System.out.println("Nhap vao gia !");
			double gia = sn.nextInt();
			s.setGia(gia);
			this.listbook.add(s);
		}
		
	}
	
	public void printlist() {
		this.listbook.forEach(go->{
			System.out.println(go);
		});
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("1.Nhap danh sach");
		System.out.println("2.Hien thi");
		System.out.println("3.Thêm");
		System.out.println("4.Sửa");
		System.out.println("5.Xoá");
		System.out.println("6. Thoat");
		Test t = new Test() ;
		QLSACHImpl manager = new QLSACHImpl(listbook);
		System.out.print("Moi Nhap lua chon cua ban :");
		int index = sn.nextInt();
		do {
			if(index == 1) {
				t.nhapsach();
			}else if(index == 2) {
				t.printlist();
			}else if (index == 3) {
				TACGIA t1 = new TACGIA("Nui","nam","Luongcaonui@gmail.com");
				manager.them(new SACH("Abcread",121,t1,10,2000,100.5));
			}else if (index == 4) {
				TACGIA t1 = new TACGIA("Yen","nu","Luongcaonui@gmail.com");
				manager.sua(new SACH("Efghread",121,t1,5,2000,102));
			}else if(index == 5) {
				TACGIA t1 = new TACGIA("Yen","nu","Luongcaonui@gmail.com");
				manager.xoa(new SACH("Efghread",121,t1,5,2000,102));
			}
			System.out.print("Moi nhap lua chon :");
			index = sn.nextInt();
		}while(index != 6);
	}

}
