package graphiqueGui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

import disjoncteurs.Boite;

public class PanneauPrincipal extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boite boite;
    private PanneauInfoBoite panneauInfoBoite;
    private PanneauDisjoncteurs panneauDisjoncteurs;

    public PanneauPrincipal(Boite boite) {
        this.boite = boite;
        
        panneauInfoBoite = new PanneauInfoBoite(boite);
        panneauDisjoncteurs = new PanneauDisjoncteurs(boite);
        
        add(panneauInfoBoite, BorderLayout.WEST);
        add(panneauDisjoncteurs, BorderLayout.EAST);
        setVisible(true);
    }
}
