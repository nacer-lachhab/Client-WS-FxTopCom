@echo off
cd "X:\design_Patterns\cltWSDevise\deploy" 
set CLASSPATH=%CLASSPATH%;.;..\lib\axis.jar;..\lib\axis-ant.jar;..\lib\commons-discovery-0.2.jar;..\lib\commons-logging-1.0.4.jar;..\lib\activation.jar;..\lib\mail.jar;..\lib\jaxrpc.jar;..\lib\log4j-1.2.8.jar;..\lib\saaj.jar;..\lib\wsdl4j-1.5.1.jar 
D:\java-tools\jdk1.8.0_311\bin\java.exe org.apache.axis.wsdl.WSDL2Java devise.wsdl -o ..\src