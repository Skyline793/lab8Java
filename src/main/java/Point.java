/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Skyline
 */
public class Point {
	protected int X, Y; //координаты точки

	Point() //конструктор без параметров
	{
		X = 0;
		Y = 0;
	}

	Point(int X, int Y) //конструктор с параметрами
	{
		this.X = X;
		this.Y = Y;
	}

	public void SetX(int X) //метод установки значения X
	{
		this.X = X;
	}

	public void SetY(int Y) //метод установки значения Y
	{
		this.Y = Y;
	}

	public int GetX() //метод получения координаты X
	{
		return X;
	}

	public int GetY() //метод получения координаты Y
	{
		return Y;
	}

        @Override
	public String toString() //метод вывода в консоль
	{
		return "(" + X + "," + Y + ")";
	}

}
