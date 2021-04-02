public class Product
{
	private String name;
	private boolean onStock;
	
	public Product(String name)
	{
		setName(name);
	}
	public Product(String name,boolean onStock)
	{
		setName(name);
		setOnStock(onStock);
		
	}
	public Porduct()
	{
	this("Coca-Cola",true);
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
	
	public void setOnStock(boolean onStock)
	{
		if(this.onStock != onStock)
		this.onStock = onStock;
	}
	
	public boolean isOnStock()
	{
	return onStock;
	}
	public String toString()
	{
		String str = "";
		
		str += "Product \""+ name +"\"";
		return str;
	}
}
