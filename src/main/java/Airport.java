import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Airplane> airplanes = new ArrayList<>();


    public void addAirplane(String prefix, String model, String manufacturer){
        AirplaneType type = AirplaneTypeFactory.getAirplaneType(model, manufacturer);
        Airplane airplane = new Airplane(prefix, type);
        airplanes.add(airplane);
    }

    public List<String> getAirplanes(){
        List<String> output = new ArrayList<>();
        for (Airplane airplane : airplanes) {
            output.add(airplane.getAirplane());
        }
        return output;
    }
}
