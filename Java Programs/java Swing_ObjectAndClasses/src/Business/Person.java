
package Business;

public class Person 
{
    String first_name,last_name,date_of_birth,street_address;
    Address work;
    Address local;
    Address sweet;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getStreet_address() {
        return street_address;
    }

    public Address getWork() {
        return work;
    }

    public Address getLocal() {
        return local;
    }

    public Address getSweet() {
        return sweet;
    }
    
    
    public Person()
    {
        work = new Address();
        local = new Address();
        sweet = new Address();
        first_name = "First name";
        last_name= "Last name";
        street_address = "Person has a Street Address which is : Street address";
        date_of_birth = "04/24/2000";
        
        work.setAddress_street_line_1("Work Address Steet 1");
        work.setAddress_street_line_2("Work Address Steet 2");
        work.setAddress_city("Work City");
        work.setAddress_state("Work state");
        work.setAddress_country("Work country");
        work.setAddress_zip_code("Work zip code");
        
        local.setAddress_street_line_1("Local Address Steet 1");
        local.setAddress_street_line_2("Local Address Steet 2");
        local.setAddress_city("Local City");
        local.setAddress_state("Local State");
        local.setAddress_country("Local Country");
        local.setAddress_zip_code("Local Zip Code");
        
        sweet.setAddress_street_line_1("Sweet Home Address Steet 1");
        sweet.setAddress_street_line_2("Sweet Home Address Steet 2");
        sweet.setAddress_city("Sweet Home City");
        sweet.setAddress_state("Sweet Home Sate");
        sweet.setAddress_country("Sweet Home Country");
        sweet.setAddress_zip_code("Sweet Home Zip Code");
}

}
