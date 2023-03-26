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

        /*Employee employee = new Employee("Makar", "Makarevich", "m", 21, 1);
        employeeDao.createEmployee(employee);
        System.out.println(employeeDao.findById(1));
        List<Employee> list = employeeDao.findAll();
        list.stream()
                .forEach(System.out::println);
        Employee employee1 = employeeDao.findById(employee.getId());
        employee1.setAge(234234234);
        employeeDao.updateEmployee(employee);
        employeeDao.delete(employee);*/

        //City city = new City("Istanbul");
        //cityDao.createCity(city);
        Employee employee = new Employee("Petr", "Petrov", "M", 34, cityDao.findById(1));
        employeeDao.createEmployee(employee);
        System.out.println(employeeDao.findAll());
        System.out.println(cityDao.findAll());
        //System.out.println(cityDao.findAllEmployeeByCityId(1));
    }
}
