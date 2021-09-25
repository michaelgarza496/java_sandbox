package com.michael;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

//	public static void main(String args[]) {
//        LinkedList linkedList1 = new LinkedList();
//        linkedList1.addAtEnd("ABC");
//        linkedList1.addAtEnd("DFG");
//        linkedList1.addAtEnd("XYZ");
//        linkedList1.addAtEnd("EFG");
//            
//        LinkedList linkedList2 = new LinkedList();
//        linkedList2.addAtEnd("ABC");
//        linkedList2.addAtEnd("DFG");
//        linkedList2.addAtEnd("XYZ");
//        linkedList2.addAtEnd("EFG");
//            
//        System.out.println("Initial List");
//        linkedList1.display();
//
//        System.out.println("\nList after left shifting by 2 positions");
//        shiftListLeft(linkedList1, 2);
//        linkedList1.display();
//            
//        System.out.println("\nInitial List");
//        linkedList2.display();
//            
//        System.out.println("\nList after right shifting by 2 positions");
//        shiftListRight(linkedList2, 2);
//        linkedList2.display();
//    }
//
//    public static void shiftListLeft(LinkedList linkedList, int n) {
//    	
//    	if (linkedList.getHead() != linkedList.getTail() || linkedList.getHead() != null) {
//    		for (int i = 0; i < n; i++) {
//		    	String dataToBeMoved = linkedList.getHead().getData();
//		    	linkedList.delete(dataToBeMoved);
//		    	linkedList.addAtEnd(dataToBeMoved);
//    		}
//    	}
//    }
//
//    public static void shiftListRight(LinkedList linkedList, int n) {
//
//    	if (linkedList.getHead() != linkedList.getTail() || linkedList.getHead() != null) {
//    		for (int i = 0; i < n; i++) {
//		    	String dataToBeMoved = linkedList.getTail().getData();
//		    	linkedList.delete(dataToBeMoved);
//		    	linkedList.addAtBeginning(dataToBeMoved);
//    		}
//    	}
//    }

//	public static void main(String args[]) {
//
//        LinkedList linkedList = new LinkedList();
//        LinkedList reversedLinkedList = new LinkedList();
//            
//        linkedList.addAtEnd("Data");
//        linkedList.addAtEnd("Structures");
//        linkedList.addAtEnd("and");
//        linkedList.addAtEnd("Algorithms");
//            
//        System.out.println("Initial List");
//        linkedList.display();
//
//        System.out.println();
//            
//        reverseList(linkedList.getHead(), reversedLinkedList);
//        System.out.println("Reversed List");
//        reversedLinkedList.display();
//    }
//
//    public static void reverseList(Node head, LinkedList reversedLinkedList) {
//        
//    	while(head != null) {
//    		reversedLinkedList.addAtBeginning(head.getData());
//    		head = head.getNext();
//    	}
//    }

//	public static void main(String args[]) {
//        
//        Stack stack = new Stack(10);
//        stack.push(15);
//        stack.push(25);
//        stack.push(30);
//        stack.push(40);
//            
//        stack.display();
//            
//        if (checkTop(stack)) {
//            System.out.println("The top most element of the stack is an even number");
//        } else {
//            System.out.println("The top most element of the stack is an odd number");
//        }
//    }
//
//    public static boolean checkTop(Stack stack) {
//        
//    	if (stack.peek() % 2 == 0)
//    		return true;
//        return false;
//    }

//	
//	public static void main(String[] args) {
//        
//        Queue queue = new Queue(7);
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.enqueue(9);
//        queue.enqueue(4);
//        queue.enqueue(6);
//        queue.enqueue(5);
//        queue.enqueue(10);
//
//        Queue[] queueArray = splitQueue(queue);
//            
//        System.out.println("Elements in the queue of odd numbers");
//        queueArray[0].display();
//            
//        System.out.println("\nElements in the queue of even numbers");
//        queueArray[1].display();
//
//    }
//      
//    public static Queue[] splitQueue(Queue queue) {
//        //Implement your code here and change the return value accordingly
//    	Queue q[] = {new Queue(queue.getMaxSize()), new Queue(queue.getMaxSize())};
////    	q[0] = new Queue(queue.getMaxSize());
////    	q[1] = new Queue(queue.getMaxSize());
//    	while (!queue.isEmpty()) {
//    		int item = queue.dequeue();
//    		if (item % 2 == 0) {
//    			q[1].enqueue(item);
//    		} else {
//    			q[0].enqueue(item);
//    		}
//    	}
//        return q; 
//    }

//	public static void main(String args[]) {
//        
//        Stack stack = new Stack(10);
//        stack.push(15);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.display();
//        calculateSum(stack);
//            
//        System.out.println("Updated stack");
//        stack.display();
//    }
//
//    public static void calculateSum(Stack stack) {
//        //Implement your code here
//    	Stack temp = new Stack(100);
//    	int sum = 0;
//    	while(!stack.isEmpty()) {
//    		int num = stack.pop();
//    		sum += num;
//    		temp.push(num);
//    	}
//    	stack.push(sum);
//    	while(!temp.isEmpty()) {
//    		stack.push(temp.pop());
//    	}
//    }

//	public static void main(String[] args) {
//        
//        Queue queue = new Queue(7);
//        queue.enqueue(13983);
//        queue.enqueue(10080);
//        queue.enqueue(7113);
//        queue.enqueue(2520);
//        queue.enqueue(2500);
//
//        Queue outputQueue = findEvenlyDivisibleNumbers(queue);
//            
//        System.out.println("Evenly divisible numbers");
//        outputQueue.display();
//
//    }
//      
//    public static Queue findEvenlyDivisibleNumbers(Queue queue) {
//        //Implement your code here and change the return value accordingly
//    	Queue divisibleQ = new Queue(queue.getMaxSize());
//    	
//    	while (!queue.isEmpty()) {
//    		int n = queue.dequeue();
//    		boolean div = true;
//    		for (int i = 2; i <= 10; i++) {
//        		if (n % i != 0) {
//        			div = false;
//        			break;
//        		}
//        	}
//    		if (div)
//    			divisibleQ.enqueue(n);
//    	}
//        return divisibleQ;
//    }

//	public static List<String> getItems(List<Order> orders) {
//		//Implement your logic here and change the return statement accordingly
//		List<String> allItems = new ArrayList<>();
//		for (Order order : orders) {
//			for (String item : order.getItemNames()) {
//				allItems.add(item);
//			}
//		}
//		return allItems;
//		Iterator<Order> orderIterator = orders.iterator();
//		while (orderIterator.hasNext()) {
//			Order order = orderIterator.next();
//			Iterator<String> itemIterator = order.getItemNames().iterator();
//			while (itemIterator.hasNext()) {
//				String item = itemIterator.next();
//				allItems.add(item);
//			}
//		}
//		return allItems;
//	}
//    
//	public static void main(String[] args) {
//		List<Order> orders = new ArrayList<Order>();
//
//		List<String> items1 = new ArrayList<String>();
//		items1.add("FriedRice");
//		items1.add("Pasta");
//		items1.add("Tortilla");
//		orders.add(new Order(101, items1, true));
//
//		List<String> items2 = new ArrayList<String>();
//		items2.add("Pizza");
//		items2.add("Pasta");
//		orders.add(new Order(102, items2, true));
//
//		List<String> items3 = new ArrayList<String>();
//		items3.add("Burger");
//		items3.add("Sandwich");
//		items3.add("Pizza");
//		orders.add(new Order(103, items3, true));
//
//		List<String> items = getItems(orders);
//		System.out.println("List of Items:");
//		for (String item : items) {
//			System.out.println(item);
//		}
//
//	}

//	public static List<Participant> generateListOfFinalists(Participant[] finalists) {
//		// Implement your logic here and change the return statement accordingly
//		return Arrays.asList(finalists);
//	}
//
//	public static List<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
//		// Implement your logic here and change the return statement accordingly
//		List<Participant> allFinalists = new ArrayList<>();
//		for (Participant participant : finalists) {
//			if (participant.getParticipantTalent().equals(talent)) {
//				allFinalists.add(participant);
//			}
//		}
//		return allFinalists;
//	}
//
//	public static void main(String[] args) {
//		Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
//		Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
//		Participant finalist3 = new Participant("John", "Singing", 94.5);
//		Participant finalist4 = new Participant("Bravo", "Singing", 97.6);
//
//		Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };
//
//		List<Participant> finalistsList = generateListOfFinalists(finalists);
//
//		System.out.println("Finalists");
//		for (Participant finalist : finalistsList)
//			System.out.println(finalist);
//
//		String talent = "Singing";
//		System.out.println("Finalists in " + talent + " category");
//
//		List<Participant> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
//		for (Participant finalist : finalistsCategoryList)
//			System.out.println(finalist);
//	}
//	
//	
//	
//    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
//		//Implement your logic here and change the return statement accordingly
//    	List<Object> concatList = new LinkedList<Object>(listOne);
////    	for (Object obj : listOne) {
////    		concatList.add(obj);
////    	}
//    	Iterator<Object> listTwoIterator = ((LinkedList<Object>) listTwo).descendingIterator();
//    	while(listTwoIterator.hasNext()) {
//    		concatList.add(listTwoIterator.next());
//    	}
//    	return concatList;
//	}
//
//
//	public static void main(String args[]) {
//		List<Object> listOne = new LinkedList<Object>();
//		listOne.add("Hello");
//		listOne.add(102);
//		listOne.add(25);
//		listOne.add(38.5);
//		
//		List<Object> listTwo = new LinkedList<Object>();
//		listTwo.add(150);
//		listTwo.add(200);
//		listTwo.add('A');
//		listTwo.add("Welcome");
//		
//		List<Object> concatenatedList = concatenateLists(listOne, listTwo);
//		
//		System.out.println("Concatenated linked list:");
//		for (Object value : concatenatedList) {
//			System.out.print(value+" ");
//		}
//	}

//	public static Set<Student> findDuplicateEntries(List<Student> students) {
//		//Implement your logic here and change the return statement accordingly 
//		Set<Student> studentsHS = new HashSet<Student>();
//		Set<Student> duplicates = new HashSet<>();
//		for (Student student : students) {
//			if (!studentsHS.add(student)) {
//				duplicates.add(student);
//			}
//		}
//		return duplicates;
//	}
//	
//	public static void main(String[] args) {
//		List<Student> students = new ArrayList<Student>();
//
//		students.add(new Student(1001, "Dean", 111));
//		students.add(new Student(1002, "Harley", 112));
//		students.add(new Student(1003, "Franklin", 113));
//		students.add(new Student(1005, "Arden", 113));
//		students.add(new Student(1100, "Juliet", 112));
//		students.add(new Student(1003, "Franklin", 111));
//		students.add(new Student(1001, "Dean", 114));
//
//		Set<Student> duplicateStudents = findDuplicateEntries(students);
//		System.out.println("Students who have applied for re-evaluation in more than one subject");
//		for(Student student: duplicateStudents)
//		    System.out.println(student);
//	}

//	public static void main(String args[]) {
//		Map<String, Double> studentMarks = new HashMap<String, Double>();
//	    studentMarks.put("Lily", 90.0);
//		studentMarks.put("Robin", 68.0);
//		studentMarks.put("Marshall", 76.5);
//		studentMarks.put("Neil", 67.0);
//		studentMarks.put("Ted", 92.0);
//		
//		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
//		
//		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
//		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
//			System.out.println(entry.getKey()+" -- "+entry.getValue());
//		}
//		
//	}

//	public static List<Integer> removeDuplicates(List<Integer> list) {
//        //Implement your logic here and change the return statement accordingly
//		List<Integer> uniqueList = new LinkedList<Integer>();
//		for (Integer integer : list) {
//			if (!uniqueList.contains(integer)) {
//				uniqueList.add(integer);
//			}
//		}
//        return uniqueList;
//	}
//	
//	public static void main(String args[]) {
//		List<Integer> list = new LinkedList<Integer>();
//		list.add(10);
//		list.add(15);
//		list.add(21);
//		list.add(15);
//		list.add(10);
//		
//		List<Integer> updatedList = removeDuplicates(list);
//		
//		System.out.println("Linked list without duplicates");
//		for (Integer value : updatedList) {
//			System.out.print(value+" ");
//		}
//	}

//	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
//	    //Implement your logic here and change the return statement accordingly
//		List<Integer> commonElements = new LinkedList<Integer>();
//		for (Integer integer : listOne) {
//			if (listTwo.contains(integer)) {
//				commonElements.add(integer);
//			}
//		}
//	    return commonElements;
//	}
//	
//	public static void main(String arga[]){
//
//		List<Integer> listOne = new LinkedList<Integer>();
//		listOne.add(10);
//		listOne.add(12);
//		listOne.add(21);
//		listOne.add(1);
//		listOne.add(53);
//		
//		List<Integer> listTwo = new LinkedList<Integer>();
//		listTwo.add(11);
//		listTwo.add(21);
//		listTwo.add(25);
//		listTwo.add(53);
//		listTwo.add(47);
//
//		System.out.println(findCommonElements(listOne, listTwo));
//	}

//	public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
//		 //Implement your logic here and change the return statement accordingly
//		List<Integer> mergedList = new LinkedList<>();
//		int i = 0, j = 0;
//		while(true) {
//			if (i >= listOne.size()) {
//				while (j < listTwo.size()) {
//					mergedList.add(listTwo.get(j++));
//				}
//				break;
//			} else if (j >= listTwo.size()) {
//				while (i < listOne.size()) {
//					mergedList.add(listOne.get(i++));
//				}
//				break;
//			}
//			
//			if (listOne.get(i) < listTwo.get(j)) {
//				mergedList.add(listOne.get(i++));
//			} else {
//				mergedList.add(listTwo.get(j++));
//			}
//		}
//		 return mergedList;
//	}
//
//	public static void main(String args[]) {
//		List<Integer> listOne = new LinkedList<Integer>();
//		listOne.add(10);
//		listOne.add(13);
//		listOne.add(21);
//		listOne.add(42);
//		listOne.add(56);
//		
//		List<Integer> listTwo = new LinkedList<Integer>();
//		listTwo.add(15);
//		listTwo.add(20);
//		listTwo.add(21);
//		listTwo.add(85);
//		listTwo.add(92);
//		
//		List<Integer> mergedList = mergeLists(listOne, listTwo);
//		System.out.println(mergedList);
//	}

//	public static void main(String arga[]){
//		Queue queue= new Queue(5);
//		
//		queue.enqueue("Emily");
//		queue.enqueue("Lily");
//		queue.enqueue("Rachel");
//		queue.enqueue("Rose");
//		
//		queue.dequeue();
//		queue.dequeue();
//	
//		System.out.println(queue.getQueue());
//	}

//	public static Set<Student> findUnique(List<Student> students) {
//		//Implement your logic here and change the return statement accordingly 
//		Set<Student> unique = new HashSet<>(), dup = new HashSet<>();
//		for (Student student : students)
//			if (!unique.add(student))
//				dup.add(student);
//		unique.removeAll(dup);
//		return unique;
//	}
//
//	public static Set<Student> findDuplicates(List<Student> students) {
//		//Implement your logic here and change the return statement accordingly 
//		Set<Student> unique = new HashSet<>(), dup = new HashSet<>();
//		for (Student student : students)
//			if (!unique.add(student))
//				dup.add(student);
//		return dup;
//	}
//	
//	public static void main(String[] args) {
//		List<Student> students = new ArrayList<Student>();
//
//		students.add(new Student(5004, "Wyatt", "Wyatt@example.com","Dance"));
//		students.add(new Student(5010, "Lucy", "Lucy@example.com","Dance"));
//		students.add(new Student(5550, "Aaron", "Aaron@example.com","Dance"));
//		students.add(new Student(5560, "Ruby", "Ruby@example.com","Dance"));
//		students.add(new Student(5015, "Sophie", "Sophie@example.com","Music"));
//		students.add(new Student(5013, "Clara", "Clara@example.com","Music"));
//		students.add(new Student(5010, "Lucy", "Lucy@example.com","Music"));
//		students.add(new Student(5011, "Ivan", "Ivan@example.com","Music"));
//		students.add(new Student(5550, "Aaron", "Aaron@example.com","Music"));
//
//		Set<Student> studentNominations = findUnique(students);
//		System.out.println("Students who have submitted nominations");
//		for(Student student: studentNominations)
//		    System.out.println(student);
//
//		Set<Student> duplicateStudents = findDuplicates(students);
//		System.out.println("Students who have submitted nominations for both the events");
//		for(Student student: duplicateStudents)
//		    System.out.println(student);
//	}

//	public static List<String> sortSales(Map<String, Integer> sales) {
//		// Implement your logic here and change the return statement accordingly
//		List<String> names = new LinkedList<>();
//		List<Integer> salez = new LinkedList<>();
//		for (Map.Entry<String, Integer> sale : sales.entrySet()) {
//
//			if (salez.isEmpty()) {
//				names.add(sale.getKey());
//				salez.add(sale.getValue());
//				continue;
//			}
//			for (int i = 0; i <= salez.size(); i++) {
//				if (salez.get(i) < sale.getValue()) {
//					salez.add(i, sale.getValue());
//					names.add(i, sale.getKey());
//					break;
//				} else if (i == salez.size() - 1) {
//					salez.add(sale.getValue());
//					names.add(sale.getKey());
//				}
//			}
//
//		}
//		return names;
//	}

//	for (int j = 0; j <= i+1; j++) {
//	if (j == i + 1) {
//		names[j] = sale.getKey();
//		salez[j] = sale.getValue();
//		i++;
//		break;
//	} else if (salez[j] >= sale.getValue()) {
//		names[j + 1] = sale.getKey();
//		salez[j + 1] = sale.getValue();
//		i++;
//		break;
//	} else {
//		names[j + 1] = names[j];
//		salez[j + 1] = salez[j];
//	}
//}

//	public static void main(String args[]) {
//		Map<String, Integer> sales = new HashMap<String, Integer>();
//		sales.put("Mathew", 50);
//		sales.put("Lisa", 76);
//		sales.put("Courtney", 45);
//		sales.put("David", 49);
//		sales.put("Paul", 49);
//
//		List<String> employees = sortSales(sales);
//
//		System.out.println("Employees in the decreasing order of their sales\n=====================================");
//		for (String employeeName : employees) {
//			System.out.println(employeeName);
//		}
//	}

//	public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
//		//Implement your logic here and change the return statement accordingly
//		Deque<Object> mergedQueue = new ArrayDeque<>();
//		while (intQueue.peek() != null || charQueue.peek() != null) {
//			if (intQueue.peek() != null)
//				mergedQueue.add(intQueue.poll());
//			if (charQueue.peek() != null)
//				mergedQueue.add(charQueue.poll());
//		}
//		return mergedQueue;
//	}
//
//	public static void main(String[] args) {
//		
//		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
//		integerQueue.add(3);
//		integerQueue.add(6);
//		integerQueue.add(9);
//		
//		Deque<Character> characterQueue = new ArrayDeque<Character>();
//        characterQueue.add('a');
//		characterQueue.add('e');
//		characterQueue.add('i');
//		characterQueue.add('o');
//		characterQueue.add('u');
//		characterQueue.add('b');
//		
//		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
//		
//		System.out.println("The elements in the merged queue are:");
//		for(Object element: mergedQueue)
//		    System.out.println(element);
//	    
//	}

//	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
//		//Implement your logic here and change the return statement accordingly
//		List<Integer> orderedD = new LinkedList<>();
//		while (inputStack.peek() != null) {
//			if (orderedD.isEmpty()) {
//				orderedD.add(inputStack.pop());
//				continue;
//			} else {
//				int val = inputStack.pop();
//				for (int i = 0; i < orderedD.size(); i++) {
//					if (val >= orderedD.get(i)) {
//						orderedD.add(i, val);
//						break;
//					} 
//				}
//			}
//		}
//		return new ArrayDeque<Integer>(orderedD);
//	}
//
//	public static void main(String[] args) {
//		
//		Deque<Integer> inputStack = new ArrayDeque<Integer>();
//		inputStack.push(10);
//		inputStack.push(8);
//		inputStack.push(5);
//		inputStack.push(12);
//		inputStack.push(5);
//	
//		Deque<Integer> updatedStack = changeSmallest(inputStack);
//		
//		System.out.println("Stack After Modification:");
//		for (Integer value : updatedStack)
//			System.out.println(value);
//	}

//	public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
//	    //Implement your logic here and change the return statement accordingly
//		Deque<Patient> senior = new ArrayDeque<>();
//		Deque<Patient> remaining = new ArrayDeque<>();
//		List<Deque<Patient>> splitQ = new ArrayList<>();
//		while (patientsQueue.peek() != null) {
//			Patient patient = patientsQueue.pop();
//			if (patient.getAge() >= 60)
//				senior.add(patient);
//			else
//				remaining.add(patient);
//		}
//		splitQ.add(senior);
//		splitQ.add(remaining);
//		return splitQ;
//	}
//
//	public static void main(String[] args) {
//		
//		Patient patient1=new Patient("Jack","Male",25);
//		Patient patient2=new Patient("Tom","Male",64);
//		Patient patient3=new Patient("Simona","Female",24);
//
//		Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
//		patientsQueue.add(patient1);
//		patientsQueue.add(patient2);
//		patientsQueue.add(patient3);
//
//		List<Deque<Patient>> queuesList = splitQueue(patientsQueue);
//		
//		int counter=0;
//		for (Deque<Patient> queue : queuesList) {
//			if(counter==0)
//				System.out.println("Patients in the senior queue\n============================");
//			else
//				System.out.println("Patients in the normal queue\n============================");
//			
//			for (Patient patient : queue) {
//				System.out.println("Name : "+patient.getName());
//				System.out.println("Age : "+patient.getAge());
//				System.out.println();
//			}
//			counter++;
//		}	
//	}

//	public static Deque<Character> updateStack(Deque<Character> inputStack) {
//		// Implement your logic here and change the return statement accordingly
//		Deque<Character> temp = new ArrayDeque<>();
//		while (inputStack.size() > 3)
//			temp.add(inputStack.poll());
//		inputStack.addAll(temp);
//		return inputStack;
//	}
//
//	public static void main(String[] args) {
//
//		Deque<Character> inputStack = new ArrayDeque<Character>();
//		inputStack.push('E');
//		inputStack.push('D');
//		inputStack.push('C');
//		inputStack.push('B');
//		inputStack.push('A');
//
//		Deque<Character> resultStack = updateStack(inputStack);
//
//		System.out.println("The alphabets in updated stack are:");
//		for (Character alphabet : resultStack)
//			System.out.println(alphabet);
//	}

//	public static int searchElement(int[] elements, int elementToBeSearched) {
//		//Implement your logic here and change the return statement accordingly
//		for (int i = 0; i < elements.length; i++) {
//			if (elements[i] == elementToBeSearched)
//				return i+1;
//		}
//		return -1;
//	}
//	
//	public static void main(String[] args) {
//		int[] elements = { 76, 24, 78, 98, 1 };
//		int elementToBeSearched = 78;
//		
//		int numberOfIterations = searchElement(elements, elementToBeSearched);
//		
//		if (numberOfIterations == -1)
//			System.out.println("Element not found!");
//		else
//			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations);
//	}

//	public static int iterations = 0;
//
//	public static int searchElement(int elements[], int low, int high, int elementToBeSearched) {
//		// Implement your logic here and change the return statement accordingly
//		iterations++;
//		int mid = (high + low) / 2;
//		if (elements[mid] == elementToBeSearched)
//			return mid;
//		if (elementToBeSearched > elements[mid])
//			return searchElement(elements, mid + 1, high, elementToBeSearched);
//		if (elementToBeSearched < elements[mid])
//			return searchElement(elements, 0, mid - 1, elementToBeSearched);
//		return -1;
//	}
//
//	public static void main(String[] args) {
//		int[] elements = { 1, 23, 43, 46, 78, 90 };
//		int elementToBeSearched = 43;
//
//		int indexPosition = searchElement(elements, 0, elements.length - 1, elementToBeSearched);
//
//		if (indexPosition == -1)
//			System.out.println("Element not found!");
//		else
//			System.out.println("Element found at index position " + indexPosition + "!");
//
//		System.out.println("Number of iterations: " + iterations);
//	}

//	static int noOfSwaps = 0;
//	static int noOfPasses = 0;
//
//	public static void swap(int[] elements, int firstIndex, int secondIndex) {
//		// Implement your logic here
//		int temp = elements[firstIndex];
//		elements[firstIndex] = elements[secondIndex];
//		elements[secondIndex] = temp;
//		noOfSwaps++;
//	}
//
//	public static int bubbleSort(int[] elements) {
//		// Implement your logic here and change the return statement accordingly
//		boolean swapped = true;
//		int end = elements.length-1;
//		while (swapped) {
//			swapped = false;
//			for (int i = 0; i < end; i++) {
//				if (elements[i] > elements[i + 1]) {
//					swap(elements, i, i + 1);
//					swapped = true;
//				}
//			}
//			end--;
//			noOfPasses++;
//		}
//		return noOfPasses;
//	}
//
//	public static void displayArray(int[] elements) {
//		for (int element : elements)
//			System.out.print(element + " ");
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//
//		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };
//
//		System.out.println("Given array:");
//		displayArray(elements);
//
//		int noOfPasses = bubbleSort(elements);
//
//		System.out.println("==========================");
//		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
//		System.out.println("==========================");
//
//		System.out.println("Array after sorting:");
//		displayArray(elements);
//
//	}
//
//	public static void mergeSort(int[] elements, int size) {
//		// Implement your logic here
//		if (size < 2)
//			return;
//		
//		int mid = size / 2;
//		int[] left = new int[mid];
//		int[] right = new int[size - mid];
//		
//		for (int i = 0; i < left.length; i++)
//			left[i] = elements[i];
//		for (int i = mid; i < size; i++)
//			right[i - mid] = elements[i];
//		
//		mergeSort(left, left.length);
//		mergeSort(right, right.length);
//		merge(elements, left, right, left.length, right.length);
//	}
//
//	public static void merge(int[] elements, int[] left, int[] right, int leftMerge, int rightMerge) {
//		// Implement your logic here
//		int firstI = 0, secondI = 0, thirdI = 0;
//		while (firstI < leftMerge && secondI < rightMerge) {
//			if (left[firstI] <= right[secondI])
//				elements[thirdI++] = left[firstI++];
//			else
//				elements[thirdI++] = right[secondI++];
//		}
//		
//		while (firstI < leftMerge)
//			elements[thirdI++] = left[firstI++];
//		while (secondI < rightMerge)
//			elements[thirdI++] = right[secondI++];
//	}
//
//	public static void displayArray(int[] elements) {
//		for (int element : elements)
//			System.out.print(element + " ");
//		System.out.println();
//	}
//
//	public static void main(String[] args) {
//		int[] elements = { 95, 56, 20, 98, 34, 77, 80 };
//
//		System.out.println("Given Array:");
//		displayArray(elements);
//
//		mergeSort(elements, elements.length);
//
//		System.out.println("Sorted Array:");
//		displayArray(elements);
//
//	}

//	public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
//		//Implement your logic here and change the return statement accordingly
//		for (int i = 0; i < employeeIds.length; i++)
//			if (employeeIds[i] == employeeIdToBeSearched)
//				return i;
//		return -1;
//	}
//
//	public static void main(String a[]) {
//		int[] employeeIds = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
//		int employeeIdToBeSearched = 8022;
//		
//		int numberOfIterations = searchEmployeeId(employeeIds, employeeIdToBeSearched);
//		
//		if (numberOfIterations == -1)
//			System.out.println("Employee Id " + employeeIdToBeSearched + " is not found!");
//		else
//			System.out.println("Employee Id " + employeeIdToBeSearched + " is found! Number of iterations : " + numberOfIterations);
//	}

//	public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
//		//Implement your logic here and change the return statement accordingly
//		int mid = customerIds.length / 2;
//		while (mid >= 0) {
//			if (customerIds[mid] == customerIdToBeSearched)
//				return mid;
//			if (customerIdToBeSearched > customerIds[mid])
//				mid = (customerIds.length - mid) / 2;
//			else
//				mid = mid / 2;
//		}
//		return 0;
//	}
//	
//	public static void main(String[] args) {
//		int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
//		int customerIdToBeSearched = 80462;
//
//		int index = searchCustomerId(customerIds, customerIdToBeSearched);
//		
//		if (index == -1)
//			System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
//		else
//			System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index+"!");
//	}

//	public static void sortArray(int arr[]) {
//		// Implement your logic here
//		boolean swapped = true;
//		int end = arr.length-1;
//		while (swapped) {
//			swapped = false;
//			for (int i = 0; i < end; i++) {
//				if (arr[i] > arr[i+1]) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//					swapped = true;
//				}
//			}
//			end--;
//		}
//	}
//
//	public static int findMaxSum(int arr[], int m) {
//		// Implement your logic here and change the return statement accordingly
//		int sum = 0;
//		for (int i = arr.length - m; i < arr.length; i++)
//			sum += arr[i];
//		return sum;
//	}
//
//	public static int findMinSum(int arr[], int m) {
//		// Implement your logic here and change the return statement accordingly
//		int sum = 0;
//		for (int i = 0; i < m; i++)
//			sum += arr[i];
//		return sum;
//	}
//
//	public static void main(String[] args) {
//		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
//		sortArray(arr);
//		for (int i = 0; i < arr.length; i++)
//			System.out.print(arr[i] + " ");
//		System.out.print("\n");
//		System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
//		System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
//	}

//	public static void mergeSort(int[] elements, int size) {
//		//Implement your logic here
//		if (size < 2)
//			return;
//		
//		int mid = size / 2;
//		int[] left = new int[mid];
//		int[] right = new int[elements.length - mid];
//		
//		for (int i = 0; i < left.length; i++)
//			left[i] = elements[i];
//		for (int i = mid; i < size; i++)
//			right[i - mid] = elements[i];
//		
//		mergeSort(left, left.length);
//		mergeSort(right, right.length);
//		merge(elements, left, right, left.length, right.length);
//	}
//
//	public static void merge(int[] elements, int left[], int right[], int leftMerge, int rightMerge) {
//        //Implement your logic here
//		int leftIndex = 0, rightIndex = 0, initialIndex = 0;
//		
//		while (leftIndex < leftMerge && rightIndex < rightMerge) {
//			if (left[leftIndex] < right[rightIndex])
//				elements[initialIndex++] = left[leftIndex++];
//			else
//				elements[initialIndex++] = right[rightIndex++];
//		}
//		
//		while (leftIndex < leftMerge)
//			elements[initialIndex++] = left[leftIndex++];
//		while (rightIndex < rightMerge)
//			elements[initialIndex++] = right[rightIndex++];
//	}
//	
//	public static double findMedian(int elements[]) {
//		//Implement your logic here and change the return statement accordingly
//		if (elements.length % 2 != 0)
//			return elements[elements.length / 2];
//		else
//			return (elements[elements.length / 2] + elements[elements.length / 2 - 1]) / 2.0;
//	}
//
//	public static void main(String[] args) {
//		int elements[] = { 25, 28, 35, 50, 60, 100 }; // 11 12 22 25 34 64 90
//		
//        mergeSort(elements, elements.length); 
//        for (int i = 0; i < elements.length; i++)
//			System.out.print(elements[i] + " ");
//		System.out.print("\n");
//        System.out.println("Median: "+findMedian(elements)); 
//	}

//	public static int calculatePower(int num, int p) {
//        //Implement your logic here and change the return statement accordingly
//		if (p == 0)
//			return 1;
//		int n = num;
//		for (int i = 0; i < p-1; i++, n *= num);
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(calculatePower(2,3));
//	}

//	public static void mergeSort(int elements[], int size) {
//		if (size < 2)
//			return;
//		
//		int mid = size / 2;
//		int[] left = new int[mid];
//		int[] right = new int[size - mid];
//		
//		for (int i = 0; i < mid; i++)
//			left[i] = elements[1];
//		for (int i = mid; i < size; i++)
//			right[i - mid] = elements[i];
//		
//		mergeSort(left, left.length);
//		mergeSort(right, right.length);
//		merge(elements, left, right, left.length, right.length);
//	}
//	
//	public static void merge(int[] elements, int[] left, int[]right, int leftMerge, int rightMerge) {
//		int initialIndex = 0, leftIndex = 0, rightIndex = 0;
//		while (leftIndex < leftMerge && rightIndex < rightMerge) {
//			if (left[leftIndex] < right[rightIndex])
//				elements[initialIndex++] = left[leftIndex++];
//			else
//				elements[initialIndex++] = right[rightIndex++];
//		}
//		
//		while (leftIndex < leftMerge)
//			elements[initialIndex++] = left[leftIndex++];
//		while (rightIndex < rightMerge)
//			elements[initialIndex++] = right[rightIndex++];
//	}
//	
//	public static int[] getMaxMin(int arr[], int low, int high) { 
//	    //Implement your logic here and change the return statement accordingly
//		mergeSort(arr, arr.length);
//	    return new int[]{arr[arr.length-1], arr[0]};
//	} 
//	  
//	public static void main(String args[]) { 
//	    int arr[] = {6, 15, 100, 10, 1000, 0, -10}; 
//
//	    int[] maxMin = getMaxMin(arr, 0, arr.length - 1);
//	    
//	      System.out.println("Minimum value is "+ maxMin[1]); 
//	 	  System.out.println("Maximum value is "+ maxMin[0]); 
//	} 

//	public static int findMaxActivities(int start[], int finish[]) {
//		// Implement your logic here and change the return statement accordingly
//		int activities = 1;
//		int fIndex = 0;
//		for (int i = 0; i < start.length; i++) {
//			if (start[i] >= finish[fIndex]) {
//				activities++;
//				fIndex = i;
//			}
//		}
//		return activities;
//	}
//
//	public static void main(String[] args) {
//		int start[] = { 1, 3, 0, 5, 8, 5 };
//		int finish[] = { 2, 4, 6, 7, 9, 9 };
//
//		System.out.println("Maximum number of activities: " + findMaxActivities(start, finish));
//	}

//	public static int cutRod(int[] price, int n) {
//		//Implement your logic here and change the return statement accordingly
//		return price[n];
//	}
//
//	public static void main(String[] args) {
//		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
//		int n = 4;
//		System.out.println("Maximum price: " + cutRod(price, n));
//	}

//	public static int[][] multiply(int arr1[][], int arr2[][]) {
//		// Implement your logic here and change the return statement accordingly
//		int[] dotProduct = new int[2];
//		dotProduct[0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0] + arr1[1][0] * arr2[0][1]
//				+ arr1[1][1] * arr2[1][1];
//		return dotProduct;
//	}
//
//	public static void main(String[] args) {
//		int arr1[][] = new int[][] { { 2, 4 }, { 1, 4 } };
//		int arr2[][] = new int[][] { { 1, 4 }, { 1, 3 } };
//
//		int[][] arr3 = multiply(arr1, arr2);
//
//		for (int index1 = 0; index1 < arr3.length; index1++) {
//			for (int index2 = 0; index2 < arr3.length; index2++) {
//				System.out.print(arr3[index1][index2] + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		List<String> employees = new ArrayList<String>();
//		employees.add("Alex");
//		employees.add("Tom");
//		employees.add("Sam");
//		employees.add("john");
//		employees.add("Jack");
//		updateEmployee(employees);
//		for (String employee: employees) {
//			System.out.print(employee+" ");
//		}
//	}
//
//	public static void updateEmployee(List<String> employees) {
//		String[] newEmployees = { "John", "Jack", "Robert", "Steve" };
//		for (int counter = 0; counter <= newEmployees.length - 1; counter++) {
//			if (!employees.contains(newEmployees[counter])) {
//				employees.add(counter + 1, newEmployees[counter]);
//			}
//		}
//	}
	
	public static void main(String args[]) {
		Map<String, Integer> studentDetails = new HashMap<String, Integer>();
		studentDetails.put("Max", 337);
		studentDetails.put("Stocks", 480);
		studentDetails.put("Malinda", 570);
		studentDetails.put("Mathew", 640);
		studentDetails.put("Max", 340);
		if (studentDetails.replace("stocks", 480, 650)) {
			studentDetails.remove("Max");
		} else {
			studentDetails.put("Sam", 490);
		}

		System.out.println(studentDetails);
	}

	
}

class Patient {

	private String name;
	private String gender;
	private int age;

	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Gender: " + this.gender + ", Age: " + this.age;
	}
}

class Student {
	private int studentId;
	private String studentName;
	private String emailId;
	private String event;

	public Student(int studentId, String studentName, String emailId, String event) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.event = event;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public boolean equals(Object student) {
		Student otherStudent = (Student) student;
		if (this.emailId.equals(otherStudent.emailId))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return emailId.hashCode();
	}

	@Override
	public String toString() {
		return "Student Id: " + studentId + ", Student Name: " + studentName + ", Email Id: " + emailId;
	}
}

class Queue {
	// Implement your logic here
	private List<String> queue;
	private int maxSize;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queue = new LinkedList<>();
	}

	public List<String> getQueue() {
		return queue;
	}

	public boolean isFull() {
		return queue.size() >= maxSize;
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		}
		return queue.add(data);
	}

	public boolean dequeue() {
		if (isEmpty()) {
			return false;
		}
		queue.remove(0);
		return true;
	}
}

//class Student {
//	
//    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
//		//Implement your logic here and change the return statement accordingly
//    	String[] maxMinStr = new String[2];
//    	double[] maxMinDbl = new double[2];
//    	for (Map.Entry<String, Double> student : studentMarks.entrySet()) {
//    		if (maxMinStr[0] == null) {
//    			maxMinStr[0] = student.getKey();
//    			maxMinDbl[0] = student.getValue();
//    			continue;
//    		}
//    		
//			if (student.getValue() < maxMinDbl[0]) {
//    			maxMinStr[1] = student.getKey();
//    			maxMinDbl[1] = student.getValue();
//			} else {
//				maxMinStr[1] = maxMinStr[0];
//    			maxMinDbl[1] = maxMinDbl[0];
//    			maxMinStr[0] = student.getKey();
//    			maxMinDbl[0] = student.getValue();
//			}
//    	}
//    	Map<String, Double> maxMin = new HashMap<String, Double>();
//    	for (int i = 0; i <= 1; i++) {
//    		maxMin.put(maxMinStr[i], maxMinDbl[i]);
//    	}
//		return maxMin;
//	}
//
//}

//class Student {
//
//	private int studentId;
//	private String studentName;
//	private int courseId;
//
//	public Student(int studentId, String studentName, int courseId) {
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.courseId = courseId;
//	}
//
//	public int getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public int getCourseId() {
//		return courseId;
//	}
//
//	public void setCourseId(int courseId) {
//		this.courseId = courseId;
//	}
//
//	@Override
//	public boolean equals(Object student) {
//		Student otherStudent = (Student) student;
//		if (this.studentId == otherStudent.studentId)
//			return true;
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return studentId;
//	}
//
//	@Override
//	public String toString() {
//		return "Student Id: "+studentId + ", Student Name: " + studentName;
//	}
//
//}

class Participant {
	private String participantName;
	private String participantTalent;
	private double participantScore;

	public Participant(String participantName, String participantTalent, double participantScore) {
		this.participantName = participantName;
		this.participantTalent = participantTalent;
		this.participantScore = participantScore;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getParticipantTalent() {
		return participantTalent;
	}

	public void setParticipantTalent(String participantTalent) {
		this.participantTalent = participantTalent;
	}

	public double getParticipantScore() {
		return participantScore;
	}

	public void setParticipantScore(double participantScore) {
		this.participantScore = participantScore;
	}

	@Override
	public String toString() {
		return "Participant Name: " + getParticipantName() + ", Participant Talent: " + getParticipantTalent()
				+ ", Participant Score: " + getParticipantScore();
	}

}

class Order {
	private int orderId;
	private List<String> itemNames;
	private boolean cashOnDelivery;

	public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
		this.orderId = orderId;
		this.itemNames = itemNames;
		this.cashOnDelivery = cashOnDelivery;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	@Override
	public String toString() {
		return "Order Id: " + getOrderId() + ", Item names: " + getItemNames() + ", Cash on delivery: "
				+ isCashOnDelivery();
	}
}

//class Queue {
//    
//    private int front;
//    private int rear;
//    private int maxSize;
//    private int arr[];
//      
//    Queue(int maxSize) {
//        this.front = 0;
//        this.rear = -1;
//        this.maxSize = maxSize;
//        this.arr = new int[this.maxSize];
//    }
//      
//    public boolean isFull() {
//        if (rear == maxSize - 1) {
//            return true;
//        }
//        return false;
//    }
//            
//    public boolean enqueue(int data) {
//        if (isFull()) {
//            return false;
//        } else {
//            arr[++rear] = data;
//            return true;
//        }
//    }
//
//    public void display() {
//        if(isEmpty())
//            System.out.println("Queue is empty!");
//        else {
//            for (int index = front; index <= rear; index++) {
//                System.out.println(arr[index]);
//            }
//        }
//    }
//            
//    public boolean isEmpty() {
//        if (front > rear)
//            return true;
//        return false;
//    }
//            
//    public int dequeue() {
//        if (isEmpty()) {
//            return Integer.MIN_VALUE;
//        } else {
//            int data = arr[this.front];
//            arr[front++] = Integer.MIN_VALUE;
//            return data;
//        }
//    }
//
//    public int getMaxSize() {
//        return maxSize;
//    }
//}

class Stack {

	private int top;
	private int maxSize;
	private int[] arr;

	Stack(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}

	public boolean isFull() {
		if (top >= (maxSize - 1)) {
			return true;
		}
		return false;
	}

	public boolean push(int data) {
		if (isFull()) {
			return false;
		} else {
			arr[++top] = data;
			return true;
		}
	}

	public int peek() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top];
	}

	public void display() {
		if (isEmpty())
			System.out.println("Stack is empty!");
		else {
			System.out.println("Displaying stack elements");
			for (int index = top; index >= 0; index--) {
				System.out.println(arr[index]); // accessing element at position index
			}
		}
	}

	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	public int pop() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top--];
	}
}

class Node {

	private String data;
	private Node next;

	public Node(String data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public String getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}
}

//class LinkedList {
//
//    private Node head;
//    private Node tail;
//
//    public Node getHead() {
//        return this.head;
//    }
//      
//    public Node getTail() {
//        return this.tail;
//    }
//
//    public void addAtEnd(String data) {
//        Node node = new Node(data);
//
//        if (this.head == null) {
//            this.head = this.tail = node;
//        } else {
//            this.tail.setNext(node);
//
//            this.tail = node;
//        }
//    }
//
//    public void addAtBeginning(String data) {
//        Node node = new Node(data);
//
//        if (this.head == null) {
//            this.head = this.tail = node;
//        }
//
//        else {
//            node.setNext(this.head);
//            this.head = node;
//        }
//    }
//
//      public void display() {
//        Node temp = this.head;
//
//        while (temp != null) {
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }
//    }
//
//    public Node find(String data) {
//        Node temp = this.head;
//
//        while (temp != null) {
//            if (temp.getData().equals(data))
//                return temp;
//            temp = temp.getNext();
//        }
//        return null;
//    }
//
//    public void insert(String data, String dataBefore) {
//        Node node = new Node(data);
//
//        if (this.head == null)
//            this.head = this.tail = node;
//        else {
//            Node nodeBefore = this.find(dataBefore);
//            if (nodeBefore != null) {
//                node.setNext(nodeBefore.getNext());
//                nodeBefore.setNext(node);
//                if (nodeBefore == this.tail)
//                    this.tail = node;
//            } 
//            else
//                System.out.println("Node not found");
//        }
//    }
//
//    public void delete(String data) {
//
//        if (this.head == null)
//            System.out.println("List is empty");
//        else {
//            Node node = this.find(data);
//
//            if (node == null)
//                System.out.println("Node not found");
//
//            if (node == this.head) {
//                this.head = this.head.getNext();
//                node.setNext(null);
//          
//                if (node == this.tail)
//                    tail = null;
//            }
//            else {
//                Node nodeBefore = null;
//                Node temp = this.head;
//                while (temp != null) {
//                    if (temp.getNext() == node) {
//                    nodeBefore = temp;
//                    break;
//                    }
//                    temp = temp.getNext();
//                }
//
//                nodeBefore.setNext(node.getNext());
//                      
//                if (node == this.tail)
//                    this.tail = nodeBefore;
//                node.setNext(null);
//            }
//        }
//    }
//}
