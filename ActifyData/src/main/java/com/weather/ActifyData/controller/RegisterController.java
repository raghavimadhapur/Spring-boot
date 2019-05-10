package com.weather.ActifyData.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weather.ActifyData.entity.Output;
import com.weather.ActifyData.entity.RegisterEntity;
import com.weather.ActifyData.entity.Weather;
import com.weather.ActifyData.repository.RegisterRepository;

@RestController
@RequestMapping("/api")
public class RegisterController {

	public RegisterController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private RegisterRepository repository;

	@PostMapping
	public ResponseEntity<RegisterEntity> create(@RequestBody RegisterEntity entity) {
		return ResponseEntity.ok(repository.save(entity));
	}

	@GetMapping("/{email}")
	public ResponseEntity<RegisterEntity> get(@PathVariable String email) {
		Optional<RegisterEntity> option = repository.findById(email);
		if (!option.isPresent()) {
			System.out.println("email " + email + " is not existed");
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(option.get());
	}
	@PostMapping("/login")
	public ResponseEntity<RegisterEntity> login(@RequestBody RegisterEntity loginEntity) {
		System.out.println(loginEntity);
		String email =loginEntity.getEmail();
		RegisterEntity entity=repository.findByEmailAndPassword(loginEntity.getEmail(),loginEntity.getPassword() );
		System.out.println(entity);
		if(entity==null)
		{
			System.out.println("email " + email + " is not existed");
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(entity);
	}
	
	@GetMapping("/weather")
	public Output m1(@RequestParam("latitude") Double latitude,@RequestParam("longitude")  Double longitude )
	{	Double lat =latitude,longit=longitude;
		RestTemplate restTemplate=new RestTemplate();
		String url ="http://fcc-weather-api.glitch.me/api/current?lat="+lat+"&lon="+longit;
		System.out.println(url);
		Weather w= restTemplate.getForObject(url, Weather.class);
		Output output=new Output();
		output.setCityName(w.getName());
		output.setCountry(w.getSys().getCountry());
		output.setHumidity(w.getMain().getHumidity());
		output.setWindSpeed(w.getWind().getSpeed());
		return output;
	}
}
