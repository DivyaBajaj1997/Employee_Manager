package Employee_Manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args){
		EmployeeMain Ei = new EmployeeMain();
		Ei.execute();
	}
		
	//Maps Implementation
		Map<Integer, Employee> store = new HashMap<>();
		
		public void execute() {
			Employee e1 = new Employee(1,"Divya");
			store.put(1, e1);
			Manager m = new Manager(2,"Riya",45);
			store.put(2, m);
			m.addManagedEmployee(e1);
			print();
		}
		
		public Employee findbyId(int id) {
			Employee e = store.get(id);
			return e;
		}
		
		public void print()
		{
			Set<Integer> keys = store.keySet();
			for(Integer id : keys)
			{
				Employee e = store.get(id);
				System.out.println(e.getName() + " " + e.getBalance());
				boolean isManager =  e instanceof Manager;
				if(isManager)
				{
					Manager m1 = (Manager) e;
					System.out.println("\n" + m1.getName() + " " + m1.getBalance());
					System.out.println("\nManaged Employees\n");
					Employee[] managedEmployees =  m1.getmanagedEmployee() ;
					for( Employee managed : managedEmployees)
					{
						if(managed!=null) {
							System.out.println(managed.getName() + " " + managed.getBalance());
						}
					}
				}
			}
		}
}


//Array Implemtation
		/*Employee[] empStore = new Employee[5];
		empStore[0]= new Employee(1, "Divya"); 
		empStore[1]= new Employee(2, "Riya"); 
		empStore[2]= new Employee(3, "Aditi"); 
		empStore[3]= new Employee(4, "Maneel"); 
		empStore[1].addsalary(3000);
		empStore[2].addsalary(30009.68);
				
		Manager m = new Manager(5,"Ananya",45);
		m.addsalary(56.89);
		
		empStore[4] = m;
		m.addManagedEmployee(empStore[1]);
		m.addManagedEmployee(empStore[3]);
		
		EmployeeMain e1 =  new EmployeeMain();
		e1.print(empStore);
		
		for(Employee e : empStore)
		{
			boolean isManager =  e instanceof Manager;
			if(isManager)
			{
				Manager m1 = (Manager) e;
				System.out.println("\n" + m1.getName() + " " + m1.getBalance());
				System.out.println("\nManaged Employees\n");
				Employee[] managedEmployees =  m1.getmanagedEmployee() ;
				for( Employee managed : managedEmployees)
				{
					if(managed!=null) {
						System.out.println(managed.getName() + " " + managed.getBalance());
					}
				}
				
			}
		}
		
		
//difference between equals and ==
		Employee a = new Employee(1, "divya");
		Employee b = new Employee(1, "divya");
		boolean same = a==b;
		System.out.println(same);
		boolean equals = a.equals(b);
		System.out.println(equals);
		}
		
		public void print(Employee[] e)
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("The id of employee " + i +" is " + e[i].getId() + ", name is " + e[i].getName() + " and balance is " + e[i].getBalance() );
			}
		}
		*/
	

