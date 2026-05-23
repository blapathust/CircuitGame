package circuit.objects.components;

public class Capacitor extends Component {
    
    float capacitance;

    public Capacitor(float resistance, float capacitance) {
        super(resistance);
        this.capacitance = capacitance;
    }

    public float getCapacitance() {
        return capacitance;
    }
}
