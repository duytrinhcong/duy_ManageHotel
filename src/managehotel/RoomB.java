package managehotel;

public class RoomB extends Room {

    public RoomB() {
        super("B", 300);
    }
    @Override
    public String toString() {
        return "RoomB{" + "Loại=" + this.loai + "/" + "Giá=" + this.gia + '}';
    }

}
