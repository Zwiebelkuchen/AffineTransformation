package model;

public class DataFlexible {
    private static DataFlexible ourInstance = new DataFlexible();

    public static DataFlexible getInstance() {
        return ourInstance;
    }

    private DataFlexible() {
    }
}
