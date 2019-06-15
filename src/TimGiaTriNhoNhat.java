import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int size;
        do
            {
                System.out.println("Nhap so phan tu trong mang" );
                 size=scanner.nextInt();
                if(size>100)
                {
                    System.out.println("Moi nhap lai");
                }
            }
        while (size>100);
        int[] array=new int[size];
        int i=0;
        for(int x:array)
        {
            System.out.println("Nhap phan thu thu "+(i+1)+" ");
            array[i]=scanner.nextInt();
            i++;
        }
        int min=array[0];
        for(int x:array)
        {
            if(min>x)
            {
                min=x;
            }
        }System.out.println("Min= "+min);
    }
}
