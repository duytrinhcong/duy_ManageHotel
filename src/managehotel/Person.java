
package managehotel;
public class Person {
    private String ten;
    private int tuoi;
    private String soCCCD;
    private Room room;
    private int thuePhongSo;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getThuePhongSo() {
        return thuePhongSo;
    }

    public void setThuePhongSo(int thuePhongSo) {
        this.thuePhongSo = thuePhongSo;
    }

    public Person(String ten, int tuoi, String soCCCD, Room room, int thuePhongSo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soCCCD = soCCCD;
        this.room = room;
        this.thuePhongSo = thuePhongSo;
    }
   public Person(){}
    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", tuoi=" + tuoi + ", soCCCD=" + soCCCD + '}';
    }
    
}
