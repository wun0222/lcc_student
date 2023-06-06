/**
 *  0717-3
 *  作業三:
 *  求因數?
 *  若整數 A 可以被整數 B 整除，則 B 是 A 的因數
 *  
 *  迴圈: for(int i = 1; i <= 100; i++)
 *  1~100 之間，由使用者輸入一個數字
 *  程式要印出: 1~100之間，那些數字是這個數字的因數
 * 
 */

public class HW4 {
    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("請輸入1~100之間的數字找因數:");
        int number = scan.nextInt();
        
        if(number >= 1 && number <= 100) {
        
            System.out.println(number + "的因數:");
            for(int i = 1; i <= number; i++) {
                if(number % i == 0)
                    System.out.print(i + ",");
                
            }
        } else {
            System.out.println("數字的範圍不在1~100之間");
        }
    
    }

}

/*
D:\java20230519>javac HW4.java

D:\java20230519>java HW4
請輸入1~100之間的數字找因數:67
67的因數:
1,67,
D:\java20230519>java HW4
請輸入1~100之間的數字找因數:90
90的因數:
1,2,3,5,6,9,10,15,18,30,45,90,
*/

/*
public class HW4 {
    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("請輸入一個整數:");
        int num = scan.nextInt();
        
        System.out.println("1~100之間");
        for(int i = 1; i <= 100; i++) {
        
            if(num % i == 0)
                System.out.println(i + "為" + num + "的因數");
            
        }
    
        
    }

}
*/
/*

D:\java20230519>javac HW4.java

D:\java20230519>java HW4
請輸入一個整數:45
1~100之間
1為45的因數
3為45的因數
5為45的因數
9為45的因數
15為45的因數
45為45的因數

D:\java20230519>java HW4
請輸入一個整數:99
1~100之間
1為99的因數
3為99的因數
9為99的因數
11為99的因數
33為99的因數
99為99的因數


*/
