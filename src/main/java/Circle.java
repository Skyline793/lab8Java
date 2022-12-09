
import static java.lang.Math.PI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Skyline
 */
public class Circle extends Figure {
    private Point center; //центр круга
	private double R; //радиус круга
	
	Circle() //конструктор без параметров
	{
		center = new Point();
		R = 0;
	}
	
	Circle(int x, int y, double R) //конструктор с параметрами
	{
		if(R < 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		center = new Point(x,y);
		this.R = R;
	}

	Circle(int x, int y, double R, int colorIndex) //конструктор с параметрами
	{
		if(R < 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона!");
		center = new Point(x,y);
		this.R = R;
		this.colorIndex = colorIndex;
	}

	public void SetR(double R) //метод установки радиуса
	{
		if(R <= 0) throw new IllegalArgumentException("Радиус должен быть положительным!");
		this.R = R;
	}

	
    @Override
	public String toString() //метод вывода в консоль
	{
		return String.format("Центр: " + center + ", радиус R = %.2f", R);
	}
	
	
    @Override
	public double CalcSquare() //метод вычисления площади круга
	{
		double S;
		S = PI * R * R;
		return S;
	}

	public double CalcPerimeter() //метод вычисления периметра круга
	{
		double P;
		P = 2 * PI * R;
		return P;
	}    
}
