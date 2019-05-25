package hashcode;

public class Person {
private int id;
private String name;

@Override
public int hashCode() {
	
	
	System.out.println("called hashCode for ="+ id+"."+name);
	return id;
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + id;
//	result = prime * result + ((name == null) ? 0 : name.hashCode());
//	return result;
}

@Override
public boolean equals(Object obj) {
	
	boolean result = false;
	
	if(obj instanceof Person) {
		if( ((Person)obj).getId() == id &&  ((Person)obj).getName().equals(name) ) {
             result = true;			
		}
	}
	return result;
	
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Person other = (Person) obj;
//	if (id != other.id)
//		return false;
//	if (name == null) {
//		if (other.name != null)
//			return false;
//	} else if (!name.equals(other.name))
//		return false;
//	return true;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Person(int id,String name) {
	
	this.id = id;
	this.name = name;		
	
}


}
