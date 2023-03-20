package ExcepptionPrac.ExceptionChallenge;

public class Stack {


    static void Push() throws StackOverFlowException {
            int size=4;
            if (size == 4) {
                throw new StackOverFlowException();
            }


        }



    static void Pop() throws StackUnderFlowException {
            int size1=-1;
        throw new StackUnderFlowException();

    }


    public static void main(String[] args) {
        try {
            Pop();
        } catch (StackUnderFlowException su) {
            System.out.println(su);
        }
        try {
            Push();
        }catch (StackOverFlowException stack){
            System.out.println(stack);
        }
    }
}
