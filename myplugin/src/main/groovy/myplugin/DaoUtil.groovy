package myplugin

import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware


/**
* A bunch of statics to support the GormDaoSupport.
* this is also setup as daoUtilsBean so that it gets injected with the ApplicationContext once its setup
*/
class DaoUtil implements ApplicationContextAware
{
	
	static ApplicationContext ctx

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx
	}

	static void checkChanges(){
		println"=============================> DaoUtil.checkChanges"
	}
}

