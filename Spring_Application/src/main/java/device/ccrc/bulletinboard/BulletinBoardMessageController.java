package device.ccrc.bulletinboard;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/device/bulletinboard")
public class BulletinBoardMessageController {
	private static Logger exception =LogManager.getLogger("Exception");
	@GetMapping
	public JSONObject getMessage() {
		exception.error("LOG SUCCESS!!!!!!!!!!!!");
		exception.debug("!!!LOG SUCCESS!!!!!!!!!!!!");
		exception.warn("#$$$$$LOG SUCCESS!!!!!!!!!!!!");
		JSONObject obj=new JSONObject();
		obj.put("Name","Sanjay");
		return obj;
	}
}
