package problem_10weeks;

import java.io.*;

public class problem8_8 {

	public static void main(String[] args) {
		File file = new File("c:\\");
		File[] files = file.listFiles(); 

		long bigSize = 0;
		File bigFile = null;
		for (int i = 0; i < files.length; i++) { 
			File f = files[i];
			if (!f.isFile()) // ���͸��� ��� �Ѿ
				continue;

			long size = f.length(); 
			if (bigSize < size) {
				bigSize = size;
				bigFile = f;
			}
		}

		if (bigFile == null) 
			System.out.println("������ �����ϴ�");
		else
			System.out.println("���� ū ������ " + bigFile.getPath() + " " + bigSize + "����Ʈ");
	}

}