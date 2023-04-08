package graphiqueGui;

import java.awt.GridLayout;

import javax.swing.JPanel;

import disjoncteurs.Boite;

public class PanneauDisjoncteurs extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boite boite;
	DisjoncteurGui montrerdisjonteurs;

    public PanneauDisjoncteurs(Boite boite) {
        this.boite = boite;
        setLayout(new GridLayout(Boite.NB_LIGNES_MAX, Boite.NB_COLONNES));
        ajouterDisjoncteurs();
    }

    private void ajouterDisjoncteurs() {
    	
    	for(int i = 0; i < Boite.NB_LIGNES_MAX; i++) {
    		for(int j = 0; j < Boite.NB_COLONNES; j++) {
    	    	montrerdisjonteurs = new DisjoncteurGui(boite.getDisjoncteur(j, i), i, j);
    	    	this.add(montrerdisjonteurs);
    		}
    	}
    	
    }
}
