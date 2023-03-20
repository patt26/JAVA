package ExcepptionPrac.ExceptionChallenge;

public class StackOverFlowException extends Exception {
    @Override
    public String toString(){
        return "Stack is overflowed cannot add items";
    }
}
