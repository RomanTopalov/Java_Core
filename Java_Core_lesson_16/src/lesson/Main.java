package lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Person person = new Person("anton ",20,"officer",12);
		
		Class ref = person.getClass();
		
		Field [] fields = ref.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field);
		}
		
		Constructor [] constructor = ref.getDeclaredConstructors();
		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2);
		}
		
		System.out.println();

		
		Method[] methods = ref.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getDefaultValue());
		}
		
		
		Class[] inters = ref.getInterfaces();
		for (Class class1 : inters) {
			System.out.println(class1);
		}
		
		
		Person per = (Person) ref.newInstance(); 
		
		System.out.println(per);
		
		Field field = ref.getDeclaredField("name");
		field.setAccessible(true);
		
		field.set(person, "value");
		System.out.println(person);
		
		Person somePerson = new Person("igor", 12, "capral", 2, new Autoe("mers", "200"));
		
		Field field1 = somePerson.getClass().getDeclaredField("auto");
		field1.setAccessible(true);
		
		field1.set(somePerson, new Autoe("atom", "323"));
		System.out.println(somePerson);
		
		
		
		
		
		
	
		
	}
	
	
	public Object clone(Object object) throws InstantiationException, IllegalAccessException{
		
		Class some =object.getClass();
		String cl=some.getSimpleName();
		Object object2 = some.newInstance();
		
		if(object instanceof Person){
			object.toString();
		}
		
		
		
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
