package baitap;

import java.util.Scanner;

public class NhanVien {
	protected String hoTen;
	protected String ngaySinh;
	protected double luong;
	
	public NhanVien() {}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao ho ten: ");
		hoTen = scanner.nextLine();
		
		System.out.println("nhap vao ngay sinh: ");
		ngaySinh = scanner.nextLine();
	}
	
	void xuat() {
		System.out.println("ho ten: " + hoTen);
		System.out.println("ngay sinh: " + ngaySinh);
		System.out.println("Luong: "+ luong);
	}
}
