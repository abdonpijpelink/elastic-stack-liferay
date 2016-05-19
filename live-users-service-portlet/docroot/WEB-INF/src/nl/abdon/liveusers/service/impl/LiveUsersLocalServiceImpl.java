package nl.abdon.liveusers.service.impl;

import java.lang.reflect.Method;
import java.util.Map;

import nl.abdon.liveusers.service.base.LiveUsersLocalServiceBaseImpl;

import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserTracker;
import com.liferay.portal.security.auth.CompanyThreadLocal;

public class LiveUsersLocalServiceImpl extends LiveUsersLocalServiceBaseImpl {

	public int getNumberOfLiveUsers() {
		try {
			Class<?> liveUsers = PortalClassLoaderUtil.getClassLoader()
					.loadClass("com.liferay.portal.liveusers.LiveUsers");

			Method getSessionUsers = liveUsers.getDeclaredMethod(
					"getSessionUsers", long.class);
			
			Map<String, UserTracker> map = (Map<String, UserTracker>) getSessionUsers
					.invoke(null, CompanyThreadLocal.getCompanyId());
			
			return map.size();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}