public class Controleur
{
	public Controleur()
	{
		new FrameGeneration(this);
		new PanelGeneration(this);
	}

	public String generation(int nbCara)
	{
		String mdp = "";

		for ( int cpt = 0; cpt < nbCara; cpt++)
		{
			mdp = mdp + cpt;
		}

		for (int cpt = 0; cpt < nbCara; cpt++)
		{
			char randomCar = (char) (Math.random() * 94 + '!');

			mdp = mdp.substring(0, cpt) + randomCar;
		}

		return mdp;
	}

	public static void main(String[] args)
	{
		new Controleur();
	}
}