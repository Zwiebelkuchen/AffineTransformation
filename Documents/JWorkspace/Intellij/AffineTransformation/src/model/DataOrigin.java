package model;

public class DataOrigin {
    private static DataOrigin ourInstance = new DataOrigin();

    public static DataOrigin getInstance() {
        return ourInstance;
    }

    private DataOrigin() {
    }
}
