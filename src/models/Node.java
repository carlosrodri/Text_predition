package models;

import java.util.ArrayList;

public class Node {
	private Node father;
	private String info;
	private ArrayList<Node> list;
	private int coincidence;
	
	public Node(String info, Node father) {
		this.info = info;
		this.father = father;
		list = new ArrayList<>();
		coincidence = 0;
	}
	
	public int getCoincidence() {
		return coincidence;
	}
	public void setCoincidence() {
		coincidence++;
	}
	public Node getFather() {
		return father;
	}
	public String getInfo() {
		return info;
	}
	public ArrayList<Node> getList() {
		return list;
	}
	
	public void addChild(Node child) {
		list.add(child);
	}
}