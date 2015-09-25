
import java.net.*;
import java.io.*;public class UdpSend
{
	public static void main(String[] args) throws SocketException, UnknownHostException, IOException
	{
		DatagramSocket ds = new DatagramSocket();
		byte[] buf = "udp test".getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getLocalHost(),10000);
		ds.send(dp);
		ds.close();
	}
}
