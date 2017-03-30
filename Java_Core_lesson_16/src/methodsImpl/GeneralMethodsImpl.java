package methodsImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import methods.GeneralMethods;

public class GeneralMethodsImpl<K> implements GeneralMethods<K>{

	@Override
	public void serialize(K k) throws IOException {
FileOutputStream fos = new FileOutputStream("classes.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(k);
oos.close();

	}

	@Override
	public void delete(K k) {
		// TODO Auto-generated method stub
		
	}

	
}
