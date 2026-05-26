import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @Test
    void testAirplaneReturn(){
        Airport airport = new Airport();
        airport.addAirplane("PP-VRU", "737-8", "Boeing");
        airport.addAirplane("PP-VRT", "A320-200", "Airbus");
        airport.addAirplane("PP-ALU", "A318-100", "Airbus");
        List<String> output = Arrays.asList(
                "Airplane{Prefix=PP-VRU, Type=737-8, Manufacturer=Boeing}",
                "Airplane{Prefix=PP-VRT, Type=A320-200, Manufacturer=Airbus}",
                "Airplane{Prefix=PP-ALU, Type=A318-100, Manufacturer=Airbus}"
        );
        assertEquals(output,airport.getAirplanes());
    }

    @Test
    void testAirplaneTypesCount(){
        Airport airport = new Airport();
        airport.addAirplane("PP-VRU", "737-8", "Boeing");
        airport.addAirplane("PP-VRT", "A320-200", "Airbus");
        airport.addAirplane("PP-ALU", "A318-100", "Airbus");

        assertEquals(3, AirplaneTypeFactory.getAirplaneTypesCount());
    }

}
