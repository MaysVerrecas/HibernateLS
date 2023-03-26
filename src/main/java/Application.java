import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.City;
import model.Employee;

import java.sql.SQLOutput;
import java.util.List;
public class Application {
    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImpl();


        Employee employee = new Employee("Petr", "Petrov", "M", 34, cityDao.findById(1));
        employeeDao.createEmployee(employee);
        System.out.println(employeeDao.findAll());
        System.out.println(cityDao.findAll());
    }
}
