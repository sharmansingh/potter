package com.potter.game.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.potter.game.PotterGame;

public class PotterGameTest {

	PotterGame pg =null;
	List ls =null;

	@Before
	public void setUp() throws Exception {
		pg=new PotterGame();
	}

	@After
	public void tearDown() throws Exception {
		ls = null;
		pg=null;
	}

	

	@Test
	public void testCalculatePrices1() {
		ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(1);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	}

	@Test
	public void testCalculatePrices2() {
		ls=new ArrayList<Integer>();
		ls.add(2);
		ls.add(2);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	}

	@Test
	public void testCalculatePrices3() {
		ls=new ArrayList<Integer>();
		ls.add(3);
		ls.add(3);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	}

	@Test
	public void testCalculatePrices4() {
		ls=new ArrayList<Integer>();
		ls.add(4);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	}

	@Test
	public void testCalculatePrices5() {
		ls=new ArrayList<Integer>();
		ls.add(5);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	
	
	}
	@Test
	public void testCalculatePrices() {
		ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(1);
		ls.add(2);
		ls.add(2);
		ls.add(3);
		ls.add(3);
		ls.add(4);
		ls.add(5);

		pg.calculatePrices(ls);
		assertNotNull(pg);
	}

}
