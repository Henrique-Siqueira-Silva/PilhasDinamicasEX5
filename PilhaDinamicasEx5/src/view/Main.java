package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhasINT.PilhasINT;

public class Main {

	public static void main(String[] args) {
		PilhasINT p = new PilhasINT();
		
		
		p.Push(4);
		p.Push(5);
		p.Push(8);
		p.Push(46);
		p.Push(44);
		p.Push(7);
		p.max();
	
	}

}
