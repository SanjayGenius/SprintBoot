package global.persistantDB.config;

import java.io.File;

import org.hibernate.cfg.Configuration;

public class HibernateTableBeans {
	private String CONFIG_FILE_LOCATION = "hibernate.cfg.xml";
	private static Configuration config;
	//private static Logger log = LogManager.getLogger("HIBERNATE");
	private static HibernateTableBeans hibernateTableBeans;
	
	private HibernateTableBeans(){
		config = new Configuration();
		
		String dbConnectionURL = System.getProperty("DBConnectionURL");
		
		if(dbConnectionURL!=null && !dbConnectionURL.trim().isEmpty()){
			config.configure(new File(dbConnectionURL));
		}else{
			config.configure(CONFIG_FILE_LOCATION);
		}
	}
	
	public static HibernateTableBeans getInstance(){
		if(hibernateTableBeans == null){
			hibernateTableBeans = new HibernateTableBeans();
			//HibernateSessionFactory.setBeanTableConfiguration(config);
		}
		return hibernateTableBeans;
	}

	@SuppressWarnings("rawtypes")
	public void addTableClass(Class tableBean){
		config.addAnnotatedClass(tableBean);
	}
	
	public Configuration getConfig(){
		return config;
	}
	
	public void setConfigfile(String configFile){
		config.configure(configFile);
	}
}
