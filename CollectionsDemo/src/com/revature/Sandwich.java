package com.revature;

public class Sandwich {

	private String breadType;
	private String cheeseType;
	private boolean hasDressing;
	private String meat;
	private double weight;
	
	public Sandwich() {
		super();
	}
	
	public Sandwich(String breadType, String cheeseType, boolean hasDressing, String meat, double weight) {
		super();
		this.breadType = breadType;
		this.cheeseType = cheeseType;
		this.hasDressing = hasDressing;
		this.meat = meat;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breadType == null) ? 0 : breadType.hashCode());
		result = prime * result + ((cheeseType == null) ? 0 : cheeseType.hashCode());
		result = prime * result + (hasDressing ? 1231 : 1237);
		result = prime * result + ((meat == null) ? 0 : meat.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Sandwich other = (Sandwich) obj;
		if (breadType == null) {
			if (other.breadType != null)
				return false;
		} else if (!breadType.equals(other.breadType))
			return false;
		if (cheeseType == null) {
			if (other.cheeseType != null)
				return false;
		} else if (!cheeseType.equals(other.cheeseType))
			return false;
		if (hasDressing != other.hasDressing)
			return false;
		if (meat == null) {
			if (other.meat != null)
				return false;
		} else if (!meat.equals(other.meat))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sandwich [breadType=" + breadType + ", cheeseType=" + cheeseType + ", hasDressing=" + hasDressing
				+ ", meat=" + meat + ", weight=" + weight + "]";
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	public boolean isHasDressing() {
		return hasDressing;
	}

	public void setHasDressing(boolean hasDressing) {
		this.hasDressing = hasDressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
