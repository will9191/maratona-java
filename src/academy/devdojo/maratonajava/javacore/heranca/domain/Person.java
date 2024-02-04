package academy.devdojo.maratonajava.javacore.heranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Inside static block of person");
    }

    {
        System.out.println("Inside initialization block of person 1");
    }
    {
        System.out.println("Inside initialization block of person 2");
    }

    public Person(String name) {
        System.out.println("Inside person constructor");
        this.name = name;
    }

//    public Person (String name, String cpf, Address address){
//        this.name = name;
//        this.cpf = cpf;
//        this.address = address;
//    }


    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet() + " " + this.address.getCep());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Address getAddress() {
        return address;
    }

}
