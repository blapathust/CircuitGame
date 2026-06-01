package circuit.objects.components.impedant;

import circuit.objects.components.other.Terminal;
import circuit.objects.components.interfaces.BasicImpedantComponentOperations;

public abstract class Component implements BasicImpedantComponentOperations {

    private final float resistance;
    private float voltage;
    private float current;

    public Terminal terminalOne;
    public Terminal terminalTwo;

    Component(float resistance) {
        this.resistance = resistance;

        terminalOne = new Terminal(this);
        terminalTwo = new Terminal(this);

        terminalOne.setInternallyConnectedTerminal(terminalTwo);
        terminalTwo.setInternallyConnectedTerminal(terminalOne);
    }

    @Override
    public float getResistance() {
        return resistance;
    };

    @Override
    public float getVoltage() {
        return voltage;
    };

    @Override
    public float getCurrent() {
        return current;
    };

    @Override
    public void setVoltage(float voltage) {
        this.voltage = voltage;
        updateCurrent();
    }

    protected void updateCurrent() {
        this.current = voltage / resistance;
    }
}
