package circuit.objects.components;

public class LED {

    private boolean isOn;
    public float forwardVoltageMin;
    public float forwardVoltageMax;
    public float backwardVoltageMax;

    private final Terminal terminal1;
    private final Terminal terminal2;

    public LED(float forwardVoltageMin, float forwardVoltageMax, float backwardVoltageMax) {
        this.isOn = false;
        this.forwardVoltageMin = forwardVoltageMin;
        this.forwardVoltageMax = forwardVoltageMax;
        this.backwardVoltageMax = backwardVoltageMax;
        this.terminal1 = new Terminal();
        this.terminal2 = new Terminal();

        terminal1.connect(terminal2);
    }

    public boolean isOn() {
        return isOn;
    }
    
    public void update() {
      
        float voltage = terminal1.getVoltage() - terminal2.getVoltage();

        if (voltage > forwardVoltageMin && voltage <= forwardVoltageMax) {
            isOn = true;
            return;
        }

        if (voltage > forwardVoltageMax || voltage < backwardVoltageMax * -1) {
            broken();
            isOn = false;
            return;
        }

        isOn = false;
    }

    public void broken(){};
}
