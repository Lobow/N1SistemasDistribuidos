package atividade01;



public class Principal {

	public static void main(String[] args) {
		
		Fio tr1 = new Fio("Teste Thread 1",500);
		Fio tr2 = new Fio("Teste Thread 2",1500);
		Fio tr3 = new Fio("Teste Thread 3",2000);
		Thread thread1 = new Thread(tr1);
		Thread thread2 = new Thread(tr2);
		Thread thread3 = new Thread(tr3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}
	
	
	
	
	
	

}
