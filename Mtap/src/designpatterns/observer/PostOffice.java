package designpatterns.observer;

import java.util.ArrayList;

public class PostOffice implements Subject
{

	private ArrayList<Passport> allMail;
	private ArrayList<Observer> observers;

	public PostOffice()
	{
		allMail = new ArrayList<>();
		observers = new ArrayList<>();
	}

	public void addMail(Passport m){
		allMail.add(m);
		Notify();
	}

	public ArrayList<Passport> getState()
	{
		return allMail;
	}

	public void register(Observer o)
	{
		observers.add(o);
	}

	public void unRegister(Observer o)
	{
		observers.remove(o);
	}

	public void Notify()
	{
		for (int i = 0; i < observers.size(); i++)
			observers.get(i).update(this);
	}
}