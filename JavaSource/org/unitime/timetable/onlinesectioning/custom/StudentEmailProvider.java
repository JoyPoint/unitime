package org.unitime.timetable.onlinesectioning.custom;

import org.unitime.commons.Email;
import org.unitime.timetable.onlinesectioning.OnlineSectioningHelper;
import org.unitime.timetable.onlinesectioning.OnlineSectioningServer;

public interface StudentEmailProvider {
	
	/**
	 * Return student email address
	 * */
	public Email createEmail(OnlineSectioningServer server, OnlineSectioningHelper helper, Boolean optional);
	
	/**
	 * If optional, return display message that needs to be toggled. Return null otherwise.
	 */
	public String isOptional(Long sessionId);

}