package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Explicit Configuration - XML Config
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;

	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd5;
	

	@Autowired
	@Qualifier("avengersExpansionPack")
	private DigitalVideoDisc dvd8;

	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DigitalVideoDisc dvd9;
	

	@Autowired
	@Qualifier("avengersExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer player2;

	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player3;

	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer player4;

	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer player5;


	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}

	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=Avengers Infinity War, studio=MAVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=Avengers Endgame, studio=MAVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=Avengers Age Of Ultron, studio=MAVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	

	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack, studio=MAVEL, actors=[1, 2, 3]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MAVEL, actors=[1, 2, 3]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=Avengers Expansion Pack3, studio=MAVEL, actors=[1, 2, 3]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	

	@Test
	public void testPlayer2Null() {
		assertNotNull(player2);
	}

	@Test
	public void testPlayer3Null() {
		assertNotNull(player3);
	}

	@Test
	public void testPlayer4Null() {
		assertNotNull(player4);
	}

	@Test
	public void testPlayer5Null() {
		assertNotNull(player5);
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL\'s IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie MARVEL\'s IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie MARVEL\'s IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}