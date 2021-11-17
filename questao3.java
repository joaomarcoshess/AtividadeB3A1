import java.util.Scanner;

public class questao3
{
	public static void main(String[] args) {
	    
    Scanner ler = new Scanner(System.in);
    Scanner lar = new Scanner(System.in);

    int r1[] = new int[4]; 
    int i, p=0; 
   
    int r2[] = new int[4]; 
    int j; 
    
    for (i=0; i<4; i++) {
      if(i == 0){
          System.out.printf("Informe as coordenadas de x0 do primeiro retângulo: ", r1);
      }
      if(i == 1){
          System.out.printf("Informe as coordenadas de y0 do primeiro retângulo: ", r1);
      }
      if(i == 2){
          System.out.printf("Informe as coordenadas de x1 do primeiro retângulo: ", r1);
      }
      if(i == 3){
          System.out.printf("Informe as coordenadas de y1 do primeiro retângulo: ", r1);
      }
      String N = ler.next();
      r1[i] = Integer.parseInt(N);
      
      if(r1[i]<0 || r1[i]>1000000){
          System.out.println("Utilize valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
 
    for (j=0; j<4; j++) {
      if(j == 0){
          System.out.printf("Informe as coordenadas de x0 do segundo retângulo: ", r1);
      }
      if(j == 1){
          System.out.printf("Informe as coordenadas de y0 do segundo retângulo: ", r1);
      }
      if(j == 2){
          System.out.printf("Informe as coordenadas de x1 do segundo retângulo: ", r1);
      }
      if(j == 3){
          System.out.printf("Informe as coordenadas de y1 do segundo retângulo: ", r1);
      }
      String M = lar.next();
      r2[j] = Integer.parseInt(M);
      if(r2[j]<0 || r2[j]>1000000){
          System.out.println("Utilize valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
    
    while (p!=1000){
        if(r1[0]==r2[0] || r1[1]==r2[1] || r1[2]==r2[2] || r1[3]==r2[3] ){ 
            System.out.printf("1");
            break;
    	}
    	
    	if(r1[2]>r2[0] && r1[2]<r2[2]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
    	}
    	if(r1[3]>r2[1] && r1[3]<r2[3]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
            break;
    	    
    	}
	}
	}
}
