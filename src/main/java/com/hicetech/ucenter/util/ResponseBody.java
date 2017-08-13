package com.hicetech.ucenter.util;

import java.util.List;

public class ResponseBody<T> {
	List<T> lists;

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}
	
	
}
