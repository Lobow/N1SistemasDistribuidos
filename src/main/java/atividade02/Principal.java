package atividade02;

public class Principal {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new RaizQuadradaThread());
		Thread thread2 = new Thread(new RaizCubicaThread());

		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			System.out.println("FIM");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
