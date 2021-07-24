package sort;

import java.util.*;

// Ex) ArrayList, LinkedList, Vector 등 * 내부적으로 Arrays.sort()를 사용

class People implements Comparable<People> {
	

    private String name;
	private int age;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
    public People(String name, int age){
        this.name = name;
        this.age= age;
    }

    @Override
    public int compareTo(People people) {
         if (this.age < people.age) {
             return -1; 
         } else if (this.age == people.age) {
             return 0;
         } else {
             return 1;
         }
     }

	
	
}
