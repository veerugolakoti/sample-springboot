package com.codexbox.springboot.app.vamshi.collections;

public  class Employee {
        public String name;
        public String address;
        public Integer IdNo;
    public Employee(String IdNo, String name, String address) {
            this.IdNo = Integer.valueOf(IdNo);
            this.name = name;
            this.address = address;
        }
    }




