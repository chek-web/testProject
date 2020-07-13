package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] list = {"ramu","ramesh"};
        String[] checked = {"ramu"};
         
        ArrayList<String> ar = new ArrayList<String>();
        String[] newArray;  
        /*for(int i = 0; i < list.length; i++) {
             for(int j = 0; j < checked.length; j++){
            	  System.out.println("value checked::::"+list[i]);
            if(checked.length !=0){
            	  if(list[i]==checked[j]){
            		  newArray=new String[0];
            	  } else {
            		  ar.add(checked[i]);
            	  }
            }  
             }
        }
        
        newArray=ar.toArray(new String[ar.size()]);
        System.out.println("string value:::"+ar.size());
        System.out.println("string value1111::"+newArray.length);*/
        String approvedPkgList[];
    	boolean disContinuedPkgFlag=false;
    		for ( int i = 0; i < list.length; i++ ) {
    			disContinuedPkgFlag = false;
    			for ( int j = 0; j < checked.length; j++ ) {
    				if ( list[i] == checked[j] ){
    					disContinuedPkgFlag = true;
    					break;
    				}
    			}
    			if(!disContinuedPkgFlag) 
    				ar.add(list[i]);
    		} 
    		approvedPkgList=ar.toArray(new String[ar.size()]);
            System.out.println("string value:::"+ar.size());
            System.out.println("string value1111::"+approvedPkgList[0]);
}
}
