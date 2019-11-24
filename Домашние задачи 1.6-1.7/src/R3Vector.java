import java.util.Scanner;
import java.lang.Math;

public class R3Vector {
    public R3Vector() {

        //Ввод координатов точек
        Scanner a = new Scanner(System.in);

        System.out.println("Начало вектора 1");
        System.out.print("X1 = ");
        int oneX1 = a.nextInt();
        System.out.print("Y1 = ");
        int oneY1 = a.nextInt();
        System.out.print("Z1 = ");
        int oneZ1 = a.nextInt();

        System.out.println("Конец вектора 1");
        System.out.print("X2 = ");
        int oneX2 = a.nextInt();
        System.out.print("Y2 = ");
        int oneY2 = a.nextInt();
        System.out.print("Z2 = ");
        int oneZ2 = a.nextInt();

        System.out.println("Начало вектора 2");
        System.out.print("X1 = ");
        int twoX1 = a.nextInt();
        System.out.print("Y1 = ");
        int twoY1 = a.nextInt();
        System.out.print("Z1 = ");
        int twoZ1 = a.nextInt();

        System.out.println("Конец вектора 2");
        System.out.print("X2 = ");
        int twoX2 = a.nextInt();
        System.out.print("Y2 = ");
        int twoY2 = a.nextInt();
        System.out.print("Z2 = ");
        int twoZ2 = a.nextInt();

        //Находим координаты векторов
        int Vect1X = oneX2 - oneX1;
        int Vect1Y = oneY2 - oneY1;
        int Vect1Z = oneZ2 - oneZ1;
        System.out.println("Координаты первого вектора = (" + Vect1X + "; " + Vect1Y + "; " + Vect1Z + ")");

        int Vect2X = twoX2 - twoX1;
        int Vect2Y = twoY2 - twoY1;
        int Vect2Z = twoZ2 - twoZ1;
        System.out.println("Координаты второго вектора = (" + Vect2X + "; " + Vect2Y + "; " + Vect2Z + ")");

        amount(Vect1X, Vect1Y, Vect1Z, Vect2X, Vect2Y, Vect2Z); //Сумма векторов

        difference(Vect1X, Vect1Y, Vect1Z, Vect2X, Vect2Y, Vect2Z); //Разность векторов

        multiplyOnNum(Vect1X, Vect1Y, Vect1Z); //Умножение вектора на число

        System.out.println(scalarMultiply(Vect1X, Vect1Y, Vect1Z, Vect2X, Vect2Y, Vect2Z)); //Скалярное произведение векторов

        VectMultiply(Vect1X, Vect1Y, Vect1Z, Vect2X, Vect2Y, Vect2Z); //Векторное произведение векторов

        System.out.println(mixedMultiply(Vect1X, Vect1Y, Vect1Z, Vect2X, Vect2Y, Vect2Z));//Смешанное произведение
    }


    public void amount(int Vect1X, int Vect1Y, int Vect1Z, int Vect2X, int Vect2Y, int Vect2Z) { //Сумма векторов
        int LastVectX = Vect1X + Vect2X;
        int LastVectY = Vect1Y + Vect2Y;
        int LastVectZ = Vect1Z + Vect2Z;
        System.out.println("Сумма векторов = (" + LastVectX + "; " + LastVectY + "; " + LastVectZ + ")");
    }


    public void difference(int Vect1X, int Vect1Y, int Vect1Z, int Vect2X, int Vect2Y, int Vect2Z) { //Разность векторов
        int LastVectX = Vect1X - Vect2X;
        int LastVectY = Vect1Y - Vect2Y;
        int LastVectZ = Vect1Z - Vect2Z;
        System.out.println("Разность векторов = (" + LastVectX + "; " + LastVectY + "; " + LastVectZ + ")");
    }

    public void multiplyOnNum(int Vect1, int Vect2, int Vect3) { //Умножение вектора на число
        System.out.println("Введите координаты вектора который следует умножить на число");
        Scanner a = new Scanner(System.in);
        System.out.println("X = "); Vect1 = a.nextInt();
        System.out.println("Y = "); Vect2 = a.nextInt();
        System.out.println("Y = "); Vect3 = a.nextInt();
        System.out.println("Введите число на которое следует умножить вектор");
        double Num = a.nextDouble();
        double multiplyOnNumX = Vect1 * Num;
        double multiplyOnNumY = Vect2 * Num;
        double multiplyOnNumZ = Vect3 * Num;
        System.out.println("Произведение вектора на число = (" + multiplyOnNumX + "; " + multiplyOnNumY + "; " + multiplyOnNumZ + ")");
    }


    public double scalarMultiply(int Vect1X, int Vect1Y, int Vect1Z, int Vect2X, int Vect2Y, int Vect2Z) { //Скалярное произведение
        System.out.println("Введите угол между векторами");
        Scanner a = new Scanner(System.in);
        int alfa = a.nextInt();
        return Math.sqrt(Vect1X * Vect1X + Vect1Y * Vect1Y + Vect1Z * Vect1Z) * Math.sqrt(Vect2X * Vect2X + Vect2Y * Vect2Y + Vect2Z * Vect2Z) * Math.cos(alfa);
    }

    public void VectMultiply(int Vect1X, int Vect1Y, int Vect1Z, int Vect2X, int Vect2Y, int Vect2Z) { //Векторное произведение
        int LastVectX = (Vect1Y * Vect2Z - Vect1Z * Vect2Y);
        int LastVectY = (Vect1X * Vect2Z - Vect2X * Vect1Z);//Простой определитель квадратной матрицы 2х2
        int LastVectZ = (Vect1X * Vect2Y - Vect1Y * Vect2X);
        System.out.println("Векторное произведение = (" + LastVectX + "; " + LastVectY + "; " + LastVectZ + ")");

    }

    public int mixedMultiply(int Vect1X, int Vect1Y, int Vect1Z, int Vect2X, int Vect2Y, int Vect2Z) { //Смешанное произведение
        Scanner a = new Scanner(System.in);
        System.out.println("Введите координаты третьего вектора");
        System.out.print("X3 = ");
        int Vect3X = a.nextInt();
        System.out.print("Y3 = ");
        int Vect3Y = a.nextInt();
        System.out.print("Z3 = ");
        int Vect3Z = a.nextInt();

        return Vect1X * Vect2Y * Vect3Z + Vect2X * Vect3Y * Vect1Z + Vect3X * Vect1Y * Vect2Z - Vect1Z * Vect2Y * Vect3X - Vect2Z * Vect3Y * Vect1X - Vect3Z * Vect1Y * Vect2X;
    }
}