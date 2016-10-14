package chapitre3;

import java.util.LinkedList;

abstract class Animal{
	private int order;
	protected String name;
	public Animal(String n){name = n;}
	public void setOrder(int ord){order = ord;}
	public int getOrder(){return order;}
	
	public boolean isOlderThan(Animal a){
		return this.order < a.getOrder();
	}
}


class AnimalQueue{
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order = 0 ;
	
	public void enqueue(Animal a){
		a.setOrder(order++);
		
		if(a instanceof Dog) dogs.addLast((Dog) a);
		else cats.addLast((Cat) a);
	}
	
	
	public Animal dequeueAny(){
		if(dogs.size() == 0 ) return dequeueCats();
		else if(cats.size() == 0 ) return dequeueDogs();
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		return dog.isOlderThan(cat) ? dequeueDogs():dequeueCats();
	}
	
	public Dog dequeueDogs(){return dogs.poll();}
	public Cat dequeueCats(){return cats.poll();}
	
}

 class Dog extends Animal{
	public Dog(String n){super(n);}
}

 class Cat extends Animal{
	public Cat(String n ){super(n);}
}


public class AnimalShelter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalQueue aq = new AnimalQueue();
		aq.enqueue(new Dog("sdf"));
		aq.enqueue(new Dog("sdsdf"));
		aq.enqueue(new Cat("sdf"));
		aq.enqueue(new Dog("sdssf"));
		System.out.println(aq.dequeueAny().name);
		System.out.println(aq.dequeueDogs().name);
		
	}

}
