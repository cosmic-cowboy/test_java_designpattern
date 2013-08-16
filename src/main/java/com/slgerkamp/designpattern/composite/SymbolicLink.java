package com.slgerkamp.designpattern.composite;

public class SymbolicLink implements DirectoryEntry {
	
	// SymbolicLink Name
	private final String name;
	
	// constructor
	public SymbolicLink(String name) {
		this.name = name;
	}

	// delete SymbolicLink
	public void remove() {
        System.out.println(name + "を削除しました");
	}

}
