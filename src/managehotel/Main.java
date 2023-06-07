package managehotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        String luaChon = "";
        do {
            System.out.println("------Mời nhập lựa chọn của bạn------");
            System.out.println("1.Thêm một khách hàng đến thuê phòng.\n"
                    + "2.Xóa một khách hàng bằng CCCD.\n"
                    + "3.Thanh toán tiền thuê phòng bằng CCCD.\n"
                    + "4.Hiển thị thông tin.\n"
                    + "5.Thoát chương trình.");
            luaChon = sc.nextLine();
            switch (luaChon) {
                case "1": {
                    System.out.print("\tNhập tên khách hàng: ");
                    String name = sc.nextLine();
                    System.out.print("\tNhập tuổi khách hàng: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("\tNhập số CCCD: ");
                    String passport = sc.nextLine();
                    System.out.println("a.Thuê phòng A.\n"
                            + "b.Thuê phòng B.\n"
                            + "c.Thuê phòng C.");
                    String luaChon2 = sc.nextLine();
                    Room room;
                    if (luaChon2.equals("a")) {
                        room = new RoomA();
                    } else if (luaChon2.equals("b")) {
                        room = new RoomB();
                    } else if (luaChon2.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("\tNhập số giờ thuê: ");
                    int gioThue = Integer.parseInt(sc.nextLine());
                    Person person = new Person(name, age, passport, room, gioThue);
                    hotel.themKhachHang(person);
                    break;
                }
                case "2":{
                    System.out.print("\tNhập số CCCD cần xóa: ");
                    String soCCCD = sc.nextLine();
                    hotel.xoaKachHang(soCCCD);
                    break;
                }
                case "3":{
                    System.out.print("Nhập số CCCD khách hàng cần thanh toán: ");
                    String soCCCD = sc.nextLine();
                    System.out.println("Giá phòng: " + hotel.tinhTienPhong(soCCCD));
                   break;
                }
                case "4":{
                   hotel.xuatDanhSach();
                }
            }
        } while (!luaChon.equals("5"));
    }
}
