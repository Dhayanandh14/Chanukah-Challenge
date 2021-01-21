import java.util.*;
class Chanukah {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int p,n,k,count;
    p=kbd.nextInt();
    for(int i=0;i<p;i++){
       n=kbd.nextInt();
       k=kbd.nextInt();
       count=0;
       for(int j=1;j<=k;j++){
         count = count +j;
       }
      System.out.println(n+" "+(count+k));
    }
    kbd.close();
  }
}