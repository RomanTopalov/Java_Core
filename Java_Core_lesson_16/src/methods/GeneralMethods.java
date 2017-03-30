package methods;

import java.io.IOException;

import lesson.Autoe;

public interface GeneralMethods<K> {

	void serialize(K k)throws IOException;
	void delete(K k)throws IOException;
}
