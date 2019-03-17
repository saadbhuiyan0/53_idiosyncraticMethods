/**
  Implement a list of diverse types.
 */

public class List_inArraySlots {

    private int filledElements; // the number of elements in this list
    private Object[] list;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      list = new Object[ INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
      return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
      String stringRep = "[";

      for (int index = 0; index < filledElements; index++)
        stringRep += list[index] + ",";

      stringRep += "]";
      return stringRep;
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( Object val) {
        // expand when at max
        if (filledElements == list.length) expand();
        list[ filledElements++] = val;
        return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        // create new list, copy values over, and replace list
        Object[] bigger = new Object[list.length * 2];

        // copy existing elements
        for(int index=0; index<list.length; index++)
            bigger[index] = list[index];

        list = bigger;
     }


     public Object get( int index){
        // pass-through request
        return list[ index];
    }
}
