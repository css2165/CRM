package com.users.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.users.beans.UserImage;

public interface UserImageRepository extends CrudRepository<UserImage, Long> {

	List<UserImage> findByUserId(long userId);
}