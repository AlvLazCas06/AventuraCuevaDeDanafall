package vista;

import model.Armas;

public class ImprimirArmas {
	
	//Tarea de: Adrián
	//Realizado por: Álvaro y Adrián
	public void imprimirMenuLucha(Armas[] armas) {
		int contador=0;
		System.out.println("0.Salir");
		for (int i = 0; i < armas.length; i++) {
			if(armas[i] != null && armas[i].isStatus()) {
			System.out.println((contador + 1) + ". Usar " + armas[i].getName());
			contador++;
			}
		}
	}
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public void imprimirEspada() {
		
		System.out.println("""
▓█████   ██████  ██▓███   ▄▄▄      ▓█████▄  ▄▄▄      
▓█   ▀ ▒██    ▒ ▓██░  ██▒▒████▄    ▒██▀ ██▌▒████▄    
▒███   ░ ▓██▄   ▓██░ ██▓▒▒██  ▀█▄  ░██   █▌▒██  ▀█▄  
▒▓█  ▄   ▒   ██▒▒██▄█▓▒ ▒░██▄▄▄▄██ ░▓█▄   ▌░██▄▄▄▄██ 
░▒████▒▒██████▒▒▒██▒ ░  ░ ▓█   ▓██▒░▒████▓  ▓█   ▓██▒
░░ ▒░ ░▒ ▒▓▒ ▒ ░▒▓▒░ ░  ░ ▒▒   ▓▒█░ ▒▒▓  ▒  ▒▒   ▓▒█░
 ░ ░  ░░ ░▒  ░ ░░▒ ░       ▒   ▒▒ ░ ░ ▒  ▒   ▒   ▒▒ ░
   ░   ░  ░  ░  ░░         ░   ▒    ░ ░  ░   ░   ▒   
   ░  ░      ░                 ░  ░   ░          ░  ░
                                    ░                
              O
              {____________________________________
@XXXXXXXXXXXXXX___________________________________.>
              {
              O

          
				""");
	}

	//Tarea de: Cristina
	//Realizado por: Cristina
	public void imprimirArco() {
		System.out.println("""
 ▄▄▄       ██▀███   ▄████▄   ▒█████  
▒████▄    ▓██ ▒ ██▒▒██▀ ▀█  ▒██▒  ██▒
▒██  ▀█▄  ▓██ ░▄█ ▒▒▓█    ▄ ▒██░  ██▒
░██▄▄▄▄██ ▒██▀▀█▄  ▒▓▓▄ ▄██▒▒██   ██░
 ▓█   ▓██▒░██▓ ▒██▒▒ ▓███▀ ░░ ████▓▒░
 ▒▒   ▓▒█░░ ▒▓ ░▒▓░░ ░▒ ▒  ░░ ▒░▒░▒░ 
  ▒   ▒▒ ░  ░▒ ░ ▒░  ░  ▒     ░ ▒ ▒░ 
  ░   ▒     ░░   ░ ░        ░ ░ ░ ▒  
      ░  ░   ░     ░ ░          ░ ░  
                   ░                 
          4$$-.                                
           4   ".                                        
           4    ^.                                       
           4     $                                       
           4     'b                                      
           4      "b.                                    
           4        $                                    
           4        $r                                   
           4        $F                                   
-$b========4========$b====*P=-                           
           4       *$$F                                  
           4        $$"                                  
           4       .$F                                   
           4       dP                                    
           4      F                                      
           4     @                                       
           4    .                                        
           J.                                            
          '$$
				""");
	}
	
}
