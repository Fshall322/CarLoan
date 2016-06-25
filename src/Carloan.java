/**
 * Created by Frank Hall on 6/25/2016.
 */
public abstract class Carloan implements CarLoanConstants
{
    protected int loanNumber;
    protected String customerLastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    public Carloan()
    {

        if(term != 36 || term != 48 || term != 60)
        {
            term = 36;
        }
    }
    public void setLoanNumber(int l)
    {
        loanNumber = l;
    }
    public int getLoanNumber()
    {
        return loanNumber;
    }
    public void setCustomerLastName(String c)
    {
        customerLastName = c;
    }
    public String getCustomerLastName()
    {
        return customerLastName;
    }
    public void setLoanAmount(double la)
    {
        loanAmount = la;
    }
    public double getLoanAmount()
    {
        return loanAmount;
    }
    public void setInterestRate(double ir)
    {
        interestRate = ir;
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setTerm(int t)
    {
        term = t;
    }
    public int getTerm()
    {
        return term;
    }

    public void ToString()
    {
        System.out.println("The loan number is: "+loanNumber);
        System.out.println("The customer last name is: "+customerLastName);
        System.out.println("The loan amount is: "+loanAmount);
        System.out.println("The interest rate is: "+interestRate);
        System.out.println("The term is: "+term);
    }

}
