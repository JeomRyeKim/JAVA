package ch03_array;

/* �迭 ��ҵ��� Ÿ���� �⺻Ÿ�� */
public class Ex08Shot {
	public static void main(String[] args) {
		//1���� �迭�� �������� ����
	      int[] score = {76,45,34,89,100,50,90,92}; //����(��������):34,45,50,76,89,90,92,100
	      int temp=0;//�迭 ����� ���� �ӽ� ������ ����
	      for(int i=0;i<score.length;i++) {
	         for(int j=i+1;j<score.length;j++) {
	            if(score[i]>score[j]) {//i(�ε���0)�� ���� ũ�� j(�ε���1)�� ���� ��ȯ
	            	//score[i]<score[j] -> ��������.
	               temp=score[i];//i(�ε���0)�� ���� �ӽú����� ����
	               score[i]=score[j];//j(�ε���1)�� ���� i(�ε���0)�� ���� ��
	               score[j]=temp;//�ӽ������� ��(�ε���0)�� �ٽ� j(�ε���1)�� ����
	            }
	         }
	      }
	      
	      //���ĵ� ���� ���
	      for(int i : score) {
	         System.out.print(i+"  ");
	      }
	}
}

