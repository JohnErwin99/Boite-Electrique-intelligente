

package graphiqueGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import java.awt.*;

import disjoncteurs.Boite;
import disjoncteurs.Disjoncteur;

public class CadreBoiteDisjonction extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int MAX_AMPERE_DEFAUT = 200;

    public CadreBoiteDisjonction() {
    	super("Boîte de Disjoncteurs");
		Boite Nouvelboite = new Boite(MAX_AMPERE_DEFAUT);
		Nouvelboite.remplirAlea();
		
		// Mettre la fenêtre plein écran
		setExtendedState(CadreBoiteDisjonction.MAXIMIZED_BOTH);

		// Fermer l’application lors d’un clic sur X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Utiliser le panneau principal décrit après qui remplace le panneau de contenu
		PanneauPrincipal Pandisjoncteur = new PanneauPrincipal(Nouvelboite);
	    add(Pandisjoncteur);

	    setVisible(true);
        
	} 
	
	
}
