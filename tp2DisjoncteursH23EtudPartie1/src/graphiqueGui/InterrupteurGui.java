/**
 * 
 */
package graphiqueGui;

import java.awt.*;
import javax.swing.*;

/**
 * @author jerwin
 *
 */
public class InterrupteurGui extends JPanel{
	
	public InterrupteurGui(String etat) {
		if (etat == "ALLUME") {
            JButton btnNoir = new JButton();
            btnNoir.setBackground(Color.BLACK);
            btnNoir.setPreferredSize(new Dimension(100, 30)); // La moitié de la taille du bouton pour un disjoncteur.
            btnNoir.setEnabled(false);
            add(btnNoir);

            JButton btnBlanc = new JButton();
            btnBlanc.setBackground(Color.WHITE);
            btnBlanc.setPreferredSize(new Dimension(100, 30)); 
            btnBlanc.setEnabled(false);
            add(btnBlanc);
        } else {
            JButton btnRouge = new JButton();
            btnRouge.setBackground(Color.RED);
            btnRouge.setPreferredSize(new Dimension(100, 30)); 
            btnRouge.setEnabled(false);
            add(btnRouge);

            JButton btnNoir = new JButton();
            btnNoir.setBackground(Color.BLACK);
            btnNoir.setPreferredSize(new Dimension(100, 30)); 
            btnNoir.setEnabled(false);
            add(btnNoir);
        }
	}
}
