import java.util.Scanner;

public class PalindromeStringwithStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        palindromeString(word);

    }


    public static void palindromeString(String str){
        StringBuilder String =new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){

            String.append(str.charAt(i));

        }
        if(str.equals(String.toString())){
            System.out.println("is a palindrome");
        }
        else {
            System.out.println("is not a palindrome");
        }


    }
}
