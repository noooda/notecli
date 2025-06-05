# NoteCLI

## Overview

The Notepad CLI is a simple command-line interface application that allows users to write, save, and load memos using text files.
This tool is intended for beginners who are learning Java, with a focus on basic file input/output and exception handling.

## Features

### 1. Select a Target Memo File

- When the application starts, the user is prompted to enter the file name to use as the target memo.
- All subsequent operations (save, load) will act on this target file.
- If the file does not exist, the application should offer to create it.

### 2. Save a Memo

- The user can input a memo.
- The memo is saved to the selected file.
- If the file does not exist, it is created automatically.
- If the file exists, the user can choose to append or overwrite.

### 3. Load a Memo

- The content of the selected file is displayed.
- If the file does not exist, a clear error message is shown.

### 4. Exit the Application

- The user can exit by typing a simple command.

## Functional Requirements

- Command-line interaction using standard input and output.
- Read and write operations using Java’s `FileWriter`, `FileReader`, `BufferedReader`, and `BufferedWriter`.
- Use `try`, `catch`, and `finally` blocks to handle exceptions, such as:

  - File not found
  - I/O errors
  - Invalid user input

## Example Use Cases

### Selecting a Target File

```
File name: notes.txt
File "notes.txt" selected.
```

### Saving a Memo

```
Memo Buy groceries and water
Saved.
```

### Loading a Memo

```
Show
Buy groceries and water
```

## Non-functional Requirements

- The application should be simple and easy to use.
- Clear error messages should be displayed for all exceptions.
- File encoding should use UTF-8.
