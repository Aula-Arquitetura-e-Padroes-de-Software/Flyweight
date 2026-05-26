public class Airplane {
    private String prefix;
    private AirplaneType type;

    public Airplane(String prefix, AirplaneType type) {
        this.prefix = prefix;
        this.type = type;
    }

    public String getAirplane(){
        return "Airplane{" +
                "prefix='" + prefix + "\n"+
                " type='" + type.getModel() + "\n" +
                " manufacturer='" + type.getManufacturer() +"\n" +
                "}";
    }
}
