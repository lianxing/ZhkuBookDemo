package com.haven.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.haven.model.Store;

/**
 *  与Store.xml文件对应的接口，方法对应XML文件中的增删改查操作
 */
@Repository("storeDao")
@Scope("prototype")
public interface StoreDAO {

	/**
	 * 插入一条记录
	 */
	public int insert(Store store);
	
	/**
	 * 删除一条记录
	 */
	public int delete(int storeId);
	
	/**
	 * 修改店铺信息，包括状态、销售量与销售额、获取店铺评分
	 */
	public int update(Store store);
	
	/**
	 * 获取店铺信息，可根据用户名或者店铺名获取
	 */
	public List<Store> getStoreInfo(Store store);
	
	/**
	 * 用于管理员获取所有店铺信息，分页显示
	 */
	public List<Store> getStoreByPage(Map<String, Object> parameter);
	
}
