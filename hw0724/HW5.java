
/***
 * 0724-1
 * 作業一:
 * 迴圈 + 陣列
 * 建立一個整數的一維陣列，元素必須要有10個。
 * 由使用者輸入欲找尋的數字。
 * 若有找到時，必須顯示在哪個索引值找到它，
 * 若沒有找到時，要顯示陣列中沒有此數字。
 * 
 */

public class HW5 {
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int[] number = {1,3,5,7,9,11,13,15,17,19};
        
        System.out.print("請輸入欲找尋的數字(範圍1~20):");
        int a = input.nextInt();
        
        for(int i = 0; i < number.length; i++) {
           
            if(a == number[i]) {
                System.out.println("在陣列中第" + i + "個索引值找到數字" + a );
                break;
            }
            if(i == number.length - 1)
                System.out.println("陣列中沒有此數字");
        }
    
    }
}

/*
D:\java20230519>javac HW5.java

D:\java20230519>java HW5
請輸入欲找尋的數字(範圍1~20):3
在陣列中第1個索引值找到數字3

D:\java20230519>java HW5
請輸入欲找尋的數字(範圍1~20):8
陣列中沒有此數字

D:\java20230519>java HW5
請輸入欲找尋的數字(範圍1~20):19
在陣列中第9個索引值找到數字19
*/