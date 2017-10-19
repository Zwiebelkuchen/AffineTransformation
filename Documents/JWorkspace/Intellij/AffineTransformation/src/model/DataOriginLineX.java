package model;

import frameworks.Matriz2D;

public class DataOriginLineX {
    private static DataOriginLineX ourInstance = new DataOriginLineX();
    private Matriz2D matriz2D;


    public static DataOriginLineX getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginLineX();
        }
        return ourInstance;
    }

    private DataOriginLineX() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
