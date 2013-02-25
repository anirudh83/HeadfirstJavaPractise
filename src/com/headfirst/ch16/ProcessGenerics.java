package com.headfirst.ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author anirudh
 * 
 */
public class ProcessGenerics {
	/**
	 * If a method argument is an array of Animals, it will also take an array
	 * of any Animal subtype
	 * 
	 * Array tyoes are checked again at run time, but collection type checks
	 * only happen on compile time!!! and hence for collection the argument of
	 * parent class can not allow child classes to be passed
	 */
	public void go() {
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Dog());
		takeAnimal(animalList);

		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		dogList.add(new Dog());

		// if we try to pass List<Dog> in takeAnimal(List<Animal> animals)
		// it wont compile!!!
		// takeAnimal(dogList);
		// imagine animals.add(new Cat()); in takeAnimals where dogList is
		// passed!!
		takeAnimalWithWildCard(dogList);
		//takeAnimals(dogList);

	}

	/**
	 * wont allow subtype of Animal to passed as the list can be modifed , for
	 * example a cat can be added
	 * 
	 * @param animals
	 */
	private void takeAnimal(List<Animal> animals) {
		//if allowed by compiler then
		//animals.add(new Cat()); 
		//in takeAnimals where dogList is passed
		for (Animal animal : animals) {
			animal.eat();
		}
	}
/**
 * Hence use of generics wild card, it will ensure no modification of list takes place
 * @param animals
 */
	private void takeAnimalWithWildCard(List<? extends Animal> animals) {
		//wont compile this
		//animals.add(new Cat());
		for (Animal animal : animals) {
			animal.eat();
		}
	}
/*
 * here T will be replaced with Animal
 */
	private <T extends Animal> void takeAnimals(ArrayList<T> list){
		for (T t : list) {
			t.eat();
		}
	}
	
	public static void main(String[] args) {
		ProcessGenerics pg = new ProcessGenerics();
		pg.go();
	}
}
