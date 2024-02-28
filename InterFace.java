package oop.Calc.HW;

import java.util.Scanner;

public class InterFace extends NumInput {
    Scanner read = new Scanner(System.in);
    private String vvodOper;

    public String getVvodOper() {
        return vvodOper;
    }

    public void setVvodOper() {
        System.out.println("Введите оператор :");
        this.vvodOper = read.next();
    }

    public void operation(String oper, NumInput C1, NumInput C2) {
        NumInput complexNumThree;
        if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
            switch (oper) {
                case "+":
                    complexNumThree = sumComplex(C1, C2);
                    System.out.println("Sum = " + complexNumThree.printComplexNumber());
                    break;
                case "-":
                    complexNumThree = subtractComplex(C1, C2);
                    System.out.println("Subtract = " + complexNumThree.printComplexNumber());
                    break;
                case "*":
                    complexNumThree = multiplyComplex(C1, C2);
                    System.out.println("Multiply = " + complexNumThree.printComplexNumber());
                    break;
                case "/":
                    complexNumThree = divideComplex(C1, C2);
                    System.out.println("Divide = " + complexNumThree.printComplexNumber());
                    break;
            }
        }
    }
}
