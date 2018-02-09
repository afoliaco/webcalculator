# webcalculator

To Run this on intelliJ comunity edition do the following steps 

1. Got to Run -> Edit Configuraiton 
2. Add a new maven configuraion 
3. In the parameters tab under the command line type tomcat7:run
4. Under the Runner tab un check project settings 
5. Type the following under the VM Options -XX:MaxPermSize=256m -Xms128m -Xmx512m -Djava.awt.headless=true
