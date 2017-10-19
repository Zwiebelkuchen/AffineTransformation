package model;

import frameworks.Matriz2D;

public class DataOriginLineY {
    private static DataOriginLineY ourInstance = new DataOriginLineY();
    private Matriz2D matriz2D = new Matriz2D();


    public static DataOriginLineY getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginLineY();
        }
        return ourInstance;
    }

    private DataOriginLineY() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
