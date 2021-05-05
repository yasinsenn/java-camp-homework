package entities;

import abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaingName;
	private double campaingDiscount;

	public Campaign(int id, String campaingName, double campaingDiscount) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.campaingDiscount = campaingDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getCampaingDiscount() {
		return campaingDiscount;
	}

	public void setCampaingDiscount(double campaingDiscount) {
		this.campaingDiscount = campaingDiscount;
	}

}
