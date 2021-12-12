package com.company;

public class Main {

    public static void main(String[] args) {

    }

//zad1
    public static int[] revert(int[] arr){

        int[] tab = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + "  ");
            tab[arr.length-1] =arr[i];}
        return tab;
    }

//zad2
public static String arrayToString(int[] arr){
        String napis = new String();

        for(int i=0;i<arr.length;i++){
            napis= napis + arr[i]+",";

        }

    return napis;
}
//zad3 zwracanie tylko parzyste
public static int[] getEven(int[] arr){
        int[] parzyste = new int[arr.length];

    for(int i=0;i<arr.length;i++){
        if (arr[i]%2==0){
            parzyste[i]=arr[i];
        }


    }


    return parzyste;
}
//zad4
public static boolean arrayEquals(int[] arr, int[] arr2){

    Boolean ret;
    if (arr == arr2) // Same as arr1.equals(arr2)
       ret=true;
    else
       ret=false;

    return ret;
}
//zad5
public static void printArray(int[] arr){

    for (int i = 0; i < arr.length; i++)
        System.out.println( arr[i]+ " ");

}
//zad6
public static boolean isInArray(double[] arr, double num){
        boolean jest;

        for(int i =0; i < arr.length; i++){
            if (i == num) {
                return true;
            }
        }
    return false;
        }


    return false;
}
//zad7
public static double getAlgebraicMean(double[] arr){
    Double srednia;
    Double suma = null;
    int ile= arr.length;
    for(int i =0; i < arr.length; i++){
         suma = suma + arr[i];

    }


    return srednia=suma/arr.length;
}
//zad8
public static boolean isIncreasing(int[] arr){

    for(int i =0; i < arr.length; i++){
        if (arr[i]<arr[i+1]) {
            return true;
        }
    }
    return false;
}
}
