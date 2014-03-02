
public class FizzBuzz {

	/* Write a program that prints numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and
	 * for multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
	 */
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++)
		{
			if (i % 5 == 0 && i % 3 == 0) //ie. i % 15 == 0
			{
				print("FizzBuzz");
			}
			else if(i % 3 == 0)
			{
				print("Fizz");
			}
			else if(i % 5 == 0)
			{
				print("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}
	
	public static void print(String sentence){
		System.out.println(sentence);
	}

}
