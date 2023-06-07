
package managehotel;

public class RoomA extends Room{

    public RoomA() {
        super("A", 500);
    } 
    @Override
    public String toString() {
        return "RoomA{"+"Loại="+this.loai +"/"+"Giá="+this.gia+ '}';
    } 
    
}
