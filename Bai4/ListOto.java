package baitap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListOto {
	List<Oto> danhSachOto = new ArrayList<>();

	void nhapDanhSachOto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so luong o to: ");
		int n = Integer.parseInt(scanner.nextLine());
	
		for(int i = 0; i<n; i++) {
			Oto oto = new Oto();
			oto.nhap();
			danhSachOto.add(oto);
		}
	}
	
	void xuatDanhSachOto() {
		for (Oto item: danhSachOto) {
			item.xuat();
		}
	}
	
	void soSanhVatToc() {
		Map<Double, List<Oto>> danhSachOtoCungVanToc = new HashMap<>();
		// gom nhóm các xe có cùng vận tốc 
		for(Oto oto1 : danhSachOto) {
			double vanToc = oto1.getVanTocToiDa();
			danhSachOtoCungVanToc.putIfAbsent(vanToc, new ArrayList<>()); // nếu chưa có key: vantoc thì thêm key và value: danh sách rỗng để lưu các ô tô
			danhSachOtoCungVanToc.get(vanToc).add(oto1); // Thêm ô tô vào danh sách theo key: vanToc 
		}
		int temp =0;
		//duyệt toàn bộ các phần tử (các cặp key–value) trong một map 
		for (Map.Entry<Double, List<Oto>> entry : danhSachOtoCungVanToc.entrySet()) {
            List<Oto> danhSachOtoCungVanToc1 = entry.getValue(); // lấy value ở đây đang là danh sách oto co cùng vận tốc
            if (danhSachOtoCungVanToc1.size() > 1) {
                temp = 1; // neu temp thay doi nghia la co cac o to cung van toc
                System.out.println("Nhóm ô tô có vận tốc " + entry.getKey());
                for (Oto oto2 : danhSachOtoCungVanToc1) {
                    oto2.xuat();
                    System.out.println();
                }
            }
        }
		if(temp == 0) {
			System.out.println("khong co o to cung van toc");
		}
	}
}
