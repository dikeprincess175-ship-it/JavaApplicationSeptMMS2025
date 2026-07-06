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
		
		System.out.println(studentId);
	}
}