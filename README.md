# iovio-task-two
##### status : *complete*
### Use Case
##### Verify that the user is able to navigate to the Bol.com main page, enter a search term, and receive the correct search results.

### Pre-requisites
- Java JDK installed and added to environment variables
- Maven installed and added to environment variables
- Git installed
- Chrome / Firefox Browser Installed

### Project Set-up
1. Clone project using the following command: 
```
git clone https://github.com/jctjavier/iovio-task-two.git
```

2. _(Optional)_ Install project dependencies
```
mvn clean install
```

3. Open **config.properties** in **\lib** to verify project and test information. Default browser is set to *chrome*

### Run Tests
1. Open CMD or terminal
2. Change directory to project directory.
Example:
```
cd iovio-task-two
```

3. Run tests using the following command:
```
mvn clean install test
```

4. _(Optional)_ Subsequent tests can be run using the following command:
```
mvn test
```

### Test Reports
1. Navigate to project folder
2. Navigate to **\ExtentReports** folder
3. File name is **ExtentReportResults.html**

### Add tests to Jenkins / Windows Scheduler / CRON jobs

#### Windows Scheduler
1. Download the batch file **(tasktwo_run.bat)** and save in a preferred directory
1. Open Control Panel and navigate to **Task Scheduler**
2. Click **Create Task** in the Actions panel to create a new scheduled task.
3. Use the wizard to set task properties
4. In the **Security Options** group, select **Run only when user is logged on*
5. In the Program/script box, enter the path to the batch file:
..Example:
```
"C:\Scripts\tasktwo_run.bat"
```
6. Click OK to save changes

#### CRON Jobs
1. Download the shellscript **(tasktwo_run.sh)** and save in a preferred directory
..* Note: The shellscript to clone and run the test can be downloaded from the exec folder in this repository
3. To schedule the job to run at 1:00pm, add the following to the file:
```
59 12 * * * ~/<PATH to sh file>/tasktwo_run.sh
```

### Troubleshooting
1. Verify that web driver binaries are compatible to browsers used
