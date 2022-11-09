import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.*;

public class Client {

    BufferedReader br;
    PrintWriter out;
    Socket socket;
    public Client(){
        try {
            System.out.println("sending request to server");
            socket=new Socket("127.0.0.1",7777);
            System.out.println("connection done");

            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out = new PrintWriter(socket.getOutputStream());

    startReading();
    startWriting();

        } catch (Exception e) {
           
        }
    }
    private void startReading() {

        Runnable r1=()->{

            System.out.println("Reader Started!!");

           try {
            while(true){
                  
                String msg=br.readLine();
            
               if(msg.equals("exit"))
               {
                System.out.println("Server left the chat");
                socket.close();
                break;
               }
               System.out.println("Server :"+msg);
            }
           } catch (Exception e) {
            e.printStackTrace();
           }
        };

        new Thread(r1).start();
    }
    private void startWriting() {

        //Thread to take data from user and send to client
        Runnable r2=()->{
            System.out.println("Writer Started!!");
            try {
                while( !socket.isClosed()){
               
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                   String content = br1.readLine();
                   out.println(content);
                   out.flush();
               
              
            }
            } catch (Exception e) {
               e.printStackTrace();
            }
        };

        new Thread(r2).start();
    }
    public static void main(String[] args) {
        System.out.println("This is Client!!!");
        new Client();
    }
}
