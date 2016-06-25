/**
 * Created by Frank Hall on 6/25/2016.
 */
public class NewCarLoan extends Carloan
{
    public NewCarLoan()
    {
        interestRate = interestRate * 0.01;

        if(interestRate > 35000)
        {
            System.out.println("Error: You have a loant amount over the maximum amount of $35000");
            System.out.println("Setting loan amount to $35000");
            loanAmount = 35000;
        }
        else
            System.out.println("Hello");

    }
}
