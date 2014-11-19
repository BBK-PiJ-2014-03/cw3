/**
*
*   an ArrayList if a List data structure based on Arrays
*
*/

public class ArrayList implements List {

    private ReturnObject[] objectArray = new ReturnObject[0];
    
    private final int INITIAL_SIZE = 1;
    
    /**
    *
    *   isEmpty() method checks if the underlying data structure is empty
    *
    *   @return boolean value true is data structure is empty false if otherwise
    *
    */
    @Override
    public boolean isEmpty() {
        if (objectArray.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
    *
    *   size() method returns the size of the underlying data structure
    *
    *   @return int value representing the size of the ArrayList
    *
    */
    @Override
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
    
    /**
    *
    *   get() method creates and returns a deep copy of the element held at the
    *   parameter index within the ArrayList
    *
    *   @param the index of the element to retrieve
    *   @return the deep copy of the element at index
    *
    */
    @Override
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
    
    /**
    *
    *   remove() method removes an element from the ArrayList
    *
    *   a new array of size() -1 of objectArray is created to copy the elements into
    *   for loop is used to iterate through the array up to the element held at index
    *   and store the elements in the newArray
    *   another for loop then does the same for elements after the index to be removed
    *   newArray is then assigned to replace objectArray
    *
    *   @param position of the element to be removed
    *   @return the element held at the index position of objectArray
    *
    */
    @Override
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
            for (int i = index; i < newArray.length-1; i++) {
                newArray[i] = objectArray[i+1];
            }
            objectArray = newArray;
        }
        return result;
    }
    
    /**
    *
    *   add() method adds a ReturnObject to the ArrayList at position index
    *
    *   creates a new array of size()+1 of objectArray to copy the elements into
    *   for loop copies the elements into newArray upto thre index position
    *   a new ReturnObjectImpl is then inserted at index with the Object item as a value
    *   for loop copies remaining elements into newArray
    *   objectArray is reassigned as newArray
    *
    *   @param index position to insert new element at
    *   @param Object to be wrapped in new ReturnObjectImpl array element
    *   @return ReturnObjectImpl with a null value if successful
    *   appropriate ErrorMessage if otherwise
    *
    */
    @Override
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
            for (int i = index+1; i < newArray.length-1; i++) {
                newArray[i] = objectArray[i-1];
            }
            objectArray = newArray;
            result = new ReturnObjectImpl(null);
        }
        return result;
    }
    
    /**
    *
    *   adds an item to the end of the ArrayList
    *
    *   creates a new Array of the size of the objectArray plus 1
    *   stores all the objects from the objectArray in the newArray
    *   stores a new ReturnObjectImpl with the item value in the final position of newArray
    *   reassigns objectArray as newArray
    *
    *   @param the Object to be wrapped in a ReturnObjectImpl
    *   @return a null value holding ReturnObject if successful
    *   or an appropriate ErrorMessage if unsuccessful
    *
    */
    @Override
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