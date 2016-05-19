/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package nl.abdon.liveusers.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LiveUsersLocalService}.
 *
 * @author Abdon Pijpelink
 * @see LiveUsersLocalService
 * @generated
 */
public class LiveUsersLocalServiceWrapper implements LiveUsersLocalService,
	ServiceWrapper<LiveUsersLocalService> {
	public LiveUsersLocalServiceWrapper(
		LiveUsersLocalService liveUsersLocalService) {
		_liveUsersLocalService = liveUsersLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _liveUsersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_liveUsersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liveUsersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int getNumberOfLiveUsers() {
		return _liveUsersLocalService.getNumberOfLiveUsers();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LiveUsersLocalService getWrappedLiveUsersLocalService() {
		return _liveUsersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLiveUsersLocalService(
		LiveUsersLocalService liveUsersLocalService) {
		_liveUsersLocalService = liveUsersLocalService;
	}

	@Override
	public LiveUsersLocalService getWrappedService() {
		return _liveUsersLocalService;
	}

	@Override
	public void setWrappedService(LiveUsersLocalService liveUsersLocalService) {
		_liveUsersLocalService = liveUsersLocalService;
	}

	private LiveUsersLocalService _liveUsersLocalService;
}