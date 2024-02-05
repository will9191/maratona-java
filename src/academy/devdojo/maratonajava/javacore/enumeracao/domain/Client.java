package academy.devdojo.maratonajava.javacore.enumeracao.domain;

public class Client {
    private String name;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String name, TypeClient typeClient, TypePayment typePayment) {
        this.name = name;
        this.typeClient = typeClient;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                ", typeClient=" + typeClient.NAME_REPORT +
                ", typeClientInt=" + typeClient.VALUE +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}
