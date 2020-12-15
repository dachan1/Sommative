/*
* Author : danielchan
*Date : Dec. 15, 2020
*méthode qui calcul le sommes des nombre premiers de 100 nombres entier généres hazzard 
*/
public class Sommative
{

	public static void main(String[] args)
		{
			int [] montab=new int[100];
			for(int i=0; i<100; i++)
			{
				montab[i]=(int)(Math.random()*(10000000));//pour que c'est une entier
				
			}
			System.out.println(sommePremiers(montab));

		}
	public static boolean nombrePremier(int value)
		{
			if (value == 1)
			{
				return false;
			}
			for(int i=2;i<=value/2;i++)
			{
				if(value%i ==0)
				{
					return false;
				}
				
				
		}
			return true;
		}
			
			public static int sommePremiers(int tableau[]) {
					int somme = 0;
					for (int i = 0; i < tableau.length; i++) {
						if (nombrePremier(tableau[i])) {
							somme += tableau[i];
						}
					}
					return somme;
				}
}

