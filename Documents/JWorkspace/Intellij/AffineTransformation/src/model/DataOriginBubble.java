package model;

import frameworks.Matriz2D;

public class DataOriginBubble {
    private static DataOriginBubble ourInstance = new DataOriginBubble();
    private Matriz2D matriz2D = new Matriz2D();


    public static DataOriginBubble getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginBubble();
        }
        return ourInstance;
    }

    private DataOriginBubble() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
