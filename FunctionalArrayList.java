public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public ReturnObject head() {
        ReturnObjectImpl result = new ReturnObjectImpl(super.get(0).getReturnValue());
        return result;
    }
    
    public FunctionalList rest() {
        FunctionalArrayList result = new FunctionalArrayList();
        for (int i = 0; i < this.size(); i++) {
            result.add(this.get(i).getReturnValue());
        }
        result.remove(0);
        return result;
    }
}