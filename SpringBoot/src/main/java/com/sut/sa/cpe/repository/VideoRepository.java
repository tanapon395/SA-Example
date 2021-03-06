package com.sut.sa.cpe.repository;

import com.sut.sa.cpe.entity.Video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface VideoRepository extends JpaRepository<Video, Long> {
    Video findByCode(String code);
}