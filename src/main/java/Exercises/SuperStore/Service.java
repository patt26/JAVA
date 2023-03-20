package Exercises.SuperStore;

public class Service {
    public static void  main(String[] args) {
        Store s= new Store();
        Customer c1= new Customer("Andy");
        Customer c2= new Customer("Jack");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
    public static class Store{
        Member[] mem =new Member[100];
        int count=0;

        void register(Member m){
            mem[count++]=m;
        }
        void inviteSale(){
            for (int i=0;i<count;i++){
                mem[i].callback();
            }
        }

    }
   abstract   class Member1{
        abstract void one();
        void two(){}
    }
    class Message extends Member1 implements message{
        void one(){}

        public void men(){}
        }
    }
    interface message{
        void men();

    }
     class Customer implements Member{
        String name;


        public Customer(String name) {
            this.name = name;
        }

        @Override
        public void callback() {
            System.out.println("I will visit,"+name);
        }

    }


