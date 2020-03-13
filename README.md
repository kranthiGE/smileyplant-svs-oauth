## SmileyPlant microservice
=========================
Author: Kranthi Kiran
Created on: 13-Sep-16
Description: This project provides RESTful services to store the state of a device so that client can request the same over HTTP(s) to switch ON/OFF a device connected.

#Features:


#Installing & local setup:

security:  
  oauth2:               
    client:
      clientId: [Client ID]
      clientSecret: [Client Secret]
      accessTokenUri: 
      userAuthorizationUri:      
      scope: openid,profile
      pre-established-redirect-uri: [Redirect URI]
      registered-redirect-uri: [Redirect URI]
      use-current-uri: false      
    resource:
      userInfoUri: 
      prefer-token-info: true
