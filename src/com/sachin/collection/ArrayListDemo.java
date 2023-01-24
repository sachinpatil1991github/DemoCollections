package com.sachin.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		list.add("sachin");
		list.add("patil");
		list.add("raje");
		
		for(String str : list )
		{
			System.out.println(str);
		}

	}

}
