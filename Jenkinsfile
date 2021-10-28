pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {

                bat 'mvn -f ./my-app/pom.xml package sonar:sonar -Dsonar.login=c3ecc1b7d6d7239c5681d0df589e97c52368ffd1'
                
            }

        }

    }
}
