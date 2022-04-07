package corp.skull.oops;
public class Constructor
{
    public Constructor()
    {
        System.out.println("Its a constructor");
    }
    public Constructor(int a)
    {
        this();
        System.out.println("Value of a is : "+a);
    }
    public static void main(String[] args)
    {
        Constructor obj=new Constructor(10);
    }
}