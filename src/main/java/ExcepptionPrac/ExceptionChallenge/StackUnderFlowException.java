package ExcepptionPrac.ExceptionChallenge;

public class StackUnderFlowException extends Exception{
    @Override
    public String toString(){
        return "Stack is empty cannot delete more items";
    }
}
