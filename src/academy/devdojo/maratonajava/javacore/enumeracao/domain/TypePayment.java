package academy.devdojo.maratonajava.javacore.enumeracao.domain;

public enum TypePayment {

    CREDITO {
        @Override
        public double discountCalc(double value) {
            return value * 0.05;
        }
    }, DEBITO {
        @Override
        public double discountCalc(double value) {
            return value * 0.1;
        }
    };

    public abstract double discountCalc(double value);

}
