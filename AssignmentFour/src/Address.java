public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String pincode;


    public Address(String streetAddress,String city,String state,String country, String pincode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getAddress(){
        return "( " + streetAddress + " | " + city + " | " + state + " | " + country + " | " + pincode + " )";
    }
}
