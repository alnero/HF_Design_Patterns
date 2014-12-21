# Steps to run the DJView Servlet on localhost

1. Download Tomcat

2. Under tomcat/webapps make a new folder, DJView/

3. Copy contents of HF_Design_Patterns/src/MVC/jsp to tomcat/webapps/DJView

4. Build up your project and get the binary files

5. Inside tomcat/webapps/DJView/WEB-INF create folder classes/

6. Copy compiled MVC/ folder to tomcat/webapps/DJView/WEB-INF/classes/ (e.g. full path to the BeatModel.class is tomcat/webapps/DJView/WEB-INF/classes/MVC/BeatModel.class)

7. Start Tomcat, navigate to localhost:8080/DJView/DJView.jsp