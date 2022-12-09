
import java.io.Serializable;
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Skyline
 */
public class Vector extends Point implements Serializable{
    Vector() //конструктор без параметров
	{
		super(0,0);
	}
    Vector(int x, int y) //конструктор с параметрами
	{
		super(x, y);
        }

	@Override
	public String toString() //метод вывода в консоль
	{
		return "(" + X + "," + Y + ")";
	}

	public double CalcVectLen() //метод вычисления длины вектора
	{
		double length = sqrt(X * X + Y * Y);
		return length;
	}
	
	public double CalcScalarProd(Vector v2) //метод вычисления скалярного произведения
	{
		int x1 = this.X;
		int y1 = this.Y;
		int x2 = v2.X;
		int y2 = v2.Y;
		double prod;
		prod = x1 * x2 + y1 * y2;
		return prod;
	}
	
}
