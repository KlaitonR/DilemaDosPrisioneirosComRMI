package RMI;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class ServidorJuiz{
	
	ServidorJuiz(){
		
		try {
	
			System.setProperty("java.rmi.server.hostname", "IpAqui"); //COLOCAR IP AQUI
			LocateRegistry.createRegistry(1099);
			Veredito v = new VereditoImple();
			Naming.bind("JuizService", (Remote) v);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
		
	public static void main (String args[]){
		new ServidorJuiz();
	}
	
}
