package tumbleweed;

import java.util.List;
import java.lang.StringBuilder;

public class State {
	public Input in;
	
	//TODO: add variables
	public int data;
	
	public State(Input in) {
		this.in = in;
		//TODO: generate empty state
	}
	
	public String toString() {
		//TODO: print me as given in the problem statement 
		return "fill me";
	}
	
	public String visualize() {
		//TODO: visualize 
		return "visualization";
	}
	
	public String visualizeFreq() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < in.C; i++) {
			int sum = 0;
			for (int j = 0; j < in.c_l[i]; j++) {
				sum += in.c_products[i][j];
			}
			sb.append(sum).append('\n');
		}
		return sb.toString();
	}
	
	public static State solve(Input i) {
		//TODO: solve me
		return new State(i);
	}
	
	public List<Input> readAll() {
		//TODO: read all inputs from data dir 
		return null;
	}
}
