package com.netwizard.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Rayulu Vemula
 *
 */
public class RequestConstans {

	public static final String MONGO_TEMPLATE = "mongoTemplate";

	public interface PAGE {
		public static final String DASHBOARD = "dashboard";
		public static final String INDEX = "index";
		public static final String WELCOMEBOARD = "welcomeboard";
		public static final String SURVEY = "survey";
		public static final String REPORTS = "reports";
		public static final String PREFERENCES = "preferences";
		public static final String USERMANAGEMENT = "usermanagement";
	}

	public interface Anonymous {
		public static final String ANONYMOUS_USER = "anonymousUser";
	}

	public interface Password {
		public static final String DEFAULT_PASSWORD = "Care$123";
	}

	public interface Agency {
		public static final String AGENCY_NAME = "Spirit Home Healthcare";
	}

	public interface Home {
		public static final String WELCOME = "welcometodashboards";
		public static final String HOME_PAGE = "homePage";
		public static final String My_HOME = "myhome";
	}

	public interface Commonfields {
		public static final String FIRSTNAME = "firstName";
		public static final String LASTNAME = "lastName";
		public static final String PROFILEPIC = "profilepic";
		public static final String ROLE = "role";
	}

	public interface Collections {
		public static final String COLLECTION_GROUP = "assignGroup";
		public static final String COLLECTION_DEPARTMENT = "department";
		public static final String COLLECTION_CATEGORY = "category";
		public static final String COLLECTION_SURVEY = "survey";
		public static final String COLLECTION_USERS = "users";
		public static final String COLLECTION_CARE_LOG_BEAN = "careLogBean";
		public static final String COLLECTION_CARE_GIVER = "careGiver";
		public static final String COLLECTION_MEMBER = "member";
		public static final String COLLECTION_KUDO = "kudo";
		public static final String COLLECTION_COMMUNITY = "communityPost";
		public static final String COLLECTION_COMMUNITY_VENDOR = "vendor";
		public static final String COLLECTION_COMMUNITY_TASKS = "tasks";
	}

	public interface Roles {
		public static final String ROLE_ADMIN = "ROLE_ADMIN";
		public static final String ROLE_VENDOR = "ROLE_VENDOR";
		public static final String ROLE_USER = "ROLE_USER";
		public static final String ROLE_MEMBER = "member";
	}

	public interface Images {
		public static final String LOGO_IMAGE = "../" + "/resources/images/logo.png";
		public static final String FOOTER_IMAGE_URL = "../" + "/resources/images/logo_icon.png";
		public static final String BELL_ICON_IMAGE_URL = "../" + "/resources/images/bell_icon.png";
		public static final String LOGIN_NW_BTN_IMAGE_URL = "../" + "/resources/images/login_nw_btn.png";
		public static final String CARE_HEROS_LOGOIMAGEURL = "../" + "/resources/images/care_heros_logo.png";
		public static final String HEART_ICONIMAGEURL = "../" + "/resources/images/heart_icon.png";
		public static final String NEED_CARE_ICONIMAGEURL = "../" + "/resources/images/need_care_icon.png";
		public static final String WAITING_ICONIMAGEURL = "../" + "/resources/images/waiting_icon.png";
		// public static final String ="../"+"";

	}

	public static Map<String, Object> imagesUtils(HttpServletRequest req) {
		Map<String, Object> map = new HashMap<String, Object>();
		String applicationPath = null;
		applicationPath = null;
		/*
		 * String logoUrl = "http://" + applicationPath + Images.LOGO_IMAGE; String
		 * loginUrl = "http://" + applicationPath ; String footerImageurl = "http://" +
		 * applicationPath +Images.FOOTER_IMAGE_URL; String bell_IconImageurl =
		 * "http://" + applicationPath + Images.BELL_ICON_IMAGE_URL; String
		 * login_nw_btnImageurl = "http://" + applicationPath +
		 * Images.LOGIN_NW_BTN_IMAGE_URL;
		 * 
		 * String care_heros_logoImageurl = "http://" + applicationPath +
		 * "/resources/images/care_heros_logo.png"; String heart_iconImageurl =
		 * "http://" + applicationPath + "/resources/images/heart_icon.png"; String
		 * need_care_iconImageurl = "http://" + applicationPath +
		 * "/resources/images/need_care_icon.png"; String waiting_iconImageurl =
		 * "http://" + applicationPath + "/resources/images/waiting_icon.png";
		 */

		String logoUrl = "../" + Images.LOGO_IMAGE;
		String loginUrl = "../" + applicationPath;
		String footerImageurl = "../" + applicationPath + Images.FOOTER_IMAGE_URL;
		String bell_IconImageurl = "../" + applicationPath + Images.BELL_ICON_IMAGE_URL;
		String login_nw_btnImageurl = "../" + applicationPath + Images.LOGIN_NW_BTN_IMAGE_URL;

		String care_heros_logoImageurl = "../" + applicationPath + "/resources/images/care_heros_logo.png";
		String heart_iconImageurl = "../" + applicationPath + "/resources/images/heart_icon.png";
		String need_care_iconImageurl = "..//" + applicationPath + "/resources/images/need_care_icon.png";
		String waiting_iconImageurl = "../" + applicationPath + "/resources/images/waiting_icon.png";

		map.put("loginUrl", loginUrl);
		map.put("logoUrl", logoUrl);
		map.put("loginUrl", loginUrl);

		// logo_icon.png =footerImageurl
		map.put("footerImageurl", footerImageurl);
		map.put("bell_IconImageurl", bell_IconImageurl);
		map.put("login_nw_btnImageurl", login_nw_btnImageurl);
		map.put("care_heros_logoImageurl", care_heros_logoImageurl);
		map.put("heart_iconImageurl", heart_iconImageurl);
		map.put("need_care_iconImageurl", need_care_iconImageurl);
		map.put("waiting_iconImageurl", waiting_iconImageurl);

		return map;

	}

	public static UserDetails getLogInUserDetails(String source) {
		return null;
	}

}
