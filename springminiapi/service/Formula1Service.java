package com.natwest.springminiapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.springminiapi.domain.Formula1;
import com.natwest.springminiapi.repo.F1Repo;

@Service
public class Formula1Service {

	private F1Repo repo;
	
	public Formula1Service(F1Repo repo) {
		this.repo = repo;
	}
	
	public Formula1 create(Formula1 f1) {
		return this.repo.saveAndFlush(f1);
		
	}
	
	public List<Formula1> read() {
		return this.repo.findAll();
		
	}
	
	public Formula1 update(Long id, Formula1 newf1) {
		Formula1 existing = this.repo.getById(id);
		existing.setCountry(newf1.getCountry());
		existing.setTrackName(newf1.getTrackName());
		existing.setTrackLength(newf1.getTrackLength());
		existing.setStreetTrack(newf1.isStreetTrack());
		existing.setNoOfLaps(newf1.getNoOfLaps());
		existing.setRating(newf1.getRating());
	
		Formula1 updated = this.repo.save(existing);
		return updated;
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
	
}
