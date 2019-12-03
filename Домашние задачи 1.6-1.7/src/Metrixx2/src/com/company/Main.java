package com.company;

public class Main {

    public static void main(String[] args) {
	Matrix2 matrix = new Matrix2(2,6, 8, 10);
	Matrix2 matrix2 = new Matrix2(2,6, 8, 10);
	matrix.callMat();
	Matrix2 matrix3 = Matrix2.multiply(matrix,new Matrix2(3,2,35,3));
	matrix3.callMat();
	matrix.MultiplyByNum(5);
	matrix.callMat();


    }
}
