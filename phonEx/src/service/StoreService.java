package service;

import java.util.ArrayList;
import java.util.List;

import domain.App;
import domain.MemoApp;

public class StoreService {
	
	private List<App> availableApps = new ArrayList<>();

	public StoreService() {
		availableApps.add(new MemoApp());
	}
	
	public List<App> getAvailableApps() {
		return availableApps;
	}


}
