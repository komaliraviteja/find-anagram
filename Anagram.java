import java.util.*;
class Anagram{
    public static void main(String[] args){
        String a ="Hello";
        String[] arr = {"Heoll","elloH","olleH","Hell"};
        char[] chr = a.toCharArray();
        Arrays.sort(chr);
        String b = new String(chr);
        for(int i =0;i<arr.length;i++){
            char[] chre = arr[i].toCharArray();
            Arrays.sort(chre);
            String c = new String(chre);
            if(!b.equals(c)){
                System.out.println(c+" is not a anagram");
            }
        }
    }
}

