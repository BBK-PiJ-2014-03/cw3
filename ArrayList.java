public class ArrayList implements List {

    private ReturnObject[] objectArray = new ReturnObject[0];
    
    private final int INITIAL_SIZE = 1;
    

    public boolean isEmpty() {
        if (objectArray.length == 0) {
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
            result = objectArray.length;
        }
        return result;
    }
    
    public ReturnObject get(int index) {
        ReturnObject result;
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index >= this.size() || index < 0) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        else {
            result = new ReturnObjectImpl(objectArray[index].getReturnValue());
        }
        return result;
    }
    
    public ReturnObject remove(int index) {
        ReturnObject result;
        if (index >= this.size() || index < 0) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (this.isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
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
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        else {
            ReturnObject[] newArray = new ReturnObject[this.size()+1];
            for (int i = 0; i < index; i++) {
                newArray[i] = objectArray[i];
            }
            newArray[index] = new ReturnObjectImpl(item);
            for (int i = index+1; i < newArray.length; i++) {
                newArray[i] = objectArray[i-1];
            }
            objectArray = newArray;
            result = new ReturnObjectImpl(null);
        }
        return result;
    }
    
    public ReturnObject add(Object item) {
        ReturnObject result;
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        if (this.isEmpty()) {
            objectArray = new ReturnObject[INITIAL_SIZE];
            objectArray[0] = new ReturnObjectImpl(item);
            return new ReturnObjectImpl(null);
        }
        else {
            ReturnObject[] newArray = new ReturnObject[(this.size()+1)];
            for (int i = 0; i < objectArray.length; i++) {
                newArray[i] = objectArray[i];
            }
            newArray[newArray.length-1] = new ReturnObjectImpl(item);
            objectArray = newArray;
            result = new ReturnObjectImpl(null);
        }
        return result;
    }
    
    
}