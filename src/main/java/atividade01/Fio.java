package atividade01;

public class Fio implements Runnable {
	
	
	private String nome;
	private long milissegundos;
	
	public Fio(String nome, long milissegundos) {
		super();
		this.nome = nome;
		this.milissegundos = milissegundos;
	}

	@Override
	public void run() {
		for (char d: nome.toCharArray()) {
			System.out.println(d);
			try {
					Thread.sleep(milissegundos);
				
			} catch (Exception e) {
					e.printStackTrace();
			}
		}
		
	}

}
