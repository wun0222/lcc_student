/**
 *   Watson�Ѯv�H�c: ffc141@gmail.com
 * �@�~�Ĥ@�D:
 * 
 * �Х� if .. else �P�_
 * 
 * java.util.Scanner
 * 
 * �ШϥΪ̿�J�@�ӼƦr�C
 * �P�_�ϥΪ̿�J���Ʀr�O�_���٬O����?
 * �n�L�X��
 * 
 * ����:�Х� % ���l��  �i�H�Q ? �㰣�A�l��=0
 * �N�|�O���ơA����Q�㰣�A�N�O�_��
 * 
 */

public class HW1 {

    public static void main(String[] args) {
    
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.print("�п�J�@�Ӿ��:");
        int n = scan.nextInt();
        
        System.out.println();
        
        if(n % 2 == 0) {
            System.out.println("����");
        } else {
            System.out.println("�_��");
        }
        
        System.out.println("�{������");
    }
}