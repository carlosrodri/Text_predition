package controllers;

import models.Tree;

public class Controller {
	
	private Tree tree;
	
	public Controller() {
		tree = new Tree();
		
		try {
			tree.add("Hola", tree.getRoot());
		} catch (Exception e) {
			e.printStackTrace();
		}
		tree.print(tree.getRoot());
	}
}
