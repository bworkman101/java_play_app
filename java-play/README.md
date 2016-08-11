# Java Play

This is a simple web application that showcases the Play Framework and java.

## Setup
Activator is required.  https://www.playframework.com/documentation/2.5.x/Installing

The project can also be setup using Scala SBT.  This project comes with a build.sbt file.

## Site Pages
/  The sites root contains a page that simply shows the time in milliseconds since Epoch.

## Rest Endpoint
GET /epoch   Returns a JSON object with the field epochTime.  "epochTime" is the time in milliseconds since Epoch.