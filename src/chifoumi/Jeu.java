package chifoumi;

public class Jeu extends JeuUnTour {
	private int scoreObjectif;
	
	public Jeu(String nom1, String nom2, int scoreObjectif) {
		super(nom1, nom2);
		this.scoreObjectif = scoreObjectif;
		
	}
	
	@Override
	protected void jouer() {
		while (this.joueur1.getScore() != this.scoreObjectif 
				&& this.joueur2.getScore() != this.scoreObjectif)
			super.jouer();
	}

}
