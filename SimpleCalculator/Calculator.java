package SimpleCalculator;

public class Calculator {

    double calculate(String expression) {
        //método que fará as operações, recebe uma string com os dados e retorna o resultado

        String[] tokens = expression.split(", ?");
        //dividi a string em blocos para poder processar os dados

        String operator = tokens[0];
        //retirei o operador da string com os dados

        double[] numbers = new double[tokens.length - 1];
        //criei o array que receberá os dados numéricos

        for (int i = 1; i < tokens.length; i++) {
            numbers[i - 1] = Double.parseDouble(tokens[i]);
        }
        //estou convertendo os blocos de String em blocos de  double e inserindo-os no array que criei acima

        double output = numbers[0];
        //atribuindo o primeiro elemento a uma variável para facilitar a leitura do loop

        switch (operator) {
            //esse switch case vai ajudar a determinar com qual operação estamos lidando

            case "+":
                for (int i = 1; i < numbers.length; i++) {
                    output += numbers[i];
                }
                return output;

            case "-":
                for (int i = 1; i < numbers.length; i++) {
                    output -= numbers[i];
                }
                return output;

            case "*":
                for (int i = 1; i < numbers.length; i++) {
                    output *= numbers[i];
                }
                return output;

            case "/":
                for (int i = 1; i < numbers.length; i++) {
                    output /= numbers[i];
                }
                return output;

            case "%":
                for (int i = 1; i < numbers.length; i++) {
                    output %= numbers[i];
                }
                return output;
        }
        System.out.println("Invalid Expression");
        //caso de erro de input da operação

        return output;
    }
}
