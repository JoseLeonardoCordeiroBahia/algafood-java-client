package com.algaworks.algafood.client.api;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.algaworks.algafood.client.model.RestaurantResumoModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RestauranteClient {

	private static final String RESOURCE_PATH = "/restaurantes";
	
	private RestTemplate restTemplate;
	private String url;
	
	public List<RestaurantResumoModel> listar() {
		URI resourceUri = URI.create(url + RESOURCE_PATH);
		
		RestaurantResumoModel[] restaurantes = restTemplate
				.getForObject(resourceUri, RestaurantResumoModel[].class);
		
		return Arrays.asList(restaurantes);
	}
	
}
