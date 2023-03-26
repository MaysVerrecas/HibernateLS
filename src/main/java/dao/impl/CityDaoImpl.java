package dao.impl;

import dao.CityDao;
import config.HibernateSessionFactoryUtil;
import model.City;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public City createCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
        return city;
    }

    @Override
    public City findById(Integer id) {
        City city = new City();
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            city = session.get(City.class, id);
        }
        return city;
    }

    @Override
    public List<City> findAll() {
        List<City> cities = new ArrayList<>();
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            cities = session.createQuery("FROM City ").list();
        }
        return cities;
    }

    @Override
    public City updateCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
        }
        return city;
    }

    @Override
    public City delete(City city) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
        return city;
    }

    @Override
    public List<Employee> findAllEmployeeByCityId(Integer id) {
        City city = new City();
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            city = session.get(City.class, id);
            transaction.commit();
        }
        return city.getEmployees();
    }
}
