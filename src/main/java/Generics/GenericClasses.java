package Generics;

public class GenericClasses<T> {
    private T obj;
    public void setData(T v){
        obj=v;
    }
    public T readData(){
        return obj;
    }

    public static void main(String[] args) {
        GenericClasses<Integer> gc=new GenericClasses<>();
        gc.setData(83);
        System.out.println(gc.readData());
    }
}

@SuppressWarnings("unchecked")
 class GenericArray<T,L>{
    T[] array=(T[])new Object[10];

  private   int length=0;
    public void Append(T v,L c){
        array[length++]=v;

    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(array[i]);
        }
    }


     public static void main(String[] args) {
         GenericArray<String,Integer> gcc=new GenericArray<>();
         gcc.Append("true",10);
         gcc.Append("false",45);
         gcc.Append("false",67);
         gcc.display();
     }
}
