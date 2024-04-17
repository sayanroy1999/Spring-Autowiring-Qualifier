package com.example.demo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

        //Autowiring by property
          @Autowired
          @Qualifier("temp2")
        private Address address;

        //Autowiring by setter method
        //2) @Autowired
        public void setAddress(Address address) {
        System.out.println("Setting values");
        this.address = address;
    }

    public Emp() {
    }

        //3) Autowiring using constructor
   // @Autowired
    public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

        @Override
        public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }


}
