/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.util.Scanner;

public class CreateCarLoans
{
    public static void main(String[] args)
    {
        double rate;
        String loanType;
        int loanNumber;
        String lastname;
        double loanAmount;
        double interestRate;
        int term;
        double monthlyPayment;
        double numerator;
        double denominator1 = 0;
        double denominator2 = 0;
        double denominator3 = 0;
        double denominator4 = 0;
        Carloan[] carloan = new Carloan[5];
        NewCarLoan newloan = new NewCarLoan();
        UsedCarLoan usedloan = new UsedCarLoan();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter in your current prime interes rate");
        rate = input.nextDouble();
        System.out.println("You entered the Prime Rate of: "+rate);

        for(int x = 0; x < carloan.length ; ++x)
        {
            System.out.println("Please enter in a loan type. example(newcar or usedcar)");
            loanType = input.next();

            if(loanType == "newcar")
            {
                System.out.println("Please enter in your Loan Number: ");
                loanNumber = input.nextInt();
                newloan.setLoanNumber(loanNumber);
                System.out.println("Please enter in your Last Name: ");
                lastname = input.next();
                newloan.setCustomerLastName(lastname);
                System.out.println("Please enter in your Loan Amount: ");
                loanAmount = input.nextDouble();
                newloan.setLoanAmount(loanAmount);
                System.out.println("Please enter in your Interest Rate: ");
                interestRate = input.nextDouble();
                newloan.setInterestRate(interestRate);
                System.out.println("Please enter in your term: ");
                term = input.nextInt();
                newloan.setTerm(term);

                numerator = interestRate / term * loanAmount;
                denominator1 = 1 + interestRate / term;
                denominator2 = Math.pow(1 + interestRate, 12);
                denominator3 = 1 / denominator2;
                denominator4 = 1 - denominator3;
                monthlyPayment = numerator / denominator4;

            }
            else
            {
                System.out.println("Please enter in your Loan Number: ");
                loanNumber = input.nextInt();
                usedloan.setLoanNumber(loanNumber);
                System.out.println("Please enter in your Last Name: ");
                lastname = input.next();
                usedloan.setCustomerLastName(lastname);
                System.out.println("Please enter in your Loan Amount: ");
                loanAmount = input.nextDouble();
                usedloan.setLoanAmount(loanAmount);
                System.out.println("Please enter in your Interest Rate: ");
                interestRate = input.nextDouble();
                usedloan.setInterestRate(interestRate);
                System.out.println("Please enter in your term: ");
                term = input.nextInt();
                usedloan.setTerm(term);

                numerator = interestRate / term * loanAmount;
                denominator1 = 1 + interestRate / term;
                denominator2 = Math.pow(1 + interestRate, 12);
                denominator3 = 1 / denominator2;
                monthlyPayment = numerator / denominator2;
            }

            if(loanType == "newcar")
            {
                newloan.ToString();
                System.out.println("Your monthly payment is: " +monthlyPayment);
            }

            else
            {
                usedloan.ToString();
                System.out.println("Your monthly payment is: " +monthlyPayment);
            }

        }
    }
}
