public class TestNodeUtil {

	private static void printList(Node n) {
		if (n == null)
			System.out.println();
		else {
			System.out.print(n.getElem() + " ");
			printList(n.getNext());
		}
	}

	public static void main(String[] args) {
		// Test per il metodo: fromTo
		System.out.println("fromTo:\nAtteso:    -3 -2 -1 0 1 2 3 4 5");
		System.out.print("Iterativo: ");
		Node l1 = NodeUtil.fromTo(-3, 5);
		printList(l1);
		System.out.print("Ricorsivo: ");
		Node l2 = NodeUtil.fromTo_rec(-3, 5);
		printList(l2);
		System.out.println();

		// Test per il metodo: occurrences
		Node l1x = new Node(2, new Node(2, l1));
		System.out.println("occurrences:\nAtteso:    3 1 0");
		System.out.println("Iterativo: " + 
			               NodeUtil.occurrences(l1x, 2) + " " +
						   NodeUtil.occurrences(l1x, 1) + " " +
						   NodeUtil.occurrences(l1x, 9));
		System.out.println("Ricorsivo: " + 
						   NodeUtil.occurrences_rec(l1x, 2) + " " +
						   NodeUtil.occurrences_rec(l1x, 1) + " " +
						   NodeUtil.occurrences_rec(l1x, 9));
		System.out.println();

		// Test per il metodo: included
		Node l3 = new Node(-1, new Node(2, new Node(4, null)));
		Node l4 = new Node(-1, new Node(3, new Node(0, null)));
		System.out.println("included:\nAtteso:    true true false false");
		System.out.println("Iterativo: " + 
			               NodeUtil.included(l1, l1) + " " +
						   NodeUtil.included(l3, l1) + " " +
						   NodeUtil.included(l1x, l1) + " " +
						   NodeUtil.included(l4, l1));
		System.out.println("Ricorsivo: " + 
						   NodeUtil.included_rec(l1, l1) + " " +
						   NodeUtil.included_rec(l3, l1) + " " +
						   NodeUtil.included_rec(l1x, l1) + " " +
						   NodeUtil.included_rec(l4, l1));
		System.out.println();

		// Test per il metodo: reverse
		System.out.println("reverse:\nAtteso:    5 4 3 2 1 0 -1 -2 -3");
		Node l1rev = NodeUtil.reverse(l1);
		System.out.print("Iterativo: ");
		printList(l1rev);
		Node l2rev = NodeUtil.reverse_rec(l1);
		System.out.print("Ricorsivo: ");
		printList(l2rev);
		System.out.println();

		// Test per il metodo: zipSum
		Node l5 = NodeUtil.fromTo(2, 10);
		System.out.println("zipSum:\nAtteso:    -1 1 3 5 7 9 11 13 15");
		Node l1zip = NodeUtil.zipSum(l1, l5);
		System.out.print("Iterativo: ");
		printList(l1zip);
		Node l2zip = NodeUtil.zipSum_rec(l1, l5);
		System.out.print("Iterativo: ");
		printList(l2zip);

		System.out.println("zipSum:\nAtteso:");
		Node l3zip = NodeUtil.zipSum(null, null);
		System.out.print("Iterativo: ");
		printList(l3zip);
		Node l4zip = NodeUtil.zipSum_rec(null, null);
		System.out.print("Iterativo: ");
		printList(l4zip);

	}
}