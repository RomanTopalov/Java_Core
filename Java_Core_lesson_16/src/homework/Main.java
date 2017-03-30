package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	 public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Roma roma = new Roma();
		
//////////////
		Class ref = roma.getClass();
		
		Field [] fields = ref.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		////////////////////////////
		
		System.out.println("'''''''''''''''''''");
		
		Constructor[]constructors =ref.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		///////////////////////////
		
		System.out.println("'''''''''''''''''''");

		Method [] methods = ref.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		
		///////////////////////////
		System.out.println("'''''''''''''''''''");

		Class [] inter = ref.getInterfaces();
			for (Class class1 : inter) {
				System.out.println(class1);
			}
		
		///////////////////////////////
			
			Roma rom=(Roma) ref.newInstance();
			System.out.println(rom);
		
			//////////////////////
			
			Field field= ref.getDeclaredField("surName");
			field.setAccessible(true);
			
			Roma enotherRoma = new Roma("Roma","Topalov", 19, "CE");
			field.set(enotherRoma, "JAva");
			System.out.println(enotherRoma);
			
			
		
		
			
			
			
			
			
			
			
			
			
			
		
		
		
	}
}
