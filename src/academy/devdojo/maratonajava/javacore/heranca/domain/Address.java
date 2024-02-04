package academy.devdojo.maratonajava.javacore.heranca.domain;

public class Address {
    private String street;
    private String cep;

//    public Address(String street, String cep) {
//        this.street = street;
//        this.cep = cep;
//    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }
}
