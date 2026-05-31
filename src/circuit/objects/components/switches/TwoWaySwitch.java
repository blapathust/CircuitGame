package circuit.objects.components.switches;

import circuit.objects.components.Terminal;
import circuit.objects.components.interfaces.Switch;

public class TwoWaySwitch implements Switch {

    public final Terminal terminal1;
    public final Terminal terminal2;

    public TwoWaySwitch() {
        this.terminal1 = new Terminal();
        this.terminal2 = new Terminal();

        terminal1.setInternallyConnectedTerminal(terminal2);
        terminal2.setInternallyConnectedTerminal(terminal1);
    }

    @Override
    public boolean turnSwitch() {

        if (terminal1.isConnected()) {
            terminal1.setInternallyConnectedTerminal(null);
            terminal2.setInternallyConnectedTerminal(null);
            return true;
        } else {
            terminal1.setInternallyConnectedTerminal(terminal2);
            terminal2.setInternallyConnectedTerminal(terminal1);
            return false;
        }
    }
}
