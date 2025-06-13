package baitap;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
	private double luongCanBan;
	private int soSanPham;
	
	@Override
	void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap luong co ban: ");
		luongCanBan = Double.parseDouble(scanner.nextLine());
		
		System.out.println("nhap so san pham: ");
		soSanPham = Integer.parseInt(scanner.nextLine());
	}
	
	void tinhLuong() {
		this.luong = luongCanBan + soSanPham*5000;
	}
	
	@Override
	void xuat() {
		super.xuat();
		System.out.println("luong can ban: "+ luongCanBan);
		System.out.println("so san pham: "+ soSanPham);
	}
}
