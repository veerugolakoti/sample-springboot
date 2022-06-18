package com.codexbox.springboot.main;

import com.codexbox.springboot.assement5.CustomerInsertdata;
import com.codexbox.springboot.assement5.CustomerPurchasedetailes;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CustomerInsertdata customerInsertdata = new CustomerInsertdata();
            customerInsertdata.getCustomerHistory();


//        CustomerPurchasedetailes customerPurchasedetailes = new CustomerPurchasedetailes();
//        customerPurchasedetailes.getCustmerDetailes();

//        List<Integer> list = new ArrayList<Integer >();
//        list.add(101);
//        list.add(201);
//        list.add(301);
//        list.add(401);
//        list.add(501);
//        list.add(601);
//        list.add(701);
//        list.add(801);
//        list.add(901);
//        list.add(111);
//        list.add(151);
//        list.add(131);
//        list.add(121);
//        list.add(161);
//        list.add(191);
//        list.add(181);
//        list.add(171);
//        list.add(141);
//        for (Integer then :list) {
//        for (int i = 0; i <= 5; i++) {
//
//
//            Threadpool threadpool = new Threadpool();
//            ExecutorService es = Executors.newFixedThreadPool(5);
//            es.execute(threadpool);
////
//
//            es.shutdown()
//        JdbcExample2 jdbcExample2 = new JdbcExample2();
//        jdbcExample2.getPreparedStatement();

//        List<Employee> list = jdbcExample.getEmployeeDeatiles();
//        for (Employee emp :list) {
//            System.out.println(emp.getEmpid());
//            System.out.println(emp.getEmpname());
//        }

//        CustomerInsertdata customerPurchase = new CustomerInsertdata();
//        customerPurchase.getCustomerHistory();


    }
}

