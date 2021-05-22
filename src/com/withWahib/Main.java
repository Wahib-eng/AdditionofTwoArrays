package com.withWahib;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
      /* تعريف متغير من كلاس سكانر باي اسم واستخدامه
       من أجل أستقبال مدخلات من المستخدم
       */
        System.out.println("أدخل عدد الأسطر : ");
        int m =in.nextInt();
        System.out.println("أدخل عدد الأعمدة  : ");
        int n =in.nextInt();
        //تعريف مصفوفتين لحفظ الارقام المدخلة

        int [][]array=new int[m][n];
        int [][]array2=new int[m][n];
        // إنشاء حلقتين مدخلتين في بعض لاستقبال المدخلات وتخزينها في المصفوفة
        System.out.println("أدخل أرقام لملأ المصفوفة الأولى  :");
        for(int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.println(String.format(" أدخل المصفوفة الاولى [%d][%d] : ", r, c));
                array[r][c] = in.nextInt();
            }
        }
        System.out.println("أدخل أرقام لملأ المصفوفة الثانية  :");
        for(int r = 0; r < array2.length; r++) {
            for (int c = 0; c < array2[0].length; c++) {
                System.out.println(String.format(" أدخل المصفوفة الثانية [%d][%d] : ",c, r));
                array2[r][c] = in.nextInt();
            }
        }
        //أغلاق المدخلات
        in.close();
        //استدعاء للدالة التي ستطبع المصفوفتان
        System.out.println("المصفوفة 1 = ");
        printArray(array);
        System.out.println("المصفوفة 2 = ");
        printArray(array2);
        // استدعاء للدالة التي ستجمع المصفوفتان
        sum(array,array2);
    }
    // دالة الجمع
    private static void sum(int[][]array, int[][]array2){
        int row = array.length;
        int column= array[0].length;
        int sum[][]=new int[row][column];
        for(int i =0 ; i< row; i++){
            for(int j=0 ; j< column;j++){
                sum[i][j]=array[i][j] + array2[i][j];
            }
        }
        System.out.println("مجموع المصفوفتين يساوي : ");
        printArray(sum);
    }//دالة الطباعة
    private static  void printArray(int [][]matrices ){

        for (int r = 0; r < matrices.length; r++) {
            for (int c = 0; c < matrices[0].length; c++) {
                System.out.print(matrices[r][c]+"   \t");
            }
            System.out.println();
        }

    }
}