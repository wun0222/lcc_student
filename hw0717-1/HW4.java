/**
 *  0717-3
 *  �@�~�T:
 *  �D�]��?
 *  �Y��� A �i�H�Q��� B �㰣�A�h B �O A ���]��
 *  
 *  �j��: for(int i = 1; i <= 100; i++)
 *  1~100 �����A�ѨϥΪ̿�J�@�ӼƦr
 *  �{���n�L�X: 1~100�����A���ǼƦr�O�o�ӼƦr���]��
 * 
 */
 
public class HW4 {
    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("�п�J�@�Ӿ��:");
        int num = scan.nextInt();
        
        System.out.println("1~100����");
        for(int i = 1; i <= 100; i++) {
        
            if(num % i == 0)
                System.out.println(i + "��" + num + "���]��");
            
        }
    
        
    }

}

/*

D:\java20230519>javac HW4.java

D:\java20230519>java HW4
�п�J�@�Ӿ��:45
1~100����
1��45���]��
3��45���]��
5��45���]��
9��45���]��
15��45���]��
45��45���]��

D:\java20230519>java HW4
�п�J�@�Ӿ��:99
1~100����
1��99���]��
3��99���]��
9��99���]��
11��99���]��
33��99���]��
99��99���]��


*/