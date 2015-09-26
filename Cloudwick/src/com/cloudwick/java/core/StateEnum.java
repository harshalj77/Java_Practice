package com.cloudwick.java.core;

public enum StateEnum {
	CA(11,"Fremont",94536),
	TX(13,"Dallas",54343),
	UT(14,"StateLake",44444);
	
private StateEnum(int id, String city, int zip){
	i=id;
	c=city;
	z=zip;
	
}
private int i;
private String c;
private int z;

public int getI() {
	return i;
}
public String getC() {
	return c;
}
public int getZ() {
	return z;
}


}
