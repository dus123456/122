
public class Test2 {
	public static void main(String[] args) {
		
		//ʮ����
		int a = 10;//10
		
       //ʮ������
		int b= 0XB51;//16
		
		//�˽���
		int  c= 010;//8
		
		//������
		int d = 0b100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//���ƻ�ת
		//ʮ����  -��ʮ�� �� �� ����(�̳���)
		//ʮ�� �� ��  ���� - ��ʮ����   (Ȩ�ӷ�)
		//ʮ������ �� �� �� - �� ������
		
		//ʮ����ת������ʮ����
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
	}

}
