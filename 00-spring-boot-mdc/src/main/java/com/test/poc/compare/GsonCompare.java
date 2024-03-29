package com.test.poc.compare;

import java.lang.reflect.Type;
import java.util.Map;

import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonCompare {

	public static void main(String[] args) {
		String json1 = "{\"name\":\"ABC\", \"city\":\"XYZ\", \"state\":\"CA\"}";
		String json2 = "{\"city\":\"XYZA\", \"street\":\"123 anyplace\", \"name\":\"ABC\"}";

		Gson g = new Gson();
		Type mapType = new TypeToken<Map<String, Object>>() {
		}.getType();
		Map<String, Object> firstMap = g.fromJson(json1, mapType);
		Map<String, Object> secondMap = g.fromJson(json2, mapType);
		//System.out.println(Maps.difference(firstMap, secondMap));
		
		Person male = PersonCreator.getMalePerson("John", 31);
		Person female = PersonCreator.getFemalePerson("Jane", 30);
		
		System.out.println(male);
		System.out.println(female);
		
		DiffResult result = new DiffBuilder(female, male, ToStringStyle.SIMPLE_STYLE).build();
		System.out.println("result: " + result);
	}
}
