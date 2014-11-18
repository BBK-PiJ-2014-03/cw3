public class SampleableListImpl implements SampleableList {

    private List list;

    public SampleableListImpl (List list) {
        this.list = list;
    }

    public SampleableList sample() {
        ArrayList testArray = new ArrayList();
        SampleableList test = new SampleableListImpl(testArray);
       
        for (int i = 0; i < list.size(); i++) {
            if (isOdd(i)) {
                test.add(list.get(i).getReturnValue());
            }
        }
        return test;
    }
   
    public ReturnObject add(int index, Object item) {  
        return list.add(index, item);
    }
    public ReturnObject add(Object item) {
        return list.add(item);
    }
    public ReturnObject remove(int index) {
        return list.remove(index);
    }
    public ReturnObject get(int index) {
        return list.get(index);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
   
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