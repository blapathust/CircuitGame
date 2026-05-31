package circuit.objects.meter;

import circuit.objects.components.impedant.Component;
import circuit.objects.components.interfaces.TerminalTag;
import circuit.objects.components.other.Terminal;
import circuit.objects.components.other.Connection;

public class VoltageMeter implements TerminalTag {

    private float voltage;
    private Terminal terminal1;
    private Terminal terminal2;

    public VoltageMeter() {
        this.terminal1 = new Terminal(this);
        this.terminal2 = new Terminal(this);
    }

    public void calculateVoltage() {

        Connection in = terminal1.getWire();
        TerminalTag prev = in.getTerminal1() == terminal1 ? in.getTerminal2().getParent()
                : in.getTerminal1().getParent();

        Connection out = terminal2.getWire();
        TerminalTag next = out.getTerminal1() == terminal2 ? out.getTerminal2().getParent()
                : out.getTerminal1().getParent();

        if (prev == null || next == null)
            return;

        if (prev instanceof Component && next instanceof Component)
            this.voltage = ((Component) prev).getVoltage() - ((Component) next).getVoltage();
    }

    public float getVoltage() {
        return voltage;
    }
}
