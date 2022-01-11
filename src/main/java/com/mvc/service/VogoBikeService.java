package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dal.VogoBikeDal;
import com.mvc.entity.VogoBike;

@Service
public class VogoBikeService {
	@Autowired
	private VogoBikeDal bikeDal;

	public List<VogoBike> getBikeDetails() {
		List<VogoBike> listBikes = bikeDal.fetchVogoBikeDetails();
		return listBikes;
	}
}
