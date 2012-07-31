gradle-selenium-fixture
=======================

This project provides a Gradle build file with a basic setup to start developing web applications
for [Tomcat](http://tomcat.apache.org/) leveraging [FluentLenium](https://github.com/FluentLenium/FluentLenium)
to write and execute [Selenium Tests](http://seleniumhq.org/).

## Features

* integration test setup (source folders, dependencies etc.) 
* configured [Tomcat Plugin](https://github.com/bmuschko/gradle-tomcat-plugin/)
* [JaCoCo](http://www.eclemma.org/jacoco/) code coverage 

## Requirements

Gradle 1.0+ (wrapper is included)

## Usage

To run the integration tests, execute the following task:

	gradle integrationTest
 
This will start an embedded tomcat server, execute all integration tests and shutdown the server:

	integrationTest.doFirst {
  		println 'Starting the embedded tomcat server'
  		tasks.tomcatRun.daemon = true
  		tasks.tomcatRun.execute()
	}

	integrationTest.doLast {
  		println 'Stopping the embedded tomcat server'
  		tasks.tomcatStop.execute()
	}
	
The 'integrationTest' task has a dependency to 'check' so you can also execute:

	gradle check
