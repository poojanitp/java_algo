package upendra;

import java.util.Arrays;
import java.util.*;

public class Rotation {
    public static int[] rotateArray(int n, int array[]){
        int size = array.length;
        int actualRotation = n % size;
        int[] tempArray = new int[actualRotation];
        for(int i=0 ;i< size; i++){
            if(i < actualRotation){
                tempArray[i] = array[i];
            }
            else{
                array[i-actualRotation] = array[i];
            }
        }
        for(int i=0;i<actualRotation;i++){
            array[size-actualRotation+i] = tempArray[i];
        }
        return array;
    }
    public static int[] matrixToArray(int i1, int j1, int i2, int j2, List<ArrayList<Integer>> matrix){
        int arrayLength = 2*(i2-i1) + 2*(j2-j1);
        if(arrayLength % 2 == 1 || arrayLength == 0) {
            arrayLength++;
        }
        int[] arr = new int[arrayLength];
        int k = 0;
        for(int j=j1; j<= j2;j++){
            arr[k++] = matrix.get(i1).get(j);
        }
        for(int i=i1+1; i<= i2;i++){
            arr[k++] = matrix.get(i).get(j2);
        }
        for(int j=j2-1; j >= j1;j--){
            arr[k++] = matrix.get(i2).get(j);
        }
        for(int i=i2-1; i > i1;i--){
            arr[k++] = matrix.get(i).get(j1);
        }
        return arr;
    }
    public static void arrayToMatrix(int i1, int j1, int i2, int j2, int[] array, List<ArrayList<Integer>> matrix){
        int arrayLength = array.length;
        int k = 0;
        for(int j=j1; j<= j2;j++){
            matrix.get(i1).set(j, array[k++]);
        }
        for(int i=i1+1; i<= i2;i++){
            matrix.get(i).set(j2, array[k++]);
        }
        for(int j=j2-1; j >= j1;j--){
            matrix.get(i2).set(j, array[k++]);
        }
        for(int i=i2-1; i > i1;i--){
            matrix.get(i).set(j1, array[k++]);
        }
    }

    public static void rotateMatrix(List<ArrayList<Integer>> matrix, int r){
        int m = matrix.size();
        int n = matrix.get(0).size();
        int loopCount = Math.min((m+1)/2 , (n+1)/2);
        int i1=0, j1=0, i2=m-1, j2=n-1;
        for(int k=0; k< loopCount; k++){
            int[] arr = matrixToArray(i1, j1, i2, j2, matrix);
            System.out.println(Arrays.toString(arr));
            rotateArray(r, arr);
            System.out.println(Arrays.toString(arr));
            arrayToMatrix(i1, j1, i2, j2, arr, matrix);
            i1++; j1++; i2--; j2--;
        }
    }

}
