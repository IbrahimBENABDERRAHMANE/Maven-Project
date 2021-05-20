package second.project;

import first.app.FirstClass;

public class SecondClass {

	
	private FirstClass myFirstImportedClass;
	
	private int id;

	public FirstClass getMyFirstImportedClass() {
		return myFirstImportedClass;
	}

	public void setMyFirstImportedClass(FirstClass myFirstImportedClass) {
		this.myFirstImportedClass = myFirstImportedClass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
