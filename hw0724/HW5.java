
/***
 * 0724-1
 * �@�~�@:
 * �j�� + �}�C
 * �إߤ@�Ӿ�ƪ��@���}�C�A���������n��10�ӡC
 * �ѨϥΪ̿�J����M���Ʀr�C
 * �Y�����ɡA������ܦb���ӯ��ޭȧ�쥦�A
 * �Y�S�����ɡA�n��ܰ}�C���S�����Ʀr�C
 * 
 */

public class HW5 {
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int[] number = {1,3,5,7,9,11,13,15,17,19};
        
        System.out.print("�п�J����M���Ʀr(�d��1~20):");
        int a = input.nextInt();
        
        for(int i = 0; i < number.length; i++) {
           
            if(a == number[i]) {
                System.out.println("�b�}�C����" + i + "�ӯ��ޭȧ��Ʀr" + a );
                break;
            }
            if(i == number.length - 1)
                System.out.println("�}�C���S�����Ʀr");
        }
    
    }
}

/*
D:\java20230519>javac HW5.java

D:\java20230519>java HW5
�п�J����M���Ʀr(�d��1~20):3
�b�}�C����1�ӯ��ޭȧ��Ʀr3

D:\java20230519>java HW5
�п�J����M���Ʀr(�d��1~20):8
�}�C���S�����Ʀr

D:\java20230519>java HW5
�п�J����M���Ʀr(�d��1~20):19
�b�}�C����9�ӯ��ޭȧ��Ʀr19
*/