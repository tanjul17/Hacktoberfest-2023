import java.util.*;
public class Patterns {
    public static void main(String[] args) {


        // Start pattern >>>

        // for(int i =1 ;i<9;i++){
        // for(int j=1;j<i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ArrayList al = new ArrayList<>();
        // al.add(1);
        // al.add("2");
        // System.out.println(al);
        // Inverted Star>>>

        // for(int i =1 ;i<9;i++){
        // for(int j=9;j>i;j--){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Another MEthod:

        // for (int i =1;i<=4;i++){
        // for (int j =1;j<=4-i+1;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Print Half pyramid pattern>>

        // for (int i =1;i<=4;i++){
        // for(int j =1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // pattern:

        // int n =4;
        // char ch = 'A';
        // for (int i =1;i<=n;i++){
        // for (int j =1;j<=i;j++){
        // System.out.print(ch+" ");
        // ch++;
        // }
        // System.out.println();
        // }

        // Inverted Half pyramid>>

        // int n =4;
        // for (int i=1;i<n;i++ ){
        // for (int j=n;j<=n-i;j++){
        // System.out.println(" ");
        // }
        // for(int j=1;j<=n;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n=5;
        // for (int i =1; i<=n; i++){
        // //spaces
        // for ( int j =1; j<=n-i;j++ ){
        // System.out.print(" ");
        // }
        // //stars
        // for (int j =1; j<=5;j++ ){
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        //revision
        for(int i = 4;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
