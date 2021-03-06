
public class Zad1_5<E> {
	
	private E[] list = (E[])new Object[3];
	private int size = 0;
	
	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size - 1];
	}

	public void push(E o) {
		if(size>=list.length) {
		
			E[] list1 = (E[]) new Object[list.length*2];
			for(int i=0;i<size; i++) {
				list1[i] = list[i];
			}
			list = list1;
		}
		list[size]=o;
		size++;
	}

	public E pop() {
		size--;
		E o = list[size];
		return o;
	}

	public boolean isEmpty() {
		return size==0;
	}

	
	public String toString() {
		return "stack: " + list.toString();
	}
}
