package model;

import java.util.*;

public class Company
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private LinkedList<Product> products;
	private String name;
	
	// ----------------------------------Constructor--------------------------------------------------------------------------------
	public Company(String name)
	{
		setName(name);
		init();
	}
	public Company()
	{
		this("IBM");
	}
	private void init()
	{
		new LinkedList<>();
	}
	
	// ----------------------------------Getter-------------------------------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	
	// ----------------------------------Setter-------------------------------------------------------------------------------------
	public void setName(String name)
	{
		if(name != null)
			if( ! name.isEmpty())
				if(name.length() <= 100)
					this.name = name.trim();
				else
					System.out.println("Fehler bei setName("+ name.length() +"): Es sind Maximal 100 Zeichen erlaubt!!!"); 
			else
				System.out.println("Fehler bei setName(...): Der Name ist leer!!!"); 
		else
			System.out.println("Fehler bei setName(...): Null-Ref. erhalten!!!"); 
	}
}
