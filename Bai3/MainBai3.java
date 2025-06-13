package baitap;

public class MainBai3 {
	public static void main(String[] args) {
		NhanVienSanXuat nvsx = new NhanVienSanXuat();
		NhanVienVanPhong nvvp = new NhanVienVanPhong();
		nvsx.nhap();
		nvsx.tinhLuong();
		nvsx.xuat();
		System.out.println();
		nvvp.nhap();
		nvvp.tinhLuong();
		nvvp.xuat();
	}
}
