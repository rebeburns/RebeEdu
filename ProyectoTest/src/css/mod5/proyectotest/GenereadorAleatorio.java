package css.mod5.proyectotest;

import java.util.Random;

public class GenereadorAleatorio {

	
	public static void main(String[] args){
		Random rnd=new Random();
		for(int i=0;i<10;i++){
			System.out.println(rnd.nextInt());
		}
	}

}
