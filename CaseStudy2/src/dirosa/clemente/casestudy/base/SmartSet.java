package dirosa.clemente.casestudy.base;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

public interface SmartSet<E> extends Set<E>{

	Object clone() throws CloneNotSupportedException;

	@Override
	boolean equals(Object obj);

	void finalize() throws Throwable;

	@Override
	int hashCode();

	@Override
	String toString();
	
	public E get(E e);
	
}
