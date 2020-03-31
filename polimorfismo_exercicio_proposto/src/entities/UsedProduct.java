package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufactured;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactured) {
		super(name, price);
		this.manufactured = manufactured;
	}

	public Date getManufactured() {
		return manufactured;
	}

	public void setManufactured(Date manufactured) {
		this.manufactured = manufactured;
	}
	
	@Override
	public String priceTag() {
		return getName() 

				+ " (used) $ " 

				+ String.format("%.2f", getPrice())

				+ " (Manufacture date: "

				+ sdf.format(manufactured)

				+ ")";
	}
}
