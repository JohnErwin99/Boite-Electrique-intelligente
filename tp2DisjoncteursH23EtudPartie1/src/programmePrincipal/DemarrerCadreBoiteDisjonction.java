
package programmePrincipal;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import graphiqueGui.CadreBoiteDisjonction;

public class DemarrerCadreBoiteDisjonction {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CadreBoiteDisjonction cadreBoiteDisjonction = new CadreBoiteDisjonction();
                cadreBoiteDisjonction.setVisible(true);
                
            }
        });

	}

}
