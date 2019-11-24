package com.company;
import java.util.Scanner;
public class Matrix2 {
    Scanner sc=new Scanner(System.in);
    public Matrix2() {
            System.out.println("Введите первую основную матрицу, к ней будут применяться операции сложение и вычитание");
            int n = 0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int g=sc.nextInt();
        sum(a, b, c, g);
        diff(a, b, c, g);
        MultiplyOnNum(a, b, c, g, n);
        MultiplyMatrix(a, b, c, g);
        Opredelitel(a, b, c, g);
        ObratnMatrica(a, b, c, g);
    }
        public void sum(int a, int b, int c, int g){
            System.out.println("Введите матрицу которую нужно прибавить к первой");
            int k=sc.nextInt();
            int m=sc.nextInt();
            int o=sc.nextInt();
            int f=sc.nextInt();
            System.out.println("Полученная матрица");
            System.out.print(a+k + " "); System.out.print(b+m);
            System.out.print("\n");
            System.out.print(c+o + " "); System.out.print(g+f);
    }
        public void diff(int a, int b, int c, int g){
            System.out.println("\n");
            System.out.println("Введите матрицу которую нужно отнять от первой");
            int k=sc.nextInt();
            int m=sc.nextInt();
            int o=sc.nextInt();
            int f=sc.nextInt();
            System.out.println("Полученная матрица");
            System.out.print(a-k + " "); System.out.print(b-m);
            System.out.print("\n");
            System.out.print(c-o + " "); System.out.print(g-f);
        }
        public void MultiplyOnNum(int a, int b, int c, int g, int n){
            System.out.println("\n");
            System.out.println("Введите новую матрицу, которую нужно умножить на число");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            g=sc.nextInt();
            System.out.println("Введите число на которое нужно умножить матрицу");
            n=sc.nextInt();
            System.out.println("Полученная матрица");
            System.out.print(a*n + " "); System.out.print(b*n);
            System.out.print("\n");
            System.out.print(c*n + " "); System.out.print(g*n);
        }
        public void MultiplyMatrix(int a, int b, int c, int g){
            System.out.println("\n");
            System.out.println("Программа умножит одну матрицу на другую");
            System.out.println("Введите первую матрицу");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            g=sc.nextInt();
            System.out.println("Введите вторую матрицу");
            int k=sc.nextInt();
            int m=sc.nextInt();
            int o=sc.nextInt();
            int f=sc.nextInt();
            System.out.println("Полученная матрица");
            System.out.print(a * k + b * o + " "); System.out.print(a * m + b * f);
            System.out.print("\n");
            System.out.print(c * k + g * o + " "); System.out.print(c * m + g * f);
        }
        public void Opredelitel(int a, int b, int c, int g){
            System.out.println("\n");
            System.out.println("Программа вычисляет определитель матрицы 2х2");
            System.out.println("Введите матрицу");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            g=sc.nextInt();
            System.out.println("Определитель равен = " + (a*g-b*c));
        }
        public void ObratnMatrica(int a, int b, int c, int g){
            System.out.println("\n");
            System.out.println("Программа вычислит обратную матрицу для квадратной матрицы 2х2");
            System.out.println("Введите матрицу 2х2");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            g=sc.nextInt();
            System.out.println("Полученная матрица");
            System.out.print(g + " "); System.out.print(-b);
            System.out.print("\n");
            System.out.print(-c + " "); System.out.print(a);
        }
    }

