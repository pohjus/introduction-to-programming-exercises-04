#!/bin/bash

# chmod +x create-dir.sh

if [ -z "$1" ]; then
  echo "Error: No argument provided. Usage: ./create.sh N AuthorName"
  exit 1
fi

N=$1
AUTHOR=$2

for i in $(seq 1 $N); do
  padded=$(printf "%02d" $i)
  dir="e$padded"
  mkdir "$dir"
  cat <<EOL > "$dir/Main.java"
/**
 * Main class for exercise.
 *
 * @author $AUTHOR
 */
public class Main {
    /**
     * Main method - starting point for the app.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

    }
}
EOL
done