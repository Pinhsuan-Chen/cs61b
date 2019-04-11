/** Array based list.
 *  @author Josh Hug
 */
//       0 1  2 3 4 5 6 7
// items[7 9 -1 8 5 0 0 0 ...]
// size: 5


public class AList {
    int[] items;
    int size;
    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }
    private void resize (int capacity){
        
            int[] a = new int[capacity];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
        
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == items.length){
            resize(size +1);
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
       int x = getLast();
       //items[size] = 0 // unnecessary
       size -= 1;
       return x;
    }

    public static void main(String[] args){
        AList hiList = new AList();
        hiList.addLast(38);
        System.out.println(hiList.size());
    }
} 