package com.bikkadIt.IRCTCResourceApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private int tid;
	private String tpnr;
	private String tstatus;
	private double tprice;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTpnr() {
		return tpnr;
	}
	public void setTpnr(String tpnr) {
		this.tpnr = tpnr;
	}
	public String getTstatus() {
		return tstatus;
	}
	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}
	public double getTprice() {
		return tprice;
	}
	public void setTprice(double tprice) {
		this.tprice = tprice;
	}
	
	
}
