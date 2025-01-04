package com.ting.restaurant.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantDTO {
	private Long id;
	private String name;
	private String location;
	private Double rating;
	private List<MenuDTO> menuItems;
}
