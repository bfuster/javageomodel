/**
 * 
 */
package com.beoui.geocell;

import java.util.List;

import com.beoui.geocell.model.LocationCapable;

/**
 * Just a mock
 * @author bfuster
 *
 */
public class JPALocationCapableRepositorySearchImpl<T extends LocationCapable> implements
		LocationCapableRepositorySearch<T> {

	@Override
	public List<T> search(List<String> geocells) {
		return null;
	}
	
}
