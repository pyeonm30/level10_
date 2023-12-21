package _11콜렉션Member;

import java.util.HashMap;
import java.util.Map;

public class Controller {
	private Controller() {
		init();
	}

	private static Controller instance = new Controller();

	public static Controller getInstance() {
		return instance;
	}

	private Map<String, Action> mapList;

	private void init() {
		mapList = new HashMap<>();
		mapList.put("insert", new ActionInsert());
		mapList.put("delete", new ActionDelete());
		mapList.put("update", new ActionUpdate());
		mapList.put("selectAll", new ActionSelectAll());
	}

	public Action getAction(String key) {
		return mapList.get(key);
	}
}
