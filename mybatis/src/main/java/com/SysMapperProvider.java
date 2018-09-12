package com;



import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.Table;

import org.apache.ibatis.mapping.MappedStatement;

import org.apache.ibatis.scripting.xmltags.SqlNode;
import org.apache.ibatis.scripting.xmltags.StaticTextSqlNode;

import com.github.abel533.mapper.MapperProvider;

import com.github.abel533.mapperhelper.MapperHelper;

public class SysMapperProvider extends MapperProvider {

    public SysMapperProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }



	public SqlNode findAll(MappedStatement ms){
		try {
			Class<?> entityClass = getSelectReturnType(ms);
			//修改返回值类型为实体类型
			setResultType(ms, entityClass);

			//1.获取客户端调用的方法 com.jt.manage.mapper.ItemMapper.findTextCount()
			String methodPath = ms.getId();

			//2.获取ItemMapper的字符串
			String targetPath = methodPath.substring(0, methodPath.lastIndexOf("."));
			System.out.println(targetPath);
			//3.获取ItemMapper对象
			Class<?> targetClass = Class.forName(targetPath);

			//4.获取ItemMapper的父级接口 由于接口是可以多继承的
			Type[] types = targetClass.getGenericInterfaces();

			//5.获取SysMapper
			Type targetType = types[0];
			System.out.println(targetType);
			//判断该类型是否为泛型 SysMapper<Item>
			if(targetType instanceof ParameterizedType){
				//表示当前接口是一个泛型,并且获取泛型参数
				ParameterizedType parameterizedType = (ParameterizedType) targetType;
				System.out.println(parameterizedType);
				//SysMapper<T,V,K>   获取泛型的全部参数
				Type[] supers =  parameterizedType.getActualTypeArguments();

				//表示成功获取第一个参数 Item
				Class<?> targetMethodClass = (Class<?>) supers[0];
				System.out.println(targetMethodClass);
				//判断Class不能为空
				if(targetMethodClass !=null){

					//判断该类中是否含有注解
					if(targetMethodClass.isAnnotationPresent(Table.class)){
						//获取目标对象的注解
						System.out.println("yes ..............");
						Table table = targetMethodClass.getAnnotation(Table.class);
						System.out.println(table);
						//获取表名
						String tableName = table.name();
						System.out.println(tableName);
						//定义查询sql语句
						String sql = "select * from "+tableName;
						System.out.println(sql);
						//定义sqlNode对象
						SqlNode sqlNode = new StaticTextSqlNode(sql);
						System.out.println(sqlNode);
						return sqlNode;
					}
				}
			}

		} catch (ClassNotFoundException e) {
			System.out.println("*************!!!!!!!!!!");
			e.printStackTrace();
		}
		return null;
	}
    
    /**
     * 目标动态的获取表的记录总数.
     * sql:select count(*) from 表名??
     * public interface ItemMapper extends SysMapper<Item>
     * 
     * 1.获取ItemMapper的调用路径
     * 2.通过反射获取ItemMapper.class类型
     * 3.获取itemMapper的父级接口类型
     * 4.判断接口是否为泛型接口SysMapper<T>
     * 5.通过泛型类型的接口获取泛型的参数T
     * 6.判断是否含有@Table注解
     * 7.获取注解中的name="tb_item"
     * 8.自定义sql,返回sqlNode对象
     * @param ms
     * @return
     */


}
