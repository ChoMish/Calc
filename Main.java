public class Main  {
    public static String main(String input) throws Exception {
            String[] variableSplit = input.split(" ");
            if (variableSplit.length <3) {
                throw new Exception("т.к. строка не является математической операцией");
            }
            if (variableSplit.length !=3) {
                throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            String symbol = variableSplit[1];
            String result = null;
            int variable1 = 0;
            boolean romanFirst = false;
            try {
                variable1 = Integer.parseInt(variableSplit[0]);
            } catch (NumberFormatException e) {
                variable1 = ArabicToRoman.romanToInt(variableSplit[0]);
                romanFirst = true;
            }
            int variable2 = 0;
            boolean romanSecond = false;
            try {
                variable2 = Integer.parseInt(variableSplit[2]);
            } catch (NumberFormatException e) {
                variable2 = ArabicToRoman.romanToInt(variableSplit[2]);
                romanSecond = true;
            }
            if ((romanFirst == true && romanSecond == false) || (romanFirst == false && romanSecond == true)) {
                throw new Exception("т.к. используются одновременно разные системы счисления");
            }
            if (variable1 > 10 || variable2 > 10) {
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            }
            Compute cmp = new Compute(variable1, variable2);
            switch (symbol) {
                case "+":
                    result = String.valueOf(cmp.plus());
                    break;
                case "-":
                    result = String.valueOf(cmp.minus());
                    break;
                case "*":
                    result = String.valueOf(cmp.multiplication());
                    break;
                case "/":
                        result = String.valueOf(cmp.division());
                        break;
                default:
                    throw new Exception("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами.");
            }
            if (romanFirst == true) {
                int a = Integer.parseInt(result);
                if (a < 0) {
                    throw new Exception("т.к. в римской системе нет отрицательных чисел");
                }
                return ArabicToRoman.intToRoman(a);
            }
        return result;
        }
    }

