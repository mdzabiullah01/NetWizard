/**
 *
 */
package com.netwizard.serviceimpl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.SurveyDAO;
import com.netwizard.model.Survey;
import com.netwizard.request.model.SurveyRequest;
import com.netwizard.service.SurveyService;

/**
 * @author Gautam Joshi
 *
 */
@Service
public class SurveyServiceImpl implements SurveyService {

	private static Logger logger = Logger.getLogger(SurveyServiceImpl.class);

	@Autowired
	private SurveyDAO surveyDAO;

	@Override
	public List<Survey> saveOrUpdateSurvey(Survey survey) {
		logger.debug(">> saveOrUpdateSurvey" + survey);
		List<Survey> surveys = null;
		try {
			surveys = surveyDAO.saveOrUpdateSurvey(survey);
		} catch (Exception e) {
			logger.error("Error in saveOrUpdateSurvey.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateSurvey  surveys=" + surveys);
		return surveys;
	}

	@Override
	public List<Survey> getAllSurveys() {
		logger.debug(">> getAllSurvey");
		List<Survey> surveyList;
		try {
			surveyList = surveyDAO.getAllSurveys();
		} catch (Exception e) {
			logger.error("Error in getAllSurvey.." + e);
			e.printStackTrace();
			surveyList = null;
		}
		logger.debug("<< getAllSurvey  catList=" + surveyList);
		return surveyList;
	}

}
