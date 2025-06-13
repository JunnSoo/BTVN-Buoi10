package baitap;

import java.util.Scanner;

public class VanDongVien {
	private String hoTen;
	private int tuoi;
	private String monThiDau;
	private double canNang;
	private double chieuCao;
	
	public VanDongVien() {}
	public VanDongVien(String hoTen, int tuoi, String monThiDau, double camNang, double chieuCao) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.monThiDau = monThiDau;
		this.canNang = camNang;
		this.chieuCao = chieuCao;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getMonThiDau() {
		return monThiDau;
	}
	public void setMonThiDau(String monThiDau) {
		this.monThiDau = monThiDau;
	}
	public double getCanNang() {
		return canNang;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao ho ten: ");
		hoTen = scanner.nextLine();
		
		System.out.println("nhap vao tuoi: ");
		tuoi = Integer.parseInt(scanner.nextLine());
		
		System.out.println("nhap vao mon thi dau: ");
		monThiDau = scanner.nextLine();
		
		System.out.println("nhap vao can nang: ");
		canNang = Double.parseDouble(scanner.nextLine());
		
		System.out.println("nhap vao chieu cao: ");
		chieuCao = Double.parseDouble(scanner.nextLine());
	}
	
	void xuat() {
		System.out.println("ho ten: " + hoTen);
		System.out.println("tuoi: " + tuoi);
		System.out.println("mon thi dau: " +  monThiDau);
		System.out.println("can nang: " + canNang);
		System.out.println("chieu cao: " + chieuCao);
	}
	
	void soSanhHaiVanDongVien(VanDongVien vdv2) {
		if(this.chieuCao > vdv2.chieuCao) {
			System.out.println("van dong vien: " + this.hoTen+ " lon hon " + vdv2.hoTen);
		}else if(this.chieuCao == vdv2.chieuCao) {
			if(this.canNang > vdv2.canNang) {
				System.out.println("van dong vien: " + this.hoTen+ " lon hon " + vdv2.hoTen);
			}else if(this.canNang == vdv2.canNang) {
				System.out.println("van dong vien: " + this.hoTen+ " bang nhau " + vdv2.hoTen);
			}else {
				System.out.println("van dong vien: " + this.hoTen+ " be hon " + vdv2.hoTen);
			}
		}else {
			System.out.println("van dong vien: " + this.hoTen+ " be hon " + vdv2.hoTen);
		}
	}
}
