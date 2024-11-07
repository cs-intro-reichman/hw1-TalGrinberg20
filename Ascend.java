// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (lim * (Math.random()));
		int b = (int) (lim * (Math.random()));
		int c = (int) (lim * (Math.random()));
		int smallest = Math.min(Math.min(a,b), Math.min(a,c));
		int biggest = Math.max(Math.max(a,b), Math.max(a,c));
		int middle = Math.max(Math.min(a,b), Math.min(a,c));
		System.out.println(a + " " + b + " " + c);
		System.out.println(smallest + " " + middle + " " + biggest);
	}
}
