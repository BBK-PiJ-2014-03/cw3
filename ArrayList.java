public class ArrayList implements List {

    private ReturnObject[] objectArray = null;
    
    private final int INITIAL_SIZE = 1;
    

    public boolean isEmpty() {
        if (objectArray == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int size() {
        int result = 0;
        if (this.isEmpty()) {
            return result;
        }
        else {
            for (Object element : objectArray) {
                result++;
            }
        }
        return result;
    }
    
    public ReturnObject get(int index) {
        ReturnObject result;
        if (index >= this.size() || index < 0) {
            result = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (objectArray == null) {
            result = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        else {
            result = objectArray[index];
        }
        return result;
    }
    
    public ReturnObject remove(int index) {
        ReturnObject result;
        if (index >= this.size() || index < 0) {
            result = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (this.isEmpty()) {
            result = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        else {
            ReturnObject[] newArray = new ReturnObject[(this.size()-1)];
            for (int i = 0; i < index; i++) {
                newArray[i] = objectArray[i];
            }
            result = objectArray[index];
            for (int i = index; i < newArray.length; i++) {
                newArray[i] = objectArray[i+1];
            }
            objectArray = newArray;
        }
        return result;
    }
    
    public ReturnObject add(int index, Object item) {
        ReturnObject result;
        if (index < 0 || index >= this.size()) {
            result = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (item == null) {
            result = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        if (this.isEmpty()) {
            objectArray = new ReturnObject[INITIAL_SIZE];
            objectArray[0] = (ReturnObject)item;
        }
        /* if (index >= this.size()) {
            this.add(item);
            result = new ReturnObjectImpl(null);
        } */
        else {
            ReturnObject[] newArray = new ReturnObject[(this.size()+1)];
            for (int i = 0; i < index; i++) {
                newArray[i] = objectArray[i];
            }
            newArray[index] = (ReturnObject)item;
            for (int i = index+1; i < newArray.length; i++) {
                newArray[i] = objectArray[i];
            }
            objectArray = newArray;
            result = new ReturnObjectImpl(null);
        }
        return result;
    }
    
    public ReturnObject add(Object item) {
        return new ReturnObjectImpl(null);
    }
}