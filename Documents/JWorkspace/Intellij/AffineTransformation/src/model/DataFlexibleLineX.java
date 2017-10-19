package model;

import frameworks.Matriz2D;

public class DataFlexibleLineX {
    private static DataFlexibleLineX ourInstance = new DataFlexibleLineX();
    private Matriz2D matriz2D = new Matriz2D();


    public static DataFlexibleLineX getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleLineX();
        }
        return ourInstance;
    }

    private DataFlexibleLineX() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
