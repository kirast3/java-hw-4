class ControlPanelTest {

    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();


    public void control() {
        //altimeter = new Altimeter();
        //airGauge = new AirGauge();
        System.out.println(altimeter.toString() + " " + airGauge.toString());
    }

}

class Altimeter {

    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
