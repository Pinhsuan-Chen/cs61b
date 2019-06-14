public class SLList{
	private class IntNode{
		public int item;
		public IntNode next;
		public IntNode(int item, IntNode){
			this.item = item;
			this.next = next;
		}
	}
	private IntNode first;

	public void addFirst(int x){
		first = new IntNode(x, first)
	}

	public void insert(int item, int position){
		// if new IntNode is the first
		if(position == 0 || first == null){
			addFirst(item);
			return;
		}

		IntNode currentNode = first;

		// pos>1
		if(position>1 && currentNode != null){
			position --;
			currentNode = currendNode.next;
		}

		// add to the position after currentNode
		IntNode newNode = new IntNode(item, currentNode.next);
		currendNode.next = newNode;

	}

	public void reverse(){
		IntNode frontOfReversed = null;
		Intnode nextNodeToAdd = first;
		while(nextNodeToAdd != null){
			IntNode nextNextNodeToAdd = nextNodeToAdd.next;
			nextNodeToAdd.next = frontOfReversed;
			frontOfReversed = nextNodeToAdd;
			nextNodeToAdd = nextNextNodeToAdd;	
		}
		first = frontOfReversed;
		

	}
}