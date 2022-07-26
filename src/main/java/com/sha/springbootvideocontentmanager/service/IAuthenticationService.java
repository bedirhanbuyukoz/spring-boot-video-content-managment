package com.sha.springbootvideocontentmanager.service;

import com.sha.springbootvideocontentmanager.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
