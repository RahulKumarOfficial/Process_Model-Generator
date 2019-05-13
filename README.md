# Process_Model-Generator
Generating Process Model using Sequence Logo with the Help of Process-mining

## Description


This project presents a method of summarizing control flow of an operational process by proposing the visualization method named process logo. The proposed objective is achieved with the help of Progressive and
Dynamic Methods to get the control flow summarized in process logo. Currently available methods for control
flow visualization only present the process flow as flow-chart and doesn’t provide all necessary information.
The proposed process logo is capable of visually representing number of activities, the relative significance of
each activity, process structure, critical activity, and information score (in addition to all the information could
be displayed in control flow process model).</justify>
![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/image.png)
<br>
Process Mining is a process where we try to model the real world process executed and recorded by PAISs(Process Aware Information Systems) in the form of event logs.
<br>
![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/process-mining.gif)
<br>

The control-flow model is obtained as the following <br>
![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/process-logo.gif)
and Process Logo for corresponding Event Log is : 
![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/testdata.png)
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
<br>
Click on `Clone or Download` Button.
<br>
After downloading go to the folder where the File is downloaded.

### Prerequisites

Certain files and libraries are required to get the Project running on your system. Just follow this guide. Lets go!
<ul>
  <li>Eclipse</li>
  <li>Python 2.7 only</li>
  <li>Java 1.8 or Java8 only</li>
  <li>WebLogo Library</li>
</ul>
If you don't have these required files, I would suggest you to download from the Links in the upcoming Section.

### Installing

A step by step series of examples that tell you how to get a development environment running<br>


**1. Setting Up Eclipse with JSP (Java Server Pages)**<br>
Note : If you have already installed Dynamic Project in your system, Skip this step.<br>
```
Click on Help and then click on “Install New Software”.
```
In the Work with option, Click on your version of Eclipse.<br>
Scroll down to find “Web, XML, Java EE and OSGI Enterprise Development” option and expand it.<br>

Select the following three options under “Web, XML, Java EE and OSGI Enterprise Development”<br>
*Eclipse Java EE Developer Tools<br>
Eclipse Java Web Developer Tools<br>
Eclipse Web Developer Tools<br>*

Click next and you would see that the software are installing. <br>
Wait for some time and then a popup would ask your permission to restart the Eclipse.<br>
Restart it and you would find the dynamic web project option under project list.<br>

**2. Installing Python2.7**<br>
Note : If you have already installed Python2.7 in your system, Skip this step.<br>
Open terminal (Ctrl+Alt+T) and run the command:<br>
```
sudo apt-get update
sudo apt-get install build-essential checkinstall
sudo apt-get install libreadline-gplv2-dev libncursesw5-dev libssl-dev libsqlite3-dev tk-dev libgdbm-dev libc6-dev libbz2-dev

```
Now Change the Directory and download Python2.7 
```
cd /usr/src
sudo wget https://www.python.org/ftp/python/2.7.16/Python-2.7.16.tgz
```
Almost done! Now just extract Python Files from archived file.
```
sudo tar xzf Python-2.7.16.tgz
```
**3. Installing Java8 or Java1.8**<br>
Open terminal (Ctrl+Alt+T) and run the command:<br>
```
sudo add-apt-repository ppa:webupd8team/java
sudo apt update; sudo apt install oracle-java8-installer
```
While the install process, you have to accept Java license to continue downloading & installing Java binaries.<br>
Check the Java version<br>
```
javac -version
```
Set Java environment variables
```
sudo apt install oracle-java8-set-default
```

If you already have pip on your system, skip this step. <br><br>
**4. Installing PIP and WebLogo**
```
sudo apt update
sudo apt install python-pip
```
Verify the installation by printing the pip version number:
```
pip --version
```
The version number may vary, but it will look something like this:
```
pip 9.0.1 from /usr/lib/python2.7/dist-packages (python 2.7)
```
Now installing WebLogo Library by giving
```
pip install weblogo
```
Congratulations for finishing the above steps successfully.
## Running the Project
Now the only tasks that remains is to 
<ul>
<li>Import the Project</li>
<li>Running it with Apache Tomcat Server</li>
</ul>
<br>

### Import the Project
Open the eclipse 
```
File ❯ Import ❯ Existing Project into Workspace
```
And select the folder that was cloned.<br>
**Run the JSP Project**
```
Right click on your JSP project ❯ Run as ❯ Click on “Run on Server”.
Select the Server and click next.
Click on Add All ❯ Click Finish
```
You will see the output of your JSP page in the next window. 
<br>If you want you can copy the url and paste it in your browser, you will see the same output.

## Output
<br>
1. Home Page

![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/1.png)

<br>
2. Demonstration Example Page

![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/2.png)

<br>
Output Logo

![](https://github.com/rahulkumar082/Process_Model-Generator/blob/master/WebContent/4.png)

## Authors


* **[Rahul Kumar](https://github.com/rahulkumar082)** 
* **S. Aishwarya**
* **[Tejaswi](https://github.com/masculardwarf)**

## Acknowledgments
* We, Students of NMIT, Department of Information Science and Engineering heartfully thank **Dr. Manoj Kumar MV** for his guidance and support throughout our *Final Year Project*.
* Andrea Avancini and Mariano Ceccato. “Grammar based oracle for security testing of web applications”. In: Proceedings of
the 7th International Workshop on Automation of Software Test. IEEE Press. 2012, pp. 15–21.
* Neeraj Bhargava et al. “Decision tree analysis on j48 algorithm for data mining”. In: Proceedings of International Journal of
Advanced Research in Computer Science and Software Engineering 3.6 (2013).
* RP Jagadeesh Chandra Bose and Wil van der Aalst. “Trace alignment in process mining: opportunities for process diagnos-
tics”. In: International Conference on Business Process Management. Springer. 2010, pp. 227–242.
* aolo Di Tommaso et al. “T-Coffee: a web server for the multiple sequence alignment of protein and RNA sequences using
structural information and homology extension”. In: Nucleic acids research 39.suppl 2 (2011), W13–W17.
