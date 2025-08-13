package com.example.packagetwo;

import com.example.packageone.Base;

public class Executor {

        public static void main(String[] args) {
                Base b=new Base();
                b.varPublic=12;
                b.methodPublic();
        }
}