package circuit.objects.components;

public class Inductor extends Component {

    float inductance;

    public Inductor(float resistance, float inductance) {
        super(resistance);
        this.inductance = inductance;
    }

    public float getInductance() {
        return inductance;
    }
}
