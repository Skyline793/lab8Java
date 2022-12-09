
import java.io.Serializable;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Skyline
 */
public class Triangle extends Figure implements Serializable{
    private Point A, B, C; //вершины треугольника
    Triangle() //конструктор без параметров
	{
		A = new Point();
		B = new Point();
		C = new Point();
	}
	
	Triangle(int x1, int y1, int x2, int y2, int x3, int y3) //конструктор с параметрами
	{
		A = new Point(x1, y1);
		B = new Point(x2, y2);
		C = new Point(x3, y3);
	}

	Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int colorIndex) //конструктор с параметрами
	{
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		A = new Point(x1, y1);
		B = new Point(x2, y2);
		C = new Point(x3, y3);
		this.colorIndex = colorIndex;
	}

	
    @Override
	public String toString() //метод вывода в консоль
	{
		return "Вершина 1: " + A + ", вершина 2: " + B + ", вершина 3: " + C;
	}
	
    @Override
	public double CalcSquare() //метод вычисления площади 
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		double S;
		S = 0.5 * abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
		return S;
	}

    @Override
	public double CalcPerimeter() //метод вычисления периметра
	{
		int x1 = A.GetX(), y1 = A.GetY();
		int x2 = B.GetX(), y2 = B.GetY();
		int x3 = C.GetX(), y3 = C.GetY();
		double AB = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double AC = sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		double BC = sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double P = AB + AC + BC;
		return P;
	}
	
}
