package generic_lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {

	 public static void main(String[] args) {
		
		  Box<String, Integer> box = new Box<String, Integer>("roma", 23);
		   
		  Box<String, Integer> box1 = new Box<>("ivan", 342);
		  Box<String, String> box2 = new Box<>("ivan", "valsd");
		  Box<String, String> box3 = new Box<>("ivan", "valsd");
		 
		  List<Box> boxs = new ArrayList<Box>();
		  
		  boxs.add(box);
		  boxs.add(box1);
		  boxs.add(box2);
		  boxs.add(box3);
		  
		  int maxWeight = 0;
		  for (Box b : boxs) {
			
			  /*if(box.getWeight()>box1.getWeight()){   
			  }*/
			  	/*if(b.getWeight()>maxWeight){		  		
				System.out.println(b);		  
			  }*/
		}
		  
	}
}
