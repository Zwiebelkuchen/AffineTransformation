package model;

import frameworks.Matriz33;

public class DataOriginBubble {
    private static DataOriginBubble ourInstance = new DataOriginBubble();
    private Matriz33 matriz33 = new Matriz33();


    public static DataOriginBubble getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginBubble();
        }
        return ourInstance;
    }

    private DataOriginBubble() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
