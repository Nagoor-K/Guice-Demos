package com.nagoor.service;

import com.google.inject.ImplementedBy;
import com.nagoor.serviceImpl.GuiceServiceImpl;

@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {
	String sayHello();
}

