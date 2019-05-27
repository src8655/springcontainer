package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

@Configuration
@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem","com.cafe24.springcontainer.soundsystem2"})	//이렇게 사용해도 된다.
//@ComponentScan(basePackageClasses=Index.class)	//basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package로 사용 (Marker Interface)
//@Bean을 만들 필요 없다
//com.cafe24.springcontainer.soundsystem 패키지 안에 @Component를 찾는다
public class CDPlayerConfig {

}
