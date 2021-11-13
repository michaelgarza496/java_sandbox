package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
    private Integer id;
    private String name;
    private Integer yearsInOrg;
    private String gender;
    private String role;
    private Integer salary;
    
    
    public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYearsInOrg() {
		return yearsInOrg;
	}
	public void setYearsInOrg(Integer yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(Integer id, String name, Integer yearsInOrg, String gender, String role, Integer salary) {
		super();
		this.id = id;
		this.name=name;
		this.yearsInOrg = yearsInOrg;
		this.gender = gender;
		this.role = role;
		this.salary = salary;
	}
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", yearsInOrg=" + yearsInOrg + ", gender=" + gender + ", role="
				+ role + ", salary=" + salary + "]";
	}
	public static List<Employee> getEmployeeList()
	{
	    Employee e1 = new Employee(101,"Roger",0, "Male", "TA", 6000);
    	Employee e2 = new Employee(104,"Chris",2, "Male", "FE", 10000);
    	Employee e3 = new Employee(103,"Samuel",0, "Female", "HX", 2000);
    	Employee e4 = new Employee(102,"Brian",3, "Female", "TA", 8900);
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	return empList;
	}
}

public class EmployeeService {

	public static void main(String[] args) {
//		basics();
//		exercise();
//		mapMethod();
//		mapExercise();
		reduceMethod();
	}
	
	public static void basics() {
		List<Employee> empList = Employee.getEmployeeList();
		System.out.println("Printing normal List");
		System.out.println(empList);
		System.out.println();
		
		Stream<Employee> empStream = empList.stream();
		System.out.println("Printing empSteam");
		empStream.forEach(System.out::println);
		System.out.println();
		
		Stream<Employee> empStreamFilter = empList.stream();
		Stream<Employee> empStreamFiltered = empStreamFilter.filter(emp -> emp.getYearsInOrg() < 1);
		System.out.println("Printing filtered stream");
		empStreamFiltered.forEach(System.out::println);
		System.out.println();
		
		Stream<Employee> empStreamSort = empList.stream();
		Stream<Employee> empStreamSorted = empStreamSort.sorted((e1, e2) -> e1.getId() - e2.getId());
		System.out.println("Printing sorted list by id");
		empStreamSorted.forEach(System.out::println);
		System.out.println();
		
		Stream<Employee> empStreamPipeLine = empList.stream();
		System.out.println("Pipelining all the stream functions");
		empStreamPipeLine.filter(emp -> emp.getYearsInOrg() < 1)
		.sorted((e1, e2) -> e1.getId() - e2.getId())
		.forEach(e -> System.out.println(e.getId() + ":" + e.getName()));
		System.out.println();
	}
	
	
	public static void exercise() {
		/*
		 * a. Employees whose role is TA

			b. Count of female employees
		 */
		
		Stream<Employee> empListStream = Employee.getEmployeeList().stream();
		System.out.println("Printing employees with role TA");
		empListStream.filter(e -> e.getRole().equals("TA"))
		.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Printing the count of female employees");
		int numOfFemaleEmp = (int) Employee.getEmployeeList().stream()
		.filter(e -> e.getGender().equals("Female"))
		.count();
		System.out.println(numOfFemaleEmp);
	}
	
	public static void mapMethod() {
		List<Employee> empList = Employee.getEmployeeList();
		System.out.println("Displaying employees who's worked over a year and added 'S' in front of role");
		// Grab a new list
		List<Employee> newList = empList.stream().filter(emp -> emp.getYearsInOrg() > 1)
				.map(emp -> {
					emp.setRole("S" + emp.getRole());
					return emp;
				}).collect(Collectors.toList());
		newList.forEach(System.out::println);
	}
	
	public static void mapExercise() {
		/*
		 * Given a list of numbers, return a list of the cube of each number.

			For example, given [1, 2, 3, 4, 5] the program should return [1, 8, 27, 64, 125].
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] cubedArr = Arrays.stream(arr)
				.map(e -> e*e*e)
				.toArray();
		System.out.println(Arrays.toString(cubedArr));
	}
	
	public static void reduceMethod() {
		List<Employee> empList = Employee.getEmployeeList();
		System.out.println("Data as of now");
		empList.forEach(System.out::println);
		System.out.println();
		
		List<Employee> empFilteredList = empList.stream()
				.filter(emp -> emp.getYearsInOrg() < 1)
				.map(emp -> { emp.setSalary(emp.getSalary() + 5000); return emp; })
				.collect(Collectors.toList());
		System.out.println("Filtered employees who's been with company less than a year. Add 5 g's.");
		empFilteredList.forEach(System.out::println);
		System.out.println();
		
		Optional<Integer> max = empFilteredList.stream()
				.map(emp -> emp.getSalary())
				.reduce(Integer::max);
		List<Employee> maxEmp = empFilteredList.stream()
				.filter(emp -> emp.getSalary() == max.get())
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	

}
