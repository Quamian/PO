// Zastosuj now� wiedz� o Java 8. 
// Zaproponuj implementacj� obiekt�w: Person, VipPerson, UniversityPerson, Teacher, Student. 
// Sam zaproponuj co z czego dziedziczy/implementuje. 
// Zastosuj je�li si� da interfejsy i domy�lne metody itp.
// Poka� w klasie ZadaniePerson przyk�ady u�ycia.

package zad5;

public class ZadaniePerson {
	
	public static void main(String[] args) {
		
		Person osoba = new Person();
		VipPerson vip = new VipPerson();
		Student student = new Student();
		Teacher nauczyciel = new Teacher();
		
		osoba.przedstawSie();
		vip.przedstawSie();
		student.przedstawSie();
		nauczyciel.przedstawSie();
	}

}