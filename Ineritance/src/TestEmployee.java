import com.pojo.Employee;
import com.pojo.Person;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person emp= new Employee();
		emp.display();
		((Employee)emp).display(10);
		System.out.println(emp);
	}

}

class DemoEmployee
{
	public void printEmployee(Object o) {
		
	}
}