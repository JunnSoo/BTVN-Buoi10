package baitap;

public class MainBai2 {
	public static void main(String[] args) {
		VanDongVien vdv1 = new VanDongVien();
		VanDongVien vdv2 = new VanDongVien();
		vdv1.nhap();
		vdv2.nhap();
		vdv1.soSanhHaiVanDongVien(vdv2);
	}
}
