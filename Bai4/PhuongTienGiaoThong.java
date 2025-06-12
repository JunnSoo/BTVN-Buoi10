package baitap;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	protected String hangSanXuat;
	protected String tenPhuongTien;
	protected String namSanXuat;
	protected double vanTocToiDa;
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getTenPhuongTien() {
		return tenPhuongTien;
	}
	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}
	public String getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public double getVanTocToiDa() {
		return vanTocToiDa;
	}
	public void setVanTocToiDa(double vanTocToiDa) {
		this.vanTocToiDa = vanTocToiDa;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao hang san xuat: ");
		hangSanXuat = scanner.nextLine();
		
		System.out.println("nhap vao ten phuong tien: ");
		tenPhuongTien = scanner.nextLine();
		
		System.out.println("nhap vao nam san xuat: ");
		namSanXuat = scanner.nextLine();
		
		System.out.println("nhap vao van toc toi da: ");
		vanTocToiDa = Double.parseDouble(scanner.nextLine());
	}
	
	void xuat() {
		System.out.println("hang san xuat: "+hangSanXuat);
		System.out.println("ten phuong tien: "+tenPhuongTien);
		System.out.println("hang san xuat: "+hangSanXuat);
		System.out.println("hang san xuat: "+hangSanXuat);
	}
}
