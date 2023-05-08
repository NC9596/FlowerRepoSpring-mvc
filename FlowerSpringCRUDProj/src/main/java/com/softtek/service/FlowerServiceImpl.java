package com.softtek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.entity.Flower;
import com.softtek.repository.FlowerRepository;

@Service
public class FlowerServiceImpl implements FlowerService{
	
	@Autowired
	private FlowerRepository repo;

	@Override
	public Integer saveFlower(Flower objectOfFlower) {
		return repo.save(objectOfFlower).getid();
	}

	@Override
	public Flower updateFlower(Flower objectOfFlower) {
		return repo.save(objectOfFlower);
	}
	
	@Override
	public void deleteFlower(int id) {
			repo.deleteById(id);
	}
	
	@Override
	public Flower getOneFlower(int id) {
		Optional<Flower> objectOfFlowergt = repo.findById(id);
		if(objectOfFlowergt.isPresent())
		{
			return objectOfFlowergt.get();
		}
		else return null;
	} 

	@Override
	public List<Flower> getAllFlowers() {
		return repo.findAll();
	}

}
