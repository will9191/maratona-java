package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.domain.Client;
import academy.devdojo.maratonajava.javacore.enumeracao.domain.TypeClient;
import academy.devdojo.maratonajava.javacore.enumeracao.domain.TypePayment;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("client", TypeClient.PHYSICAL_PERSON, TypePayment.CREDITO);
        Client client2 = new Client("client", TypeClient.JURIDICAL_PERSON, TypePayment.DEBITO);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TypePayment.DEBITO.discountCalc(100));
        System.out.println(TypePayment.CREDITO.discountCalc(100));

        TypeClient typeClient = TypeClient.typeClientPerNameReport("Physical Person");
        System.out.println(typeClient);
    }
}
