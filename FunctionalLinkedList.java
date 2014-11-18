public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public ReturnObject head() {
        ReturnObjectImpl result = new ReturnObjectImpl(super.get(0).getReturnValue());
        return result;
    }
    
    public FunctionalList rest() {
        FunctionalLinkedList result = new FunctionalLinkedList();
        
        
        for (int i = 0; i < this.size(); i++) {
            result.add(get(i).getReturnValue());
        }
        result.remove(0);
        return result;
    }
}