import java.util.HashMap;
import java.util.Map;

public class AirplaneTypeFactory {
    private static Map<String, AirplaneType> airplaneTypes = new HashMap<>();

    public static AirplaneType getAirplaneType(String model, String manufacturer){
        AirplaneType airplaneType = airplaneTypes.get(model);
        if(airplaneType == null){
            airplaneType = new AirplaneType(model, manufacturer);
            airplaneTypes.put(model, airplaneType);
        }
        return airplaneType;
    }

    public static int getAirplaneTypesCount(){
        return airplaneTypes.size();
    }
}
