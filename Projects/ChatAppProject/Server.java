import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

class Server{

    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;


public Server()
{
 try {
    server=new ServerSocket(7777);
    System.out.println("server is live "+"\n"+"waiting...");
    socket=server.accept();

    br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out = new PrintWriter(socket.getOutputStream());

    startReading();
    startWriting();
    

 } catch (Exception e) {
    e.printStackTrace();
 }

}


    private void startReading() 
    {
        Runnable r1=()->{

            System.out.println("Reader Started!!");

            try {
                while(true){

                    String msg="";
                
                     msg = br.readLine();
                     if(msg.equals("exit"))
                     {
                      System.out.println("Client left the chat");
                      socket.close();
                      break;
                     }
                     System.out.println("Client :"+msg);
                 }
            } catch (Exception e) {
               e.printStackTrace();
            }
        };

        new Thread(r1).start();

    }
    private void startWriting() 
    {
        //Thread to take data from user and send to client
        Runnable r2=()->{
            System.out.println("Writer Started!!");
         try {
            while(true){
              
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
               String content = br1.readLine();
               
               out.println(content);
               out.flush();
               if(content.equals("exit")){
                socket.close();
                break;
               }
            
        }
         } catch (Exception e) {
           e.printStackTrace();
         }
        };

        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("This is server!!");
        new Server();
    }
}