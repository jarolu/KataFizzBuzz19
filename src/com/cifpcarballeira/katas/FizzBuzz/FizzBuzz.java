/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author janeiro
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int i){      
      String cadenaI=i+"";
      if(cadenaI.contains("3")) return "Fizz";
      if (i%3==0 && i%5==0) return "FizzBuzz";
      if(i%3 == 0) return "Fizz";
      if (i%5 == 0) return "Buzz";
      return i+"";
    }
    
}
