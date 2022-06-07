package com.codexbox.springboot.app.TejaAravind;

public enum EnumsPractice {

        SUMMER("Semester started in summer"),
        WINTER("Semester started in winter"),
        SPRING("Semester started in Spring"),
        FALL("Semester started in Fall");

        String value;

        public String getValue() {
                return value;
        }

        EnumsPractice (String str){
                this.value = str;

        }

        public static void main(String[] args) {
                EnumsPractice ep = EnumsPractice.SPRING;
                System.out.println(ep);

        }


}


