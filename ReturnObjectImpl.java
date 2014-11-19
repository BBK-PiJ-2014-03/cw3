/**
*
*   A wrapper class which holds an Object value
*
*/

public class ReturnObjectImpl implements ReturnObject {

    private Object myObject;
    
    /**
    *
    *   constructor which assigns the myObject parameter to be the held value
    *
    *   @param myObject an Object held by the ReturnObjectImpl wrapper
    *
    */
    public ReturnObjectImpl(Object myObject) {
        this.myObject = myObject;
    }
    
    
    /**
    *
    *   hasError() method checks to see if the value held in myObject is an ErrorMessage
    *
    * @return boolean value of whether the ReturnObjectImpl holds an ErrorMessage
    *
    */
    @Override
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
    
    /**
    *
    *   getError() method retrieves the ErrorMessage value from the ReturnObjectImpl
    *   if the value held is an ErrorMessage
    *
    *   @return the ErrorMessage held by the ReturnObjectImpl or NO_ERROR if
    *   the ReturnObjectImpl does not hold an ErrorMessage
    *
    */
    @Override
    public ErrorMessage getError() {
        if (this.hasError() == false) {
            return ErrorMessage.NO_ERROR;
        }
        else {
            return (ErrorMessage)myObject;
        }
    }
    
    /**
    *
    *   getReturnValue() method returns the object held by the ReturnObjectImpl
    *
    *   @return the Object held by the ReturnObjectImpl 
    *   or null if the ReturnObjectImpl contains an ErrorMessage
    *
    */
    @Override
    public Object getReturnValue() {
        if (this.hasError() == true) {
            return null;
        }
        else {
            return myObject;
        }
    }
    
    /**
    *
    *   toString() method returns the String.valueOf() the myObject field
    *
    *   @return String of the myObject field
    *
    */
    @Override
    public String toString() {
        return String.valueOf(myObject);
    }
}