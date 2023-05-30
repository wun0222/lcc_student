/**
 *   Watson老師信箱: ffc141@gmail.com
 * 作業第一題:
 * 
 * 請用 if .. else 判斷
 * 
 * java.util.Scanner
 * 
 * 請使用者輸入一個數字。
 * 判斷使用者輸入的數字是奇數還是偶數?
 * 要印出來
 * 
 * 提示:請用 % 取餘數  可以被 ? 整除，餘數=0
 * 就會是偶數，不能被整除，就是奇數
 * 
 */

public class HW1 {

    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("請輸入一個整數:");
        int n = scan.nextInt();
        
        System.out.println();
        
        if(n % 2 == 0) {
            System.out.println("偶數");
        } else {
            System.out.println("奇數");
        }
        
        System.out.println("程式結束");
    }
}