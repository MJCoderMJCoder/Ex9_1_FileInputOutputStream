package com.fileinputoutputstream;
/*
 * ���ֽ�����д�뵽һ�������ļ��У��ٽ��ļ������ݶ���������ʾ
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos; //�½������󣬲�ʵ����
		fos = new FileOutputStream(".\\filestream.dat"); //���ļ������
		byte[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; //�ֽ���������
		for (int i = 0; i < array.length; i++)
			fos.write(array[i]); //д���ݵ��ļ��������Ҳ����д���ļ�
		fos.close();
		FileInputStream fis;
		
		//".\\filestream.dat"���·�������ڸó������Ӧ·������һ��filestream.dat���ļ�
		fis = new FileInputStream(".\\filestream.dat"); //���ļ�������
		int value;
		
		//read()����ȡһ���ֽ����ݣ�����ֵ�Ǹ�λ��0��int����ֵ���������-1�����ʾ�ļ�����
		while ((value = fis.read()) != -1) //���ļ������������ݣ�Ҳ���Ǵ��ļ���
			System.out.print(value + " ");
		fis.close();
		
	}

}
