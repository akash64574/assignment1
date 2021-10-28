pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {

                bat 'mvn -f ./my-app/pom.xml package sonar:sonar -Dsonar.login=SonarQubeToken'
                
            }

        }

    }
}
