/** The Basic SLList and Helper IntNode Class*/
public class SLList{
	public IntNode first;
	private int size; 

	private static class IntNode{
		public int item; 
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}
	public SLList(int x){
		first = new IntNode(x,null);
		size = 1;

	}

	public void addFirst(int x){
		first = new IntNode(x, first);
		size += 1;
	}

	public int getFirst(){
		return first.item;
	}
	public void addLast(int x){
		Intnode p = first;

		while(p.next != null){
			p = p.next;
		}
		p.next = new IntNode(x, null);
		size += 1;

	}


	public static void main(String[] args){
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println("HI");
		System.out.println(L.getFirst());
	}

}