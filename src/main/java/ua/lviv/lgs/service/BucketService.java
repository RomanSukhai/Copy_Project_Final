package ua.lviv.lgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.BucketRepository;
import ua.lviv.lgs.domain.Bucket;

@Service
public class BucketService {

	@Autowired
	private BucketRepository bucketRepository;

	public List<Bucket> getAll() {
		return bucketRepository.findAll();
	}

	public void delete(Bucket bucket) {
		bucketRepository.delete(bucket);
	}

	public Bucket add(Bucket bucket) {
		return bucketRepository.save(bucket);
	}
}
