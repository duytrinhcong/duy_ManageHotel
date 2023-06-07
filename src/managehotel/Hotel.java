package managehotel;

import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Hotel {

    ArrayList<Person> list;

    public Hotel() {
        list = new ArrayList<>();
    }

    public void themKhachHang(Person person) {
        this.list.add(person);
    }

    public void xoaKachHang(String CCCD) {

//        Iterator<Person> ite = list.iterator();
//                                              // hasNext : Kiem tra xem co phan tu nao trong list khong
//        while(ite.hasNext()){
//                                             // next() : lay tung phan tu trong vong lap
//          Person person = ite.next();
//           if(person.getSoCCCD().equals(CCCD)){
//               ite.remove();
//           }
//        }
        Person person = list.stream().filter(p -> p.getSoCCCD().equals(CCCD)).findFirst().orElse(null);
        if (person == null) {
            System.out.println("Số CCCD không hợp lệ");
        } else {
            list.remove(person);
        }
    }

    public void xuatDanhSach() {
        Optional<List<Person>> optional = Optional.of(list);
        if (optional.isPresent() && !optional.get().isEmpty()) {
            list.forEach(p -> {
                System.out.println(p.toString());
            });
        } else {
            System.out.println("Danh sách khách hàng trống.");
        }
    }

    public double tinhTienPhong(String soCCCD) {
        Person person = this.list.stream().filter(p -> p.getSoCCCD().equals(soCCCD)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        } else {
            return person.getRoom().getGia() * person.getThuePhongSo();
        }
    }
}
