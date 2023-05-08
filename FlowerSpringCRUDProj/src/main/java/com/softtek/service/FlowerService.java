package com.softtek.service;

import java.util.List;

import com.softtek.entity.Flower;

public interface FlowerService {

	public Integer saveFlower(Flower objectOfFlower);
	public Flower updateFlower(Flower objectOfFlower);
	public void deleteFlower(int id);
	public Flower getOneFlower(int id);
	public List<Flower> getAllFlowers();
	
}
