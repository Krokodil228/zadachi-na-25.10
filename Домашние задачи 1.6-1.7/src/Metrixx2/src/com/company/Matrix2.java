package com.company;

public class Matrix2 {
    public int a1;
    public int a2;
    public int b1;
    public int b2;
public Matrix2(int x, int y, int z, int w){
    a1=x;
    a2=y;
    b1=z;
    b2=w;
}
    public void callMat(){
        System.out.print(a1 + " ");
        System.out.print(a2);
        System.out.print("\n");
        System.out.print(b1 + " ");
        System.out.println(b2);
    }
    public static Matrix2 sum(Matrix2 a, Matrix2 b){
            System.out.println("Сумма матриц");
        System.out.println("\n");
        return new Matrix2(a.a1 + b.a1, a.a2 + b.a2, a.b1 + b.b1, a.b2 + b.b2);
}
    public static Matrix2 minus(Matrix2 a, Matrix2 b){
            System.out.println("Вычитание матриц");
        System.out.println("\n");
        return new Matrix2(a.a1 - b.a1, a.a2 - b.a2, a.b1 - b.b1, a.b2 - b.b2);
    }
    public static Matrix2 multiply(Matrix2 a, Matrix2 b){
            System.out.println("Умножение матриц");
        System.out.println("\n");
        return new Matrix2(a.a1*b.a1, a.a2 * b.b1, a.b1*b.a2, a.b2*b.b2);
    }
    public int getOpn(Matrix2 a){
            System.out.println("Определитель матрицы");
        System.out.println("\n");
        return (a1+b2-a2-b1);
    }
    public Matrix2 getObr(){
            System.out.println("Обратная матрица");
        System.out.println("\n");
        return new Matrix2(-a1, b1, a2, -b2);
    }
    public void MultiplyByNum(int a){
            System.out.println("Умножение на число");
        System.out.println("\n");
    a1*=a;
    a2*=a;
    b1*=a;
    b2*=a;
    }
}
