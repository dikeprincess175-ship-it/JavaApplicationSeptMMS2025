import java.util.Set;
import java.util.LinkedHashSet;


public class UsingSet{
	public static void main(String[] args){
		Set<Integer> studentId = new LinkedHashSet<>();
		
		studentId.add(101);
		studentId.add(102);
		studentId.add(103);
		studentId.add(104);
		studentId.add(105);
		studentId.add(103);
		
		System.out.println(studentId);
		
		studentId.remove(104);
		
		System.out.println(studentId);
		
		System.out.println("Does studentId contain 102?? " + studentId.contains(102));
		System.out.println("Does studentId contain 104?? " + studentId.contains(104));

	}
}