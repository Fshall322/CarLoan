/**
 * Created by Frank Hall on 6/25/2016.
 */
public class UsedCarLoan extends Carloan
{
    public UsedCarLoan ()
    {
        interestRate = interestRate * 0.02;

        if(interestRate > 10000)
        {
            System.out.println("Error: You have a loant amount over the maximum amount of $10000");
            System.out.println("Setting loan amount to $10000");
            loanAmount = 10000;
        }
        else
            System.out.println("Hello");

    }
}
