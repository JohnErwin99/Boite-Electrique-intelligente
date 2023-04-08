package graphiqueGui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import disjoncteurs.Boite;

public class PanneauInfoBoite extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boite boite;

    public PanneauInfoBoite(Boite boite) {
        this.boite = boite;        
        setLayout(new GridLayout(Boite.NB_LIGNES_MAX, Boite.NB_COLONNES));
        afficherInfosBoite();
        setVisible(true);

    }

    private void afficherInfosBoite() {
    	JLabel Ampere = new JLabel("Ampere: " + String.valueOf(boite.getMaxAmperes()));
    	JLabel Consommation = new JLabel("Consommation: " + String.valueOf(boite.getConsommationTotalEnWatt()));
    	JLabel UPS = new JLabel("UPS: " + String.valueOf(boite.temps_ups()));
    	JLabel NbDisjonteurs = new JLabel("NbDisjonteurs: " + String.valueOf(boite.getNbDisjoncteurs()));
    	JLabel NbDisjonteursEntree = new JLabel("NbDisjonteursEntree: " + String.valueOf(boite.getNbDisjoncteursEntree()));
    	JLabel NbDisjonteursPhase = new JLabel("NbDisjonteursPhase: " + String.valueOf(boite.getNbDisjoncteursPhase()));

    	this.add(Ampere);   
    	this.add(Consommation);
    	this.add(UPS);
    	this.add(NbDisjonteurs);
    	this.add(NbDisjonteursEntree);
    	this.add(NbDisjonteursPhase);
    }
}
