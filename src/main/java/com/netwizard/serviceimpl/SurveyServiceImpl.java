/**
 *
 */
package com.netwizard.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netwizard.dao.SurveyDAO;
import com.netwizard.model.Survey;
import com.netwizard.request.model.SurveyRequest;
import com.netwizard.service.SurveyService;
import com.netwizard.util.DateUtil;

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
	public Survey saveOrUpdateSurvey(SurveyRequest surveyRequest) {
		logger.debug(">> saveOrUpdateSurvey" + surveyRequest);

		ModelMapper modelMapper = new ModelMapper();
		Survey survey = modelMapper.map(surveyRequest, Survey.class);
		survey.setCreatedDate(DateUtil.getGMTDate());

		try {
			survey = surveyDAO.saveOrUpdateSurvey(survey);
		} catch (Exception e) {
			logger.error("Error in saveOrUpdateSurvey.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateSurvey  survey=" + survey);
		return survey;
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
