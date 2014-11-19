/**
*
*   a SampleableListImpl is an implementation of SampleableList
*
*/

public class SampleableListImpl implements SampleableList {

    private List list;

    public SampleableListImpl (List list) {
        this.list = list;
    }

    /**
    *
    *   sample() creates a new SampleableList with only the odd elements of the list field
    *
    *   @return a new SampleableList with only the odd elements of list
    *
    */
    @Override
    public SampleableList sample() {
        ArrayList testArray = new ArrayList();
        SampleableList test = new SampleableListImpl(testArray);
       
        for (int i = 0; i < list.size()-1; i++) {
            if (isOdd(i)) {
                test.add(new ReturnObjectImpl(list.get(i).getReturnValue()));
            }
        }
        return test;
    }
   
    /**
    *
    *   add calls the add method of the list field
    *
    *   @param the index position and Object to be added
    *   @return the ReturnObject returned by the list.add() method
    *
    */
    @Override
    public ReturnObject add(int index, Object item) {  
        return list.add(index, item);
    }
    
    /**
    *
    *   add calls the add method of the list field
    *
    *   @param the Object to be added
    *   @return the ReturnObject returned by the list.add() method
    *
    */
    @Override
    public ReturnObject add(Object item) {
        return list.add(item);
    }
    
    /**
    *
    *   remove calls the remove method of the list field
    *
    *   @param the index position and Object to be removed
    *   @return the ReturnObject returned by the list.remove() method
    *
    */
    @Override
    public ReturnObject remove(int index) {
        return list.remove(index);
    }
    
    /**
    *
    *   get calls the get method of the list field
    *
    *   @param the index position of the element to be retrieved
    *   @return the ReturnObject returned by the list.get() method
    *
    */
    @Override
    public ReturnObject get(int index) {
        return list.get(index);
    }
    
    /**
    *
    *   size calls the list.size() method
    *
    *   @return the int returned by list.size()
    *
    */
    @Override
    public int size() {
        return list.size();
    }
    
    /**
    *
    *   isEmpty() calls the list.isEmpty() method
    *
    *   @return the boolean returned by list.isEmpty()
    *
    */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
   
    /**
    *
    *   returns whether or not the integer input is an odd number
    *
    *   @param the int to be tested
    *   @return true or false value of oddness
    *
    */
    private boolean isOdd(int i) {
        boolean result;
        if (i % 2 == 0) {
            result = false;
        }
        else {
            result = true;
        }
        return result;
    }
}