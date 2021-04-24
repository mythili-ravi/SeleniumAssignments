package week1.day2.assignment;

public class Pallindrome {

	public static void main(String[] args) {
		String name ="priya";
		String rev = "";
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			rev=rev+charArray[i];
			}
		

if(rev.contentEquals(name))
{
	System.out.println("The given name is  pallindrome");
			}
			else
			{
				System.out.println("The given name is non pallindrome");
		
			
		}

	}

}
