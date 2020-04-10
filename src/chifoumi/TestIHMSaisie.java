package chifoumi;

public class TestIHMSaisie {

	public static void main(String[] args) {
		IHMSaisie saisie = new IHMSaisie("Eric");
		Choix choix = saisie.proposerChoix();
		System.out.println("Le choix de Eric est " + choix);

	}

}
