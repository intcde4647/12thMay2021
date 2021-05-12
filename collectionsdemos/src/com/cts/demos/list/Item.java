package com.cts.demos.list;

public class Item {
private int id;
private String desc;
private float price;


public Item() {
	super();
	// TODO Auto-generated constructor stub
}

public Item(int id, String desc, float price) {
	super();
	this.id = id;
	this.desc = desc;
	this.price = price;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((desc == null) ? 0 : desc.hashCode());
	result = prime * result + id;
	result = prime * result + Float.floatToIntBits(price);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (desc == null) {
		if (other.desc != null)
			return false;
	} else if (!desc.equals(other.desc))
		return false;
	if (id != other.id)
		return false;
	if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
		return false;
	return true;
}

@Override
public String toString() {
	return "Item [id=" + id + ", desc=" + desc + ", price=" + price + "]";
}


}
