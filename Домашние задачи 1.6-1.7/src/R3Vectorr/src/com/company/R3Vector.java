package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;
public class R3Vector {
    Scanner sc = new Scanner(System.in);
    public int x;
    public int y;
    public int z;
    public void call(){
        System.out.println(x+" "+y+" "+z);
    }
    public R3Vector(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public R3Vector multiplybyN(){
        System.out.println("Введите на что умножить вектор");
       int n = sc.nextInt();
        return new R3Vector(this.x*n, this.y*n, this.z*n);
    }
    public R3Vector difference(){
      return kex(0);
    }
    public R3Vector summ(){
        return kex(1);
    }
    private R3Vector kex(int n){

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(n==0)
        return new R3Vector(this.x-x,this.y-y,this.z-z);
        return new R3Vector(this.x+x,this.y+y,this.z+z);
    }
    public double ScalarMultiply(){
        int alfa = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        return Math.sqrt(x*x+y*y+z*z) * Math.sqrt(s*s+d*d+f*f) * Math.cos(alfa);
    }
    public void VectMultiply(){
        int s = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        System.out.println((y*f - z*d) + "; "+(x*f - s*z)+ "; " +(x*d - y*s));
    }
    public void MixedMultiply(){
        System.out.println("Введите координаты вектора 2");
        int s = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("Введите координаты вектора 3");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(this.x * d * z + s * y * this.z + x * this.y * f - this.z * d * x - f * y * this.x - z * this.y * s);
    }
}
