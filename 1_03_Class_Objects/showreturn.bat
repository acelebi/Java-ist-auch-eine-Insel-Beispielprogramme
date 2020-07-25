@echo off
java SystemExitDemo
echo %ERRORLEVEL%
if errorlevel 10 (
   echo Exit-Code ist über 10, genau %ERRORLEVEL%
)
pause