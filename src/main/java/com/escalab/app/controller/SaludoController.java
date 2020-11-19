package com.escalab.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.escalab.app.model.Order;

@RestController
public class SaludoController {

	@GetMapping("/saludo/clase")
	public String saludarClase() {
		return "Hola Clase =) ";
	}
	
	@GetMapping(value = "/saludo/otro")
	public String saludoOtro() {
		return " Otro saludo para la clase";
	}
	
	@PostMapping("/saludo/clase")
	public String guardarSaludo() {
		return "Saludo guardado";
	}
	
	@PostMapping(value = "/saludo/otro")
	public String guardarOtroSaludo(@RequestBody String pruebaSaludo) {
		return pruebaSaludo;
	}
	
	@GetMapping("/saludo/param")
	public String getRequestParam(@RequestParam("saludo") String saludo) {
		return saludo;
	}
	
	@GetMapping("xs/{saludo}")
	public String requestPathVariable(@PathVariable("saludo") String saludo) {
		return saludo;
	}
	
	@PostMapping(value = "/guardar/orders")
	public @ResponseBody Order guardarOrder(@RequestBody Order order) {
		return order;
	}
}
