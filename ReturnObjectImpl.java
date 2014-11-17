public class ReturnObjectImpl implements ReturnObject {

    private Object myObject;
    
    public ReturnObjectImpl(Object myObject) {
        this.myObject = myObject;
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
    
    @Override
    public String toString() {
        return String.valueOf(myObject);
    }
}