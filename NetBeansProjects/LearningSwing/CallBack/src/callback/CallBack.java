package callback;
public class CallBack implements Name 
{

    
    public static void main(String[] args) 
    {
        CallBack call=new CallBack();
        NewClass newClass=new NewClass("Arihant Sai");
        newClass.implementCallback("Arihant Sai");
    }

    @Override
    public void showName(String s) 
    {
        System.out.println("The name is with callback :"+s);
    }
    
}
