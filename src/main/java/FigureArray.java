
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Skyline
 */
public class FigureArray implements Serializable {
    private ArrayList<Figure> arr; //список фигур
    public FigureArray() //констуктор
    {
        arr = new ArrayList<Figure>();
    }
    public void Add(Figure f) //метод добавления фигуры в массив
    {
        arr.add(f);
    }
    
    public void Delete(int ind) //метод удаления фигуры из списка
    {
        arr.remove(ind);
    }
    
    public Figure GetElement(int ind)
    {
        return arr.get(ind);
    }
    
    public int GetSize()
    {
        return arr.size();
    }
    
    public static String GetType(Figure f)
    {
        String s = f.getClass().getName();
        if("Circle".equals(s))
            return "Круг";
        if("Triangle".equals(s))
            return "Треугольник";
        if("Parallelogram".equals(s))
            return "Параллелограмм";
        return null;
    }

    public void SortByMaxSquare() //метод сортировки по возрастанию площади
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcSquare() < o2.CalcSquare())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMinSquare() //метод сортировки по убыванию площади
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcSquare() > o2.CalcSquare())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMaxPerimeter() //метод сортировки по возрастанию периметра
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcPerimeter() < o2.CalcPerimeter())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByMinPerimeter() //метод сортировки по убыванию периметра
    {
        Collections.sort(arr, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.CalcPerimeter() > o2.CalcPerimeter())
                    return -1;
                else return 1;
            }
        });
    }   
}
