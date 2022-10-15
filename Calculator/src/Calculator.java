public class Calculator {
    public Double calculate(Double parseInt, Integer parseInt1, String action) {
        switch (action) {
            case "+":
                return parseInt + parseInt1;
            case "-":
                return parseInt - parseInt1;
            case "*":
                return parseInt * parseInt1;
            case "/":
                return parseInt / Double.valueOf(parseInt1);
            default:
                return null;
        }
    }
}
