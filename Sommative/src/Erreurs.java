

/*
* Author : danielchan
*Date : Dec. 15, 2020
*methode qui permet de saluer un ami en utlisant son nom
*Description des erreurs
*1.Public class Erreurs le nom du classe et déclaration de le code doit être le même
*2.pour une méthode public on doit déclarer un object puis utilise cet object pour la metthode
*3.il faut mettre un espace après ami pour que c'est Bonjour mon ami Nom
*4.on doit retourner le "string message" alors on ajoute return message
*5.On doit mettre les "" sur le nom John
*/
public class Erreurs //Ceci doit être le nom du projet alors Erreurs
{

	public static void main(String[] args)
		{
			
			String Daniel =new String(); 
			Daniel.saluerAmi("John");// object qui fait la méthode
			
			System.out.println(saluerAmi("John"));// on doit mettre "" à john

		}
		
		public String saluerAmi(String nom)
		{
			String message = "Bonjour mon ami " + nom;// espace après mon ami
			return message;// avoir le retturn message 
		
		}
}
