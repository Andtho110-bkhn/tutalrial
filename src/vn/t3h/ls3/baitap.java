package vn.t3h.ls3;

import java.util.Arrays;
import java.util.Scanner;

public class baitap 
{
	public static void main(String[] args) {
		
		int[] arr = {90,90,20,27,35,22,10,8,8,8};
		Arrays.sort(arr);//sorting array  
        int length = arr.length;  
        length = removeDuplicate(arr, length);
        
        int[] newarr = new int[length];
        for (int i=0; i<length; i++)  
        	newarr[i] = arr[i];
        
        System.out.println("Mang moi co do dai: " + length + ", gia tri mang: " + Arrays.toString(newarr));
        /*
		int i = 0;
		int length = 10;
		int[] arr = new int[length];
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.print("Nhập phần tử thứ " + (i +1) + ": ");
        	int value = sc.nextInt();
        	arr[i] = value;
        	i++;
        } while(i<10);
        
        System.out.println("Mang moi co do dai: " + length + ", gia tri mang: " + Arrays.toString(arr));
        */
    }
	
	public static int removeDuplicate(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        // Tạo một mảng tạm để lưu giá trị
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
        	// Nếu phẩn tử thứ i != thứ i +1 thì thêm vào mảng tạm
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // thay đổi giá trị cho mảng cũ
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
}
