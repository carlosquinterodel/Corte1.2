
public class Program2 {

	public static void main(String[] args) {
		
		int array [] = {3, 7, 15, 25, 13};
		int resp = mayor(array, 1, array[0]);
		System.out.println("El elemento mayor del array es "+resp);

	}
	
	//Elemento mayor de un arreglo
		public static int mayor (int array[], int pos, int mayor) {
			if (array.length-1 == pos) {
				return mayor;
			}else {
				if(array[pos] > mayor) {
					mayor = array[pos];
				}
				return mayor (array, pos + 1, mayor);
			}
		}

}
