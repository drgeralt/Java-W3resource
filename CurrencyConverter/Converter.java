package CurrencyConverter;
import java.util.ArrayList;
import java.util.List;
public class Converter {
    List<Currency> currencies = new ArrayList<>(11);

    public Converter(String operation) {
        currencies.add(new Currency("USD",1));
        currencies.add(new Currency("EUR",0.91));
        currencies.add(new Currency("GBP",0.77));
        currencies.add(new Currency("RUB",87.15));
        currencies.add(new Currency("CAD",1.43));
        currencies.add(new Currency("SGD",1.33));
        currencies.add(new Currency("CHF",0.88));
        currencies.add(new Currency("MYR",4.41));
        currencies.add(new Currency("YEN",147.53));
        currencies.add(new Currency("YUA",7.23));
        currencies.add(new Currency("BRL",5.83));
        //O arraylist vai facilitar a busca pelas moedas para conversão
        System.out.println("The converted value is: " + convert(operation));
        //imprimindo no console o resultado da conversão

    }


    String convert(String input) {
        String[] data = input.split(" to ");
        //removendo o " to " do array com nossos dados, dividindo a string em duas partes

        String[] data1 = data[0].trim().split(" ");
        //dividindo a primeira parte

        double value = Double.parseDouble(data1[0]);
        String currentCurrency = data1[1].trim().toUpperCase();
        String nextCurrency = data[1].trim().toUpperCase();
        //Facilitando a leitura do codigo e filtrando erro de input

        for (Currency searchedCurrency : currencies) {
            if(searchedCurrency.getCode().equals(currentCurrency)) {
                //buscando o codigo que bate com o primeiro codigo fornecido
                for(Currency searchedCurrency2 : currencies) {
                    if (searchedCurrency2.getCode().equals(nextCurrency)) {
                        //buscando o codigo que bate com o segundo fornecido
                        return String.valueOf(value* searchedCurrency2.getValue()/ searchedCurrency.getValue());
                        //retornando como string o valor da conversão
                    }
                }
            }
        }
        return "ERROR: Currency Not Found";
        //caso seja fornecida uma moeda que nao seja uma das 10 mais usadas/real
    }
}

