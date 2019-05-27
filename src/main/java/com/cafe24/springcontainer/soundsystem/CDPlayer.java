package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	// 와이어링1
	// @Autowired
	private CompactDisc cd;
	
	public CDPlayer() {
		System.out.println("--->");
	}
	
	
	// 와이어링2(생성자를 사용)
	//@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	// 와이어링3(setter를 사용)
	//@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}

	// 와이어링4(setter가 아니라 일반메소드도 가능하다)
	@Autowired
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}

}
