/**
 * 
 */
package dataStructureLearning;

import java.util.Arrays;

/**
 * @author yuzongjian
 *��ͨ����
 * This is a project for the power supply bureau.
 */
public class learning1 {
	//����һ������
	public static void main(String[] args) {
		int [] arr1=new int[3];
		int length1=arr1.length;
		System.out.println("arr1�ĳ�����"+length1);
		int[] arr2=new int[] {10,20,30};
		System.out.println("arr2�ĳ�����"+arr2.length);
		//��һ����������ݷ������
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i]+"\t");
		}
		//���鳤�ȿɱ䣨��
		int[] arr3 =new int[] {9,8,7};
		int number=6;
		int[] arr4=new int[arr3.length+1];
		int j=0;
		for(int num:arr3) {
			System.out.println(num);
			arr4[j]=num;
			j++;
		}
		arr4[arr4.length-1]=number;
		System.out.println(Arrays.toString(arr4));
		arr3=arr4;
		System.out.println(Arrays.toString(arr3));
		
	}
}
