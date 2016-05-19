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
 * Provides a wrapper for {@link LiveUsersService}.
 *
 * @author Abdon Pijpelink
 * @see LiveUsersService
 * @generated
 */
public class LiveUsersServiceWrapper implements LiveUsersService,
	ServiceWrapper<LiveUsersService> {
	public LiveUsersServiceWrapper(LiveUsersService liveUsersService) {
		_liveUsersService = liveUsersService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _liveUsersService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_liveUsersService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liveUsersService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public int getNumberOfLiveUsers() {
		return _liveUsersService.getNumberOfLiveUsers();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LiveUsersService getWrappedLiveUsersService() {
		return _liveUsersService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLiveUsersService(LiveUsersService liveUsersService) {
		_liveUsersService = liveUsersService;
	}

	@Override
	public LiveUsersService getWrappedService() {
		return _liveUsersService;
	}

	@Override
	public void setWrappedService(LiveUsersService liveUsersService) {
		_liveUsersService = liveUsersService;
	}

	private LiveUsersService _liveUsersService;
}