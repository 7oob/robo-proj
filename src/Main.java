public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot();

        myRobot.move();
        myRobot.checkBatteryLevel();
        myRobot.stop();
        myRobot.chargeBattery();
        myRobot.displayInfo();
    }
}