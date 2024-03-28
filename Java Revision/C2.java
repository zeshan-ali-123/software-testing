import java.util.*;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String s)
    {
        super(s);
    }
};

public class C2{
    public static void main(String args[]) throws InsufficientBalanceException
    {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        scan.nextLine();
        double n = scan.nextDouble();
        try{
            if(m<n)
            {

                throw new InsufficientBalanceException("Insufficient balance: Insufficient balance to perform the withdrawal.");
            }
            else{
                System.out.println("Transaction successful.");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}