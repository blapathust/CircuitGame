import circuit.objects.components.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Resistor resistor = new Resistor(100);
        System.out.println("Resistor resistance: " + resistor.getResistance() + " ohms");

        Capacitor capacitor = new Capacitor(100, 1000);
        System.out.println("Capacitor capacitance: " + capacitor.getCapacitance() + " F");

        Inductor inductor = new Inductor(100, 1000);
        System.out.println("Inductor inductance: " + inductor.getInductance() + " H");

        TwoWaySwitch twoWaySwitch = new TwoWaySwitch();
        ThreeWaySwitch threeWaySwitch = new ThreeWaySwitch();

        LED led = new LED(1.8f, 3.3f, 5.0f);
        System.out.println("LED is on: " + led.isOn());
        
        twoWaySwitch.turnSwitch();
        threeWaySwitch.turnSwitch();
    }
}
