/**
 *  0717-3
 *  穨:
 *  ―计?
 *  璝俱计 A 砆俱计 B 俱埃玥 B 琌 A 计
 *  
 *  癹伴: for(int i = 1; i <= 100; i++)
 *  1~100 ぇ丁パㄏノ块计
 *  祘Α璶: 1~100ぇ丁êㄇ计琌硂计计
 * 
 */
 
public class HW4 {
    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("叫块俱计:");
        int num = scan.nextInt();
        
        System.out.println("1~100ぇ丁");
        for(int i = 1; i <= 100; i++) {
        
            if(num % i == 0)
                System.out.println(i + "" + num + "计");
            
        }
    
        
    }

}

/*

D:\java20230519>javac HW4.java

D:\java20230519>java HW4
叫块俱计:45
1~100ぇ丁
145计
345计
545计
945计
1545计
4545计

D:\java20230519>java HW4
叫块俱计:99
1~100ぇ丁
199计
399计
999计
1199计
3399计
9999计


*/