package chifoumi;

public class JeuUnTour {

	protected Joueur joueur1;
	protected Joueur joueur2;
	
	
	public JeuUnTour(String nom1, String nom2) {
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);
		jouer();
		
	}


	private void jouer() {
		tour();
		joueur1.ecrireScore();
		joueur2.ecrireScore();
		conclure();
		
	}


	private void conclure() {
		String winner;
		if (joueur1.getScore() > joueur2.getScore())
			winner = joueur1.getNom();
		else if (joueur1.getScore() < joueur2.getScore())
			winner = joueur2.getNom();
		else
			winner = "None";
		
		if (winner.equals("None"))
			System.out.println("Match nul !");
		else
			System.out.println("Le gagnant est " + winner);
		
	}


	private void tour() {
		Choix ch_joueur1 = joueur1.choisir();
		Choix ch_joueur2 = joueur2.choisir();
		
		if (ch_joueur1 != ch_joueur2) {
			if ((ch_joueur1 == Choix.PAPIER && ch_joueur2 == Choix.CAILLOU)
					|| (ch_joueur1 == Choix.CISEAUX && ch_joueur2 == Choix.PAPIER)
					|| (ch_joueur1 == Choix.CAILLOU && ch_joueur2 == Choix.CISEAUX))
				joueur1.crediter();
			else
				joueur2.crediter();
		}
		
	}
}
