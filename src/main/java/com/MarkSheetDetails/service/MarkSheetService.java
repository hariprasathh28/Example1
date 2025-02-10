package com.MarkSheetDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarkSheetDetails.dao.MarkSheetDao;
import com.MarkSheetDetails.entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;
	public String post(List<MarkSheet>m) {
		m.forEach(x->{
			x.setSem1total(x.getSem1theory()+x.getSem1practicals());
			x.setSem2total(x.getSem2theory()+x.getSem2practicals());
		});
		return md.post(m);
	}
	public List<MarkSheet> get() {
		return md.get();
	}

}
