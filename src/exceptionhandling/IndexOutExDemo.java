package exceptionhandling;

import org.w3c.dom.ls.LSOutput;

public class IndexOutExDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[0] =5;
            arr[1]= 3;
            arr[2]=8;
            arr[3]=2;
            arr[4]=9;
            arr[5]=1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        System.out.println(arr);
        System.out.println("Remaining code");
    }


}
