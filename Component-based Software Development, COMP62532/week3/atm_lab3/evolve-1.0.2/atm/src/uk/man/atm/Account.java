package uk.man.atm;

public class Account implements IAccount {
	String no; 
	int balance;
	
	public Account ()
    {
        balance = 0;
        no = "";
    }
    
    public void setBalance (int val) throws Exception 
    {
           if (val >=0 )
               balance = val;
           else
               throw new Exception( "Invalid balance." );
    }
    
    public String getAccountNo () {
        return String.valueOf( this.no );
    }
    
    public void setAccountNo (String val) throws Exception
    {
        if (val.length() == 4 && val.matches("[0-9]+"))
            no = val;
        else
            throw new Exception ( "Invalid account number." );
    }
    
    public void withdraw (int val ) throws Exception
    {
        if ( val > 0 && val <= balance)
            balance -= val;
        else
            throw new Exception( "Invalid amount." );
    }
    
    public void deposit (int val) throws Exception
    {
        if (val > 0)
            balance += val;
        else
            throw new Exception ( "Invalid amount." );
    }
    
    public int balance () {
        return this.balance;
    }

}
