package circuit.objects.power_source;

import circuit.objects.components.interfaces.TerminalTag;
import circuit.objects.components.other.Terminal;

public class AC implements TerminalTag {

    float voltage;
    float maxVoltage;
    float frequency;
    float phase;

    Terminal terminal1;
    Terminal terminal2;

    AC(float maxVoltage, float frequency) {
        this.voltage = voltage;
        this.terminal1 = new Terminal(this);
        this.terminal2 = new Terminal(this);

        terminal1.setInternallyConnectedTerminal(terminal2);
        terminal2.setInternallyConnectedTerminal(terminal1);
    }

    public void updateVoltage(float deltaTime) {

        this.voltage = (float) maxVoltage * Math.sin(2 * Math.PI * frequency * deltaTime + phase);
    }

    public float getMaxVoltage() {
        return maxVoltage;
    }

    public void setMaxVoltage(float maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}
