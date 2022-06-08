package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

public class DuplicateArray {
    public static void main(String [] args){
            int [] a = {1,2,3,2,1,2};
            int [] b ;
            for(int i=0;i<a.length;i++){
                for (int j=0;j<a.length;j++){
                    if(a[i]!=a[j+1]){
//                       a[i]=b[i];
                    }

                }
            }
    }
}
