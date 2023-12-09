import java.util.Scanner;
class Calcu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        String res = calc(in);
        System.out.println(res);
    }
    public static String calc(String in) {
        String [] x = in.split(" ");
        if (x.length >3||x.length<3) {
            throw new ArrayIndexOutOfBoundsException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int a;
        int b;
       try { a = Integer.parseInt(x[0]);
           b = Integer.parseInt(x[2]);}
       catch (NumberFormatException e) {
           throw new NumberFormatException("Строка не является математической операцией");}
        String xs = x[1];
        return String.valueOf(d(a,b,xs));
    }
    public static  int d (int a, int b, String xs){
        int res = 0;
        if (a>0&&a<11&&b>0&&b<11){
            switch (xs) {
                case "+":
                    res = a + b;
                    break;
                case "-":
                    res = a - b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    res = a / b;
                    break;
                default: throw  new NumberFormatException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } } else {
                throw new NumberFormatException("Числа должны быть от 1 до 10");
        }return res;
            }

        }