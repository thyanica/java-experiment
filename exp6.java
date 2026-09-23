interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }

    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Status: Ready for remote control");
    }
}

class exp6 {
    public static void main(String[] args) {

        Appliance appliance = new SmartTV();

        appliance.displayAppliance();

        SmartTV tv = (SmartTV) appliance;

        tv.turnOn();
        tv.turnOff();
    }
}