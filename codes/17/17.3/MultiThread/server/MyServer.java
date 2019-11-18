
import java.net.*;
import java.io.*;
import java.util.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class MyServer
{
	// ���屣������Socket��ArrayList���������װΪ�̰߳�ȫ��
	public static List<Socket> socketList
		= Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args)
		throws IOException
	{
		var ss = new ServerSocket(30000);
		while (true)
		{
			// ���д������������һֱ�ȴ����˵�����
			Socket s = ss.accept();
			socketList.add(s);
			// ÿ���ͻ������Ӻ�����һ��ServerThread�߳�Ϊ�ÿͻ��˷���
			new Thread(new ServerThread(s)).start();
		}
	}
}