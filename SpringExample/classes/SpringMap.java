package com.xworkz.Spring.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringMap {

	@Bean
	public void hashMap() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Ballari", 583101);
		map.put("Sudacross", 583104);
		map.put("gandhi nagar", 583102);
		map.put("manjunata nagar", 560015);
		map.put("patel nagar", 583103);

		Set<Entry<String,Integer>> entry = map.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue());
			System.out.println();
			System.out.println("KeyName :" +entry2.getKey()+"--->"+"Key value :"+entry2.getValue());
		}
		System.out.println("Size : "+ map.size());
		
	}
}
