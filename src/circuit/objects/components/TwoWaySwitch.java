package circuit.objects.components;

import circuit.objects.components.interfaces.Switch;

public class TwoWaySwitch implements Switch {

    public final Terminal terminal1;
    public final Terminal terminal2;

    public TwoWaySwitch() {
        this.terminal1 = new Terminal();
        this.terminal2 = new Terminal();

        terminal1.connect(terminal2);
        terminal2.connect(terminal1);
    }

    @Override
    public boolean turnSwitch() {

        if (terminal1.isConnected()) {
            terminal1.connect(null);
            terminal2.connect(null);
            return true;
        } else {
            terminal1.connect(terminal2);
            terminal2.connect(terminal1);
            return false;
        }
    }
}
