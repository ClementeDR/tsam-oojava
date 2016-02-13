package dirosa.clemente.casestudy.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public  class HashSmartSet<E> implements SmartSet<E>{
	
	private transient HashMap<E, Object> map;

	private static final Object PRESENT = new Object();
	
	public HashSmartSet(){
		map = new HashMap<E, Object>();
		
	}
	//implementazione di matteo
	
	public E get(E e){
		if(map.containsKey(e))
			return map.keySet().iterator().next();
		else {
			return null;
		}
	}

	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return SmartSet.super.spliterator();
	}

	public Stream<E> parallelStream() {
		// TODO Auto-generated method stub
		return SmartSet.super.parallelStream();
	}

	public boolean removeIf(Predicate<? super E> filter) {
		// TODO Auto-generated method stub
		return SmartSet.super.removeIf(filter);
	}

	public Stream<E> stream() {
		// TODO Auto-generated method stub
		return SmartSet.super.stream();
	}

	public void forEach(Consumer<? super E> arg0) {
		// TODO Auto-generated method stub
		SmartSet.super.forEach(arg0);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
