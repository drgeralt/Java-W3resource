package CurrencyConverter;

public class Currency {
    public Currency(String code, double value) {
        this.code = code;
        this.value = value;
        //construtor da moeda
    }

    public double getValue() {
        return value;
        //usado no calculo
    }

    public String getCode() {
        return code;
        //usado na busca por moedas teste
    }

    private final String code;
    private final double value;
    //dados da moeda
}
