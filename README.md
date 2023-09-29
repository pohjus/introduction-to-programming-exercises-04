# Introduction to Programming: Exercise Set 04

This repository contains exercise set 04 for an Introduction to Programming course. Also some utility scripts
are included for creating a proper directory structure quickly.

## ⚠️ Disclaimer

**Use these utility scripts at your own risk. Running these could potentially harm or destroy data on your computer. I am not responsible for any damage caused.**

See also similar tool by [Lassi-Ahonen](https://github.com/Lassi-Ahonen/): [java_homework_dir_gen](https://github.com/Lassi-Ahonen/java_homework_dir_gen).

## Quick Start

### macOS / Linux

1. **Download the Script**: Obtain `util/create-dir.sh` and place it in a directory of your choice.

2. **Set Permissions**: Open terminal and navigate to the directory where `create-dir.sh` is stored. Then, set execute permissions:

```bash
   chmod +x create-dir.sh
```

3. Run the Script: Execute the script with a numerical argument (e.g., 10) to create directories:

```bash
   ./create-dir.sh 10
```

Resulting Directory Structure

The script will create the following directories each containing a Main.java file:

```text
.
├── e01
│   └── Main.java
├── e02
│   └── Main.java
...
└── e10
    └── Main.java
```

### Example

![My Image](util/images/mac.gif)

### Windows

1. **Download the Script**: Obtain `util/create-dir.bat` and place it in a directory of your choice.
2. **Run as Administrator**: Open Command Prompt with administrator rights.
3. **Execute the Script**: Navigate to the script's directory and run:

```bash
create-dir.bat 10
```

### Example

![My Image](util/images/windows.gif)
