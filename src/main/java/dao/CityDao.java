package dao;

import model.City;
import model.Employee;

import java.util.List;

public interface CityDao {
    City createCity(City city);

    City findById(Integer id);

    List<City> findAll();

    City updateCity(City city);

    City delete(City city);

    List<Employee> findAllEmployeeByCityId(Integer id);
}
