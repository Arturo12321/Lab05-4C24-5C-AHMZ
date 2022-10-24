package com.tecsup.maven.lab10.example;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();	
		int sum = app.sumar(4,5);		
		int res = app.restar(4,5);
		int multiplicar= app.multiplicar(4,5);
	}

	public  int restar(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public  int sumar(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public  int dividir(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	public  int multiplicar(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}


}
