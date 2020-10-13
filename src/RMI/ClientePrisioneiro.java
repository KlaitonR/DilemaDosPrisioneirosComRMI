package RMI;

import java.rmi.Naming;
import java.util.Random;

public class ClientePrisioneiro {
	
	public static void main(String[] args){
	    
	    try{
	    	
	    	Veredito v = (Veredito) Naming.lookup("rmi://IpAqui:1099/JuizService"); //COLOCAR IP AQUI
	    	System.out.println(v.veredito(confisao(), confisao()));
	    
	    } catch (Exception e) {
	      System.err.println("Exceção no cliente" + e.toString());
	      e.printStackTrace();
	    }
	    
	  }
	
	public static boolean confisao() {
		
		Random conf = new Random();
		int confisao = conf.nextInt(2);
		
		if(confisao == 1)
			return true;
		else 
			return false;
	
	}

}
