public class ArrayList implements List {

    private ReturnObject[] ReturnObjectArray;
    
    private final int INITIAL_SIZE = 5;
    
    private int listSize;
    
    public ArrayList() {
        ReturnObjectArray = new ReturnObjectArray[INITIAL_SIZE];
        listSize = 0;
    }
    