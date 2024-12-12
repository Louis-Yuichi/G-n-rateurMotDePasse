import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FrameGeneration extends JFrame
{
	Controleur ctrl;

	public FrameGeneration(Controleur ctrl)
	{
		this.setTitle("Fenêtre de base");
		this.setVisible(true);
		this.setSize(800, 450);
		this.setLocation(400, 400);

		this.setLayout(new BorderLayout());
		// this.setLayout(new FlowLayout());
		// this.setLayout(new GridLayout(lig, col, hgap, vgap));

		/* Ajouter notre panel à la Frame */
		this.add(new PanelGeneration(ctrl));

		this.ctrl = ctrl;

		/* Fermer la fenêtre */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}