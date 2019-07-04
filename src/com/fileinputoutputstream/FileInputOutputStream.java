package com.fileinputoutputstream;
/*
 * 将字节数据写入到一个磁盘文件中，再将文件的内容读出来并显示
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos; //新建流对象，并实例化
		fos = new FileOutputStream(".\\filestream.dat"); //打开文件输出流
		byte[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; //字节数组类型
		for (int i = 0; i < array.length; i++)
			fos.write(array[i]); //写数据到文件输出流，也就是写入文件
		fos.close();
		FileInputStream fis;
		
		//".\\filestream.dat"相对路径。会在该程序的相应路径下有一个filestream.dat的文件
		fis = new FileInputStream(".\\filestream.dat"); //打开文件输入流
		int value;
		
		//read()：读取一个字节数据，返回值是高位补0的int类型值，如果返回-1，则表示文件结束
		while ((value = fis.read()) != -1) //从文件输入流读数据，也就是从文件读
			System.out.print(value + " ");
		fis.close();
		
	}

}
