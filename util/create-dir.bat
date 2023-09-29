@echo off
setlocal enabledelayedexpansion

if "%1"=="" (
  echo Error: No argument provided. Usage: create.bat N
  exit /b 1
)

set N=%1

for /l %%i in (1, 1, %N%) do (
  set "pad=00%%i"
  set "folder=e!pad:~-2!"

  mkdir !folder!
  if errorlevel 1 (
    echo Access Denied: Could not create directory !folder!
    goto end
  )

  echo public class Main > !folder!/Main.java
  echo     public static void main(String[] args) >> !folder!/Main.java
  echo. >> !folder!/Main.java
  echo     } >> !folder!/Main.java
  echo } >> !folder!/Main.java
)

:end
