package baitap;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong{
	private int soChoNgoi;
	private String kieuDongCo;
	@Override
	void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so cho ngoi: ");
		soChoNgoi = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap vao kieu dong co: ");
		kieuDongCo = scanner.nextLine();
	}
	
	@Override
	void xuat() {
		super.xuat();
		System.out.println("so cho ngoi: "+ soChoNgoi);
		System.out.println("Kieu dong co: "+ kieuDongCo);
	}
}
