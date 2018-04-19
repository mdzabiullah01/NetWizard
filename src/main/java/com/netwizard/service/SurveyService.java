/**
 *
 */
package com.netwizard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netwizard.model.Category;
import com.netwizard.model.Survey;
import com.netwizard.request.model.SurveyRequest;

/**
 * @author Gautam Joshi
 *
 */
@Service
public interface SurveyService {

	/**
	 * 
	 * @param survey
	 * @return
	 */
	List<Survey> saveOrUpdateSurvey(Survey survey);

	/**
	 * 
	 * @return
	 */
	List<Survey> getAllSurveys();

}
