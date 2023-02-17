package Tuan1;

public class HinhChuNhat {
	public double chieudai;
	public doublie chieurong;
	//Dong goi chieu dai
	public void setchieudai(double cd) throws Exception {
		if (cd>0) {
			this.chieudai=cd
		}  else throws new Exception("chieu dai lown hon 0");
		
	}
	public double getchieudai( ) {
		reuturn this.chieudai;
	}
	//dong goi va rang buoc chieu rong
	public void setchieurong(double cr) throws Exception {
		if(cr>0)
			this.chieurong=cr
		} else throw new Exception("chieu rong > 0");
    }
	public double getchieurong( ) {
		return this.chieurong;
	}
	//tao constructor (ham tao doi tuong
	public hinhchunhat() {
		
	}
	public hinhchunhat(double cd, double cr) {
		this.chieudai=cd;
		this.chieurong=cr;
	}
	//Tinh chu vi
	public double getchuvi( ) {
		return (getchieudai()+getchieurong())*2
	}
	//tinh dien tich
	public double getdientich() {
		return getchieudai()*getchieurong();
	}

	 
	
	
	
	public static void main(String[] args) throws Exception {
		HinhChuNhat h1= new HinhChuNhat();
	
		h1.setChieuDai(10);
		h1.setChieuRong(5);
	
		System.out.println("chieu dai ban da nhap"+h1.chieuDai);
		System.out.println("chieu rong ban da nhap"+h1.chieuRong);
		
	
		//chuvi
		System.out.println("Chu vi hinh chu nhat la"+h1.getChuVi());
	
		//dien tich
		System.out.println("Dien tich hinh chu nhat la"+h1.getDienTich());
		
		

	}

}

}
