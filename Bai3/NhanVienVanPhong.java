package baitap;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
	private int soNgayLamViec;
	
	@Override
	void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so ngay lam viec: ");
		soNgayLamViec = Integer.parseInt(scanner.nextLine());
	}
	
	void tinhLuong() {
		this.luong = soNgayLamViec * 100000;
	}
	
	@Override
	void xuat() {
		super.xuat();
		System.out.println("So ngay lam viec: "+ soNgayLamViec);
	}
}
