import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l= new ArrayList();
		l.add("ABC");
		l.add("XYZ");
		l.add("C");
		l.add("LMN");
		l.add("ABC");
		//l.add(new Double(123.45d));
		//l.add(new Object());
		//l.add(new File("data.txt"));
		
		System.out.println(l);
		
		int size= l.size();
		System.out.println("size="+size);
		
		l.add(2, "NEW DATA");
		System.out.println(l);

		boolean found= l.contains("NEW");
		if (found)
		{
			System.out.println("Data is avail");
		}
		else
		{
			System.out.println("sorry");
		}
		
		Object o=l.get(3);
		System.out.println("your data is "+o);
		
		o=l.remove(0);
		System.out.println("you removed "+o);
		
		boolean remove=l.remove("NEW DATA");
		
		if(remove)
		{
			System.out.println("removed successfully");
		}
		else
		{
			System.out.println("sorry can't remove");
		}
		
		System.out.println("updated size = "+l.size());
		
		
		Iterator<String> it=l.iterator();
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
		
		
		
}
	
}
