import javax.swing.*;

import java.awt.event.*;

import java.awt.GridLayout;
import java.awt.Color;

public class PanelGeneration extends JPanel implements ActionListener
{
	private Controleur ctrl;

	private JButton    btnGenMDP;

	private JTextField txtNbCara;

	private int        nbCara;

	public PanelGeneration(Controleur ctrl)
	{
		this.setLayout(new GridLayout(5, 4, 10, 10));

		/* ------------------------ */
		/*  Création des composants */
		/* ------------------------ */

		this.setBackground(new Color(147, 214, 245));

		this.ctrl = ctrl;

		this.btnGenMDP = new JButton("Générer un mot de passe");

		this.txtNbCara = new JTextField(1);
		this.txtNbCara.setBackground(Color.WHITE);
		this.txtNbCara.setEnabled(true);

		/* ------------------------------ */
		/*  Positionnement des composants */
		/* ------------------------------ */

		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());

		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());

		this.add(new JLabel());
		this.add(this.btnGenMDP);
		this.add(this.txtNbCara);
		this.add(new JLabel());

		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());

		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());

		/* -------------------------- */
		/*  Activation des composants */
		/* -------------------------- */

		this.btnGenMDP.addActionListener(this);
		this.txtNbCara.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this.txtNbCara)
		{
			nbCara = Integer.parseInt(this.txtNbCara.getText());

			if (nbCara > 24)
			{
				nbCara = 24;
			}

			if (nbCara < 8)
			{
				nbCara = 8;
			}
		}

		if (e.getSource() == this.btnGenMDP)
		{
			String mdp = "";
			mdp = this.ctrl.generation(nbCara);
			this.txtNbCara.getText();
			JOptionPane.showConfirmDialog(null, mdp, "Mot de passe généré", JOptionPane.OK_CANCEL_OPTION);
		}
	}
}