package circuit.objects.components;

import java.util.ArrayList;

class Strip{
    
    final public int length;

    ArrayList<Terminal> terminals;

    Strip(int length) {
        this.length = length;
        this.terminals = new ArrayList<>(length);
    }
    
    protected void connect(Terminal terminal, int position) {
        if (terminals.size() < length && terminals.get(position) == null) {
            terminals.set(position, terminal);

            
        }
    }

    protected void disconnect(Terminal terminal, int position) {
        if (terminals.size() > position && terminals.get(position) == terminal) {
            terminals.set(position, null);

            terminal.setVoltage(0);
        }
    }

    protected void updateVoltage(int voltage, int position) {
        if (terminals.size() > position && terminals.get(position) != null) {
            terminals.get(position).setVoltage(voltage);
        }
    }
}

public class Breadboard {

    
}
