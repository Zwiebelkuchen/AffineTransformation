package model;

import frameworks.Matriz33;

public class DataFlexibleLineY {
    private static DataFlexibleLineY ourInstance = new DataFlexibleLineY();
    private Matriz33 matriz33 = new Matriz33();


    public static DataFlexibleLineY getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataFlexibleLineY();
        }
        return ourInstance;
    }

    private DataFlexibleLineY() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
