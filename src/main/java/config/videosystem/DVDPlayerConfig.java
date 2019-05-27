package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}

	// 주입하기1
	// @Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer(avengers());
	}
	
	// 주입하기2	//매개변수로 두면 autowired처럼 만들어진 Bean에서 주입이 됨
	//@Bean
	public DVDPlayer dvdPlayer2(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입하기3	별로 추천X
	//@Bean
	@Bean(name="dvdPlayer3")
	public DVDPlayer dvdPlayer3(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDigitalVideoDisc(dvd);
		return player;
	}
	
	// 주입하기4	//매개변수로 두면 autowired처럼 만들어진 Bean에서 주입이 됨
	//@Bean
	@Bean(name="dvdPlayer4")
	public DVDPlayer dvdPlayer4() {
		return new DVDPlayer(avengers());
	}
	
	
}
