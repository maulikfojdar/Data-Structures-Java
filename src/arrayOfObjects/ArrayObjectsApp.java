package arrayOfObjects;

public class ArrayObjectsApp {

	public static void main(String[] args){
		
		ArrayObjects persons = new ArrayObjects(10);
		persons.insert("Maulik", "Fojdar", 23);
		persons.insert("Bharat", "Savani", 24);
		persons.insert("Rajiv", "Annapragada", 22);
		
		persons.find("Fojdar");
		persons.find("Patel");
		persons.insert("ABC", "Patel", 12);
		persons.delete("Patel");
		persons.displayRecords();
		
	}
}
