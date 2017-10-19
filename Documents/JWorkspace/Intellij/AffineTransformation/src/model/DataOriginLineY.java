package model;

import frameworks.Matriz33;

public class DataOriginLineY {
    private static DataOriginLineY ourInstance = new DataOriginLineY();
    private Matriz33 matriz33 = new Matriz33();


    public static DataOriginLineY getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginLineY();
        }
        return ourInstance;
    }

    private DataOriginLineY() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
