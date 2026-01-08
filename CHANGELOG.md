# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unrelease]

## [25-12-24]

### Changes
- Change the authentication method to from using `token` to `cookie` by setting `solid.login.token-base: false` and `server.sevlet.session.cookie.same-site: lax`.  

### Fixed
- Fix `No qualify bean '**SqlConfigManager' bean` error in junit test of domain submodule 


## [25-11-20]

### Changes
- Update codeql action version to `v4` in `codeql.yml`.  


## [25-10-24]

## Changes
- Fix scripts of github action : to continue the flows of github action when test fails.
- Fix scripts of docker image build and application startup.

## [25-09-23]

### Changes

- Change the logback xml file `logback-file.xml`
- Replace the deprecated attribute in `application.yml`

## [25-09-22]

### Changes
- Update framework version to `framework_version=[1.2, 1.3)` in `gradle.properties`.
- Change from `new AntPathRequestMatcher` to `PathPatternRequestMatcher.withDefaults().matcher` due to deprecation.
- Change `webSecurityCustomizer()` to `SecurityFilterChain` in `SecurityConfiguration.java` since `ignoring()` is no longer recommended.
- Update `logback-file.xml` and `logback-console.xml` to add `[%X{requestId}]` in log pattern.
- Update `application.yml` to change actuator management setting from `enable: true` to `access: read_only`.
- Update `application.yml` to declare cache type to `reids` for redis profile.
- Update `TestSecurityConfiguration.java` to clarify the security configuration for test.


## [25-09-17]

### Enhance

- Refactor test code in projects to be easy used.

## [25-08-27]

### Changed

- Remove unused environment variable `APP_PJ_PREFIX` from GitHub Actions workflows.
- Remove unused test dependency `org.junit.platform:junit-platform-launcher` from Gradle build files.

## [25-06-04]

### Enhance
- add jacco coverage report as artifact and summary in github action


## [25-05-29]

### Enhance
- Support dynamic context path in html page for backend 


## [25-05-28]

### Changed
- update `Dockerfile` to use a new version of java base image(17.0.15_6).


## [25-04-17]

### Changed
- Fixed the issue that CI/CD may fail in copied project at 'gradlew permission denied' error.


## [25-04-14]

### Changed
- Fix error "No test report files were found" in execution of github action.


## [25-03-26]

### Changed
- Update github actions in `codeql.yml`.


## [25-03-24]

### Enhance
- Update `DummyAuthenticationInterceptor` to allow to switch user according to request header info for dummy-auth. 


## [25-03-20]

### Enhance
- Add new feature of changing locale for current login user (#142)


## [25-02-07]

### Enhance
- Remove the dependency of JSP parsing feature. (#138)


## [25-01-22]

### Fixes
- Update gradle version to fix the problem that snapshot version of gradle plugins might be used. (#135)


## [24-11-21]

### Fixes
- Fix the problem of unable to remote debugging.(#129)


## [24-11-14]

### Fixes
- Resolve the issue that encountering login page when it's with 'dummy-user' profile.

## [24-11-12]

### Fixes
- Fix the issue of `PJUserDetailsServiceLoader#loadUserByUsername` been called twice when login failed, by removing `http.authenticationProvider(authenticationProvider());` in `PJLoginSecurityConfiguration`.  


## [24-11-06]

### Changes
- Fix the session of logined user can't be expired in correct timeout when using not redis profile in `PJRedisConfiguration`. 


## [24-11-04]

### Changes
- update `Dockerfile` to use a new version of java base image(17.0.13_11).


## [24-10-25]

### Changes
- update `trivy-scan.yml`, solving the problem that trivy db might be downloaded failed due to traffic limit.


## [24-10-16]

### Changes
- update `codeql.yml` to use the latest version of github actions. 


## [24-10-10]

### Fixed
- update `logback-file.xml` to fix the problem that "ClassNotFound" exception happened due to `SizeAndTimeBasedFNATP` removed in logback new version.  


## [24-10-07]

### Fixed
- change `SecurityConfiguration` and `DummyAuthenticationInterceptor` to fix the problem that websocket can't be connected when using `dummy-auth`.  


## [24-09-24]

### Changes
- update solid framework_version to [1.1, 1.2) in `gradle.properties`.


## [24-09-13]

### Changes
- update `PJUserDetailsServiceLoader` to show how to set roles into `userDetails`.  
- update `SecurityConfiguration` that not ignoring `/error` from spring security, and add it as `permit` in `PJLoginSecurityConfiguration`.  