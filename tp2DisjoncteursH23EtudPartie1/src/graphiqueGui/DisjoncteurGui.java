package graphiqueGui;

import java.awt.*;
import javax.swing.*;

import disjoncteurs.Disjoncteur;;

class DisjoncteurGui extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private int ligne;
    private int colonne;

    public DisjoncteurGui(Disjoncteur disjoncteur, int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;

        if (disjoncteur == null) {
            JButton btnVide = new JButton();
            btnVide.setPreferredSize(new Dimension(200, 30));
            btnVide.setEnabled(false);
            add(btnVide);

            JButton btnGris = new JButton();
            btnGris.setBackground(Color.GRAY);
            btnGris.setPreferredSize(new Dimension(200, 30));
            btnGris.setEnabled(false);
            add(btnGris);
        } else {
            // Bouton avec les données du disjoncteur
            JButton btnDonnees = new JButton(disjoncteur.getAmpere() + "/" + 
            disjoncteur.getTension() + disjoncteur.getPuissanceEnWatt());
            btnDonnees.setPreferredSize(new Dimension(200, 30));
            btnDonnees.setEnabled(false);
            add(btnDonnees);

            // Interrupteur dans le bon état
            String etatAllume = String.valueOf(disjoncteur.getEtat());
            InterrupteurGui interrupteurGui = new InterrupteurGui(etatAllume);
            add(interrupteurGui);
        }
    }
}
