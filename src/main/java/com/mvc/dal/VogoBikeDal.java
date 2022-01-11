package com.mvc.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.entity.VogoBike;

@Repository
public class VogoBikeDal {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final static String VOGOBIKE_QUER = "SELECT * FROM SKVOGO";

	public List<VogoBike> fetchVogoBikeDetails() {

		List<VogoBike> vogoBikes = jdbcTemplate.query(VOGOBIKE_QUER, (rs, count) -> {

			VogoBike vogoBike = new VogoBike();
			vogoBike.setVogo_id(rs.getInt(1));
			vogoBike.setBike_number(rs.getString(2));
			vogoBike.setCompany_name(rs.getString(3));
			vogoBike.setBike_cost(rs.getDouble(4));
			return vogoBike;
		});

		return vogoBikes;
	}
}
