package models;

import java.util.ArrayList;

public class Tree {
	private Node root;
	private Node current;

	public Tree() {
		root = new Node(null, null);
	}

	public void add(String word, Node node) throws Exception {
		current = node;
		if(validate(word.substring(0), current)) {
			current.setCoincidence();
			add(word.substring(1, word.length()), current);
		}else {
			current.addChild(new Node(word.substring(0, 1), current));
			add(word.substring(1, word.length()), current.getList().get(0));
		}
	}

	private boolean validate(String substring, Node node) throws Exception {
		if(node.getList() != null) {
			for (Node child : node.getList()) {
				if(child.getInfo().equals(substring)) {
					return true;
				}else {
					current = node;
					return false;
				}
			}
		}else {
			throw new Exception("Node not have children");
		}
		return false;
	}
	
	public Node getRoot() {
		return root;
	}

	public void print(Node node) {
		if (node.getList() != null) {
			System.out.println(node.getInfo() + "    padre");
			printList(node.getList());
		}
	}

	private void printList(ArrayList<Node> list) {
		for (Node node : list) {
			System.out.println(node.getInfo() + "    hijo");
//			print(node);
		}
	}
}