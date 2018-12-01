package Team17;

/**
 *
 * @author Youssef Khaled
 */
public class ShiftArray {
    public void ShiftArray(int []arr)
    {
        int tmp = arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = tmp;
    }
    
}
