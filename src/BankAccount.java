public class BankAccount
{
    public static void main (String[] args)
    {
        float bobBalance = 2175.37f;
        // bobBalance = bobBalance - 302.50f;
        // bobBalance = bobBalance + 50.03f;
        // bobBalance = bobBalance/2 + 20.00f;
        // bobBalance--;
        // bobBalance = bobBalance * 2;
        // bobBalance++;

        bobBalance -= 302.50f;
        bobBalance += 50.03f;
        bobBalance /= 2; 
        bobBalance += 20.00f;
        bobBalance--;
        bobBalance *= 2;
        bobBalance++;

        System.out.println(bobBalance);
    }
}