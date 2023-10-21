package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.FlightsPageLocator;
import com.app.locator.LoginPage_locator;

public class FlightsPageExe extends FlightsPageLocator {

	public static void from(String from) {
		BaseClass.inputValue(FlightsPageLocator.fromElement(), from);
	}

	public static void to(String to) {
		BaseClass.inputValue(FlightsPageLocator.toElement(), to);
	}
	
	public static void searchButton() {
		BaseClass.click_Value(FlightsPageLocator.searchElement());
	}
}
