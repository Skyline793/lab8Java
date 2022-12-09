/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Skyline
 */
public abstract class Figure {
    protected static String[] colors = {"не задан", "красный", "синий", "зеленый", "желтый"}; //массив цветов фигуры
    protected int colorIndex; //выбранный индекс цвета
    Figure()
    {
        colorIndex = 0;
    } //конструктор

    public void SetColorIndex(int colorIndex) //метод установки индекса цвета
    {
        if(colorIndex < 0 || colorIndex >= Figure.colors.length) throw new IllegalArgumentException("Индекс цвета вне диапазона");
        this.colorIndex = colorIndex;
    }
    
    public String GetColor()
    {
        return colors[colorIndex];
    }
    
    public abstract double CalcSquare(); //абстрактный метод вычислеия площади
    public abstract double CalcPerimeter(); //абстрактный метод вычисления периметра
}
