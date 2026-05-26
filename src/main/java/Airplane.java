public class Airplane {
    private String prefix;
    private AirplaneType type;

    public Airplane(String prefix, AirplaneType type) {
        this.prefix = prefix;
        this.type = type;
    }

    public String getAirplane(){
        return "Airplane{" +
                "Prefix=" + prefix + ", "+
                "Type=" + type.getModel() + ", " +
                "Manufacturer=" + type.getManufacturer() +
                "}";
    }
}
