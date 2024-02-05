package academy.devdojo.maratonajava.javacore.enumeracao.domain;

public enum TypeClient {
    PHYSICAL_PERSON(1, "Physical Person"),
    JURIDICAL_PERSON(2, "Juridical Person");

    public final int VALUE;
    public final String NAME_REPORT;

    TypeClient(int value, String NAME_REPORT) {
        this.VALUE = value;
        this.NAME_REPORT = NAME_REPORT;
    }

    public static TypeClient typeClientPerNameReport(String NAME_REPORT) {
        for (TypeClient typeClient : values()) {
            if (typeClient.getNAME_REPORT().equals(NAME_REPORT)) {
                return typeClient;
            }
        }
        return null;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getNAME_REPORT() {
        return NAME_REPORT;
    }
}
