package baitap;

import java.util.Scanner;

public class PhanSo {
	private double tuSo;
	private double mauSo;
	
	public PhanSo() {
		// TODO Auto-generated constructor stub
		tuSo = 0;
		mauSo = 1;
	}
	
	public double getTuSo() {
		return tuSo;
	}

	public void setTuSo(double tuSo) {
		this.tuSo = tuSo;
	}

	public double getMauSo() {
		return mauSo;
	}

	public void setMauSo(double mauSo) {
		this.mauSo = mauSo;
	}

	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao tu so: ");
		tuSo = Integer.parseInt(scanner.nextLine());
		do {
			System.out.println("Nhap vao mau so: ");
			mauSo = Integer.parseInt(scanner.nextLine());
			if (mauSo == 0) {
				System.out.println("mau so khong the la 0");
			}
		} while (mauSo == 0);
	}
	
	void xuat() {
		System.out.println("Phan số: " + tuSo+"/"+mauSo);
	}
	
	public double cong(PhanSo ps2) {
		//ketQua.tuSo = this.tuSo*ps2.mauSo + this.mauSo*ps2.tuSo;
		//ketQua.mauSo = this.mauSo*ps2.mauSo;
		double ketQua = (this.tuSo/this.mauSo) + (ps2.tuSo/ps2.mauSo);
		return ketQua;
	}
	
	public double tru(PhanSo ps2) {
		//ketQua.tuSo = this.tuSo*ps2.mauSo - this.mauSo*ps2.tuSo;
		//ketQua.mauSo = this.mauSo*ps2.mauSo;
		double ketQua = (this.tuSo/this.mauSo) - (ps2.tuSo/ps2.mauSo);
		return ketQua;
	}
	
	public double nhan(PhanSo ps2) {
		double ketQua = (this.tuSo/this.mauSo) * (ps2.tuSo/ps2.mauSo);
		return ketQua;
	}
	
	public double chia(PhanSo ps2) {
		double ketQua = (this.tuSo/this.mauSo) / (ps2.tuSo/ps2.mauSo);
		return ketQua;
	}
}
