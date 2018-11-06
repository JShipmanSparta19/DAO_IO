package com.sparta.jas;

import com.sparta.jas.Model.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.getEmployee("90");
    }
}
