package model;

public enum BusType {
    BYD_K9("BYD_K9"),
    Mercedes_Benz_Citaro("Mercedes_Benz_Citaro"),
    Volvo_B7RLE("Volvo_B7RLE"),
    Linkker_LM312("Linkker_LM312");

    private String value;

    private BusType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
