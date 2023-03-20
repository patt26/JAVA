import java.util.*;

public class GFG {
    public static void main(String[] args) {
       /* String str = "GEEKS FOR GEEKS";
        String newStr=str.replaceAll("\\s+","");
        Character [] c1=new Character[1023].;

        char c;
        String reverse="";
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < newStr.length(); i++) {
            c = newStr.charAt(i);
            reverse=c+reverse;
            c1[i]=c;

        }
        String str1= String.valueOf(reverse.toCharArray());
        for (Character x:c1
             ) {
            System.out.println(c1.t);
        }
        System.out.println(str1);
        // System.out.println(reverse.trim());
       *//*
        char[] ch=newStr.toCharArray();

        HashSet<char[]> newSet=new HashSet<>();
        newSet.add(ch);
        System.out.println(newSet.size());
        }*/


      //  Election2019(new String[]{"B","C","D","A"},new int[]{2,3,1,4},3);
     //   System.out.println(binarySearch(new int[]{1,2,3,4,5},5,4));
        ArrayList<Integer> arrayList=new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        reverseInGroups(new ArrayList<Integer>(arrayList),8,8);


    }

    public static void Election2019(String [] party,int[] seats,int n){
        TreeMap<String,Integer> hm=new TreeMap<>();
        for (int i = 0, j = 0; i<party.length && j< seats.length;i++,j++){
                hm.put(party[i],seats[j]);
        }
        for(Map.Entry<String,Integer> mp:hm.entrySet()){
            String key=mp.getKey();
            Integer value=mp.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println(Collections.max(hm.values()));


        /*int highestValue=Integer.MIN_VALUE;
        for(Integer value:hm.values()){
            if(value>highestValue){
                highestValue=value;
            }
        }
        System.out.println(highestValue);*/


    }

    public static void ReverseWithoutSpaces(){
        String s="GEEKS FOR GEEKS";
        String newString=s.replaceAll("\\s+","");
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();

        for(int i=newString.length()-1;i>=0;i--){
            lhs.add(newString.charAt(i));
        }
        for (Character x:lhs){
            sb.append(x);
        }
        System.out.println(sb);
    }
    public static int binarySearch(int arr[],int n,int k){
        Integer num = null;
        Integer index=null;
        for(int i=0;i<n;i++){
            num=arr[i];
            if(num==k) {
                index = i;
                if (num.equals(k)) {
                    return index;
                }
                System.out.println(num);
            }
        }
        return -1;
    }
   static void  reverseInGroups(ArrayList<Integer> arr,int n,int k) {
       List<Integer> demo = new ArrayList<>();
       demo = arr.subList(0, k);
       List<Integer> remaining;
       remaining = arr.subList(k, arr.size());
       List<Integer> reverse = new ArrayList<>();
       List<Integer> reverse2 = new ArrayList<>();

       for (int i = demo.size() - 1; i >= 0; i--) {
           reverse.add(demo.get(i));
       }
//       if (arr.size() - k != 0) {
           for (int i = remaining.size() - 1; i >= 0; i--) {
               reverse2.add(remaining.get(i));
           }

           reverse.addAll(reverse2);

           for (Integer x : reverse
           ) {
               System.out.print(x + " ");
           }

       }
   }


