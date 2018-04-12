package junit;

public class Buscador {
	
	public static boolean buscar(int num, int[] array){
		int i=0;
		boolean trobat=false;
		while(!trobat && i<array.length){
		trobat=array[i]==num;
		i++;
		}
		return trobat;
		}

}
