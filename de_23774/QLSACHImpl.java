package de_23774;

import java.util.ArrayList;

public class QLSACHImpl implements QLSACH {
	ArrayList<SACH> listbook  ; 
	public QLSACHImpl() {
		this.listbook = new ArrayList<>() ;
	}
	
	
	public QLSACHImpl(ArrayList<SACH> list)
	{
		this.listbook = list ; 
	}
	
	@Override
	public boolean hienthi() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(!this.listbook.isEmpty()) {
				this.listbook.forEach(go->{
					System.out.println(go);
				});
				return true ;
			}else {
				throw new Exception("Khong hien thi duoc danh sach");
			}

		}catch(Exception ex) {
			ex.getStackTrace();
			System.out.print("Loi "+ ex.getMessage());
			return false;
		}
	}

	@Override
	public boolean them(SACH s) throws Exception {
		// TODO Auto-generated method stub
		try {
			boolean find = false ; 
			for(SACH i : this.listbook) {
				if(i.getID() == s.getID()) {
					find = true ; 
					break ;
				}
			}
			if(find) {
				System.out.println("Da ton tai ID cua sach !");
				return false ;
			}else {
				this.listbook.add(s);
				System.out.println("Da them thanh cong");
				return true;
			}
		}catch(Exception ex) {
			ex.getStackTrace();
			return false ;
		}
	}

	@Override
	public boolean sua(SACH s) throws Exception {
		// TODO Auto-generated method stub
		try {
			for(SACH i : this.listbook) {
				if(i.getID() == s.getID()) {
					this.listbook.remove(i);
					this.listbook.add(s);
					System.out.println("Da sua thanh cong");
					break ; 
				}
			}
			return true ;
		}catch(Exception ex) {
			ex.getStackTrace();
			return false ; 
		}
	}

	@Override
	public boolean xoa(SACH s) throws Exception {
		// TODO Auto-generated method stub
		try {
			for(SACH i : this.listbook) {
				if(i.getID() == s.getID()) {	
					this.listbook.remove(i);
					System.out.println("Da xoa thanh cong");
					return true ;
				}
			}
			System.out.println("Da xoa that bai");
			return false ; 
		}catch(Exception ex) {
			System.out.println("Da xoa that bai");
			ex.getStackTrace(); 
			return false ;
		}
	}

}
