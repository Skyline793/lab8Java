
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Skyline
 */
public class Parallelogram extends Figure {
    private Vector a, b; //вектора, на которых построен параллелограмм
	
	Parallelogram() //конструктор без параметров
	{
		a = new Vector();
		b = new Vector();
	}
	
	Parallelogram(int x1, int y1, int x2, int y2) //конструктор с параметрами
	{
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
	}

	Parallelogram(int x1, int y1, int x2, int y2, int colorIndex) //конструктор с параметрами
	{
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		a = new Vector(x1, y1);
		b = new Vector(x2, y2);
		this.colorIndex = colorIndex;
	}
	
    @Override
	public String toString() //метод вывода в консоль
	{
		return "Вектор 1: " + a + ", вектор 2: " + b;
	}
	
    @Override
	public double CalcSquare() //метод вычисления площади
	{
		double S, len_a, len_b, prod, cosinus, sinus;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		if(len_a * len_b == 0)
			return 0;
		prod = a.CalcScalarProd(b);
		cosinus = prod / (len_a * len_b);
		sinus = sqrt(1 - cosinus * cosinus);
		S = len_a * len_b * sinus;
		return S;	
	}

    @Override
	public double CalcPerimeter() //метод вычисления площади
	{
		double P, len_a, len_b;
		len_a = a.CalcVectLen();
		len_b = b.CalcVectLen();
		P = 2 * (len_a + len_b);
		return P;
	}
}
