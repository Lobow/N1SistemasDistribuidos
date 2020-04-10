package atividade03;

import java.util.Random;

public class Produtor {
	public int str[] = new int[6];


	public String ConverteNumeroParaChar(int[] delta) {
		String nome[] = new String[delta.length];
		
			nome[1] = String.valueOf((char)(delta[1] + 64)); 
			nome[2] = String.valueOf((char)(delta[2] + 64));
			nome[3] = String.valueOf((char)(delta[3] + 64));
			nome[4] = String.valueOf((char)(delta[4] + 64));
			nome[5] = String.valueOf((char)(delta[5] + 64));
			System.out.print(nome[1]);
			System.out.print(nome[2]);
			System.out.print(nome[3]);
			System.out.print(nome[4]);
			System.out.print(nome[5]);
	    return nome.toString();
	    
	}
	
	public static int [] palavraAletoria() {
	    int str[] = new int[6];
		Random rd = new Random();
		str[1] = rd.nextInt(27);
		str[2] = rd.nextInt(27);
		str[3] = rd.nextInt(27);
		str[4] = rd.nextInt(27);
		str[5] = rd.nextInt(27);	
		
		return str;
	}
	
	
		
	}

