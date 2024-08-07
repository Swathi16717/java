package myfirstjava;

public class employee {
	public int id;
	public String name;
	
	public employee(int id, String name) {  //parameter constructor
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {  //getters and setters
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

	@Override //two string
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
		
	}
	
	

}

