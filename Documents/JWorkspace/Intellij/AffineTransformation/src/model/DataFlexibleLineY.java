package model;

import frameworks.Matriz2D;

public class DataFlexibleLineY {
    private static DataFlexibleLineY ourInstance = new DataFlexibleLineY();
    private Matriz2D matriz2D = new Matriz2D();


    public static DataFlexibleLineY getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleLineY();
        }
        return ourInstance;
    }

    private DataFlexibleLineY() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
