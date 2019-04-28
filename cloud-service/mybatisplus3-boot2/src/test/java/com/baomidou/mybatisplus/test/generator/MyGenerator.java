package com.baomidou.mybatisplus.test.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.test.generator.GeneratorRader;

public class MyGenerator extends GeneratorRader {
	private static String BASE_PATH = "com.cloud.organization";// 包路径
	private static String OUT_CLASS_PATH ="/src/main/java";
	private static String OUT_XML_PATH = "/src/main/resources/mybatis-mappers/";
    //数据库
	private static String TABLENAMES[] = {"cloud_org"};
	
	public static void main(String[] args) throws IOException {
		AutoGenerator mpg = new AutoGenerator();
		// 自定义需要填充的字段
		List<TableFill> tableFillList = new ArrayList<>();
		tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));

		// 直接输出到目录
		File directory = new File("E:\\Mywork\\cloud-service\\organization-center");// 参数为空
		final String outFile = directory.getCanonicalPath();
		System.out.println(outFile);

		/***** 代码生成器 ********************************************/
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir(outFile + OUT_CLASS_PATH);// 输出目录
		gc.setOpen(false);// 是否打开目录
		gc.setFileOverride(true);// 是否覆盖文件
		gc.setActiveRecord(false);// 开启 activeRecord 模式
		gc.setEnableCache(true);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList
		gc.setAuthor("lgh");
		gc.setIdType(IdType.ID_WORKER);
		gc.setDateType(DateType.ONLY_DATE);
		gc.setMapperName("%sDao");// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setXmlName("%sMapper");
		gc.setEntityName("%s");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");
		mpg.setGlobalConfig(gc);

		/***** 数据源配置 ********************************************/
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("root");
		dsc.setUrl("jdbc:mysql://localhost:3306/cloud_organization?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false");
		mpg.setDataSource(dsc);
		
		/***** 策略配置 ********************************************/
		StrategyConfig sc = new StrategyConfig();// 策略配置
		sc.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		sc.setInclude(TABLENAMES);// 需要生成的表
		sc.setTableFillList(tableFillList);
		mpg.setStrategy(sc);

		/***** 包配置 ********************************************/
		PackageConfig pc = new PackageConfig();
		pc.setEntity("model");
		pc.setParent(BASE_PATH);
		mpg.setPackageInfo(pc);

		/***** 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值 ****/
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
		//定义mapperxml生成路径
		List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
		focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
			@Override
			public String outputFile(TableInfo tableInfo) {
				return outFile + OUT_XML_PATH + tableInfo.getXmlName() + ".xml";
			}
		});
		cfg.setFileOutConfigList(focList);
		mpg.setCfg(cfg);
		/**************************************************************************************/

		
		/***** 自定义模板配置 ********************************************/
		TemplateConfig tc = new TemplateConfig();
		tc.setXml(null);
		mpg.setTemplate(tc);
        mpg.execute();

        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
        System.err.println(mpg.getCfg().getMap().get("abc"));
	}
}
