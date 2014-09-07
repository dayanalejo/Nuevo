import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner Ent1 = new Scanner(System.in);
		String numero1=null;
		String numero2=null;
		int num1arabico = 0;
		int num2arabico=0;
		
		
		System.out.println("Ingrese el primer numero romano (MAY)");
		numero1 = Ent1.next();
		System.out.println("Ingrese el segundo numero romano (MAY)");
		numero2 = Ent1.next();
		
		if(ValidarRomanos.validarsimbolo(numero1)== true && ValidarRomanos.validarsimbolo(numero2)== true){
			
		 int numromano1[]= OperarRomanos.Rellenar(numero1);
		 int numromano2[]= OperarRomanos.Rellenar(numero2);
		
		 num1arabico= OperarRomanos.NumeroRomanoArabico(numromano1,numromano1.length);
		 num2arabico= OperarRomanos.NumeroRomanoArabico(numromano2,numromano2.length);
		
		 String SumaRoma = OperarRomanos.ResulSumaRomano(num1arabico,num2arabico);
		 if(ValidarRomanos.validarsimbolo(SumaRoma))
		 {
			 System.out.println("La suma de los numeros es "+ SumaRoma);
		 }
					
		}
		else
		{
			System.out.println("Alguno de los Numero ingresados no son validos");
		}				
	}
}
