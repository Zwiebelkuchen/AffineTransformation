package model;

import frameworks.Matriz2D;

public class DataFlexibleBubble {
    private static DataFlexibleBubble ourInstance = new DataFlexibleBubble();
    private Matriz2D matriz2D = new Matriz2D();


    public static DataFlexibleBubble getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleBubble();
        }
        return ourInstance;
    }

    private DataFlexibleBubble() {
    }

    public Matriz2D getMatriz2D() {
        return matriz2D;
    }

    public void setMatriz2D(Matriz2D matriz2D) {
        this.matriz2D = matriz2D;
    }
}
