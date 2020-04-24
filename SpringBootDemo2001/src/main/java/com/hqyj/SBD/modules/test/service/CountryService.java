package com.hqyj.SBD.modules.test.service;

import com.hqyj.SBD.modules.test.entity.Country;

public interface CountryService {
	
	Country getCountryById(int countryId);
	
	Country getCountryByName(String countryName);
}
