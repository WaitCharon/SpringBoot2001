package com.hqyj.SBD.modules.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.SBD.modules.test.dao.CountryDao;
import com.hqyj.SBD.modules.test.entity.Country;
import com.hqyj.SBD.modules.test.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;

	@Override
	public Country getCountryById(int countryId) {
		return countryDao.getCountryById(countryId);
	}

	@Override
	public Country getCountryByName(String countryName) {
		return countryDao.getCountryByName(countryName);
	}

}
