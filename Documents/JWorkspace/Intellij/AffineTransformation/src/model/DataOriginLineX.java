package model;

import frameworks.Matriz33;

public class DataOriginLineX {
    private static DataOriginLineX ourInstance = new DataOriginLineX();
    private  Matriz33 matriz33;


    public static DataOriginLineX getInstance() {
        if (ourInstance == null)
        {
            ourInstance = new DataOriginLineX();
        }
        return ourInstance;
    }

    private DataOriginLineX() {
    }

    public Matriz33 getMatriz33() {
        return matriz33;
    }

    public void setMatriz33(Matriz33 matriz33) {
        this.matriz33 = matriz33;
    }
}
