public class IntList{
	public int first;
	public IntList rest;

	public IntList(int f, IntList r){
		first = f;
		rest = r;
	}
	 public int get (int i){
	 	if (i ==0){return this.first;}
	 	return this.rest.get(i-1);
	 }
	 public static IntList dincrList(IntList Li, int x){
	 	if( Li == null){return Li;}

	 	Li.first += x;
	 	dincrList(Li.rest, x);
	 	return Li;
	 }
	 public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
        System.out.println("hi"+dincrList(L,3).get(2));
        System.out.println("hi");
    }
}