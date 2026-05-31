package circuit.objects.components.switches;

import circuit.objects.components.Terminal;
import circuit.objects.components.interfaces.Switch;

public class ThreeWaySwitch implements Switch {

    public final Terminal terminal1;
    public final Terminal terminal2;
    public final Terminal terminal3;

    public ThreeWaySwitch() {
        this.terminal1 = new Terminal();
        this.terminal2 = new Terminal();
        this.terminal3 = new Terminal();

        terminal1.connect(terminal2);
        terminal2.connect(terminal1);
        terminal3.connect(null);
    }

    @Override
    public boolean turnSwitch() {

        if (terminal2.isConnected()) {
            terminal2.connect(null);
            terminal3.connect(terminal1);
            terminal1.connect(terminal3);
            return false;
        }
        terminal3.connect(null);
        terminal1.connect(terminal2);
        terminal2.connect(terminal1);
        
        return true;
    }
}
