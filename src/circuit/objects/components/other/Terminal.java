package circuit.objects.components.other;

import circuit.objects.components.interfaces.TerminalTag;

public class Terminal {

    private TerminalTag parent;
    private Terminal connection;
    private Connection wire;

    public Terminal(TerminalTag parent) {

        this.parent = parent;
    }

    public void setInternallyConnectedTerminal(Terminal terminal) {
        this.connection = terminal;
    }

    public void setExternallyConnectedWire(Connection wire) {
        this.wire = wire;
    }

    public boolean isInternallyConnected() {
        return connection != null;
    }

    public TerminalTag getParent() {
        return parent;
    }

    public Terminal getConnection() {
        return connection;
    }

    public Connection getWire() {
        return wire;
    }
}