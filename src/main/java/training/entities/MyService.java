package training.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
	private DataService dataService;

    @Autowired(required = false)
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return this.dataService;
	}

	// Other methods using dataService
}