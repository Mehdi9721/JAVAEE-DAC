package model;

// this is just a model, which holds data of student 
public class Student {
private int sci,comp,math,prn;
private String name;

public int getPrn() {
	return prn;
}
public void setPrn(int prn) {
	this.prn = prn;
}
public int getSci() {
	return sci;
}
public void setSci(int sci) {
	this.sci = sci;
}
public int getComp() {
	return comp;
}
public void setComp(int comp) {
	this.comp = comp;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
