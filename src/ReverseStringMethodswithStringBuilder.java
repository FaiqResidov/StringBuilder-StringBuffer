import java.util.Scanner;

public class ReverseStringMethodswithStringBuilder {
    public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  String string=sc.next();
     reverseString(string);
    }

    public static void reverseString(String string){
        StringBuilder reverse=new StringBuilder();
        String salam;
        for(int i=string.length()-1;i>=0;i--){
            reverse.append(string.charAt(i));
        }
        System.out.println(reverse);
    }


}