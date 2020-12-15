/*
* Author : danielchan
*Date : Dec. 15, 2020
*méthode qui calcul le sommes des nombre premiers de 100 nombres entier généres hazzard 
*/
public class Sommative
{

	public static void main(String[] args)
		{
			
			int [] montab=new int[100];// tableau de 100 éléments
			for(int i=0; i<100; i++)
			{
				montab[i]=(int)(Math.random()*(10000000));//pour les éléments hazard sont des entiers
				
			}
			System.out.println(sommePremiers(montab));

		}
	public static boolean nombrePremier(int value)
		{
			if (value == 1)//du fait que 1 est pas un nombre premiers
			{
				return false;
			}
			for(int i=2;i<=value/2;i++)
			{
				if(value%i ==0)//si ca égal 0 c'est pas premier alors false
				{
					return false;
				}
				
				
		}
			return true;//return les nombre premiers
		}
			
			public static int sommePremiers(int tableau[]) {
					int sum = 0;
					for (int i = 0; i < tableau.length; i++) {//boucle pour aller à procceser tout les 100 éléments
						if (nombrePremier(tableau[i])) {//si l'élément est premiers
							sum += tableau[i];//en ajoute cette élément à sum
						}
					}
					return sum;
				}
}

