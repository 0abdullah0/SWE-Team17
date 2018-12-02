/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_project;

/**
 *
 * @author Youssef Khaled
 */


/**
 *
 * @author Youssef Khaled
 */
public class ShiftArray {
    public void ShiftArray(int []arr)
    {
        int tmp = arr[0];
        int tmpC = arr[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
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
        for( int i = 0; i < arr.length; i++ )
        {
            System.out.print(arrC[i]+" ");
        }
    }
    
}
