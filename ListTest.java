import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ListTest {
        
        ArrayList newArray;
        
        LinkedList listStart;
        
        FunctionalArrayList newFunctionalArrayList;
        
        SampleableListImpl newSample;
        
        StackImpl newStack;
        
        ImprovedStackImpl newImprovedStack;
        
        /* @Before
        public void buildArrayList() {
            newArray = new ArrayList();
        }
        
        @Test
        public void testEmptyStructure() {
            System.out.println(newArray.get(0));
        }

        
        @Test
        public void testAdd() {
            newArray.add(1);
            
            newArray.add("Hello");

            newArray.add("WORDS");
            
            newArray.add(4.5);
            
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        
        @Test
        public void testSize() {
            System.out.println(newArray.size());
            assertEquals(0, newArray.size());
            
        }
        
        
        @Test
        public void testIndexAdd() {
            newArray.add(0, "STRING");
        
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        @Test
        public void testAddVoid () {
            System.out.println(newArray.add(2, null));
    
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        
        @Test
        public void testAddALot () {
            for (int i = 0; i < 20; i++) {
                newArray.add(i);
            }
        
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        @Test
        public void testRemove () {
            newArray.remove(0);
            newArray.remove(0);
            newArray.remove(0);
            newArray.remove(0);
            newArray.remove(0);
            newArray.remove(0);
            
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        @Test
        public void testGet () {
            System.out.println(newArray.get(48904));
            
            System.out.println(Arrays.toString(newArray.objectArray));
        }
        
        @After
        public void cleanArrayList () {
            newArray = null;
        } */
        
        /* @Before
        public void buildFunctionalList () {
            newFunctionalArrayList = new FunctionalArrayList();
        }
        
        @Test
        public void testAdd () {
            newFunctionalArrayList.add(1);
            
            newFunctionalArrayList.add("Hello");

            newFunctionalArrayList.add("WORDS");
            
            newFunctionalArrayList.add(4.5);
            
            System.out.println(Arrays.toString(newFunctionalArrayList.objectArray));
        }
        
        @Test
        public void testHead () {
            newFunctionalArrayList.add(new FunctionalArrayList());
            newFunctionalArrayList.add(4.5);
            newFunctionalArrayList.add(1);
            newFunctionalArrayList.add("Hello");
            newFunctionalArrayList.add("WORDS");
            newFunctionalArrayList.add(true);
            
            
            System.out.println(newFunctionalArrayList.head());
        }
        
        @Test
        public void testRest () {
            newFunctionalArrayList.add(new FunctionalArrayList());
            newFunctionalArrayList.add(4.5);
            newFunctionalArrayList.add(1);
            newFunctionalArrayList.add("Hello");
            newFunctionalArrayList.add("WORDS");
            newFunctionalArrayList.add(true);
            
            FunctionalArrayList newTest = (FunctionalArrayList)newFunctionalArrayList.rest();
            
            System.out.println(Arrays.toString(newTest.objectArray));
            
        }
        
        @After
        public void cleanFunctionalArrayList () {
            newFunctionalArrayList = null;
        } */
        
        
        /* @Before
        public void buildSample () {
            newArray = new ArrayList();
            newArray.add(1);
            newArray.add("Hello");
            newArray.add("WORDS");
            newArray.add(4.5);
            newArray.add(true);
            newArray.add("Long words");
            newArray.add(false);
            newArray.add(new ArrayList());
            
            newSample = new SampleableListImpl(newArray);
        }
        
        @Test
        public void testSample () {
            SampleableList test = newSample.sample();
            
            SampleableListImpl newTest1 = (SampleableListImpl)test;
            
            System.out.println(newTest1.list.get(-1));
            System.out.println(newTest1.list.get(0));
            System.out.println(newTest1.list.get(1));
            System.out.println(newTest1.list.get(2));
            System.out.println(newTest1.list.get(3));
            System.out.println(newTest1.list.get(4));
            System.out.println(newTest1.list.get(5));
        }
        
        @After
        public void cleanSample () {
            newSample = null;
            newArray = null;
        }
         */
        
        /* @Before
        public void buildStack () {
            newStack = new StackImpl();
        }
        
        @Test
        public void pushTest () {
            newStack.push("abc");
            newStack.push(123);
            newStack.push(4.5);
            newStack.push("123");
            
            System.out.println(newStack.top());
        }
        
        @Test
        public void popTest () {
            newStack.push("abc");
            newStack.push(789);
            newStack.push(4.5);
            newStack.push("123");
            
            System.out.println(newStack.top());
            
            newStack.pop();
            
            System.out.println(newStack.top());
            
            newStack.pop();
            
            System.out.println(newStack.top());
            
        }
        
        @After
        public void cleanStack () {
            newStack = null;
        } */
        
        
        @Before
        public void buildImproved () {
            newArray = new ArrayList();
            newArray.add(1);
            newArray.add("Hello");
            newArray.add("WORDS");
            newArray.add(4.5);
            newArray.add(true);
            newArray.add("Long words");
            newArray.add(false);
            newArray.add(new ArrayList());
        
            newImprovedStack = new ImprovedStackImpl (newArray);
        }
        
        @Test
        public void testReverse () {
            
        }
        
        @After
        public void cleanImproved () {
            newArray = null;
            newImprovedStack = null;
        }
        
       /*  @Before
        public void buildLinkedList() {
            listStart = new LinkedList();
        }
        
        @Test
        public void testEmptyStructure () {
            System.out.println(newLinkedList);
        }
        
        @Test
        public void testAdd() {
            
            System.out.println(listStart.get(0));
            
            System.out.println(listStart.add(123));
            System.out.println(listStart.get(0));
            System.out.println(listStart.getIndex());
            System.out.println(listStart.size());
            
            System.out.println(listStart.add(456));
            System.out.println(listStart.get(1));
            System.out.println(listStart.next.getIndex());
            System.out.println(listStart.size());
            
            System.out.println(listStart.add(789));
            System.out.println(listStart.get(2));
            System.out.println(listStart.next.next.getIndex());
            System.out.println(listStart.size());
            
            System.out.println(listStart.add("abc"));
            System.out.println(listStart.get(3));
            System.out.println(listStart.next.next.next.getIndex());
            System.out.println(listStart.size());
            
        }
        
        @After
        public void cleanLinkedList() {
            listStart = null;
        } */
}