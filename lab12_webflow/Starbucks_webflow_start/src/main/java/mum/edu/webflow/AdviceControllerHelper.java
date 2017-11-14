package mum.edu.webflow;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.repository.AdviceRepository;
import mum.edu.service.AdviceService;

@Component
public class AdviceControllerHelper {
	 @Autowired
	AdviceRepository adviceRepository;
	 

	public Map<Integer, String> getAllRoasts() {
		return adviceRepository.getAllRoasts();
	}

	public String getRoastByKey(Integer roastKey) {
		return adviceRepository.getRoast(roastKey);
	}

	public List<String> getAdvices(Integer roastKey) {
		return adviceRepository.getListByType(adviceRepository.getRoast(roastKey));
	}

}
