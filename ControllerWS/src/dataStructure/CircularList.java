package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CircularList<T> {
	private T currentElement=null;
	private List<T> elementsList;
	public CircularList()
	{
		elementsList=Collections.synchronizedList(new ArrayList<T>());
	}
	public int size()
	{
		return elementsList.size();
	}

	public synchronized T getCurrentElement()
	{
		if (currentElement==null)
			if(size()>0)
				currentElement= elementsList.get(0);
		return currentElement;
	}
	public synchronized T getNext()
	{
		int size=elementsList.size();
		if(size==1)
			currentElement=elementsList.get(0);
		else
			if(size>1)
			{
				int currentIndex=elementsList.indexOf(currentElement);
				if(currentIndex<size-1)
					currentElement=elementsList.get(currentIndex+1);
				else
					currentElement=elementsList.get(0);
			}
		return currentElement;
	}
	public void add(T element)
	{
		elementsList.add(element);
	}
	public synchronized boolean removeElement(int index)
	{
		T element=elementsList.get(index);
		boolean res=false;
		
			if(size()==1)
				currentElement=null;
			if(element==currentElement)
			{
			 currentElement=getNext();
			}
			res=elementsList.remove(element);

		return res;
	}
	public synchronized boolean removeElement(T element)
	{
		if(elementsList.indexOf(element)<0)
			return false;
		return removeElement(elementsList.indexOf(element));
	}
	public boolean isEmpty()
	{
		return elementsList.isEmpty();
	}
	public boolean contains(T element)
	{
		return elementsList.contains(element);
	}
	public static void main(String args[])
	{
		CircularList<String> l=new CircularList<String>();
		String x1="ala1";
		String x2="ala2";
		//String x3="ala3";
		l.add(x2);
		l.add(x1);
		l.add(x1);
		
		//l.add(x2);
		//l.add(x3);
		//l.removeElement("ala1");
		//l.getNext();
		//l.getNext();

		//l.removeElement("ala2");
		//l.removeElement("ala3");
		
		//System.out.println(l.getCurrentElement());
		System.out.println(l.getNext());
		System.out.println(l.getNext());
		System.out.println(l.getNext());
		l.removeElement("ala1");
		l.removeElement("ala1");
		System.out.println(l.getNext());
		System.out.println(l.getNext());
		//System.out.println(l.contains("ala"));
		
	}

}
