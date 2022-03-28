package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotencialTest {

  private Potencial potencial;

  @Before
  public void setUp() throws Exception {
    this.potencial = new Potencial();
  }

  @After
  public void tearDown() throws Exception {
    this.potencial = null;
  }

  @Test public void test1()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(12, 0);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test2()
  {
    final double expected =  Double.MAX_VALUE;
    final double result = this.potencial.apply(0, 12);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test3()
  {
    final double expected =  Double.MAX_VALUE;
    final double result = this.potencial.apply(0, -1);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test4()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(-12, 0);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test5()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(10, 0);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test6()
  {
    final double expected =  0.00001;
    final double result = this.potencial.apply(10, -5);
    assertEquals(expected, result, 0.00001);
  }

  @Test public void test7()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(1, 120);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test8()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(-1, 120);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test9()
  {
    final double expected =  1.0e10;
    final double result = this.potencial.apply(10, 10);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test10()
  {
    final double expected =  169.0;
    final double result = this.potencial.apply(-13, 2);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test11()
  {
    final double expected =  248832.0;
    final double result = this.potencial.apply(12, 5);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test12()
  {
    final double expected =  -62748517.0;
    final double result = this.potencial.apply(-13, 7);
    assertEquals(expected, result, 0.1);
  }

  @Test public void test13()
  {
    final double expected =   0.008;
    final double result = this.potencial.apply(5, -3);
    assertEquals(expected, result, 0.001);
  }

  @Test public void test14()
  {
    final double expected =  0.25;
    final double result = this.potencial.apply(-2, -2);
    assertEquals(expected, result, 0.01);
  }

  @Test public void test15()
  {
    final double expected =  0.03125;
    final double result = this.potencial.apply(2, -5);
    assertEquals(expected, result, 0.00001);
  }

  @Test public void test16()
  {
    final double expected =  -0.0078125;
    final double result = this.potencial.apply(-2, -7);
    assertEquals(expected, result, 0.0000001);
  }

  @Test public void test17()
  {
    final double expected =  1.0;
    final double result = this.potencial.apply(0, 0);
    assertEquals(expected, result, 0.1);
  }
}