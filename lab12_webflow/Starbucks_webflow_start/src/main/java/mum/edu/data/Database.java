package mum.edu.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import mum.edu.domain.User;

@Component
public class Database implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HashMap<String, User> users = new HashMap<String, User>();
	public HashMap<String, List<String>> advice = new HashMap<String, List<String>>();
	 {
		users.put("Dave", new User("Dave","111"));
		users.put("Steve", new User("Steve","222"));
		users.put("Ralph", new User("Ralph","333"));
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		advice.put("Dark", darkList);
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		advice.put("Medium", medList);
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		advice.put("Light", lightList);
	}
	
		public Map<Integer, String> roasts =  new HashMap<Integer, String>() {
            {
                put(1, "Dark");
                put(2, "Medium");
                put(3, "Light");
             }
        };
		

 
}
