
public class OperarRomanos {

	
	public static int[] Rellenar(String numero){
	
	int numromano1[] = new int[numero.length()];
	for (int i = 0; i < numero.length(); i++) {
		char n = numero.charAt(i);
		switch (n) {
		case 'I':
			
			numromano1[i]=1;
			break;
		case 'V':
			
			numromano1[i]=5;
			break;
		case 'X':
			numromano1[i]=10;
			break;
			
		case 'L':

			numromano1[i]=50;
			break;
		case 'C':

			numromano1[i]=100;
			break;
		case 'D':
			numromano1[i]=500;
			break;
			
		case 'M':
			numromano1[i]=1000;
			break;
		default:
			return null;
		}
	}
	
	return numromano1;
}
	
	public static int NumeroRomanoArabico(int[] numroman,int cant)
	{
		int suma=0;
		if(numroman.length>1)
		{
		for (int i = 0; i < cant; i++) {
			
			if(i!=cant-1)
			{
			if(numroman[i] < numroman[i+1])
			{
				suma=suma+(numroman[i+1]-numroman[i]);
				i++;
			}
			else
			{
				suma=suma+numroman[i];
			}
			
			}
			else
			{
				suma=suma+numroman[i];
			}
		}
		
		}
		else
		{
			suma= suma+ numroman[numroman.length-1];
		}
		
		return suma;
	}
	
	public static String ResulSumaRomano(int num1, int num2)
	{
		  int Total = num1+num2;
		  String romano=null;
		  String Unidades[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
	      String Decenas[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
	      String Centenas[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
	      String Miles[]={"", "M", "MM", "MMM", "IV-", "V-", "VI-", "VII-", "VII-", "IX-"};
	      	      
	      int u=Total%10;  
	      int d=(Total/10)%10;  
	      int c=(Total/100)%10; 
	      int m=Total/1000;
	      if(Total>=1000)
	      {
	    	romano= Miles[m]+Centenas[c]+Decenas[d]+Unidades[u];
	      }
	      else if(Total>=100){           
	    	  romano= Centenas[c]+Decenas[d]+Unidades[u];  
	      }else{  
	          if(Total>=10){  
	        	  romano= Decenas[d]+Unidades[u];            
	          }else{  
	        	  romano= Unidades[Total];            
	          }            
	      }            
	      
	      return romano;
	    } 
	
}
