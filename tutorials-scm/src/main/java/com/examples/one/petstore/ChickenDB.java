import java.util.*;
public class ChickenDB{
	
	
	ArrayList<Chicken> chickens = new ArrayList<>();
	
	boolean addChicken(Chicken c){
		if(chickens.size()<10){
			chicken.add(c);
			return true;
		}else {
			System.out.println("Error: too many chickens");
			return false;
		}
		
	}
	
	boolean delChicken(int id){
		if(chickens.size>=id){
			chickens.remove(id);
			return true;
		}else{
			System.out.println("Error 404: chicken not found");
			return false;
		}
	}


	Chicken getChicken(int id){
		return chickens.get(id);
	}
	
	
	int countChickens(){
		return chickens.size();
	
	}
	
}




}
