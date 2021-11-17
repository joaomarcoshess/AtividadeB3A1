import java.util.Scanner;
public class questao1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner ( System.in );
	    Scanner input2 = new Scanner ( System.in );
	    Scanner input3 = new Scanner ( System.in );
		int g = 1, pao = 1, vetor[], j, k, menor = 0;
		//g = pessoas
		String num, num2;
		
		while (g < 1 || g >10000){
    		System.out.println("Informe quantas pessoas há na festa: ");
    		num = input.next();
    		g = Integer.parseInt(num);
		}
		
		while (pao < 1 || pao > 10000){
    		System.out.println("Informa a quantidade de pães pedidos: ");
    		num = input2.next();
    		pao = Integer.parseInt(num);
		}
		
		vetor = new int[pao];
		
		for (k = 0 ;  k < pao ; k++){
		    vetor [k] = 1;
		    while (vetor [k] < 1 || vetor [k] > 10000){
    		    System.out.println("Informa a quantidade de pães: ");
    		    num2 = input3.next();
    		    vetor [k] = Integer.parseInt(num2);
		    }
		}
		
		
		//s = Soma, c = comprimento.
		int s = 0, c = 0 ;
		while (s != g){
		    s = 0;
		    c ++;
		    for (j = 0 ; j < pao ; j++){
		        s = s + (vetor [j] / c);
		        if ((vetor [j] / c) <= 0){
		            break;
		        }
		    }
		}
		s = 0;
		c =  (c * 2) + 1;
		while (s != g){
		    s = 0;
		    c --;
		    for (j = 0 ; j < pao ; j++){
		        s = s + (vetor [j] / c);
		        if ((vetor [j] / c) <= 0){
		            break;
		        }
		    }
		}
		System.out.println(c);
		
	}
}
