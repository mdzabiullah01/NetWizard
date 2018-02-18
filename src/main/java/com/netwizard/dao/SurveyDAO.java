/**
 *
 */
package com.netwizard.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.netwizard.model.Survey;

/**
 * @author Gautam Joshi
 *
 */
@Component
public interface SurveyDAO {

	Survey saveOrUpdateSurvey(Survey survey);

	List<Survey> getAllSurveys();
}
