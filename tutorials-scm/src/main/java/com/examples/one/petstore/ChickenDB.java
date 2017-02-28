package com.examples.one.petstore;
import java.util.*;
public class ChickenDB{
	
	ArrayList<Chicken> chickens = new ArrayList<Chicken>();
	
	public boolean addChicken(final Chicken c){
		if(chickens.size() < 10){
			chickens.add(c);
			return true;
		}else {
			System.out.println("Error: too many chickens");
			return false;
		}
		
	}

    public boolean delChicken(final int id){
		if(chickens.size() >= id){
			chickens.remove(id);
			return true;
		}else{
			System.out.println("Error 404: chicken not found");
			return false;
		}
	}

    public Chicken getChicken(int id){
		return chickens.get(id);
	}

    public int countChickens(){
		return chickens.size();
	}
}

