public class ReturnObjectImpl implements ReturnObject {

    private Object myObject;
    
    private ReturnObjectImpl next;
    private ReturnObjectImpl prev;
    
    public ReturnObjectImpl(Object myObject) {
        this.myObject = myObject;
        this.next = null;
        this.prev = null;
    }
    
    public boolean hasError() {
        if (myObject == ErrorMessage.EMPTY_STRUCTURE){
            return true;
        }
        if (myObject == ErrorMessage.INDEX_OUT_OF_BOUNDS){
            return true;
        }
        if (myObject == ErrorMessage.INVALID_ARGUMENT){
            return true;
        }
        else {
            return false;
        }
    }
    
    public ErrorMessage getError() {
        if (this.hasError() == false) {
            return ErrorMessage.NO_ERROR;
        }
        else {
            return (ErrorMessage)myObject;
        }
    }
    
    public Object getReturnValue() {
        if (this.hasError() == true) {
            return null;
        }
        else {
            return myObject;
        }
    }
    
    public ReturnObject getNext() {
        return next;
    }
    public ReturnObject getPrev() {
        return prev;
    }
}
    
    