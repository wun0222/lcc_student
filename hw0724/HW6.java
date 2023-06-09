
/***
 * 0724-2
 * 作業二: 
 * 迴圈 + 陣列 (氣泡排序法)
 * 建立一個整數的一維陣列，元素必須要有10個
 * 請利用迴圈方式，將一維陣列排序(請由小至大排序)
 * 排序後，請呈現出內容
 * 
 * 若上述做法時，可以再嘗試改成(由大至小排序)
 * 
 */
public class HW6 {
    public static void main(String[] args) {
        
        int[] number = {2, 3, 78, 9, 33, 45, 66, 90, 8, 20};
        int min = 0;
        int temp = 0;
    
        
        for(int x = 0; x < number.length; x++) {
            
            //System.out.println("\nx =" + x);  //debug
            
            min = number[x];
            for(int i = x + 1; i < number.length; i++) {
            
                //System.out.println("i =" + i); //debug
                
                if(number[i] < min) {
                    temp = number[x];
                    min = number[i];
                    number[i] = temp;
                    number[x] = min;
                }
                
                /*
                //debug
                for(int n : number) {
                    System.out.print(n + " ");
                }
                System.out.println();
                */
            }
            
        
        }
        
    
        System.out.println("此陣列由小到大為:");
        for(int n : number) {
            System.out.print(n + " ");
        }
        
        System.out.println();
        
        
        System.out.println("此陣列由大到小為:");
        for(int i = number.length - 1; i >= 0; i--) 
            System.out.print(number[i] + " ");
    
    }
}

/*
D:\java20230519>javac HW6.java

D:\java20230519>java HW6
此陣列由小到大為:
2 3 8 9 20 33 45 66 78 90
此陣列由大到小為:
90 78 66 45 33 20 9 8 3 2
*/


/*
D:\java20230519>javac HW6.java

D:\java20230519>java HW6

x =0
i =1
2 3 78 9 33 45 66 90 8 20
i =2
2 3 78 9 33 45 66 90 8 20
i =3
2 3 78 9 33 45 66 90 8 20
i =4
2 3 78 9 33 45 66 90 8 20
i =5
2 3 78 9 33 45 66 90 8 20
i =6
2 3 78 9 33 45 66 90 8 20
i =7
2 3 78 9 33 45 66 90 8 20
i =8
2 3 78 9 33 45 66 90 8 20
i =9
2 3 78 9 33 45 66 90 8 20

x =1
i =2
2 3 78 9 33 45 66 90 8 20
i =3
2 3 78 9 33 45 66 90 8 20
i =4
2 3 78 9 33 45 66 90 8 20
i =5
2 3 78 9 33 45 66 90 8 20
i =6
2 3 78 9 33 45 66 90 8 20
i =7
2 3 78 9 33 45 66 90 8 20
i =8
2 3 78 9 33 45 66 90 8 20
i =9
2 3 78 9 33 45 66 90 8 20

x =2
i =3
2 3 9 78 33 45 66 90 8 20
i =4
2 3 9 78 33 45 66 90 8 20
i =5
2 3 9 78 33 45 66 90 8 20
i =6
2 3 9 78 33 45 66 90 8 20
i =7
2 3 9 78 33 45 66 90 8 20
i =8
2 3 8 78 33 45 66 90 9 20
i =9
2 3 8 78 33 45 66 90 9 20

x =3
i =4
2 3 8 33 78 45 66 90 9 20
i =5
2 3 8 33 78 45 66 90 9 20
i =6
2 3 8 33 78 45 66 90 9 20
i =7
2 3 8 33 78 45 66 90 9 20
i =8
2 3 8 9 78 45 66 90 33 20
i =9
2 3 8 9 78 45 66 90 33 20

x =4
i =5
2 3 8 9 45 78 66 90 33 20
i =6
2 3 8 9 45 78 66 90 33 20
i =7
2 3 8 9 45 78 66 90 33 20
i =8
2 3 8 9 33 78 66 90 45 20
i =9
2 3 8 9 20 78 66 90 45 33

x =5
i =6
2 3 8 9 20 66 78 90 45 33
i =7
2 3 8 9 20 66 78 90 45 33
i =8
2 3 8 9 20 45 78 90 66 33
i =9
2 3 8 9 20 33 78 90 66 45

x =6
i =7
2 3 8 9 20 33 78 90 66 45
i =8
2 3 8 9 20 33 66 90 78 45
i =9
2 3 8 9 20 33 45 90 78 66

x =7
i =8
2 3 8 9 20 33 45 78 90 66
i =9
2 3 8 9 20 33 45 66 90 78

x =8
i =9
2 3 8 9 20 33 45 66 78 90

x =9
此陣列由小到大為:
2 3 8 9 20 33 45 66 78 90
*/