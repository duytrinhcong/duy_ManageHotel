
package managehotel;

public class Room {
    protected String loai;
    protected double gia;

    public Room(String loai, double gia) {
        this.loai = loai;
        this.gia = gia;
    }
    public Room(){}
    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
