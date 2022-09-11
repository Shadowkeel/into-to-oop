public class House {
    int height;
    int width;
    int rooms;
    int bathroom;

    public House(int height,int width, int rooms,int bathroom){
        System.out.println("constructor with full arguments is called");
        this.height=height;
        this.width=width;
        this.rooms=rooms;
        this.bathroom=bathroom;
    }
    public House(){
        System.out.println("constructor with zero arguments is called");
    }
    public void setHeight(int height){
        this.height=height;
    }
public void setWidth(int width){
        this.width=width;
}
public int area(){
        return this.height*this.width;
}
    public void setRooms(int rooms){
        this.rooms=rooms;
    }
    public void setBathroom(int bathroom){
        this.bathroom=bathroom;
    }
}
