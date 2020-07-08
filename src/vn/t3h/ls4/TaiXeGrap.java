package vn.t3h.ls4;

import java.util.Scanner;

public class TaiXeGrap {

	public static void main(String[] args) {
		// Nhập vào số lượng tài xế
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hãy nhập số lượng tài xế: ");
		int tongTaiXe = Integer.parseInt(scanner.nextLine());

		// Khai báo mảng các tài xế
		GrapInterface[] mangTaiXe = new GrapInterface[tongTaiXe];
		for (int i = 0; i < tongTaiXe; i++) {
			// Người dùng nhập thông tin tài xế
			System.out.print("Tên tài xế " + (i + 1) + ": ");
			String ten = scanner.nextLine();
			System.out.print("Là tài xế (1-Grap Car; 2-Grap bike): ");
			int laTaixe = Integer.parseInt(scanner.nextLine());
			if (laTaixe == 1) {
				System.out.print("Nhập số giờ làm thêm: ");
				int gioLamThem = Integer.parseInt(scanner.nextLine());
				System.out.print("Loại giờ làm thêm (1-Cao điểm; 2-Thấp điểm): ");
				int loaiXe = Integer.parseInt(scanner.nextLine());
				mangTaiXe[i] = new GrapCar(ten, gioLamThem, loaiXe);
			} else {
				System.out.print("Số cuốc chạy: ");
				int gioLamViec = Integer.parseInt(scanner.nextLine());
				mangTaiXe[i] = new GrapBike(ten, gioLamViec);
			}
		}
		System.out.println("\nKết quả tính lương\n");
		// Tính lương và xem thông tin xe
		for (GrapInterface grap : mangTaiXe) {
			grap.tinhTien();
			grap.thongTinXe();
		}
	}
}
