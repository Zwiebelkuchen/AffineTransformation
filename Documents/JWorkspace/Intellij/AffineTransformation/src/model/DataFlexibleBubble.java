package model;

import frameworks.Matriz33;

public class DataFlexibleBubble {
    private static DataFlexibleBubble ourInstance = new DataFlexibleBubble();
    private Matriz33 matriz33 = new Matriz33();


    public static DataFlexibleBubble getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleBubble();
        }
        return ourInstance;
    }

    private DataFlexibleBubble() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
