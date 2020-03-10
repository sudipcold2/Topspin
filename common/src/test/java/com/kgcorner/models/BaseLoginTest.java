package com.kgcorner.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Description : <Write class Description>
 * Author: kumar
 * Created on : 10/03/20
 */

public class BaseLoginTest {

    class LoginTestModel extends BaseLogin {}

    private LoginTestModel login;

    @Before
    public void setup() {
        login = new LoginTestModel();
    }

    @Test
    public void testBaseLogin() {
        login.setId("1");
        login.setLoginProvider("Google");
        login.setOAuthAccessToken("AccessToken");
        login.setPassword("Password");
        login.setRefreshToken("RefreshToken");
        login.setUserId("1");
        login.setUsername("Username");

        assertEquals("1", login.getId());
        assertEquals("1", login.getUserId());
        assertEquals("Google", login.getLoginProvider());
        assertEquals("Password", login.getPassword());
        assertEquals("AccessToken", login.getOAuthAccessToken());
        assertEquals("RefreshToken", login.getRefreshToken());
        assertEquals("Username", login.getUsername());
        assertEquals(login.getId().hashCode(), login.hashCode());
        login.setId(null);
        assertEquals(0, login.hashCode());
    }

}