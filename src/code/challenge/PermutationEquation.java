package code.challenge;

import java.util.ArrayList;
import java.util.List;

public class PermutationEquation {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		
		
		//result -> 4, 2, 5, 1, 3
		
		System.out.println(permutationEquation(list));

	}
	
	public static List<Integer> permutationEquation(List<Integer> p){
		
		List<Integer> yList = new ArrayList<>();
		int len = p.size();
		for(int i = 1; i <= len; i++) {
			int index = 0;
			for(int j = 0; j < p.size(); j++) {
				if(i == p.get(j)) {
					index = j + 1;
					break;
				}
			}
			for(int j = 0; j < p.size(); j++) {
				if(index == p.get(j)) {
					index = j + 1;
					break;
				}
			}
			yList.add(index);	
		}
		return yList;	
		
	}

}
