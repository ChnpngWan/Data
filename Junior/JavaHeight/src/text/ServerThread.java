package text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable{
	public Socket socket;
	public ServerThread(Socket socket) {
		super();
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readLine=bufferedReader.readLine();
			String string[]=readLine.split(" ");
			System.out.println(string[0]+"您好！我是"+string[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
