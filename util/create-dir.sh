#!/bin/bash

# in unix systems, give permissions:
# chmod +x create-dir.sh

if [ -z "$1" ]; then
  echo "Error: No argument provided. Usage: ./create.sh N"
  exit 1
fi

N=$1

for i in $(seq 1 $N); do
  padded=$(printf "%02d" $i)
  dir="e$padded"
  mkdir "$dir"
  cat <<EOL > "$dir/Main.java"
public class Main {
    public static void main(String[] args) {

    }
}
EOL
done