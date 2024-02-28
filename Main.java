package oop.Calc.HW;

public class Main {
    public static void main(String[] args) {
        NumInput complexNumOne = new NumInput();
        complexNumOne.setRealNull();
        complexNumOne.setImagionaryNull();
        System.out.println(complexNumOne.printComplexNumber());
        NumInput complexNumTwo = new NumInput();
        complexNumTwo.setRealNull();
        complexNumTwo.setImagionaryNull();
        System.out.println(complexNumTwo.printComplexNumber());
        InterFace user = new InterFace();
        user.setVvodOper();
        user.operation(user.getVvodOper(), complexNumOne, complexNumTwo);
    }
}