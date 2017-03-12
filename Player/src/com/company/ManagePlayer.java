package com.company;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
/**
 * Created by Talon on 2/21/2017.
 */
//public class ManagePlayer {

//    create table Player (
//            id INT NOT NULL auto_increment,
//            first_name VARCHAR(20) default NULL,
//    last_name  VARCHAR(20) default NULL,
//    Batting_Avg     DOUBLE  default NULL,
//    Batting_Class VARCHAR(20) default NULL,
//    PRIMARY KEY (id)
//);
//
//
//    <?xml version="1.0" encoding="utf-8"?>
//<!DOCTYPE hibernate-mapping PUBLIC
// "-//Hibernate/Hibernate Mapping DTD//EN"
//         "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
//
//<hibernate-mapping>
//   <class name="Player" table="Player">
//      <meta attribute="class-description">
//    This class contains the employee detail.
//      </meta>
//      <id name="id" type="int" column="id">
//         <generator class="native"/>
//      </id>
//      <property name="Fname" column="first_name" type="string"/>
//      <property name="Lname" column="last_name" type="string"/>
//      <property name="BattAvg" column="Batting_Avg" type="double"/>
//      <property name="BattClass" column="Batting_Class" type="string"/>
//    </class>
//</hibernate-mapping>
//
//
//
//
//    private static SessionFactory Bobcats;
//    public static void main(String[] args) {
//        try{
//            Bobcats = new Configuration().configure().buildSessionFactory();
//        }catch (Throwable ex) {
//            System.err.println("Failed to create sessionFactory object." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//        ManagePlayer ME = new ManagePlayer();
//
//      /* Add few employee records in database */
//        Integer PlID1 = ME.addEmployee("Zara", "Ali", 1000);
//        Integer PlID2 = ME.addEmployee("Daisy", "Das", 5000);
//        Integer PlID3 = ME.addEmployee("John", "Paul", 10000);
//
//      /* List down all the employees */
//        ME.listEmployees();
//
//      /* Update employee's records */
//        ME.updateEmployee(empID1, 5000);
//
//      /* Delete an employee from the database */
//        ME.deleteEmployee(empID2);
//
//      /* List down new list of the employees */
//        ME.listEmployees();
//    }
//    /* Method to CREATE an employee in the database */
//    public Integer addEmployee(String fname, String lname, int salary){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        Integer employeeID = null;
//        try{
//            tx = session.beginTransaction();
//            Employee employee = new Employee(fname, lname, salary);
//            employeeID = (Integer) session.save(employee);
//            tx.commit();
//        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return employeeID;
//    }
//    /* Method to  READ all the employees */
//    public void listEmployees( ){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        try{
//            tx = session.beginTransaction();
//            List employees = session.createQuery("FROM Employee").list();
//            for (Iterator iterator =
//                 employees.iterator(); iterator.hasNext();){
//                Employee employee = (Employee) iterator.next();
//                System.out.print("First Name: " + employee.getFirstName());
//                System.out.print("  Last Name: " + employee.getLastName());
//                System.out.println("  Salary: " + employee.getSalary());
//            }
//            tx.commit();
//        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//    }
//    /* Method to UPDATE salary for an employee */
//    public void updateEmployee(Integer EmployeeID, int salary ){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        try{
//            tx = session.beginTransaction();
//            Employee employee =
//                    (Employee)session.get(Employee.class, EmployeeID);
//            employee.setSalary( salary );
//            session.update(employee);
//            tx.commit();
//        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//    }
//    /* Method to DELETE an employee from the records */
//    public void deleteEmployee(Integer EmployeeID){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        try{
//            tx = session.beginTransaction();
//            Employee employee =
//                    (Employee)session.get(Employee.class, EmployeeID);
//            session.delete(employee);
//            tx.commit();
//        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//    }
//}}