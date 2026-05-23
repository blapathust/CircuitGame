package circuit.objects.components;

class Terminal {

        int voltage;
        Terminal connection;

        Terminal() {
            this.voltage = 0;
        }

        protected void connect(Terminal terminal) {
            this.connection = terminal;
        }

        protected void setVoltage(int voltage) {
            this.voltage = voltage;
        }

        protected int getVoltage() {
            return voltage;
        }

        protected boolean isConnected() {
            return connection != null;
        }
    }