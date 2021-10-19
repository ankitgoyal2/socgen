

public class sortEvenOdd
{
    public static void main( String args[])
    {
        int arr[] = {1,2,9,8,10,5};
        int size = 6;


        int start = 0, end = size-1;

        int count=0;
        while (start < end)
        {
            while (arr[start] % 2 == 0)
            {
                start++;
                count++;
            }
    
            
            while (arr[end] % 2 != 0 && start < end)
                end--;
    
            
            if (start < end)
            {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }


        for(int i=0;i<count;i++)
        {
            for(int j=1;j<count;j++)
            {
                if(arr[j-1]<arr[j])
                {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int oddCount = size-count;
        for(int i=0;i<oddCount;i++)
        {
            for(int j=1;j<oddCount;j++)
            {
                if(arr[count+j-1]<arr[count+j])
                {
                    int tmp = arr[count+j-1];
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