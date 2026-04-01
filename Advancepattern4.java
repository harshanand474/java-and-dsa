 import java.util.*;
  class Advancepattern{
      public static void main (String args[]){
          int n=4;
          //upper half
          for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                  System.out.print(" ");
              }
              //upper half stars
              int s=(2*i)-1;
              for (int j=1;j<=s;j++){
                  System.out.print("*");
              }
              System.out.println();
            }
            //lower half
            for(int i=n;i>=1;i--){
              for(int j=1;j<=n-i;j++){
                  System.out.print(" ");
              }
              //lower half stars
              int s=(2*i)-1;
              for (int j=1;j<=s;j++){
                  System.out.print("*");
              }
              System.out.println();
            }
        }
    }   