package Lambda_Expression;

class PracLambda{
    public static void main(String[] args) {
//        LambdaDemo ld=()->
//        System.out.println("Hello");;
//         ld.display();
        UseLambda ud=new UseLambda();
        ud.callLambda(()-> System.out.println("hello"));
    }
}
class UseLambda{
    public void callLambda(LambdaDemo ld){
        ld.display();
    }
}
class staticRefDemo{
    public static void main(String[] args) {
        staticRef sr=System.out::println;
        sr.Display("Hellooo");
        reverseDemo rd=staticRefDemo::reverse;
        rd.Display("Hello");

    }

    private static void reverse(String str){
        StringBuffer st=new StringBuffer(str);
        System.out.println(st.reverse());
    }


}