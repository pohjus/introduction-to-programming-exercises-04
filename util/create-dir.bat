@echo off
setlocal enabledelayedexpansion

if "%1"=="" (
  echo Error: No argument provided. Usage: create.bat N AuthorName
  exit /b 1
)

set N=%1
set AUTHOR=%2

for /l %%i in (1, 1, %N%) do (
  set "pad=00%%i"
  set "folder=e!pad:~-2!"

  mkdir !folder!
  if errorlevel 1 (
    echo Access Denied: Could not create directory !folder!
    goto end
  )

  echo /** > !folder!/Main.java
  echo  * Main class for exercise. >> !folder!/Main.java
  echo  *  >> !folder!/Main.java
  echo  * @author %AUTHOR% >> !folder!/Main.java
  echo  */ >> !folder!/Main.java
  echo public class Main >> !folder!/Main.java
  echo     /** >> !folder!/Main.java
  echo      * Main method - starting point for the app. >> !folder!/Main.java
  echo      * >> !folder!/Main.java
  echo      * @param args Command line arguments >> !folder!/Main.java
  echo      */ >> !folder!/Main.java
  echo     public static void main(String[] args) >> !folder!/Main.java
  echo. >> !folder!/Main.java
  echo     } >> !folder!/Main.java
  echo } >> !folder!/Main.java
)

:end