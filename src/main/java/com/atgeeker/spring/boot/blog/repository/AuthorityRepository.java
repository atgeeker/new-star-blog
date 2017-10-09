package com.atgeeker.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atgeeker.spring.boot.blog.domain.Authority;

/**
 * Authority 仓库.
 *
 * @since 1.0.0 2017年3月2日
 * @author <a href="https://atgeeker.com">Zyy</a> 
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
