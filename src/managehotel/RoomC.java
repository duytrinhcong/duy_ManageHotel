
package managehotel;

public class RoomC extends Room{
    
    public RoomC() {
        super("C", 100);
    }
      @Override
    public String toString() {
        return "RoomC{"+"Loại="+this.loai +"/"+"Giá="+this.gia+ '}';
    } 
}
