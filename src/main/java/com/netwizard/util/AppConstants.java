package com.netwizard.util;

public class AppConstants {
	public static final String GET_CARE_ACTIVITIES_CARE_TYPE = "all";
	public static final int SUCCESSCODE = 0;
	public static final int ERRORCODE = 1;
	public static final int SESSION_INVALID_CODE = 2;
	public static final String USER = "USER";
	public static final String PAID_CAREGIVER = "PAID_CAREGIVER";
	public static final String MEMBER = "MEMBER";
	public static final String REPORT = "Report";
	public static final Object CASEMANAGER = "CASEMANAGER";
	public static final Object ACCEPT_PAID_CAREGIVER = "ACCEPT_PAID_CAREGIVER";

	public static final String EMAIL_FROM = "contact@careheroes.co";

	public static final String JSON = "application/json";
	public static final String SPACE = " ";
	public static final String MONGO_TEMPLATE = "mongoTemplate";
	public static final String USER_NOT_LOGIN = "NOT_LOGIN";

	public static final String ADDCAREGIVER = "ACCOUNT_CREATION";
	public static final String FORGETPASSWORD = "FORGET_PASSWORD";

	public static final String CHANGE_PASSWORD = "CHANGE_PASSWORD";
	public static final String RESETPASSWORD = "RESET_PASSWORD";

	public static final String ACCOUNTLOCKED = "ACCOUNT_LOCKED";

	public static final String NEWNOTIFICATION = "NEW_NOTIFICATION";

	public static final String NEW_MEMBER_ASSIGNMENTS = "NEW_MEMBER_ASSIGNMENTS";

	public static final String NEW_MEMBER_ASSIGNMENTS_REMINDER2 = "NEW_MEMBER_ASSIGNMENTS_REMINDER2";
	public static final String NEW_MEMBER_ASSIGNMENTS_REMINDER1 = "NEW_MEMBER_ASSIGNMENTS_REMINDER1";
	public static final String NEW_MEMBER_ASSIGNMENTS_FINAL_REMINDER = "NEW_MEMBER_ASSIGNMENTS_FINAL_REMINDER";
	public static final String AUTO = "AUTO_GENERATED";	
	
	

	public enum ERROR {

		/*CONTROLLER */

		//CASEMANAGER
		REST_CASEMANAGER_CONTROLLER_GETMEMBERS_ERROR("C-101", "Unknown error while getting members"),
		REST_CASEMANAGER_CONTROLLER_GETCAREACTIVITIES_ERROR("C-102", "Unknown error while getting getCareActivies"),
		REST_CASEMANAGER_CONTROLLER_GETCAREREPORTS_ERROR("C-103", "Unknown error while getting getCareReportsbyCareType"),
		REST_CASEMANAGER_CONTROLLER_GET_CASEMANAGER_PROFILE_ERROR("C-121", "Unknown error while getting CaseManagerProfile"),
		REST_CASEMANAGER_CONTROLLER_GET_SEARCHMEMBERS_ERROR("C-104", "Unknown error while getting getSearchMembers"),
		REST_CASEMANAGER_CONTROLLER_GET_REPORTSSEARCH_ERROR("C-105", "Unknown error while getting getReportsSearch"),
		REST_CASEMANAGER_CONTROLLER_GET_CASEMANAGER_MEMBER_UPDATES_ERROR("C-122", "Unknown error while getting CaseManager member updates"),
		REST_CASEMANAGER_CONTROLLER_GET_REPORT_SEARCH_ERROR("C-123", "Unknown error while getting getReportsSearch"),
		REST_CASEMANAGER_CONTROLLER_GET_CASEMANAGER_PROFILE_UPDATE_ERROR("C-163", "Unknown error while getting CaseManagerProfile Update"),



		//COMMON CONTROLLER
		REST_COMMON_CONTROLLER_GET_NOTIFICATIONSCOUNT_ERROR("C-106", "Unknown error while getting getNotificationsCount"),
		REST_COMMON_CONTROLLER_GET_MESSAGESCOUNT_ERROR("C-107", "Unknown error while getting getMessagesCount"),
		REST_COMMON_CONTROLLER_GET_ALLTASKS_ERROR("C-108", "Unknown error while getting getAllTasks"),
		REST_COMMON_CONTROLLER_VIEW_REPORTSARCHIVE_ERROR("C-109", "Unknown error while getting viewReportsArchive"),
		REST_COMMON_CONTROLLER_GET_NOTIFICATIONS_ERROR("C-110", "Unknown error while getting getNotifications"),
		REST_COMMON_CONTROLLER_GET_MESSAGES_ERROR("C-111", "Unknown error while getting getMessages"),
		REST_COMMON_CONTROLLER_GET_MEMBERDETAILS_ERROR("C-112", "Unknown error while getting getMemeberDetailsById"),
		REST_COMMON_CONTROLLER_SENDMESSAGE_ERROR("C-113", "Unknown error while getting sendMessage"),
		REST_COMMON_CONTROLLER_GET_ALLTASKNAMES_ERROR("C-114", "Unknown error while getting getAllTaskNames"),
		REST_COMMON_CONTROLLER_GET_COMMENTTOCARELOGPOST_ERROR("C-159", "Unknown error while getting commenttoCareLogPost"),
		REST_COMMON_CONTROLLER_GET_LIKETOCARELOGPOST_ERROR("C-160", "Unknown error while getting liketoCareLogPost"),
		REST_COMMON_CONTROLLER_GET_RECENTCHATS_ERROR("C-161", "Unknown error while getting recentchatList"),
		REST_COMMON_CONTROLLER_GET_GETCHAT_ERROR("C-162", "Unknown error while getting chatrelated information"),
		REST_COMMON_CONTROLLER_GET_ALL_USERS_ERROR("C-172", "Unknown error while getting all user details"),
		REST_COMMON_CONTROLLER_GET_RECENTNOTIFICATIONS_ERROR("C-173", "Unknown error while getting recent notifications"),
		REST_COMMON_CONTROLLER_GET_MEMBER_CARELOG_ERROR("C-136", "Unknown error while getting member care log details"),
		REST_COMMON_CONTROLLER_ARCHIVE_REPORT_ERROR("C-143", "Unknown error while getting archive report status"),
		REST_COMMON_CONTROLLER_GET_CARELOG_BEAN_BYID_ERROR("C-165", "Unknown error while getting carelog bean by id"),
		REST_COMMON_CONTROLLER_GET_MEMBER_DETAILS_ERROR("C-135", "Unknown error while getting member details"),
		REST_COMMON_CONTROLLER_UPDATE_CAREGIVER_ERROR("C-140", "Unknown error while update caregiver"),


		//VENDOR
		REST_VENDOR_CONTROLLER_GET_SEARCH_CAREGIVERS_ERROR("C-115", "Unknown error while getting searching careGivers"),
		REST_VENDOR_CONTROLLER_GET_SEARCH_MEMBERS_ERROR("C-116", "Unknown error while getting searching members"),
		REST_VENDOR_CONTROLLER_GET_REPORT_SEARCH_ERROR("C-117", "Unknown error while getting Report Search"),
		REST_VENDOR_CONTROLLER_GETCAREACTIVITIES_ERROR("C-118", "Unknown error while getting getCareActivies"),
		REST_VENDOR_CONTROLLER_GETCAREREPORTS_ERROR("C-119", "Unknown error while getting getCareReportsbyCareType"),
		REST_VENDOR_CONTROLLER_GETMEMBERS_ERROR("C-120", "Unknown error while getting members"),

		//COMMUNITY
		REST_COMMUNITY_CONTROLLER_SUBMIT_POST_BY_PAID_CAREGIVER_ERROR("C-124", "Unknown error while submit post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_GET_TRENDING_POST_BY_PAID_CAREGIVER_ERROR("C-125", "Unknown error while getting trending post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_GET_INTRESTING_POST_BY_PAID_CAREGIVER_ERROR("C-126", "Unknown error while getting intresting people by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_COMMENT_TO_POST_BY_PAID_CAREGIVER_ERROR("C-127", "Unknown error while comment to post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_LIKE_TO_POST_BY_PAID_CAREGIVER_ERROR("C-128", "Unknown error while like to post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_SEARCH_POST_BY_PAID_CAREGIVER_ERROR("C-129", "Unknown error while search post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_ADD_FOLLOWING_BY_PAID_CAREGIVER_ERROR("C-130", "Unknown error while add following post by paid caregiver"),
		REST_COMMUNITY_CONTROLLER_GET_COMMUNITY_POST_BY_PAID_CAREGIVER_ERROR("C-131", "Unknown error while getting community post by paid caregiver"),

		//INCIDENT 
		REST_INCIDENT_CONTROLLER_GET_INCIDENT_TYPE_ERROR("C-132", "Unknown error while getting incident type"),
		REST_INCIDENT_CONTROLLER_GET_SEVERITY_LEVEL_ERROR("C-138", "Unknown error while getting severity level"),


		//MEMBER
		REST_MEMBER_CONTROLLER_GET_CARELOG_BY_CARETYPE_ERROR("C-133", "Unknown error while getting carelog by caretype"),
		REST_MEMBER_CONTROLLER_GET_CARE_REPORTS_ERROR("C-134", "Unknown error while getting care reports"),
		REST_MEMBER_CONTROLLER_GET_CAREGIVER_BY_MEMBERID_ERROR("C-137", "Unknown error while getting member id details"),
		REST_MEMBER_CONTROLLER_GET_MEMBER_CAREPLANSBY_MEDICAIDID_ERROR("C-171", "Unknown error while getting member care pland by medicaid Id details"),

		//VENDOR
		REST_VENDOR_CONTROLLER_ADD_CAREGIVER_ERROR("C-139", "Unknown error while adding caregiver"),
		REST_VENDOR_CONTROLLER_GET_ALL_CAREGIVER_ERROR("C-141", "Unknown error while getting all caregiver "),
		REST_VENDOR_CONTROLLER_GET_CAREGIVER_BY_ID_ERROR("C-142", "Unknown error while getting caregiver by id"),
		REST_VENDOR_CONTROLLER_GET_VENDOR_PROFILE_ERROR("C-144", "Unknown error while getting vendor profile"),
		REST_VENDOR_CONTROLLER_UPDATE_VENDOR_PROFILE_ERROR("C-145", "Unknown error while update vendor profile"),
		REST_VENDOR_CONTROLLER_UPDATE_MEMBER_ERROR("C-146", "Unknown error while update member"),
		REST_VENDOR_CONTROLLER_ACCEPT_ASSIGNMENT_ERROR("C-159", "Unknown error while accept Assignment "),
		REST_COMMON_CONTROLLER_GETUSERS_DETAILS_BASEDON_ROLE_ERROR("C-173", "Unknown error while getting user details "),
		REST_VENDOR_CONTROLLER_UPDATE_CARE_GIVER("C-175", "Unknown error while updating care giver info"),



		//PAID CAREGIVER
		REST_PAID_CAREGIVER_CONTROLLER_GET_ALL_TASKS_ERROR("C-146", "Unknown error while getting all tasks"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_MEMBER_ERROR("C-147", "Unknown error while get member"),
		REST_PAID_CAREGIVER_CONTROLLER_UPDATE_CARELOG_ERROR("C-148", "Unknown error while update carelog bean for logcare"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_CAREMEMBER_ERROR("C-149", "Unknown error while get care members"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_PAID_CAREGIVER_PROFILE_ERROR("C-150", "Unknown error while get paid caregiver profile"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_FOLLOWERS_PROFILE_ERROR("C-151", "Unknown error while get followers"),
		REST_PAID_CAREGIVER_CONTROLLER_STRAT_CARE_PROFILE_ERROR("C-152", "Unknown error while start care"),
		REST_PAID_CAREGIVER_CONTROLLER_SUBMIT_CARE_PROFILE_ERROR("C-153", "Unknown error while submit care"),
		REST_PAID_CAREGIVER_CONTROLLER_GETTING_KUDO_LIST_ERROR("C-154", "Unknown error while getting kudo list"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_CARE_LOG_BEANBYID_ERROR("C-159", "Unknown error while getting care log bean by id"),
		REST_PAID_CAREGIVER_CONTROLLER_GET_CHECKIN_STATUS_ERROR("C-164", "Unknown error while getting check in status by id"),
		REST_PAID_CAREGIVER_CONTROLLER_UPDATE_CAREGIVER_PROFILE_ERROR("C-166", "Unknown error while update care giver by id"),
		REST_PAID_CARE_CONTROLLER_SAVE_CHECKIN_STATUS("C-174", "Unknown error while saving check in status details "),


		//LOGIN
		REST_LOGIN_CONTROLLER_FORGOT_PASSWORD_ERROR("C-155", "Entered Careticker email doesn't exist on our database!!"),
		REST_LOGIN_CONTROLLER_RESET_PARAM_ERROR("C-156", "Your email address or password is not correct. Please try again."),
		REST_LOGIN_CONTROLLER_RESET_PASSWORD_ERROR("C-157", "Your email address or password is not correct. Please try again."),
		REST_LOGIN_CONTROLLER_CHANGE_PASSWORD_ERROR("C-159", "You have entered incorrect default password. Please try again!! "),
		REST_LOGIN_CONTROLLER_USEREXISTS_ERROR("C-167", "Email id already exists in our database!!"),
		REST_LOGIN_CONTROLLER_PASSWORD_EXIST_ERROR("C-168", "Your new password should not match any of your previous five passwords!!"),
		REST_LOGIN_SECURITY_CONTROLLER_CHANGE_PASSWORD_ERROR("C-169", "Please login into the web application, to reset your password..!"),

		//USER
		REST_USER_CONTROLLER_LOGIN_USER_ERROR("C-158", "Your email address or password is not correct. Please try again."),





		/*Service */
		REST_COMMON_SERVICE_IMPL_GETMEMBERS_ERROR("S-101", "Unknown error while getting members"),		
		REST_SERVICE_IMPL_GETCAREACTIVITIES_ERROR("S-102", "Unknown error while getting getCareActivies"),
		REST_COMMON_SERVICE_IMPL_GET_SEARCHMEMBERS_ERROR("S-104", "Unknown error while getting getSearchMembers"),
		REST_SERVICE_IMPL_GET_REPORTSSEARCH_ERROR("S-105", "Unknown error while getting getReportsSearch"),
		REST_SERVICE_IMPL_GET_NOTIFICATIONSCOUNT_ERROR("S-106", "Unknown error while getting getNotificationsCount"),
		REST_SERVICE_IMPL_GET_MESSAGESCOUNT_ERROR("S-107", "Unknown error while getting getMessagesCount"),
		REST_SERVICE_IMPL_GET_ALLTASKS_ERROR("S-108", "Unknown error while getting getAllTasks"),
		REST_SERVICE_IMPL_VIEW_REPORTSARCHIVE_ERROR("S-109", "Unknown error while getting viewReportsArchive"),
		REST_SERVICE_IMPL_GET_NOTIFICATIONS_ERROR("S-110", "Unknown error while getting getNotifications"),
		REST_SERVICE_IMPL_GET_MESSAGES_ERROR("S-111", "Unknown error while getting getMessages"),
		REST_COMMON_SERVICE_IMPL_GET_MEMBERDETAILS_ERROR("S-112", "Unknown error while getting getMemeberDetailsById"),
		REST_SERVICE_IMPL_SENDMESSAGE_ERROR("S-113", "Unknown error while getting sendMessage"),
		REST_SERVICE_IMPL_GET_ALLTASKNAMES_ERROR("S-114", "Unknown error while getting getAllTaskNames"),
		REST_SERVICE_IMPL_COMMENTTOCARELOGPOST_ERROR("S-167", "Unknown error while getting commemtToCareLogPost"),
		REST_SERVICE_IMPL_LIKETOCARELOGPOST_ERROR("S-168", "Unknown error while getting liketoCareLogPost"),
		REST_SERVICE_IMPL_RECENTCHATS_ERROR("S-169", "Unknown error while getting recent Chats"),

		REST_SERVICE_IMPL_GETCHAT_ERROR("S-170", "Unknown error while getting getChats"),
		REST_SERVICE_IMPL_GET_MEMBER_CAREPLANS_BY_MEDICAIDID_ERROR("S-171", "Unknown error while getting getChats"),
		REST_SERVICE_IMPL_RECENTNOTIFICATION_ERROR("S-172", "Unknown error while getting recent notifications"),


		//AGENCY
		REST_AGENCY_SERVICE_GET_SEARCH_CAREGIVERS_ERROR("S-115", "Unknown error while getting searching careGivers"),
		REST_AGENCY_SERVICE_GET_SEARCH_MEMBERS_ERROR("S-116", "Unknown error while getting getSearchMembers"),
		REST_AGENCY_SERVICE_GET_REPORT_SEARCH_ERROR("S-117", "Unknown error while getting Report Search"),

		//CASEMANAGER
		REST_CASEMANAGER_SERVICE_IMPL_GET_CASEMANAGER_PROFILE_ERROR("S-121", "Unknown error while getting CaseManagerProfile"),
		REST_CASEMANAGER_SERVICE_IMPL_GET_CASEMANAGER_MEMBER_UPDATES_ERROR("S-122", "Unknown error while getting CaseManager member updates"),
		REST_CASEMANAGER_SERVICE_IMPL_GET_REPORT_SEARCH_ERROR("S-123", "Unknown error while getting getReportsSearch"),
		REST_CASEMANAGER_SERVICE_IMPL_GET_CASEMANAGER_PROFILE_UPDATE_ERROR("S-160", "Unknown error while getting CaseManagerProfile update"),

		//COMMUNITY
		REST_COMMUNITY_SERVICE_IMPL_SUBMIT_POST_BY_PAID_CAREGIVER_ERROR("S-124", "Unknown error while submit post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_GET_TRENDING_POST_BY_PAID_CAREGIVER_ERROR("S-125", "Unknown error while getting trending post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_GET_COMMUNITY_POST_BY_PAID_CAREGIVER_ERROR("S-131", "Unknown error while getting community post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_GET_INTRESTING_POST_BY_PAID_CAREGIVER_ERROR("S-126", "Unknown error while getting intresting people by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_COMMENT_TO_POST_BY_PAID_CAREGIVER_ERROR("S-127", "Unknown error while comment to post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_LIKE_TO_POST_BY_PAID_CAREGIVER_ERROR("S-128", "Unknown error while like to post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_SEARCH_POST_BY_PAID_CAREGIVER_ERROR("S-129", "Unknown error while search post by paid caregiver"),
		REST_COMMUNITY_SERVICE_IMPL_ADD_FOLLOWING_BY_PAID_CAREGIVER_ERROR("S-130", "Unknown error while add following post by paid caregiver"),



		//INCIDENT 
		REST_INCIDENT_SERVICE_IMPL_GET_INCIDENT_TYPE_ERROR("S-132", "Unknown error while getting incident type"),


		//MEMBER
		REST_MEMBER_SERVICE_GET_CARELOG_BY_CARETYPE_ERROR("S-133", "Unknown error while getting carelog by caretype"),
		REST_MEMBER_SERVICE_GET_CARELOG_BY_MEMBERID_ERROR("S-159", "Unknown error while getting carelog by memberId"),


		//VENDOR
		REST_VENDOR_SERVICE_ADD_CAREGIVER_ERROR("S-139", "Unknown error while adding caregiver"),
		REST_VENDOR_SERVICE_GET_VENDOR_CARE_REPORT_BY_MEMBER_ID("S-200", "Unknown error while geting memberReports"),
		REST_VENDOR_SERVICE_GET_VENDOR_CARE_REPORT_BY_CAREGIVER_ID("S-200", "Unknown error while geting care Reports"),
		REST_VENDOR_SERVICE_UPDATE_CAREGIVER_ERROR("S-140", "Unknown error while update caregiver"),
		REST_VENDOR_SERVICE_GET_ALL_CAREGIVER_ERROR("S-141", "Unknown error while getting all caregiver "),
		REST_VENDOR_SERVICE_GET_CAREGIVER_BY_ID_ERROR("S-142", "Unknown error while getting caregiver by id"),
		REST_VENDOR_SERVICE_ARCHIVE_REPORT_ERROR("S-143", "Unknown error while getting archive report status"),
		REST_VENDOR_SERVICE_GET_VENDOR_PROFILE_ERROR("S-144", "Unknown error while getting vendor profile"),
		REST_VENDOR_SERVICE_UPDATE_VENDOR_PROFILE_ERROR("S-145", "Unknown error while update vendor profile"),
		REST_VENDOR_SERVICE_UPDATE_MEMBER_ERROR("S-146", "Unknown error while update member"),
		REST_VENDOR_SERVICE_ACCEPT_ASSIGNMENT_ERROR("S-159", "Unknown error while accept Assignment "),


		//PAID CAREGIVER
		REST_PAID_CAREGIVER_SERVICE_IMPL_GET_MEMBER_ERROR("S-147", "Unknown error while get member"),
		REST_PAID_CAREGIVER_SERVICE_UPDATE_CARELOG_ERROR("S-148", "Unknown error while update carelog bean for logcare"),
		REST_PAID_CAREGIVER_SERVICE_GET_CAREMEMBER_ERROR("S-149", "Unknown error while get care members"),
		REST_PAID_CAREGIVER_SERVICE_GET_PAID_CAREGIVER_PROFILE_ERROR("S-150", "Unknown error while get paid caregiver profile"),
		REST_PAID_CAREGIVER_SERVICE_GET_FOLLOWERS_PROFILE_ERROR("S-151", "Unknown error while get followers"),
		REST_PAID_CAREGIVER_SERVICE_STRAT_CARE_PROFILE_ERROR("S-152", "Unknown error while start care"),
		REST_PAID_CAREGIVER_SERVICE_IMPL_GETTING_KUDO_LIST_ERROR("S-154", "Unknown error while getting kudo list"),
		REST_PAID_CAREGIVER_SERVICE_IMPL_CARE_LOG_BEANBYID_ERROR("S-159", "Unknown error while getting care log bean by id"),
		REST_PAID_CAREGIVER_SERVICE_IMPL_GET_CHECKIN_STATUS_ERROR("S-164", "Unknown error while getting checking details by id"),
		REST_PAID_CAREGIVER_SERVICE_IMPL_GET_CARE_LOG_BEANBYID_ERROR("S-165", "Unknown error while getting care log bean by id"),
		REST_PAID_CAREGIVER_SERVICE_IMPLUPDATE_CAREGIVER_PROFILE_ERROR("S-166", "Unknown error while update care giver profile by id"),
		REST_PAID_CAREGIVER_SERVICE_SAVE_CHECKIN_STATUS_ERROR("S-174", "Unknown error while saving check in status"),
		
	



		//LOGIN
		REST_LOGIN_SERVICE_FORGOT_PASSWORD_ERROR("S-155", "Unknown error while forgot Password "),
		REST_LOGIN_SERVICE_RESET_PASSWORD_ERROR("S-156", "Unknown error while calling reset param "),

		//USER
		REST_USER_SERVICE_LOGIN_USER_ERROR("S-158", "Your email address or password is not correct. Please try again."),
		REST_USER_SERVICE_LOGIN_WRONG_PASSWORD_ERROR("S-158", "Unknown error while login validation "),



		/*DAO */
		REST_COMMON_DAO_IMPL_GETMEMBERS_ERROR("D-101", "Unknown error while getting members"),
		REST_COMMON_DAO_IMPL_GETCAREACTIVITIES_BY_CARETYPE_ERROR("D-102", "Unknown error while getting getCareActivies"),
		REST_COMMON_DAO_IMPL_GET_SEARCHMEMBERS_BY_CARETYPE_ERROR("D-104", "Unknown error while getting getSearchMembers"),
		REST_COMMON_DAO_IMPL_GET_REPORTSSEARCH_ERROR("D-105", "Unknown error while getting getReportsSearch"),
		REST_COMMON_DAO_IMPL_GET_ALLTASKS_ERROR("D-108", "Unknown error while getting getAllTasks"),
		REST_COMMON_DAO_IMPL_VIEW_REPORTSARCHIVE_ERROR("D-109", "Unknown error while getting viewReportsArchive"),
		REST_COMMON_DAO_IMPL_GET_NOTIFICATIONS_ERROR("D-110", "Unknown error while getting getNotifications"),
		REST_COMMON_DAO_IMPL_GET_MEMBERDETAILS_ERROR("D-112", "Unknown error while getting getMemeberDetailsById"),
		REST_COMMON_DAO_IMPL_SENDMESSAGE_ERROR("D-113", "Unknown error while getting sendMessage"),
		REST_COMMON_DAO_IMPL_GET_ALLTASKNAMES_ERROR("D-114", "Unknown error while getting getAllTaskNames"),
		REST_COMMON_DAO_IMPL_GET_COMMENTTOCARELOGPOST_ERROR("D-159", "Unknown error while getting commenttoCareLogPost"),
		REST_COMMON_DAO_IMPL_GET_LIKETOCARELOGPOST_ERROR("D-160", "Unknown error while getting liketoCareLogPost"),
		REST_COMMON_DAO_IMPL_GET_RECENTCHATS_ERROR("D-161", "Unknown error while getting recentChats"),
		REST_COMMON_DAO_IMPL_GET_GETCHAT_ERROR("D-162", "Unknown error while getting getChat"),
		REST_COMMON_DAO_IMPL_GET_NOTIFICATIONSCOUNT_ERROR("D-163", "Unknown error while getting notificationCount"),



		//AGENCY
		REST_AGENCY_DAO_IMPL_GET_SEARCH_CAREGIVERS_ERROR("D-115", "Unknown error while getting searching careGivers"),
		REST_AGENCY_DAO_IMPL_GET_SEARCH_MEMBERS_ERROR("D-116", "Unknown error while getting getSearchMembers"),
		REST_AGENCY_DAO_IMPL_GET_REPORT_SEARCH_ERROR("D-117", "Unknown error while getting Report Search"),


		//CASEMANAGER
		REST_CASEMANAGER_DAO_IMPL_GET_CASEMANAGER_PROFILE_ERROR("D-121", "Unknown error while getting CaseManagerProfile"),
		REST_CASEMANAGER_DAO_IMPL_GET_CASEMANAGER_MEMBER_UPDATES_ERROR("D-122", "Unknown error while getting CaseManager member updates"),
		REST_CASEMANAGER_DAO_IMPL_GET_REPORT_SEARCH_ERROR("D-123", "Unknown error while getting getReportsSearch"),
		REST_CASEMANAGER_DAO_IMPL_GET_CASEMANAGER_PROFILE_UPDATE_ERROR("D-124", "Unknown error while getting CaseManagerProfile update"),

		//COMMUNITY
		REST_COMMUNITY_DAO_IMPL_SUBMIT_POST_BY_PAID_CAREGIVER_ERROR("D-124", "Unknown error while submit post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_GET_TRENDING_POST_BY_PAID_CAREGIVER_ERROR("D-125", "Unknown error while getting trending post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_GET_COMMUNITY_POST_BY_PAID_CAREGIVER_ERROR("D-131", "Unknown error while getting community post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_COMMENT_TO_POST_BY_PAID_CAREGIVER_ERROR("D-127", "Unknown error while comment to post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_LIKE_TO_POST_BY_PAID_CAREGIVER_ERROR("D-128", "Unknown error while like to post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_SEARCH_POST_BY_PAID_CAREGIVER_ERROR("D-129", "Unknown error while search post by paid caregiver"),
		REST_COMMUNITY_DAO_IMPL_ADD_FOLLOWING_BY_PAID_CAREGIVER_ERROR("D-130", "Unknown error while add following post by paid caregiver"),



		//MEMBER
		REST_MEMBER_DAO_IMPL_GET_CARELOG_BY_CARETYPE_ERROR("D-133", "Unknown error while getting carelog by caretype"),



		//VENDOR
		REST_VENDOR_DAO_IMPL_ADD_CAREGIVER_ERROR("D-139", "Unknown error while adding caregiver"),
		REST_VENDOR_DAO_IMPL_UPDATE_CAREGIVER_ERROR("D-140", "Unknown error while update caregiver"),
		REST_VENDOR_DAO_IMPL_GET_ALL_CAREGIVER_ERROR("D-141", "Unknown error while getting all caregiver "),
		REST_VENDOR_DAO_IMPL_GET_CAREGIVER_BY_ID_ERROR("D-142", "Unknown error while getting caregiver by id"),
		REST_VENDOR_DAO_IMPL_ARCHIVE_REPORT_ERROR("D-143", "Unknown error while getting archive report status"),
		REST_VENDOR_DAO_IMPL_GET_VENDOR_PROFILE_ERROR("D-144", "Unknown error while getting vendor profile"),
		REST_VENDOR_DAO_IMPL_UPDATE_VENDOR_PROFILE_ERROR("D-145", "Unknown error while update vendor profile"),    
		REST_VENDOR_DAO_IMPL_ACCEPT_ASSIGNMENT_ERROR("D-159", "Unknown error while accept Assignment "),
		REST_VENDOR_Dao_GET_VENDOR_CARE_REPORT_BY_MEMBER_ID("D-200", "Unknown error while geting memberReports"),

		//PAID CAREGIVER
		REST_PAID_CAREGIVER_DAO_IMPL_GET_MEMBER_ERROR("D-147", "Unknown error while get member"),  
		REST_PAID_CAREGIVER_DAO_UPDATE_CARELOG_ERROR("D-148", "Unknown error while update carelog bean for logcare"),  
		REST_PAID_CAREGIVER_DAO_GET_CAREMEMBER_ERROR("D-149", "Unknown error while get care members"),
		REST_PAID_CAREGIVER_DAO_GET_PAID_CAREGIVER_PROFILE_ERROR("D-150", "Unknown error while get paid caregiver profile"),
		REST_PAID_CAREGIVER_DAO_GET_FOLLOWERS_PROFILE_ERROR("D-151", "Unknown error while get followers"),
		REST_PAID_CAREGIVER_DAO_STRAT_CARE_PROFILE_ERROR("D-152", "Unknown error while start care"),
		REST_PAID_CAREGIVER_DAO_GETTING_KUDO_LIST_ERROR("D-154", "Unknown error while getting kudo list"),
		REST_PAID_CAREGIVER_DAO_GET_CARE_LOGBEAN_BYID_ERROR("D-159", "Unknown error while getting care log bean by id"),  
		REST_PAID_CAREGIVER_DAO_SAVE_PAID_CAREGIVER_PROFILE_ERROR("D-160", "Unknown error while saving care giver profile"), 
		REST_PAID_CAREGIVER_DAO_GET_CARELOG_BEANID_ERROR("D-160", "Unknown error while getting care log bean byid profile"),
		REST_PAID_CAREGIVER_SERVICE__UNASSIGNED_CAREGIVERS_STATUS_ERROR("D-174", "Unknown error while getting unassigned CareGiver"),

		//LOGIN
		REST_LOGIN_DAO_FORGOT_PASSWORD_ERROR("D-155", "Entered Careticker email doesn't exist on our database!!"),
		REST_LOGIN_DAO_RESET_PASSWORD_ERROR("D-156", "Your email address or password is not correct. Please try again."), 

		//USER
		REST_USER_DAO_LOGIN_USER_ERROR("D-158", "Please enter a valid email address."), 
		REST_USER_DAO_LOGIN_WRONG_PASSWORD_ERROR("D-158", "Your email address or password is not correct. Please try again."),      
		REST_USER_WRONG_PASSWORD("D-158","Your email address or password is not correct. Please try again."),
		REST_USER_WRONG_TRY_PASSWORD("D-777","Your Careticker account has been locked for attempting with 3 times with invalid passwords."),


		REST_USER_SERVICE_SESSION_STATUS_ERROR("S-159","saving session information"), 
		REST_USER_SERVICE_LOGIN_SESSION_STATUS_ERROR("S-160","login session status information not exist in our data base"), 
		REST_USER_SERVICE_LOGOUT_ERROR("S-161","log out error"), 


		REST_USER_CONTROLLER_SAVE_PAGE_ROLES_ERROR("C-162","saving pages url based upon role"), 
		REST_USER_SERVICE_SAVE_PAGE_ROLES_ERROR("S-162","saving pages url based upon role"), 
		REST_USER_DAO_SAVE_PAGE_ROLES_ERROR("D-162","saving pages url based upon role"), 

		REST_USER_SERVICE_GETTING_ALL_USERS_ERROR("S-163","getting all user details in data base"), 
		REST_USER_DAO_GETTING_ALL_USERS_ERROR("D-163","getting all user details in data base"), 

		
		REST_EMAIL_SCHEDULER_GET_ALL_NOTIFICATION_ERROR("SH-001", "Unknown error while  sucheduler  all notification"),
		
		REST_USER_SERVICE_LOGIN_SESSION_STATUS_ERROR_2("S-164","user does not exit");


		public String code;
		public String msg;

		private ERROR(final String code, final String msg) {
			this.code = code;
			this.msg = msg;
		}

	}

}
