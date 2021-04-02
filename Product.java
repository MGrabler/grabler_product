public class Product
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private String name;
	private float price;
	
	// ----------------------------------Constructor--------------------------------------------------------------------------------
	public Product(String name, float price)
	{
		setName(name);
		setPrice(price);
	}
	public Product()
	{
		this("Coca Cola", 10.0f);
	}
	
	// ----------------------------------Getter-------------------------------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
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
	public void setPrice(float price)
	{
		if(price > 0)
			if(price < 100_000)
				this.name = name.trim();
			else
				System.out.println("Fehler bei setPrice(+ price +): Der Preis darf nicht größer 100.000€ sein!!!");
		else
			System.out.println("Fehler bei setPrice("+ price +"): Der Preis darf nicht kleiner/gleich 0€ sein!!!"); 
	}
	
	// ----------------------------------toString-------------------------------------------------------------------------------------
	public String toString()
	{
		String str = "";
		
		str += "Product \""+ name +"\"";
		return str;
	}
}