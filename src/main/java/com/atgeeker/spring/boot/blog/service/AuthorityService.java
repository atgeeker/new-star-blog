package com.atgeeker.spring.boot.blog.service;

import com.atgeeker.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since 1.0.0 2017年3月18日
 * @author <a href="https://atgeeker.com">Zyy</a>
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
