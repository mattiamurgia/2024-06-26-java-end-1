public class Room {

    private int numberRoom;
    private String roomType;
    private boolean available;

    public Room(int numberRoom, String roomType) {
        setNumberRoom(numberRoom);
        setRoomType(roomType);
        setAvailable(true);
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Camera: " + getNumberRoom() + " Tipo: " + getRoomType() + " Libera: " + isAvailable();
    }

}
