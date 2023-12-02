class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}

public class custom_exception
{
    static void validate(int age) throws InvalidAgeException{
        if(age<18)
        {
            throw new InvalidAgeException( "Age is not valid.");
        }
        else
        {
            System.out.println("welcome to cast your vote");
        }
    }

    public static void main(String[] args) {
        try
        {
            validate(13);
        }
        catch(InvalidAgeException ex)
        {
            System.out.println("caught the exception.");
            System.out.printf("Exception occured  ",ex.getMessage());
            System.out.println("Rest of the code");

        }

        
    }
    
}
