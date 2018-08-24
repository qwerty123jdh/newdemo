
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;




public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Book> m =new HashMap<>();
		m.put("Citi", new Book(123, "Adv Java", "Oracle", 1234d));
		m.put("wipro", new Book(300, "Adv Java", "Oracle", 2000d));
		m.put("Accenture", new Book(123, "Adv Java", "Oracle", 1234d));
		
		System.out.println(m);
		
		m.put("wipro", new Book(300, "Adv J", "Oracle", 2000d));
		System.out.println("after duplicate key");
		System.out.println(m);
		Set<Entry<String, Book>> entries=m.entrySet();
		Iterator<Entry<String, Book>> iterator= entries.iterator();
		while (iterator.hasNext())
		{
			Entry<String, Book> entry=iterator.next();
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
				
	}

}