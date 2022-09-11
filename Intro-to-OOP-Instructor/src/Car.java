public class Car {
    String type;
    String model;
    int speedLimit;
 public Car(String type, String model,int speedLimit){
  this.type=type;
  this.model=model;
  this.speedLimit=speedLimit;
 }
 public Car(String type, String model){
     this.type=type;
     this.model=model;
 }
 public Car(){
 }

    public void setType(String newType){
        type=newType;
    }
    public void setModel(String newModel){
        model=newModel;
    }
    public void setSpeedLimit(int newSpeed){
        speedLimit=newSpeed;
    }
}
