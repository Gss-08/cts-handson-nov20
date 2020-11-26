package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		for(Items item : list) System.out.println(item);
		System.out.println("---- Sorting ID in ascending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getID()-i2.getID();
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting ID in descending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i2.getID()-i1.getID();
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting Name in ascending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting Name in descending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i2.getName().compareTo(i1.getName());
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting Price in ascending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return (int)(i1.getPrice()-i2.getPrice());
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting Price in descending order ----");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return (int)(i2.getPrice()-i1.getPrice());
			}
		});
		for(Items item : list) {
			System.out.println(item);
		}
	}

}
