import java.util.Set;
import java.util.HashSet;


public class UsingHashSet{
	public static void main(String[] args){
		Set<String> emails = new HashSet<>();
		
		emails.add("jonhbull199@gmail.com");
		emails.add("lilynick245@gmail.com");
		emails.add("graceson8099@gmail.com");
		emails.add("kenmon380@gmail.com");
		emails.add("portnumber23@gmail.com");
		emails.add("annaekin343@gmail.com");
		emails.add("shinehit553@gmail.com");	
		emails.add("mortgo233@gmail.com");
		emails.add("hominservice99@gmail.com");
		emails.add("melink43@gmail.com");
		emails.add("tomgilger32@gmail.com");	

		for (String email : emails){ 
			System.out.println(email);
		}
	}
}