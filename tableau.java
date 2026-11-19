import java.util.Scanner;

public class tableau {
    public static void main(String[] arg){
        int[] t =new int[5];
        t[0]=2;
        t[1]=0;
        t[2]=1;
        t[3]=3;
        t[4]=4;
        for (int i = 0; i < 5; i++) {
            System.out.print(t[i]);
        }
        System.out.println();
        System.out.println("la longueur de tableau est :"+t.length);
        t[1]=2;
        System.out.println("la valeur à l'indice 1 est :"+t[1]);
        float[] t1 = new float[5];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("t["+i+"] =");
            t1[i]=sc.nextFloat();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(t1[i]+"|");

        }
        System.out.println();
        float[] tf = new float[5];
        tf[0]=t[0]+t1[0];
        tf[1]=t[1]+t1[1];
        tf[2]=t[2]+t1[2];
        tf[3]=t[3]+t1[3];
        tf[4]=t[4]+t1[4];
        for (int i = 0; i < 5; i++) {
            System.out.print(tf[i]+"|");
        }
        System.out.println();
    }

}