package com.cifpcarballeira.katas.FizzBuzz.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janeiro
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

    @Test
    public void test1devuelve1() {
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(1);
       assertEquals("1", resultado);
    }
    @Test
    public void test2devuelde2 (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(2);
       assertEquals("2", resultado); 
    }
    @Test
    public void test3devueldeFizz (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(3);
       assertEquals("Fizz", resultado); 
    }
    @Test
    public void test5devueldeBuzz (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(5);
       assertEquals("Buzz", resultado); 
    }
    @Test
    public void test15devueldeFizzBuzz (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(15);
       assertEquals("FizzBuzz", resultado); 
    }
    @Test
    public void test13devueldeFizz (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(13);
       assertEquals("Fizz", resultado); 
    }

    @Test
    public void test59devueldeBuzz (){
       FizzBuzz fb = new FizzBuzz();
       String resultado = fb.getFizzBuzz(59);
       assertEquals("Buzz", resultado); 
    }
}
