package gui.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattServer {
	//Process �ʵ� ����
	ServerSocket server;
	Socket s;
	ArrayList<ChattThread> list;
	
	public ChattServer(){
		list = new ArrayList<ChattThread>();		
	}
	
	public void broadCast(String message) { //��� Ŭ���̾�Ʈ�� ȭ�鿡 �� ��µǵ���
		for(ChattThread t : list) {
			t.sendMessage(message);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready....");
			
			while(true) {//������... waiting for...
				s = server.accept();
				ChattThread ct = new ChattThread(s,this);
				list.add(ct);
				ct.start(); //�۾��� ���������� ����Ǵ� Focus!!				
			}
		}catch(Exception e) {
			
		}finally {
		}
	}
	public static void main(String[] args) {
		ChattServer process = new ChattServer();
		process.net();
		
	}

}
//������ ����� Ŭ���̾�Ʈ�� �޼����� �ְ�޴� �ϸ� �����ϴ� ������... �۾� ������..
class ChattThread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattServer;
	
	ChattThread(Socket s, ChattServer chattServer){
		this.s = s;
		this.chattServer = chattServer;
		
		System.out.println(s.getInetAddress() + "���� �����ϼ̽��ϴ�.");
		chattServer.broadCast(s.getInetAddress() + "���� ä�ù濡 �����̽��ϴ�.");
		
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	public void run() {
		//������ Thread�� �۾��ϴ� ����...
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while(true) {
				String line = br.readLine();
				chattServer.broadCast(line);
			}
		}catch(IOException e) {
			//������ �������� ������ �̰�����..
			System.out.println(s.getInetAddress() + "���� ������ �����̽��ϴ�.");
			chattServer.broadCast(s.getInetAddress() + "���� ä�ù濡 �������ϴ�.");
			//
			chattServer.list.remove(this);
			
		}
		
	}
}


