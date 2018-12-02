package Team17;

/**
 *
 * @author Youssef Khaled
 */
public class ShiftArray {
    public void ShiftArray(int []arr, char []arrC)
    {
        int tmp = arr[0];
        char tmpC= arrC[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
            arrC[i] = arrC[i+1];
        }
        arr[arr.length-1] = tmp;
        arrC[arr.length-1] = tmpC;
        // Printing Arrays
        System.out.print("The integer array after shift: ");
        for( int i = 0; i < arr.length; i++ )
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nThe charcter array after shift: ");
        for( int i = 0; i < arrC.length; i++ )
        {
            System.out.print(arrC[i]+" ");
        }
        System.out.println();
   
    }
        
    
    
}
