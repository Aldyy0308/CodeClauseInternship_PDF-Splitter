# PDF Page-by-Page Splitter

## Overview

The PDF Page-by-Page Splitter is a Java program designed to split a PDF file into individual pages. It provides an easy-to-use command-line interface for selecting a source PDF file and generating separate PDF files for each page within the source file.

## Features

- Splits a PDF file into individual pages.
- Command-line interface for automation.
- Cross-platform compatibility (Windows, macOS, Linux).

## Prerequisites

Before using the PDF Page-by-Page Splitter, ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 8 or later
- Apache PDFBox library

## Usage

To split a PDF file page by page, follow these steps:

1. Compile the Java source code if not already compiled:

   ```bash
   javac pdf.java
   ```

2. Run the program with the pdf file needed to be split specified in the program

   Replace `input.pdf` with the path to your source PDF file and `output_directory/` with the directory where you want to save the individual page PDF files.

3. The program will process the PDF file and create a separate PDF file for each page in the specified output directory.

## Contributions

Contributions to this project are welcome. If you would like to make improvements or add new features, please fork the repository, make your changes, and submit a pull request.

## Acknowledgments

This project relies on the Apache PDFBox library for PDF manipulation. Special thanks to the Apache PDFBox development team for their excellent work.

If you have any questions or encounter issues with the PDF Page-by-Page Splitter, feel free to [open an issue](https://github.com/your/repository/issues) on our GitHub repository.

Thank you for using the PDF Page-by-Page Splitter!

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
