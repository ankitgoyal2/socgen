
import java.lang.Math;

public class SortSquareRoot {


    


    public static void main( String args[])
    {
        double arr[] = {8,9,10,15,16,56,49,53};
        int size = 8;

        int count=0;
        int temp;
        double tm;
        for(int i=0;i<size;i++)
        {
            arr[i] = Math.sqrt(arr[i]);
            temp = (int)arr[i];
            if(temp==arr[i])
            {
               tm = arr[count];
               arr[count] = arr[i];
               arr[i] = tm; 
               count++;
            }
        }



        for(int i=0;i<count;i++)
        {
            for(int j=1;j<count;j++)
            {
                if(arr[j-1]<arr[j])
                {
                    double tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int remaining = size-count;
        for(int i=0;i<remaining;i++)
        {
            for(int j=1;j<remaining;j++)
            {
                if(arr[count+j-1]<arr[count+j])
                {
                    double tmp = arr[count+j-1];
                    arr[count+j-1] = arr[count+j];
                    arr[count+j] = tmp;
                }
            }
        }

       
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        

    }
}
