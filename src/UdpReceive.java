
import java.net.*;
import java.nio.*;
public class UdpReceive
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(10000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		String address = dp.getAddress().getHostName();
		int port = dp.getPort();
		String data = new String(dp.getData(),0,dp.getLength());
		System.out.println(address+":"+port+":"+data);
	}
}
