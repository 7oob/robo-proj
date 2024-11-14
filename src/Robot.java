public class Robot {

    int batteryLevel = 100;
    int speed = 0;
    String name = "Roomba";
    String colour = "black";
    int weight = 5;


    public void move(){
        speed = 8;
        System.out.println(name + " is moving at speed " + speed + " mph.");
    }

    public void stop(){
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    public void checkBatteryLevel(){
        System.out.println(name + "'s current battery level is " + batteryLevel + "%");
    }

    public void displayInfo(){
        System.out.println(name + "'s colour is " + colour + " and it's weight is " + weight + " lbs.");
    }
}
