/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int capacity;
    private int filledElements;
    private int[] list;
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
	capacity = 2;
        list = new int[capacity];
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
	String output = "[";
	for (int ele : list){
	    output += ele + ",";
	}
	return output + "]";
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
	 list[filledElements + 1] = value;
	 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
	 list = new int[capacity *= 2];
	 System.out.println( "expand... (for debugging)" + capacity);
	 /* S.O.P. rules for debugging:
              Working methods should be silent. But during 
              development, the programmer must verify that 
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
	 */
     }
}
