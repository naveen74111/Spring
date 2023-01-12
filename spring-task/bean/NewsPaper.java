package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("newsPaperId")
	private int property;

	private String name;

	private String ownerName;

	@Autowired
	@Qualifier("newsPaperLanguage")
	private String language;

	@Autowired
	@Qualifier("newsPaperPrice")
	private double price;

	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("newsPaperOwnerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [property=" + property + ", name=" + name + ", ownerName=" + ownerName + ", language="
				+ language + ", price=" + price + "]";
	}

}
