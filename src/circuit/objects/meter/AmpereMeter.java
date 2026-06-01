package circuit.objects.meter;

import circuit.objects.components.impedant.Component;
import circuit.objects.components.interfaces.TerminalTag;
import circuit.objects.components.other.Terminal;
import circuit.objects.components.other.Connection;
import java.util.ArrayList;

public class AmpereMeter implements TerminalTag {

    private Terminal terminal1;
    private Terminal terminal2;
    private float current;

    public AmpereMeter() {
        this.terminal1 = new Terminal(this);
        this.terminal2 = new Terminal(this);

        terminal1.setInternallyConnectedTerminal(terminal2);
    }

    public void calculateCurrent(float voltage1, float voltage2) {

    }

    public float getCurrent() {
        return current;
    }
}
