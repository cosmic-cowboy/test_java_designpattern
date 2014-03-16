package com.slgerkamp.designpattern.prototype.techscore;

import java.util.*;

public class PrototypeKeeper{
	
	private Map<String,Cloneable> map;
	
	public PrototypeKeeper(){
		this.map = new HashMap<String,Cloneable> ();
	}
	
	public void addCloneable(String key,Cloneable prototype){
		map.put( key , prototype );
	}
	
	public Cloneable getClone(String key){
		Cloneable prototype = map.get(key);
		return prototype.createClone();
	}
}