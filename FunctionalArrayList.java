/**
*
*   A FunctionalArrayList is an extension of ArrayList which implements the FunctionalList interface
*
*/

public class FunctionalArrayList extends ArrayList implements FunctionalList {

    /**
    *
    *   head() method creates a deep copy of the element at the head of the ArrayList
    *
    *   @return a deep copied ReturnObject with the same value as the ReturnObject at the head of
    *   the super class' data structure
    *
    */
    @Override
    public ReturnObject head() {
        ReturnObjectImpl result = new ReturnObjectImpl(super.get(0).getReturnValue());
        return result;
    }
    
    /**
    *
    *   rest() method creates a new FunctionalList from the elements of the calling FunctionalArrayList
    *   then removes the head element
    *   
    *   @return a deep copy of the calling ArrayList with the head element removed
    *
    */
    @Override
    public FunctionalList rest() {
        FunctionalArrayList result = new FunctionalArrayList();
        int count = this.size()-1;
        for (int i = 0; i < this.size(); i++) {
            result.add(new ReturnObjectImpl(this.get(count).getReturnValue()));
            count--;
        }
        result.remove(0);
        return result;
    }
}