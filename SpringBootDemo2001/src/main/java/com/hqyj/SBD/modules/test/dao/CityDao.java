package com.hqyj.SBD.modules.test.dao;

import java.util.List;
import com.hqyj.SBD.modules.test.entity.City;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


//@Repository
@Mapper
public interface CityDao {
	/**
	 * #{countryId} --- prepared statement,select * from m_city where country_id =?
	 * ${countryId} --- statement,select * from m_city where country_id =?
	 * @param countryId
	 * @return
	 */
	@Select("select * from m_city where country_id = #{countryId}")
	List<City> getCitiesByCountryId(int countryId);
	
	List<City> getCitiesByCountryId2(int countryId);
	
	@Insert("Insert into m_city (city_name,local_city_name,country_id,date_created)"
			+ "values (#{cityName},#{localCityName},#{countryId},#{dateCreated})")
	void insertCity(City city);
}
