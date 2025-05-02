package main;

import service.MenuService;

public class PhonMain {
	public static void main(String[] args) {
		
		MenuService menu = new MenuService();
		
		menu.showInstalledApps();
		
		
	}
}
