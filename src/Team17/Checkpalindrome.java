package Team17;

import java.util.Random;
class Checkpalindrome{
	Checkpalindrome(int []int_arr,char[] word){
    int i1 = 0;
    int i2 = word.length - 1;
    boolean i=true;
    boolean c=true;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            c=false;
            break;
        }
        ++i1;
        --i2;
    }
    int i3 = 0;
    int i4 = int_arr.length - 1;
    while (i4 > i3) {
        if (int_arr[i3] != int_arr[i4]) {
            i=false;
            break;
        }
        ++i3;
        --i4;
    }
    if(!i) {
    	System.out.println("intger array is not palindrome");
    }else {
    	System.out.println("intger array is palindrome");
    }
    if(!c) {
    	System.out.println("char array is not palindrome");
    }else {
    	System.out.println("char array is palindrome");
    }
}
}