public class Product
{
	private String name;
	
	public Product(String name)
	{
		setName(name);
	}
	public Product()
	{
		setName("Coca Cola");
	}

	public String getName()
	{
		return name;
	}

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
	
	public String toString()
	{
		String str = "";
		
		str += "Product \""+ name +"\"";
		return str;
	}
}