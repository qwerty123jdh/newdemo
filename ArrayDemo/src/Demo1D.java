
public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] numbers;
 numbers= new int[3];
 numbers[0]= 10;
 numbers[1]= 11;
 numbers[2]= 10;

 System.out.println("num:-"+numbers[0]);
 for(int i=0;i<numbers.length;i++) {
	 System.out.println(numbers[i]);
 }
 for(int x:numbers)
 {
	 System.out.println(x);
	}

}
}
