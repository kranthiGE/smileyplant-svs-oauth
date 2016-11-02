## `Predix Shared UAA Spring Boot Web Example`
Sample web application to demonstrate securing a Spring Boot Web Application with the GE Shared UAA service and GE SSO using OIDC

### How-To

#### Configure Lombok with Spring Tool Suite (STS)
* [Download lombok.jar](https://projectlombok.org/download.html)
* Add lombok.jar to STS Home directory
```
STS Home Example: C:\Program Files\sts-bundle\sts-3.7.3.RELEASE\
```
* Modify STS.ini
```
-vmargs
-javaagent:lombok.jar
-Xbootclasspath/a:lombok.jar
```

#### Run Locally
* Change the spring.profiles.active in the src/main/resources/application.yml to be "ge-oidc,local" or "predix-basic,local"
* From the Command line
```
cd [project directory]
mvn spring-boot:run
```
* From Spring Tool Suite (STS)
```
Right click on the project - Run As - Spring Boot App
```

### Links
* [Predix Info on using Spring Boot (HTTPS Redirect ISSUE)](https://www.predix.io/support/article/KB0011758)
* [Predix Basic Shared UAA Self-Service Web Portal](https://shared-uaa.run.aws-usw02-pr.ice.predix.io/)
* [GE SSO OIDC Client Creation Self-Service](http://oidcapi.corporate.ge.com/)
* [Spring Boot and OAuth2 Tutorial](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Spring Boot Configuration Properties and Profile Management Using YAML](https://hoserdude.com/2014/06/19/spring-boot-configurationproperties-and-profile-management-using-yaml/)

### application.yml configuration for Spring Boot server to work in Predix
```
server:
  port: 8080
  use-forward-headers: true
  tomcat:
    remote-ip-header: x-forwarded-for
    protocol-header: x-forwarded-proto
    protocol-header-https-value: http
```

### application.yml configuration for OIDC

```
security:  
  oauth2:               
    client:
      clientId: [Client ID]
      clientSecret: [Client Secret]
      accessTokenUri: https://fssfed.ge.com/fss/as/token.oauth2
      userAuthorizationUri: https://fssfed.ge.com/fss/as/authorization.oauth2       
      scope: openid,profile
      pre-established-redirect-uri: [Redirect URI]
      registered-redirect-uri: [Redirect URI]
      use-current-uri: false      
    resource:
      userInfoUri: https://fssfed.ge.com/fss/idp/userinfo.openid
      prefer-token-info: true
```

### application.yml configuration for Predix Basic Shared UAA

```
security:
  oauth2:
    client:
      client-id: [Client ID]
      client-secret: [Client Secret]    
      access-token-uri:  https://a8a2ffc4-b04e-4ec1-bfed-7a51dd408725.predix-uaa.run.aws-usw02-pr.ice.predix.io/oauth/token
      user-authorization-uri:  https://a8a2ffc4-b04e-4ec1-bfed-7a51dd408725.predix-uaa.run.aws-usw02-pr.ice.predix.io/oauth/authorize      
      scope: uaa.resource,openid
      pre-established-redirect-uri: [Redirect URI]
      registered-redirect-uri: [Redirect URI]
      use-current-uri: false                
    resource:
      userInfoUri: https://a8a2ffc4-b04e-4ec1-bfed-7a51dd408725.predix-uaa.run.aws-usw02-pr.ice.predix.io/userinfo
      prefer-token-info: true
```
