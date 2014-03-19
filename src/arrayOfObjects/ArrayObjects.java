package arrayOfObjects;

public class ArrayObjects {

	private Person[] person;
	int nElements = 0;
	
	public ArrayObjects(int size){
		this.person = new Person[size];
		this.nElements = 0;
	}
	
	public void find(String lastName){
		int i;
		for (i = 0; i < nElements; i++){
			if(person[i].getLastName().equals(lastName))
				break;
		}
		if(i < nElements){
			System.out.println("Record found: "+person[i].display());
		}
		else{
			System.out.println("Record not found.");
		}
		
		
	}
	
	public void insert(String firstName, String lastName, int age){
		person[nElements] = new Person(lastName, firstName, age);
		nElements++;
	}
	
	public void delete(String lastName){
		int i;
		for (i = 0; i < nElements; i++) {
			if(person[i].getLastName().equals(lastName))
				break;
		}
		if(i < nElements){
			System.out.println("The Record to be deleted is: "+person[i].display());
			for (int j = i; j < nElements; j++) {
				person[j] = person[j+1];
			}
		}
		else{
			System.out.println("Record not found.");
		}
		nElements--;
	}
	
	public void displayRecords(){
		for (int i = 0; i < nElements; i++) {
			System.out.println(person[i].display());
		}
	}
}
