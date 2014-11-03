/**
*
* @author PiJ
*
* Provides the return values from a method If there is an error has a
* property to indicate that situation Otherwise, returns the intended
* value
*
*/
public interface ReturnObject {
    /**
    *
    * @return whether there has been an error
    */
    public boolean hasError();
    /**
    *
    * @return the error message
    */
    public String getError();
    /**
    *
    * @return the return value from the method - null if there has been an
    * error
    */
    public Object getReturnValue();
}