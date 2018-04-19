/**
 *
 */
package com.netwizard.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.netwizard.model.Survey;

/**
 * @author Rayulu Vemula
 *
 */
@Component
public interface SurveyDAO {

	List<Survey> saveOrUpdateSurvey(Survey survey);

	List<Survey> getAllSurveys();
}
