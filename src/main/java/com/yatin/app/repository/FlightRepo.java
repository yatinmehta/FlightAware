package com.yatin.app.repository;

import com.yatin.app.model.UserIp;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepo extends CrudRepository<UserIp, Long> {
}