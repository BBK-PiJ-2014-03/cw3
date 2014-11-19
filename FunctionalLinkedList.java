/**
*
*   A FunctionalLinkedList is an extension of LinkedList which implements the FunctionalList interface
*
*/

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    /**
    *
    *   head() method creates a deep copy of the element at the head of the LinkedList
    *
    *   @return a deep copied ReturnObject with the same value as the ReturnObject at the head of the LinkedList
    *
    */
    @Override
    public ReturnObject head() {
        ReturnObjectImpl result = new ReturnObjectImpl(super.get(0).getReturnValue());
        return result;
    }
    
    /**
    *
    *   rest() method creates a new FunctionalList from the elements of the calling FunctionalLinkedList
    *   then removes the head element
    *   
    *   @return a deep copy of the calling LinkedList with the head element removed
    *
    */
    public FunctionalList rest() {
        FunctionalList result = new FunctionalLinkedList();
        int count = this.size()-1;
        for (int i = 0; i < this.size()-1; i++) {
            result.add(new ReturnObjectImpl(this.get(count).getReturnValue()));
            count--;
        }
        result.remove(0);
        return result;
    }
}