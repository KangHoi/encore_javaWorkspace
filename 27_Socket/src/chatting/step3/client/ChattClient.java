package chatting.step3.client;
/*
 * Ű����� �����͸� �о�鿩��
 * ������ ������.
 * -------------------------------
 * �ٽ� ������ ���� �޼����� �о
 * Ŭ���̾�Ʈ �ڽ��� �ܼ�â�� �޼����� ���
 * ::
 * �Է� ---br, br1
 * ��� --- 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChattClient {
	//�ʵ� ����
	BufferedReader br;
	PrintWriter pw;
	Socket s;
	
	//Stream..
	public void net() {
		try {
			s = new Socket("127.0.0.1",60000);
			System.out.println("Socket Creating....");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			System.out.println("Client Stream Creating...");
			while(true) {
				String line = br.readLine();//Ű����� �Է¹��� ������ �о
				pw.println(line);//������ ������.
			}
		}catch(Exception e) {
			System.out.println("�������� ������ ���������ϴ�.."); //ä�ù��� ������ �˰��� ���⿡ �ֱ�
			
		}finally {
			try {
				br.close();
				pw.close();
			} catch(IOException e) {
				
			}
		}
		
	}

	public static void main(String[] args) {
		ChattClient cc = new ChattClient();
		cc.net();
		

	}

}
class Clientthread extends Thread{
	Socket s;
	BufferedReader br1;
	
	Clientthread(Socket s) {
		this.s = s;
	}
	public void run() {
		try {
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true) {
				String str = br1.readLine();
				System.out.println("���� �޼���" + str);
			}
			
		}
		catch(IOException e){
			
		}
	}
}
