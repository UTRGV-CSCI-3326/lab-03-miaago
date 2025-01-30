import java.text.DecimalFormat;

public class BankAccount
{
    public static void main (String[] args)
    {
        DecimalFormat DollarsNCents = new DecimalFormat("0.00");
        float bobBalance = 2175.37f;
        
        bobBalance -= 302.50f;
        bobBalance += 50.03f;
        bobBalance /= 2; 
        bobBalance += 20.00f;
        bobBalance--;
        bobBalance *= 2;
        bobBalance++;

        System.out.println("$" + DollarsNCents.format(bobBalance));


    }
}