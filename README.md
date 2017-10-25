# A Multi module Gradle project that publishes artifacts to a Maven repository

One way of creating multiple artifacts from Gradle that are consumable by Maven projects is to divide the project 
in modules and allow each module to publish an artifact that is consumable by Maven.

This sample project show one implementation.

The [complete story](http://www.thinkcode.se/blog), with all details, is available at [Think Code AB's](http://www.thinkcode.se) [blog](http://www.thinkcode.se/blog) 

## The project

It is a commandline tool that will reflect a beam in a mirror. Some people mihght call it a *Hello world* project. It is a starting point with focus on the build tool.

### Modules

A multimodule project need two or more modules. 

#### app

The application module. This is the final application. It is built as a war project. Currently it only supports 
commandline. But one day, you may be able to add it to a servlet container if you want. You will need to put some more 
work into transforming it first.

#### api

A module that is expected to be consumed by other projects as well that need a compile time dependency to a way to 
communicate with this application. It is distributed as a jar.

## Building

The project is built using Gradle wrapper.

    ./gradlew clean build
    
Publishing the project to a local Maven repository is done with 

    publishToMavenLocal
    
There is no support for publishing to Nexus. This is left as an exercise for the reader. The real reason is that I 
don't have a Nexus or Artifactory to connect to so I won't speculate in the details.
    


