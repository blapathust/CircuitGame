package circuit.objects.components.other;

import circuit.objects.components.other.Terminal;
import circuit.objects.components.interfaces.TerminalTag;

public class LED implements TerminalTag {

    private boolean isOn;
    private boolean isBroken;
    public float forwardVoltageMin;
    public float forwardVoltageMax;
    public float backwardVoltageMax;

    public final Terminal terminal1;
    public final Terminal terminal2;

    public LED(float forwardVoltageMin, float forwardVoltageMax, float backwardVoltageMax) {
        this.isOn = false;
        this.forwardVoltageMin = forwardVoltageMin;
        this.forwardVoltageMax = forwardVoltageMax;
        this.backwardVoltageMax = backwardVoltageMax;
        this.terminal1 = new Terminal(this);
        this.terminal2 = new Terminal(this);
        this.isBroken = false;

        terminal1.setInternallyConnectedTerminal(terminal2);
    }

    public boolean isOn() {
        return isOn;
    }

    public void update() {

        if (isBroken) {
            // TODO: implement
            return;
        }

    }

    public void broken() {
        isOn = false;
        isBroken = true;

        update();
    };
}
