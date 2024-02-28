package oop.Calc.HW;

import java.util.Scanner;

public class NumInput {
    Scanner read = new Scanner(System.in);
    private float real, imaginary;

    NumInput() {
    }

    NumInput(int tempReal, int tempImaginary) {
        setReal(tempReal);
        setImaginary(tempImaginary);
        /* this.real = tempReal;
        this.imaginary = tempImaginary; */
    }

    NumInput sumComplex(NumInput C1, NumInput C2) {
        NumInput temp = new NumInput();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }

    NumInput subtractComplex(NumInput C1, NumInput C2) {
        NumInput temp = new NumInput();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }

    NumInput multiplyComplex(NumInput C1, NumInput C2) {
        NumInput temp = new NumInput();
        temp.real = C1.real * C2.real - C1.imaginary * C2.imaginary;
        temp.imaginary = C1.imaginary * C2.real + C1.real * C2.imaginary;
        return temp;
    }

    NumInput divideComplex(NumInput C1, NumInput C2) {
        NumInput temp = new NumInput();
        temp.real = ((C1.real * C2.real) + (C1.imaginary * C2.imaginary)) / ((C2.real * C2.real) + (C2.imaginary * C2.imaginary));
        temp.imaginary = ((C1.imaginary * C2.real) - (C1.real * C2.imaginary)) / ((C2.real * C2.real) + (C2.imaginary * C2.imaginary));
        return temp;
    }

    public float getImaginary() {
        return imaginary;
    }

    public void setImagionaryNull() {
        System.out.println("Введите <<b>> комплексного числа : ");
        this.imaginary = (float) read.nextInt();
    }

    public void setImaginary(int imaginary) {
        this.imaginary = (float) imaginary;
    }

    public float getReal() {
        return real;
    }

    public void setRealNull() {
        System.out.println("Введите <<a>> комплексного числа : ");
        this.real = (float) read.nextInt();
    }

    public void setReal(int real) {
        this.real = (float) real;
    }

    String printComplexNumber() {
        String s = "("
                + real + " + "
                + imaginary + "i)";
        return s;
    }

}