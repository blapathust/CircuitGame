package circuit.objects.components.other;

public class Connection {

    Terminal terminal1;
    Terminal terminal2;

    public Connection(Terminal terminal1, Terminal terminal2) {
        this.terminal1 = terminal1;
        this.terminal2 = terminal2;

        terminal1.setExternallyConnectedWire(this);
        terminal2.setExternallyConnectedWire(this);
    }

    public void disconnect() {

        terminal1.setExternallyConnectedWire(null);
        terminal2.setExternallyConnectedWire(null);

        terminal1 = null;
        terminal2 = null;
    }

    public Terminal getTerminal1() {
        return terminal1;
    }

    public Terminal getTerminal2() {
        return terminal2;
    }
}
