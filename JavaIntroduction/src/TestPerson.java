
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p;
       p= new Person();
       //p.setValues();
       p.display();
       
       p= new Person(23, "ietrir");
       //p.setValues(22, "Priyanka");
       p.display();
       
       p.setAge(100);
       p.display();
       
       Person p5=new Person();
       Person p1=new Person();
       Person p2=new Person();
       Person p3=new Person();
       Person p4=new Person();
       
       System.gc();
       
	}

}
