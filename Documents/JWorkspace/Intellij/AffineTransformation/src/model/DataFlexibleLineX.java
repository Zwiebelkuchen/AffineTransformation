package model;

import frameworks.Matriz33;

public class DataFlexibleLineX {
    private static DataFlexibleLineX ourInstance = new DataFlexibleLineX();
    private Matriz33 matriz33 = new Matriz33();


    public static DataFlexibleLineX getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleLineX();
        }
        return ourInstance;
    }

    private DataFlexibleLineX() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
