/**
 *
 */
package com.netwizard.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.netwizard.dao.SurveyDAO;
import com.netwizard.model.Survey;
import com.netwizard.util.RequestConstans;

/**
 * @author Rayulu Vemula
 *
 */
@Component
@Repository("surveyDAO")
public class SurveyDAOImpl implements SurveyDAO {

	private static Logger logger = Logger.getLogger(SurveyDAOImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Survey> saveOrUpdateSurvey(Survey survey) {
		logger.debug(">> saveOrUpdateSurvey" + survey);
		List<Survey> surveyList = null;
		try {
			this.mongoTemplate.save(survey, RequestConstans.Collections.COLLECTION_SURVEY);
			surveyList = this.mongoTemplate.findAll(Survey.class, RequestConstans.Collections.COLLECTION_SURVEY);
		} catch (Exception e) {
			logger.error("Error in saveOrUpdateSurvey.." + e);
			e.printStackTrace();
		}
		logger.debug("<< saveOrUpdateSurvey  surveyList =" + surveyList);
		return surveyList;
	}

	@Override
	public List<Survey> getAllSurveys() {
		logger.debug(">> getAllSurveys");
		List<Survey> surveyList;
		try {
			surveyList = this.mongoTemplate.findAll(Survey.class, RequestConstans.Collections.COLLECTION_SURVEY);
		} catch (Exception e) {
			logger.error("Error in getAllSurveys.." + e);
			e.printStackTrace();
			surveyList = null;
		}
		logger.debug("<< getAllSurveys  survey List=" + surveyList);
		return surveyList;
	}

}
