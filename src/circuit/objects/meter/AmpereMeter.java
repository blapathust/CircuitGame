package circuit.objects.meter;

import circuit.objects.components.impedant.Component;
import circuit.objects.components.interfaces.TerminalTag;
import circuit.objects.components.other.Terminal;
import circuit.objects.components.other.Connection;

public class AmpereMeter implements TerminalTag {

    private Terminal terminal1;
    private Terminal terminal2;
    private float current;

    public AmpereMeter() {
        this.terminal1 = new Terminal(this);
        this.terminal2 = new Terminal(this);

        terminal1.setInternallyConnectedTerminal(terminal2);
        terminal2.setInternallyConnectedTerminal(terminal1);
    }

    public void calculateCurrent(float voltage1, float voltage2) {

        Connection connection = terminal1.getWire();

        TerminalTag prev = connection.getTerminal1() == terminal1 ? connection.getTerminal2().getParent()
                : connection.getTerminal1().getParent();
        this.current = prev.getCurrent();
    }

    public float getCurrent() {
        return current;
    }
}
