package com.xworkz.Spring.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpringList {

	public void arrayList() {
		List<String> list = new ArrayList<String>();
		list.add("Anu Hotel");
		list.add("raghu Hotel");
		list.add("Kumar Hotel");
		list.add("Lakshmi Hotel");
		list.add("Gana Hotel");
		list.add("ManeTindi Hotel");

		System.out.println(list.size());
		for (String str : list) {
			System.out.println(str);
		}
	}
}
