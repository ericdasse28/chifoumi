package chifoumi;

public class LanceJeu {

	public static void main(String[] args) {
		int scoreAAtteindre = Integer.parseInt(args[2]);
		new Jeu(args[0], args[1], scoreAAtteindre);

	}

}
