import java.io.IOException;

public class Code_efficiency {
    public static void main(String[] args) throws IOException {
        int n=100;
        for (int i=0;i<n;i++)     //O(1)+O(n+1)+O(n)=O(2n+2)=O(2*100+2)=O(202)
        {
            System.out.println(i);  //O(1)
        }
        System.out.println(n);      //O(1)
    }//O(202+100+1)=O(303)

    public void main2(){
        int n=100;
        for(int i=0;i<n/2;i++)//O(2k+2)=O(2*50+2)=O(102)
        {
            System.out.println(i);  //O(1)
        }//O(102)
        for(int i=n/2;i<n;i++)//O(102)
        {
            System.out.println(i);  //O(1)
        }//O(102)
        System.out.println(n);//O(1)
    }//O(102)+O(50)+O(102)+O(50)+O(1)=O(305)
}
