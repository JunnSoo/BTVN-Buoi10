package baitap;

public class Main {
	public static void main(String[] args) {
		PhanSo pso1 = new PhanSo();
		PhanSo pso2 = new PhanSo();
		
		pso1.nhap();
		pso2.nhap();
		pso1.xuat();
		pso2.xuat();
		System.out.println("tong 2 phan so: "+ pso1.cong(pso2));
		System.out.println("hieu 2 phan so: "+ pso1.tru(pso2));
		System.out.println("tich 2 phan so: "+ pso1.nhan(pso2));
		System.out.println("thuong 2 phan so: "+ pso1.chia(pso2));
	}
}
