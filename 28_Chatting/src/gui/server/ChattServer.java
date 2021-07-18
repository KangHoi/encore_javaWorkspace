package gui.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattServer {
	//Process 필드 지정
	ServerSocket server;
	Socket s;
	ArrayList<ChattThread> list;
	
	public ChattServer(){
		list = new ArrayList<ChattThread>();		
	}
	
	public void broadCast(String message) { //모든 클라이언트의 화면에 다 출력되도록
		for(ChattThread t : list) {
			t.sendMessage(message);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready....");
			
			while(true) {//윙윙윙... waiting for...
				s = server.accept();
				ChattThread ct = new ChattThread(s,this);
				list.add(ct);
				ct.start(); //작업이 병렬적으로 진행되는 Focus!!				
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
//서버와 연결된 클라이언트와 메세지를 주고받는 일만 전담하는 쓰레드... 작업 쓰레드..
class ChattThread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattServer;
	
	ChattThread(Socket s, ChattServer chattServer){
		this.s = s;
		this.chattServer = chattServer;
		
		System.out.println(s.getInetAddress() + "님이 접속하셨습니다.");
		chattServer.broadCast(s.getInetAddress() + "님이 채팅방에 들어오셨습니다.");
		
	}
	public void sendMessage(String str) {
		pw.println(str);
	}
	public void run() {
		//실제로 Thread가 작업하는 내용...
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while(true) {
				String line = br.readLine();
				chattServer.broadCast(line);
			}
		}catch(IOException e) {
			//연결이 끊어지면 로직이 이곳으로..
			System.out.println(s.getInetAddress() + "님이 접속을 끊으셨습니다.");
			chattServer.broadCast(s.getInetAddress() + "님이 채팅방에 나갔습니다.");
			//
			chattServer.list.remove(this);
			
		}
		
	}
}


