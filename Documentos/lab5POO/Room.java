public class Room implements Reservable{
    private int id;
    private int capacity;
    private Floor floor;
    private RoomType type;
    private boolean isReserved;

    public Room(int id, int capacity, Floor floor, RoomType type, boolean isReserved){
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
        this.type = type;
        this.isReserved = isReserved;
    }

    @Override
    public boolean BOOK(){
        if(!isReserved){
            isReserved = true;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean CancelBooking(){
        if(isReserved){
            isReserved = false;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isBooked(){
        return isReserved;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
