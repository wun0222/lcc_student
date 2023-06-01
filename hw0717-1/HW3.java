
/**
 *  0717-2
 *  作業二:
 *  請用巢狀迴圈來做
 *  
 *  1
 *  22
 *  333
 *  4444
 *  55555
 *  4444
 *  333
 *  22
 *  1
 *  
 */

public class HW3 {
    public static void main(String[] args) {
    
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    
    }
}

/*
D:\java20230519>javac HW3.java

D:\java20230519>java HW3
1
22
333
4444
55555
4444
333
22
1
*/