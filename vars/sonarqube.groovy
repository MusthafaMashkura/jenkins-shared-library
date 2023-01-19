def sonarAnalysis(String Project_Key, String Project_Name){
      sh "mvn sonar:sonar \
      -Dsonar.projectName=${Project_Name} \
      -Dsonar.projectKey=${Project_Key}"
 //     -Dsonar.host.url=${Sonar_URL}  \   //url and login details will be taken from the sonarqube server plugin
 //     -Dsonar.login=${Sonar_login}"
}
