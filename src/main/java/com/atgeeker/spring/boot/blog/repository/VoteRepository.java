package com.atgeeker.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atgeeker.spring.boot.blog.domain.Vote;

/**
 * Vote 仓库.
 *
 * @since 1.0.0 2017年4月9日
 * @author <a href="https://atgeeker.com">Zyy</a> 
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
