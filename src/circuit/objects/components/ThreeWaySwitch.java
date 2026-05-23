package circuit.objects.components;

import circuit.objects.components.interfaces.Switch;

public class ThreeWaySwitch implements Switch {

    Terminal terminal1;
    Terminal terminal2;
    Terminal terminal3;

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
