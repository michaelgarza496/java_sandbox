import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class interviewproblems {

	public static char firstRepeatingCharacter(String str) {
		Map<Character, Boolean> visited = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (visited.containsKey(c))
				return c;
			else
				visited.put(c, true);
		}
		return '\0';
	}

	public int[] removeDuplicates(int[] arr) {
		Set<Integer> removedDup = new HashSet<>();
		for (int i : arr)
			removedDup.add(i);
		int[] newArr = new int[removedDup.size()];
		int i = 0;
		for (Integer key : removedDup)
			newArr[i++] = key;
		return newArr;
		/// return Arrays.stream(arr).distinct().toArray();
	}

	public static int findDuplicate(int[] arr) {
		Map<Integer, Boolean> visited = new HashMap<>();
		for (int n : arr) {
			if (visited.containsKey(n))
				return n;
			else
				visited.put(n, true);
		}
		return -1;
	}

	static class Tree {
		int data;
		Tree left;
		Tree right;

		Tree(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		Tree(int data, Tree left, Tree right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public static void dfsPreorder(Tree root) {
		if (root.left != null)
			dfsPreorder(root.left);
		System.out.println(root.data + " ");
		
		if (root.right != null)
			dfsPreorder(root.right);
		System.out.print(root.data + " ");
	}

	public void dfsInorder(Tree root) {
		if (root.left != null) {
			dfsPreorder(root.left);
			System.out.print(root.data + " ");
		} else if (root.right != null)
			dfsPreorder(root.right);
		
	}

	public void dfsPostorder(Tree root) {
		// your code here
	}
	
	public static Tree buildTree(int[] data) {
		Tree root = new Tree(data[0]);
		Tree cursor = root;
		for (int i = 1; i < data.length; i++) {
			
		}
		return root;
	}

	public static void main(String[] args) {
//		char c = firstRepeatingCharacter("abcd");
//		System.out.println(findDuplicate(new int[] { 4, 2, 1, 3, 1 }));
		
		
	}
}
