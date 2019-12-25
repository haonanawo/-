package entity;

import java.sql.Date;

public class Employee {
    private int eno;
    private String ename;
    private String esex;
    private int eage;
    private String etel;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public Employee() {
		super();
	}
	public Employee(int eno, String ename, String esex, int eage, String etel) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esex = esex;
		this.eage = eage;
		this.etel = etel;
	}
	
	public Employee(String ename, String esex, int eage, String etel) {
		super();
		this.ename = ename;
		this.esex = esex;
		this.eage = eage;
		this.etel = etel;
	}
	

}
