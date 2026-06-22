public class VarArgsClassWork{
	public static void main(String[] args){
		int countOfOdd = oddNumnbers{3,3,45,3,4,5,3,5,4,7,8,9,9,7,5,3,2,2,0};
		System.out.printf("The count of odd numbers are %d%n",countOfOdd);
	}
	public static int OddNumbers(int... numbers){
		int countOfOdd = 0;
		for(int number : numbers){
			if(number%2==1){
				countOfOdd++;
			}
		}
		return countOfOdd;
}
}
	
