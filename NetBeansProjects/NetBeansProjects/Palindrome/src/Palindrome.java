import java.util.Scanner;
import static javafx.application.Platform.exit;
class Palindrome
{ 
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no of tests not gratet than 100\n");
        
	int n = sc.nextInt();
	if(n>100)
	{
	        System.out.println("Test cannot be grater than 100\n");
		exit();
	}
        String[] s = new String[n+1];
       
	for(int i=0;i<=n;i++)
		s[i] = sc.nextLine();

	for(int i=1;i<=n;i++)
	{
		int l = s[i].length();
                int counter=0;
		for(int j=0;j<l/2;j++)
		{
			if(!(s[i].charAt(j)==s[i].charAt(l-1-j)))
				counter++;
		}
		System.out.println(counter);
	}
    }  
}
