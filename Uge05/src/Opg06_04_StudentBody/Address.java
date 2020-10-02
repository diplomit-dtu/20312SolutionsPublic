package Opg06_04_StudentBody;

//********************************************************************
// Address.java Author: Lewis/Loftus
//
// Represents a street address.
//********************************************************************
public class Address
{
    private String streetAddress, city, state;
    private long zipCode;
    //-----------------------------------------------------------------
// Constructor: Sets up this address with the specified data.
//-----------------------------------------------------------------
    public Address (String street, String town, String st, long zip)
    {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    public long getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    //-----------------------------------------------------------------
// Returns a description of this Address object.
//-----------------------------------------------------------------
    public String toString()
    {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;
        return result;
    }
}
