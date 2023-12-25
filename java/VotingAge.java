import java.util.Scanner;

public class VotingAge
{
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age=");
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for vote."+age);
        }
        else
        {
            System.out.println("You are not eligible for vote."+age);
        }
    }
}
