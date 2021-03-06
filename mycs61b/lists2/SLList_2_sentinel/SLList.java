/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;
	private IntNode last; 

	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	} 

	

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		

 		IntNode p = sentinel;
 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 		// =========================================================== > 1
 		// ##########################
 		// ##### Question :    ######
 		// ##########################
 		// 什麼時候要用pointer?為什麼要用pointer?
 		// =========================================================
 		// while (sentinel.next != null) {
 		// 	sentinel = sentinel.next;
 		// }
 		// sentinel.next = new IntNode(x, null);
 		// =========================================================== < 2

 	}

 	/**faster addLast*/
 	public void addLast(int x){
 		last.next = new IntNode(x, null);
 		last = last.next;
 		size += 1;
 	}
// ====================================================================== > 1
 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}
 	// ===================================================================
 	/** another size method*/
 	/** Returns the size of the list starting at IntNode p. */
// private static int size(IntNode p) {
//     if (p.next == null) {
//         return 1;
//     }

//     return 1 + size(p.next);
// }
// public int size() {
//     return size(first);
// }
 	// ================================================================ < 2


	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		SLList L = new SLList();
 		L.addLast(15);
 		L.addLast(20);
 		System.out.println(L.size());
 		
 	}
}