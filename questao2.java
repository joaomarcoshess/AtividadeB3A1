//T = Tempo em minutos (1 <= T <= 30);
//N = Número de vendedores (1 <= N <= 1 000);
//L = Número de Ligações (1 <= L <= 1 000 000);

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		 Scanner inputN = new Scanner ( System.in );
		 System.out.println("Informe o número de vendedores: ");
    	 String numeroN = inputN.next();
    	 int N = Integer.parseInt(numeroN);
    	 if (N < 1 || N > 1000){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
    	 
         Scanner inputL = new Scanner ( System.in );
         System.out.println("Informe o número de ligações: ");
    	 String numeroL = inputL.next();
    	 int L = Integer.parseInt(numeroL);
    	 if (L < 1 || L > 1000000){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
    	 
    	 Scanner inputT = new Scanner ( System.in );
    	 int T[];
    	 T = new int[L];
    	 
    	 for(int i = 0; i < L; i++){
    	     if(i == 0){
    	         System.out.println("Informe o tempo de ligação: ");
    	     }
    	     if(i > 0){
    	         System.out.println("Informe o próximo tempo de ligação: ");
    	     }
    	     String numeroT = inputT.next();
    	     T[i] = Integer.parseInt(numeroT);
    	     
    	     if (T[i] < 1 || T[i] > 30){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
	     
    	 }
    	 int M[][];
    	 M = new int[N][L];
    	 int j = 1, k = 1, l = 0, menor = 0;
    	 
       //Laço de repetição que preenche a primeira linha com os vendedores em ordem e zera a segunda linha para preenchê-la depois.
    	 for (j = 0; j < N; j++){
    	    M[0][j] = j + 1;
    	    M[1][j] = 0;
    	 }
    	 
    	 for (k = 0; k < L; k++){
    	    menor = M[1][0];
    	    for(l = 0; l < N; l++){
    	        if(M[1][l] < M[1][l++]){
    	            menor = l;
    	        }
    	        
    	    }
    	    M[1][menor] = T[k]; 
    	 }
    	 
    	 for (k = 0; k < N; k++){
    	    System.out.println("  ");
    	    for(l = 0; l < 2; l++){
    	        System.out.println(M[l][k]);
    	    }
    	 }
	}
}
